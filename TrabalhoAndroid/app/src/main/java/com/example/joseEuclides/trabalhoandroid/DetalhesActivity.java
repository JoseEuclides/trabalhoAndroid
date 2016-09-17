package com.example.diego.trabalhoandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class DetalhesActivity extends AppCompatActivity {

    TextView codigo;
    TextView nome;
    TextView preco;
    TextView ingresientes;
    int cod;
    String nomeRecibido, precoRecibido, ingredientesRecibido;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes);
        Intent i = getIntent();
        Bundle b = i.getExtras();
        if(b != null){
            cod = (int) b.get("id");
            nomeRecibido = (String) b.get("nome");
            precoRecibido = (String) b.get("preco");
            ingredientesRecibido = (String) b.get("ingredientes");
        }


        codigo = (TextView)findViewById(R.id.textView14);
        preco = (TextView)findViewById(R.id.textView16);
        nome = (TextView)findViewById(R.id.textView15);
        ingredientes = (TextView)findViewById(R.id.textView17);

        codigo.setText(cod+"");
        preco.setText(precoRecibido);
        nome.setText(nomeRecibido);
        ingresientes.setText(recheioRecibido);

    }

    public void Voltar(View view){
        Intent i = new Intent(getBaseContext(),MainActivity.class);
        startActivity(i);
    }
}
