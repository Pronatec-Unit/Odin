package com.fsociety.calc.calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*; //Importa todos os componentes widget *

public class MainActivity extends AppCompatActivity {

    private EditText formNota01; // Declarada Variável formNota01
    private EditText formNota02; // Declarada Variável formNota01
    private Button btnCalcular; // Declarada Variável btnCalcular
    private TextView textResultado; // Declarada Variável textResultado
    private double nota01;
    private double nota02;
    private double calcNota01;
    private double calcNota02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        formNota01 = (EditText)findViewById(R.id.formNota01); //Formulário NOTA 1
        formNota02 = (EditText)findViewById(R.id.formNota02); //Formulário NOTA 2
        btnCalcular = (Button)findViewById(R.id.btnCalcular); //Botão Resultado
        textResultado = (TextView)findViewById(R.id.textResultado); //Resultado Final
        btnCalcular.setOnClickListener(new View.OnClickListener() { // Ação depois do Click
            @Override
            public void onClick(View v) {
                nota01 = Double.parseDouble(formNota01.getText().toString());
                nota02 = Double.parseDouble(formNota02.getText().toString());

                calcNota01 = (nota01 * 4);
                calcNota02 = (nota02 * 6);

                Double media = calcularMedia(calcNota01, calcNota02);
                if (media>=7)
                    textResultado.setText("APROVADO!!! sua média é: " + media.toString()); // Saida
                else {
                    textResultado.setText("REPROVADO!!! sua média é: " + media.toString()); //Saida
                }
            }
        });
    }
    // Calculo
    private double calcularMedia(double n1, double n2) {
        double mediaFinal = (n1 + n2);
        return mediaFinal;

    }
}
