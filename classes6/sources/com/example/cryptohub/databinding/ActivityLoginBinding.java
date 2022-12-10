package com.example.cryptohub.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
/* loaded from: /home/sukeshraghav/Downloads/CryptoHub-cryptohub_decoded_by_apktool/classes6.dex */
public final class ActivityLoginBinding implements ViewBinding {
    public final ConstraintLayout container;
    public final ProgressBar loading;
    public final Button login;
    public final EditText password;
    private final ConstraintLayout rootView;
    public final EditText username;

    private ActivityLoginBinding(ConstraintLayout rootView, ConstraintLayout container, ProgressBar loading, Button login, EditText password, EditText username) {
        this.rootView = rootView;
        this.container = container;
        this.loading = loading;
        this.login = login;
        this.password = password;
        this.username = username;
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityLoginBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ActivityLoginBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View root = inflater.inflate(2131427356, parent, false);
        if (attachToParent) {
            parent.addView(root);
        }
        return bind(root);
    }

    public static ActivityLoginBinding bind(View rootView) {
        ConstraintLayout container = (ConstraintLayout) rootView;
        int id = 2131230957;
        ProgressBar loading = (ProgressBar) ViewBindings.findChildViewById(rootView, 2131230957);
        if (loading != null) {
            id = 2131230958;
            Button login = (Button) ViewBindings.findChildViewById(rootView, 2131230958);
            if (login != null) {
                id = 2131231045;
                EditText password = (EditText) ViewBindings.findChildViewById(rootView, 2131231045);
                if (password != null) {
                    EditText username = (EditText) ViewBindings.findChildViewById(rootView, 2131231182);
                    if (username == null) {
                        id = 2131231182;
                    } else {
                        return new ActivityLoginBinding((ConstraintLayout) rootView, container, loading, login, password, username);
                    }
                }
            }
        }
        String missingId = rootView.getResources().getResourceName(id);
        throw new NullPointerException("Missing required view with ID: ".concat(missingId));
    }
}
