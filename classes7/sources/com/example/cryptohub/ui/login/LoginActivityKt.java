package com.example.cryptohub.ui.login;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: LoginActivity.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0012\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003¨\u0006\u0005"}, d2 = {"afterTextChanged", "", "Landroid/widget/EditText;", "Lkotlin/Function1;", "", "app_debug"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/sukeshraghav/Downloads/CryptoHub-cryptohub_decoded_by_apktool/classes7.dex */
public final class LoginActivityKt {
    public static final void afterTextChanged(EditText $this$afterTextChanged, final Function1<? super String, Unit> function1) {
        Intrinsics.checkNotNullParameter($this$afterTextChanged, "<this>");
        Intrinsics.checkNotNullParameter(function1, "afterTextChanged");
        $this$afterTextChanged.addTextChangedListener(new TextWatcher() { // from class: com.example.cryptohub.ui.login.LoginActivityKt$afterTextChanged$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                function1.invoke(String.valueOf(editable));
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                Intrinsics.checkNotNullParameter(s, "s");
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Intrinsics.checkNotNullParameter(s, "s");
            }
        });
    }
}
