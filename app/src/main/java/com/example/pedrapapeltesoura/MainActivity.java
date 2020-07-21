package com.example.pedrapapeltesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void selecionadoPedra(View view) {
        this.opcaoSelecionada(0);
    }

    public void selecionadoPapel(View view) {
        this.opcaoSelecionada(1);
    }

    public void selecionadoTesoura(View view) {
        this.opcaoSelecionada(2);
    }

    public void opcaoSelecionada(int opcao) {

        ImageView imageResultado = findViewById(R.id.ivPadrao);
        TextView textView = findViewById(R.id.textoTroca);

        int r = new Random().nextInt(3);

        switch (r) {

            case 0:
                imageResultado.setImageResource(R.drawable.pedra);
                break;
            case 1:
                imageResultado.setImageResource(R.drawable.papel);
                break;
            case 2:
                imageResultado.setImageResource(R.drawable.tesoura);

        }


        if ((r == 0 && opcao == 2) || (r == 1 && opcao == 0) || (r == 2 && opcao == 1))
            textView.setText("Voce Perdeu :( ");
        else if ((opcao == 0 && r == 2) || (opcao == 1 && r == 0) || (opcao == 2 && r == 1))
            textView.setText("Voce Venceu Parabéns :)");
        else
            textView.setText("Voce Empatou");


    }


}