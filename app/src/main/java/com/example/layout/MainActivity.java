package com.example.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText EdUang;
    TextView EdHasil;
    double angka1, hasil;
    Button hasilButton;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EdUang = (EditText)findViewById(R.id.EdNominalUang);
        EdHasil = (TextView)findViewById(R.id.EdHasilUang);
        hasilButton = (Button) findViewById(R.id.btnSubmit);

        hasilButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (EdUang.getText().length()>0){
                    angka1 = Integer.parseInt(EdUang.getText().toString());
                    String content = EdUang.getText().toString();
                    content = String.valueOf(angka1 * 15.211);
                    EdHasil.setText("Rp." + content);
                }
            }
        });


    }
}