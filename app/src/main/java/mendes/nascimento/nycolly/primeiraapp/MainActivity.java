package mendes.nascimento.nycolly.primeiraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // declarando o botão enviar e informando o id
        Button btnEnviar = findViewById(R.id.btnEnviar);
        // definindo click do botão
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // definindo o editText
                EditText etTexto=findViewById(R.id.etDigiteAqui);
                //colocando o texto do etTexto em uma string
                String textoDigitado=etTexto.getText().toString();
                //criando um intent para pegar o texto que for digitado//
                Intent i=new Intent(MainActivity.this,ProximaAtividade.class);
                i.putExtra("Texto",textoDigitado);
                startActivity(i);

            }
        });
    }
}