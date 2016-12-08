package com.example.androidlogin;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;

public class LoginDialogFragment extends android.app.DialogFragment {

    static LoginDialogFragment newInstance(String title, String message) {
        LoginDialogFragment loginDialogFragment = new LoginDialogFragment();

        Bundle args = new Bundle();

        args.putString("title", title);
        args.putString("message", message);

        loginDialogFragment.setArguments(args);

        return loginDialogFragment;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        String title   = getArguments().getString("title");
        String message = getArguments().getString("message");

        return new AlertDialog.Builder(getActivity())
                .setIcon(R.mipmap.ic_launcher)
                .setTitle(title)
                .setMessage(message)
                .setNeutralButton("OK", null).create();
    }
}
