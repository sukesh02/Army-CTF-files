package com.example.cryptohub.ui.login;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: LoginResult.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\bJ&\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/example/cryptohub/ui/login/LoginResult;", "", "success", "Lcom/example/cryptohub/ui/login/LoggedInUserView;", "error", "", "(Lcom/example/cryptohub/ui/login/LoggedInUserView;Ljava/lang/Integer;)V", "getError", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSuccess", "()Lcom/example/cryptohub/ui/login/LoggedInUserView;", "component1", "component2", "copy", "(Lcom/example/cryptohub/ui/login/LoggedInUserView;Ljava/lang/Integer;)Lcom/example/cryptohub/ui/login/LoginResult;", "equals", "", "other", "hashCode", "toString", "", "app_debug"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/sukeshraghav/Downloads/CryptoHub-cryptohub_decoded_by_apktool/classes7.dex */
public final class LoginResult {
    private final Integer error;
    private final LoggedInUserView success;

    public LoginResult() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ LoginResult copy$default(LoginResult loginResult, LoggedInUserView loggedInUserView, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            loggedInUserView = loginResult.success;
        }
        if ((i & 2) != 0) {
            num = loginResult.error;
        }
        return loginResult.copy(loggedInUserView, num);
    }

    public final LoggedInUserView component1() {
        return this.success;
    }

    public final Integer component2() {
        return this.error;
    }

    public final LoginResult copy(LoggedInUserView loggedInUserView, Integer num) {
        return new LoginResult(loggedInUserView, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LoginResult) {
            LoginResult loginResult = (LoginResult) obj;
            return Intrinsics.areEqual(this.success, loginResult.success) && Intrinsics.areEqual(this.error, loginResult.error);
        }
        return false;
    }

    public int hashCode() {
        LoggedInUserView loggedInUserView = this.success;
        int hashCode = (loggedInUserView == null ? 0 : loggedInUserView.hashCode()) * 31;
        Integer num = this.error;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "LoginResult(success=" + this.success + ", error=" + this.error + ')';
    }

    public LoginResult(LoggedInUserView success, Integer error) {
        this.success = success;
        this.error = error;
    }

    public /* synthetic */ LoginResult(LoggedInUserView loggedInUserView, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : loggedInUserView, (i & 2) != 0 ? null : num);
    }

    public final LoggedInUserView getSuccess() {
        return this.success;
    }

    public final Integer getError() {
        return this.error;
    }
}
