package com.example.diego.trabalhoandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    Lanche lc;
    private ImageButton incluir;
    Intent i;
    ListView lista;
    int cod=0;
    static Lanche[] lanches = new Lanche[100];
    ArrayAdapter<String> adapterLista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        incluir = (ImageButton) findViewById(R.id.imageButton);
        lista = (ListView) findViewById(R.id.listView);



        adapterLista = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
        lista.setAdapter(adapterLista);
        lista.setOnItemClickListener(this);

        Lanche lanche = new Lanche();
        lanche.setNome("X-AVC");
        lanche.setCodigo(cod);
        lanche.setPreco("18.50");
        lanche.setIngredientes("Pão, Hamburguer, Queijo, presunto, Bacon, Calabresa, Milho, Ovo, Salsicha, Catupiry");
        lanches[cod] = lanche;
        cod++;

        adapterLista.add(lanche.getNome());


        lanche = new Lanche();
        lanche.setNome("X-Bacon");
        lanche.setCodigo(cod);
        lanche.setPreco("15.50");
        lanche.setIngredientes("Pão, Hamburguer, Bacon, Queijo, Presunto, Alface, Tomate, milho, Ovo");
        lanches[cod] = lanche;
        cod++;
        adapterLista.add(lanche.getNome());

        lanche = new Lanche();
        lanche.setNome("X-Dog");
        lanche.setCodigo(cod);
        lanche.setPreco("13.50");
        lanche.setIngredientes("Pão, Salsicha, ovo, presunto, alface, Tomate, Milho, Ovo");
        lanches[cod] = lanche;
        cod++;
        adapterLista.add(lanche.getNome());

        lanche = new Lanche();
        lanche.setNome("X-Tudo");
        lanche.setCodigo(cod);
        lanche.setPreco("12.50");
        lanche.setIngredientes("Pão, hamburguer, frango, ovo, salsicha, bacon, calabresa, queijo, presunto, alface, tomate, milho, batata");
        lanches[cod] = lanche;
        cod++;
        adapterLista.add(lanche.getNome());

        lanche = new Lanche();
        lanche.setNome("Especial");
        lanche.setCodigo(cod);
        lanche.setPreco("12.50");
        lanche.setIngredientes("Pão, hamburguer, calabresa, alface, tomate, milho, batata");
        lanches[cod] = lanche;
        cod++;
        adapterLista.add(lanche.getNome());

        lanche = new Lanche();
        lanche.setNome("Misto Quente");
        lanche.setCodigo(cod);
        lanche.setPreco("12.50");
        lanche.setIngredientes("Pão de Forma, queijo, presunto");
        lanches[cod] = lanche;
        cod++;
        adapterLista.add(lanche.getNome());

        lanche = new Lanche();
        lanche.setNome("X-Egg");
        lanche.setCodigo(cod);
        lanche.setPreco("12.50");
        lanche.setIngredientes("Pão, hamburguer, 2 ovos, queijo, presunto, alface, tomate, milho");
        lanches[cod] = lanche;
        cod++;
        adapterLista.add(lanche.getNome());

        lanche = new Lanche();
        lanche.setNome("X-Calabresa");
        lanche.setCodigo(cod);
        lanche.setPreco("12.50");
        lanche.setIngredientes("Pão, calabresa, ovo, queijo, alface, tomate, milho");
        lanches[cod] = lanche;
        cod++;
        adapterLista.add(lanche.getNome());

        lanche = new Lanche();
        lanche.setNome("X-Mega Pitbull");
        lanche.setCodigo(cod);
        lanche.setPreco("12.50");
        lanche.setIngredientes("Pão, 2 hamburgues, 2 frango, 2 ovos, 2 salsichas, bacon, calabresa, queijo, presunto, alface, tomate, milho");
        lanches[cod] = lanche;
        cod++;
        adapterLista.add(lanche.getNome());

        lanche = new Lanche();
        lanche.setNome("Pik Nik");
        lanche.setCodigo(cod);
        lanche.setPreco("12.50");
        lanche.setIngredientes("Pão, ovo, presunto, bancon, queijo, alface, tomate, azeitona");
        lanches[cod] = lanche;
        cod++;
        adapterLista.add(lanche.getNome());

        lanche = new Lanche();
        lanche.setNome("X-Doce");
        lanche.setCodigo(cod);
        lanche.setPreco("12.50");
        lanche.setIngredientes("Pão de mel, chocolate, morango, amendoim");
        lanches[cod] = lanche;
        cod++;
        adapterLista.add(lanche.getNome());

        lanche = new Lanche();
        lanche.setNome("X-Pimenta");
        lanche.setCodigo(cod);
        lanche.setPreco("12.50");
        lanche.setIngredientes("Pão, hamburguer, 2 pimentas,  queijo, presunto, alface, tomate, milho");
        lanches[cod] = lanche;
        cod++;
        adapterLista.add(lanche.getNome());


        i = getIntent();
        Bundle b = i.getExtras();
        if(b != null){

            lc = (Lanche) b.get("lancheCadastrado");

            adapterLista.add(lc.getNome());

        }
    }
    public void Cadastrar(View v) {
        Intent i = new Intent(getBaseContext(),CadastroActivity.class);
        i.putExtra("count", cod);
        startActivity(i);


    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        Intent i = new Intent(getApplicationContext(), DetalhesActivity.class);
        i.putExtra("id", lanches[position].getCodigo());
        i.putExtra("nome", lanches[position].getNome());
        i.putExtra("preco", lanches[position].getPreco());
        i.putExtra("ingredientes", lanches[position].getIngredientes());

        startActivity(i);
    }
}
