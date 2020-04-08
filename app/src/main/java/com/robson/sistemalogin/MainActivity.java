package com.robson.sistemalogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public EditText txtEmail;
    public EditText txtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login_in(View view) {
        txtEmail = findViewById(R.id.txtEmail);
        txtPassword = findViewById(R.id.txtPassword);
        if (txtEmail.getText().toString().equals("")||txtPassword.getText().toString().length() < 8){
            Toast.makeText(this, "Preencha os campos corretamente!", Toast.LENGTH_LONG).show();
        }else {
            Toast.makeText(this, "Login realizado com sucesso!", Toast.LENGTH_LONG).show();
            moveInHome();
        }
    }

    private void moveInHome() {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }
}
