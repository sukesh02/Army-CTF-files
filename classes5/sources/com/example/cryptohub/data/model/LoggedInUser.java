package com.example.cryptohub.data.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: LoggedInUser.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/example/cryptohub/data/model/LoggedInUser;", "", "userId", "", "displayName", "(Ljava/lang/String;Ljava/lang/String;)V", "getDisplayName", "()Ljava/lang/String;", "getUserId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/sukeshraghav/Downloads/CryptoHub-cryptohub_decoded_by_apktool/classes5.dex */
public final class LoggedInUser {
    private final String displayName;
    private final String userId;

    public static /* synthetic */ LoggedInUser copy$default(LoggedInUser loggedInUser, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = loggedInUser.userId;
        }
        if ((i & 2) != 0) {
            str2 = loggedInUser.displayName;
        }
        return loggedInUser.copy(str, str2);
    }

    public final String component1() {
        return this.userId;
    }

    public final String component2() {
        return this.displayName;
    }

    public final LoggedInUser copy(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "userId");
        Intrinsics.checkNotNullParameter(str2, "displayName");
        return new LoggedInUser(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LoggedInUser) {
            LoggedInUser loggedInUser = (LoggedInUser) obj;
            return Intrinsics.areEqual(this.userId, loggedInUser.userId) && Intrinsics.areEqual(this.displayName, loggedInUser.displayName);
        }
        return false;
    }

    public int hashCode() {
        return (this.userId.hashCode() * 31) + this.displayName.hashCode();
    }

    public String toString() {
        return "LoggedInUser(userId=" + this.userId + ", displayName=" + this.displayName + ')';
    }

    public LoggedInUser(String userId, String displayName) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        this.userId = userId;
        this.displayName = displayName;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getDisplayName() {
        return this.displayName;
    }
}
