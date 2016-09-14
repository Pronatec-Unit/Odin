package com.fsociety.calc.calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

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
        btnCalcular.setOnClickListener(new View.OnClickListener()) {

        }
    }
}
