package com.example.cryptohub.ui.login;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: LoggedInUserView.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/example/cryptohub/ui/login/LoggedInUserView;", "", "displayName", "", "(Ljava/lang/String;)V", "getDisplayName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/sukeshraghav/Downloads/CryptoHub-cryptohub_decoded_by_apktool/classes7.dex */
public final class LoggedInUserView {
    private final String displayName;

    public static /* synthetic */ LoggedInUserView copy$default(LoggedInUserView loggedInUserView, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = loggedInUserView.displayName;
        }
        return loggedInUserView.copy(str);
    }

    public final String component1() {
        return this.displayName;
    }

    public final LoggedInUserView copy(String str) {
        Intrinsics.checkNotNullParameter(str, "displayName");
        return new LoggedInUserView(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LoggedInUserView) && Intrinsics.areEqual(this.displayName, ((LoggedInUserView) obj).displayName);
    }

    public int hashCode() {
        return this.displayName.hashCode();
    }

    public String toString() {
        return "LoggedInUserView(displayName=" + this.displayName + ')';
    }

    public LoggedInUserView(String displayName) {
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        this.displayName = displayName;
    }

    public final String getDisplayName() {
        return this.displayName;
    }
}
