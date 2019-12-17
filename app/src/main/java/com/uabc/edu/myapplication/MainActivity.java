package com.uabc.edu.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int contador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //activity_main.xml
        setContentView(R.layout.activity_main);
        final TextView elTexto=findViewById(R.id.elTexto);

        final EditText textoDeEntrada=findViewById(R.id.entradaDeTexto);

        //Recupera el boton de la vista XML (layout)
        Button myBoton=findViewById(R.id.myBoton);
        myBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Mediante el string en values
                contador++;
                elTexto.setText(R.string.titulo);
                elTexto.setText(elTexto.getText().toString()+contador);
                //Texto directo
                //elTexto.setText("!!Soy el titulo!!! Contador:"+contador);
            }
        });

        Button miBoton2=findViewById(R.id.myBoton2);

        final TextView texto2 = findViewById(R.id.texto2);
        miBoton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this,
                        textoDeEntrada.getText(),
                        Toast.LENGTH_SHORT).show();
                }
        });


    }

    @Override
    protected void onStart() {
        super.onStart();
        System.err.println("++++:OnStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.err.println("++++:OnResume");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        System.err.println("++++:OnRestart");

    }

    @Override
    protected void onStop() {
        super.onStop();
        System.err.println("++++:OnStop");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.err.println("++++:OnDestroy");

    }
}
