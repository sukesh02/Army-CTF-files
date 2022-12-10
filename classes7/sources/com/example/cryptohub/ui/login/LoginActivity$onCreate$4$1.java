package com.example.cryptohub.ui.login;

import android.widget.EditText;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: LoginActivity.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/sukeshraghav/Downloads/CryptoHub-cryptohub_decoded_by_apktool/classes7.dex */
final class LoginActivity$onCreate$4$1 extends Lambda implements Function1<String, Unit> {
    final /* synthetic */ EditText $password;
    final /* synthetic */ EditText $username;
    final /* synthetic */ LoginActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginActivity$onCreate$4$1(LoginActivity loginActivity, EditText editText, EditText editText2) {
        super(1);
        this.this$0 = loginActivity;
        this.$username = editText;
        this.$password = editText2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object p1) {
        invoke((String) p1);
        return Unit.INSTANCE;
    }

    public final void invoke(String it) {
        LoginViewModel loginViewModel;
        Intrinsics.checkNotNullParameter(it, "it");
        loginViewModel = this.this$0.loginViewModel;
        if (loginViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loginViewModel");
            loginViewModel = null;
        }
        loginViewModel.loginDataChanged(this.$username.getText().toString(), this.$password.getText().toString());
    }
}
