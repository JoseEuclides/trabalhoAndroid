package com.eduardo.applogin.cardapioapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MainActivity extends AppCompatActivity {

    ListView list;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cadastroInicial();

        carregaLanches();


    }

    public AdapterView.OnItemClickListener detalheLanche(final Context context){
        return (new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> av, View view, int position, long id) {
                Object o = av.getItemAtPosition(position);
                String str=(String)o;

                Lanches l = Colecoes.getInstance().localizaLancheNome(str);


                Intent detalhe = new Intent(getBaseContext(), DetalheLanche.class);

                Bundle b = new Bundle();
                b.putString("nome", l.getNomeLanche());
                b.putString("detalhe", l.getIngredientes());
                b.putString("valor", String.valueOf(l.getValor()));

                detalhe.putExtras(b);

                startActivity(detalhe);



            }
        });
    }

    public void cadastroInicial(){


    }

    public void carregaLanches(){
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, Colecoes.getInstance().getLanchesNome());

        list = (ListView) findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(detalheLanche(this));

    }

    public void cadastrarLanche(View view) {
        Intent i = new Intent(getBaseContext(), CadastroLanche.class);

        startActivity(i);

    }

    @Override
    protected void onResume() {
        super.onResume();
        carregaLanches();
    }
}
