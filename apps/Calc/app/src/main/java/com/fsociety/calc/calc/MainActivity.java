package com.fsociety.calc.calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*; //Importa todos os componentes do pacote widget *

public class MainActivity extends AppCompatActivity {

    private EditText formNota01;
    private EditText formNota02;
    private Button btnCalcular;
    private TextView textResultado;
    private double nota01;
    private double nota02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        formNota01 = (EditText)findViewById(R.id.formNota01);
        formNota02 = (EditText)findViewById(R.id.formNota02);
        btnCalcular = (Button)findViewById(R.id.btnCalcular);
        textResultado = (TextView)findViewById(R.id.textResultado);
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nota01 = Double.parseDouble(formNota01.getText().toString());
                nota02 = Double.parseDouble(formNota02.getText().toString());

                Double media = calcularMedia(nota01, nota02);
                textResultado.setText(media.toString());
            }
        });
    }

    private double calcularMedia(double n1, double n2) {
        double mediaFinal = (n1 + n2) / 2;
        return mediaFinal;

    }
}
