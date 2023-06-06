package com.example.lms_log;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // set password and username
        String pass = "";
        String uname = "";

        TextView username = (TextView) findViewById(R.id.username);
        TextView password = (TextView) findViewById(R.id.password);

        MaterialButton loginbtn = (MaterialButton) findViewById(R.id.loginbtn);

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().toString().equals(uname) && password.getText().toString().equals(pass)){
                    Toast.makeText(MainActivity.this, "LOGIN SUCCESSFULL!",Toast.LENGTH_SHORT ).show();

                    Intent intent = new Intent(MainActivity.this, Home.class);
                    startActivity(intent);

                }

                else{
                    Toast.makeText(MainActivity.this, "Check Password And User Name!!!",Toast.LENGTH_SHORT ).show();
                }
            }
        });






    }
}