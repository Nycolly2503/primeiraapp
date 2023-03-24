package mendes.nascimento.nycolly.primeiraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ProximaAtividade extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setando a proxima atividade,ou seja, criando uma ligação entre as duas páginas do app
        setContentView(R.layout.activity_proxima_atividade);
        Intent a=getIntent();
        String textodigitado= a.getStringExtra("Texto");
        //definindo o textView que vai receber o texto
        TextView tvTexto=findViewById(R.id.tvTexto);
        // definindo que o textView vai receber o texto digitado na página anterior
        tvTexto.setText(textodigitado);

    }
}