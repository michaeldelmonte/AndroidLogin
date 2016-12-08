package com.example.androidlogin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handleLogin(View view) {

        EditText txtUsername = (EditText) findViewById(R.id.txtUsername);
        EditText txtPassword = (EditText) findViewById(R.id.txtPassword);

        String usernameTxt = txtUsername.getText().toString();
        String passwordTxt = txtPassword.getText().toString();

        if (usernameTxt.equals("admin") && passwordTxt.equals("pass123")) {
            LoginDialogFragment loginDialogFragment = LoginDialogFragment.newInstance("Login", "User login successful!");
            loginDialogFragment.show(getFragmentManager(), "dialog");

            txtUsername.setText("");
            txtPassword.setText("");
        } else {
            Toast.makeText(this,"Invalid credentials!", Toast.LENGTH_SHORT).show();
        }

    }
}
