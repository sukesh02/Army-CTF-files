package com.example.cryptohub.ui.login;

import android.util.Patterns;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.example.cryptohub.data.LoginRepository;
import com.example.cryptohub.data.Result;
import com.example.cryptohub.data.model.LoggedInUser;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
/* compiled from: LoginViewModel.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0013H\u0002J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0013J\u0016\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0013R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/example/cryptohub/ui/login/LoginViewModel;", "Landroidx/lifecycle/ViewModel;", "loginRepository", "Lcom/example/cryptohub/data/LoginRepository;", "(Lcom/example/cryptohub/data/LoginRepository;)V", "_loginForm", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/cryptohub/ui/login/LoginFormState;", "_loginResult", "Lcom/example/cryptohub/ui/login/LoginResult;", "loginFormState", "Landroidx/lifecycle/LiveData;", "getLoginFormState", "()Landroidx/lifecycle/LiveData;", "loginResult", "getLoginResult", "isPasswordValid", "", "password", "", "isUserNameValid", "username", "login", "", "loginDataChanged", "app_debug"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/sukeshraghav/Downloads/CryptoHub-cryptohub_decoded_by_apktool/classes7.dex */
public final class LoginViewModel extends ViewModel {
    private final MutableLiveData<LoginFormState> _loginForm;
    private final MutableLiveData<LoginResult> _loginResult;
    private final LiveData<LoginFormState> loginFormState;
    private final LoginRepository loginRepository;
    private final LiveData<LoginResult> loginResult;

    public LoginViewModel(LoginRepository loginRepository) {
        Intrinsics.checkNotNullParameter(loginRepository, "loginRepository");
        this.loginRepository = loginRepository;
        LiveData<LoginFormState> mutableLiveData = new MutableLiveData<>();
        this._loginForm = mutableLiveData;
        this.loginFormState = mutableLiveData;
        LiveData<LoginResult> mutableLiveData2 = new MutableLiveData<>();
        this._loginResult = mutableLiveData2;
        this.loginResult = mutableLiveData2;
    }

    public final LiveData<LoginFormState> getLoginFormState() {
        return this.loginFormState;
    }

    public final LiveData<LoginResult> getLoginResult() {
        return this.loginResult;
    }

    public final void login(String username, String password) {
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(password, "password");
        Result.Success login = this.loginRepository.login(username, password);
        if (login instanceof Result.Success) {
            this._loginResult.setValue(new LoginResult(new LoggedInUserView(((LoggedInUser) login.getData()).getDisplayName()), null, 2, null));
        } else {
            this._loginResult.setValue(new LoginResult(null, 2131689522, 1, null));
        }
    }

    public final void loginDataChanged(String username, String password) {
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(password, "password");
        if (!isUserNameValid(username)) {
            this._loginForm.setValue(new LoginFormState(2131689520, null, false, 6, null));
        } else if (!isPasswordValid(password)) {
            this._loginForm.setValue(new LoginFormState(null, 2131689519, false, 5, null));
        } else {
            this._loginForm.setValue(new LoginFormState(null, null, true, 3, null));
        }
    }

    private final boolean isUserNameValid(String username) {
        if (StringsKt.contains$default(username, '@', false, 2, (Object) null)) {
            return Patterns.EMAIL_ADDRESS.matcher(username).matches();
        }
        return !StringsKt.isBlank(username);
    }

    private final boolean isPasswordValid(String password) {
        return password.length() > 5;
    }
}
