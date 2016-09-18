﻿package com.example.jose.calculadora;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edValor1,edValor2;
    TextView tvResultado;
    double resultado;
    double val1,val2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edValor1 = (EditText)findViewById(R.id.edValor1);
        edValor2 = (EditText)findViewById(R.id.edValor2);

        tvResultado = (TextView)findViewById(R.id.tvResultado);

    }

    public void somar(View view) {

        val1 = Double.parseDouble(edValor1.getText().toString());
        val2 = Double.parseDouble(edValor2.getText().toString());

        resultado = val1 + val2;

        tvResultado.setText(""+resultado);
    }

    public void subtrair(View view) {
        val1 = Double.parseDouble(edValor1.getText().toString());
        val2 = Double.parseDouble(edValor2.getText().toString());

        resultado = val1 - val2;

        tvResultado.setText(""+resultado);
    }

    public void multiplicar(View view) {
        val1 = Double.parseDouble(edValor1.getText().toString());
        val2 = Double.parseDouble(edValor2.getText().toString());

        resultado = val1 * val2;

        tvResultado.setText(""+resultado);

    }

    public void dividir(View view) {
        if(Double.parseDouble(edValor2.getText().toString()) == 0) {
            tvResultado.setText("Não pode dividir por 0");
        }else {
            val1 = Double.parseDouble(edValor1.getText().toString());
            val2 = Double.parseDouble(edValor2.getText().toString());
            resultado = val1 / val2;
            tvResultado.setText("" + resultado);
        }
    }
}
