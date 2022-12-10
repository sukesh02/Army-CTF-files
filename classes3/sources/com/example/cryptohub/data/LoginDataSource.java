package com.example.cryptohub.data;

import com.example.cryptohub.data.Result;
import com.example.cryptohub.data.model.LoggedInUser;
import java.io.IOException;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: LoginDataSource.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, d2 = {"Lcom/example/cryptohub/data/LoginDataSource;", "", "()V", "login", "Lcom/example/cryptohub/data/Result;", "Lcom/example/cryptohub/data/model/LoggedInUser;", "username", "", "password", "logout", "", "app_debug"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/sukeshraghav/Downloads/CryptoHub-cryptohub_decoded_by_apktool/classes3.dex */
public final class LoginDataSource {
    public final Result<LoggedInUser> login(String username, String password) {
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(password, "password");
        try {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            LoggedInUser fakeUser = new LoggedInUser(uuid, "Jane Doe");
            return new Result.Success(fakeUser);
        } catch (Throwable e) {
            return new Result.Error(new IOException("Error logging in", e));
        }
    }

    public final void logout() {
    }
}
