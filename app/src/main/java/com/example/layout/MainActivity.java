package com.example.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    EditText btnUsername;
    EditText btnPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // konekkan semua komponen dengan xml nya

        btnUsername = (EditText) findViewById(R.id.btnUsername);
        btnPassword = (EditText) findViewById(R.id.btnPassword);
        btnLogin = (Button) findViewById(R.id.btnlogins);
        btnLogin.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                String username = btnUsername.getText().toString();
                String password = btnPassword.getText().toString();
                if (username.equalsIgnoreCase("admin") &&
                        password.equalsIgnoreCase("admin")){
                    startActivity(new Intent(MainActivity.this,MainActivity2.class));
                }else{
                    Toast.makeText(getApplicationContext(), "Gagal Login", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}