package com.androidizate.frasesdeldia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button botonFrase;
    EditText muestroFrase;
    List<String> listaFrase = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        botonFrase = (Button) findViewById(R.id.btn_obtener_frase);
        muestroFrase = (EditText) findViewById(R.id.tv_frase);
        crearFrases();
        botonFrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                muestroFrase.setText(listaFrase.get(seleccionFrase()));
            }
        });

    }

    private void crearFrases() {
        listaFrase.add("Va a ser un buen dia");
        listaFrase.add("Ojo por ojo");
        listaFrase.add("A quien mal anda");
        listaFrase.add("Vamos a tomar algo");
        listaFrase.add("Frase incompleta");
        listaFrase.add("Va a ser un buen dia 6");
        listaFrase.add("Va a ser un buen dia 7");
        listaFrase.add("Va a ser un buen dia 8");
        listaFrase.add("Va a ser un buen dia 9");
        listaFrase.add("Va a ser un buen dia 10");
    }

    private int seleccionFrase() {
        Random rand = new Random();
        return rand.nextInt(10);
    }
}
