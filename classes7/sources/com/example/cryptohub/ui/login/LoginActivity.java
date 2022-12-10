package com.example.cryptohub.ui.login;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import com.example.cryptohub.databinding.ActivityLoginBinding;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: LoginActivity.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0014J\u0012\u0010\u000b\u001a\u00020\b2\b\b\u0001\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/example/cryptohub/ui/login/LoginActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/example/cryptohub/databinding/ActivityLoginBinding;", "loginViewModel", "Lcom/example/cryptohub/ui/login/LoginViewModel;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "showLoginFailed", "errorString", "", "updateUiWithUser", "model", "Lcom/example/cryptohub/ui/login/LoggedInUserView;", "app_debug"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/sukeshraghav/Downloads/CryptoHub-cryptohub_decoded_by_apktool/classes7.dex */
public final class LoginActivity extends AppCompatActivity {
    private ActivityLoginBinding binding;
    private LoginViewModel loginViewModel;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityLoginBinding inflate = ActivityLoginBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(layoutInflater)");
        this.binding = inflate;
        LoginViewModel loginViewModel = null;
        if (inflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            inflate = null;
        }
        setContentView((View) inflate.getRoot());
        ActivityLoginBinding activityLoginBinding = this.binding;
        if (activityLoginBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityLoginBinding = null;
        }
        final EditText username = activityLoginBinding.username;
        Intrinsics.checkNotNullExpressionValue(username, "binding.username");
        ActivityLoginBinding activityLoginBinding2 = this.binding;
        if (activityLoginBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityLoginBinding2 = null;
        }
        final EditText password = activityLoginBinding2.password;
        Intrinsics.checkNotNullExpressionValue(password, "binding.password");
        ActivityLoginBinding activityLoginBinding3 = this.binding;
        if (activityLoginBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityLoginBinding3 = null;
        }
        final Button login = activityLoginBinding3.login;
        Intrinsics.checkNotNullExpressionValue(login, "binding.login");
        ActivityLoginBinding activityLoginBinding4 = this.binding;
        if (activityLoginBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityLoginBinding4 = null;
        }
        final ProgressBar loading = activityLoginBinding4.loading;
        Intrinsics.checkNotNullExpressionValue(loading, "binding.loading");
        LoginViewModel loginViewModel2 = (LoginViewModel) new ViewModelProvider((ViewModelStoreOwner) this, new LoginViewModelFactory()).get(LoginViewModel.class);
        this.loginViewModel = loginViewModel2;
        if (loginViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loginViewModel");
            loginViewModel2 = null;
        }
        loginViewModel2.getLoginFormState().observe((LifecycleOwner) this, new Observer() { // from class: com.example.cryptohub.ui.login.LoginActivity$$ExternalSyntheticLambda0
            public final void onChanged(Object obj) {
                LoginActivity.onCreate$lambda$0(login, username, this, password, (LoginFormState) obj);
            }
        });
        LoginViewModel loginViewModel3 = this.loginViewModel;
        if (loginViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loginViewModel");
        } else {
            loginViewModel = loginViewModel3;
        }
        loginViewModel.getLoginResult().observe((LifecycleOwner) this, new Observer() { // from class: com.example.cryptohub.ui.login.LoginActivity$$ExternalSyntheticLambda1
            public final void onChanged(Object obj) {
                LoginActivity.onCreate$lambda$1(loading, this, (LoginResult) obj);
            }
        });
        LoginActivityKt.afterTextChanged(username, new LoginActivity$onCreate$3(this, username, password));
        LoginActivityKt.afterTextChanged(password, new LoginActivity$onCreate$4$1(this, username, password));
        password.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.example.cryptohub.ui.login.LoginActivity$$ExternalSyntheticLambda2
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                boolean onCreate$lambda$4$lambda$2;
                onCreate$lambda$4$lambda$2 = LoginActivity.onCreate$lambda$4$lambda$2(LoginActivity.this, username, password, textView, i, keyEvent);
                return onCreate$lambda$4$lambda$2;
            }
        });
        login.setOnClickListener(new View.OnClickListener() { // from class: com.example.cryptohub.ui.login.LoginActivity$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoginActivity.onCreate$lambda$4$lambda$3(loading, this, username, password, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(Button $login, EditText $username, LoginActivity this$0, EditText $password, LoginFormState it) {
        Intrinsics.checkNotNullParameter($login, "$login");
        Intrinsics.checkNotNullParameter($username, "$username");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter($password, "$password");
        if (it == null) {
            return;
        }
        $login.setEnabled(it.isDataValid());
        if (it.getUsernameError() != null) {
            $username.setError(this$0.getString(it.getUsernameError().intValue()));
        }
        if (it.getPasswordError() != null) {
            $password.setError(this$0.getString(it.getPasswordError().intValue()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$1(ProgressBar $loading, LoginActivity this$0, LoginResult it) {
        Intrinsics.checkNotNullParameter($loading, "$loading");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (it == null) {
            return;
        }
        $loading.setVisibility(8);
        if (it.getError() != null) {
            this$0.showLoginFailed(it.getError().intValue());
        }
        if (it.getSuccess() != null) {
            this$0.updateUiWithUser(it.getSuccess());
        }
        this$0.setResult(-1);
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onCreate$lambda$4$lambda$2(LoginActivity this$0, EditText $username, EditText $password, TextView textView, int actionId, KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter($username, "$username");
        Intrinsics.checkNotNullParameter($password, "$password");
        if (actionId == 6) {
            LoginViewModel loginViewModel = this$0.loginViewModel;
            if (loginViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("loginViewModel");
                loginViewModel = null;
            }
            loginViewModel.login($username.getText().toString(), $password.getText().toString());
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$4$lambda$3(ProgressBar $loading, LoginActivity this$0, EditText $username, EditText $password, View it) {
        Intrinsics.checkNotNullParameter($loading, "$loading");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter($username, "$username");
        Intrinsics.checkNotNullParameter($password, "$password");
        $loading.setVisibility(0);
        LoginViewModel loginViewModel = this$0.loginViewModel;
        if (loginViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loginViewModel");
            loginViewModel = null;
        }
        loginViewModel.login($username.getText().toString(), $password.getText().toString());
    }

    private final void updateUiWithUser(LoggedInUserView model) {
        String welcome = getString(2131689614);
        Intrinsics.checkNotNullExpressionValue(welcome, "getString(R.string.welcome)");
        String displayName = model.getDisplayName();
        Toast.makeText(getApplicationContext(), welcome + ' ' + displayName, 1).show();
    }

    private final void showLoginFailed(int errorString) {
        Toast.makeText(getApplicationContext(), errorString, 0).show();
    }
}
