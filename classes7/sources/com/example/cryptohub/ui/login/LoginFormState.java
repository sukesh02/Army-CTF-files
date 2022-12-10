package com.example.cryptohub.ui.login;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: LoginFormState.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J0\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/example/cryptohub/ui/login/LoginFormState;", "", "usernameError", "", "passwordError", "isDataValid", "", "(Ljava/lang/Integer;Ljava/lang/Integer;Z)V", "()Z", "getPasswordError", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getUsernameError", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Z)Lcom/example/cryptohub/ui/login/LoginFormState;", "equals", "other", "hashCode", "toString", "", "app_debug"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/sukeshraghav/Downloads/CryptoHub-cryptohub_decoded_by_apktool/classes7.dex */
public final class LoginFormState {
    private final boolean isDataValid;
    private final Integer passwordError;
    private final Integer usernameError;

    public LoginFormState() {
        this(null, null, false, 7, null);
    }

    public static /* synthetic */ LoginFormState copy$default(LoginFormState loginFormState, Integer num, Integer num2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            num = loginFormState.usernameError;
        }
        if ((i & 2) != 0) {
            num2 = loginFormState.passwordError;
        }
        if ((i & 4) != 0) {
            z = loginFormState.isDataValid;
        }
        return loginFormState.copy(num, num2, z);
    }

    public final Integer component1() {
        return this.usernameError;
    }

    public final Integer component2() {
        return this.passwordError;
    }

    public final boolean component3() {
        return this.isDataValid;
    }

    public final LoginFormState copy(Integer num, Integer num2, boolean z) {
        return new LoginFormState(num, num2, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LoginFormState) {
            LoginFormState loginFormState = (LoginFormState) obj;
            return Intrinsics.areEqual(this.usernameError, loginFormState.usernameError) && Intrinsics.areEqual(this.passwordError, loginFormState.passwordError) && this.isDataValid == loginFormState.isDataValid;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        Integer num = this.usernameError;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.passwordError;
        int hashCode2 = (hashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
        boolean z = this.isDataValid;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "LoginFormState(usernameError=" + this.usernameError + ", passwordError=" + this.passwordError + ", isDataValid=" + this.isDataValid + ')';
    }

    public LoginFormState(Integer usernameError, Integer passwordError, boolean isDataValid) {
        this.usernameError = usernameError;
        this.passwordError = passwordError;
        this.isDataValid = isDataValid;
    }

    public /* synthetic */ LoginFormState(Integer num, Integer num2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? false : z);
    }

    public final Integer getUsernameError() {
        return this.usernameError;
    }

    public final Integer getPasswordError() {
        return this.passwordError;
    }

    public final boolean isDataValid() {
        return this.isDataValid;
    }
}
