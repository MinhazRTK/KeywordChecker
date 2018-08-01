package com.batch2.m0nk3y.keywordchecker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText id,password;
    private  Button Button;
    private  TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         id = findViewById(R.id.id);
          password = findViewById(R.id.pass);
        Button = findViewById(R.id.login);
        textView = findViewById(R.id.warning);

        Button.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        String name = id.getText().toString();
        String pass = password.getText().toString();
        Intent i;
        if(name.equals("m0nk3y") && pass.equals("admin")){
            i = new Intent(this,Ok.class);
            startActivity(i);

        }

        else {
            textView.setText("Wrong Credentials!");
        }
    }
}
