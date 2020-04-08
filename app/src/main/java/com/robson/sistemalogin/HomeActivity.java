package com.robson.sistemalogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void login_off(View view) {
        Intent intentSair = new Intent(this, MainActivity.class);
        startActivity(intentSair);
        Toast.makeText(this, "LogOff", Toast.LENGTH_LONG).show();
    }
}
