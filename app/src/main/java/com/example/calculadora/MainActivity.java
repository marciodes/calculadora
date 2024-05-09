package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Mensagem(View v){

        TextView text = findViewById(R.id.textView);
        EditText login = findViewById(R.id.login);
        EditText senha = findViewById(R.id.senha);

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){

        }
        if(login.getText().toString().equals("marcioti23ic@gmail.com") && senha.getText().toString().equals("1234")){

            Intent intent = new Intent(MainActivity.this, tela3.class);
            startActivity(intent);
        }
    }
}