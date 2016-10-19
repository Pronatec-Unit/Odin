package com.example.a06235434.preodin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button IrParaMasculinoActivity = (Button)findViewById(R.id.buttonMasc);

        IrParaMasculinoActivity.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Masculinos.class);
                startActivity(intent);
            }
        });

        Button IrParaFemininoActivity = (Button)findViewById(R.id.buttonFemi);

        IrParaFemininoActivity.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Femininos.class);
                startActivity(intent);
            }
        });

        Button IrParaOutrosActivity = (Button)findViewById(R.id.buttonOutros);

        IrParaOutrosActivity.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Outros.class);
                startActivity(intent);
            }
        });

        Button IrParaSobrenomesActivity = (Button)findViewById(R.id.buttonSobre);

        IrParaSobrenomesActivity.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Sobrenomes.class);
                startActivity(intent);
            }
        });
    }
}
