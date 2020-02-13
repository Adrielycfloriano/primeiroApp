package com.example.meuprimeiroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.meuprimeiroapp.activities.ActivityProduto;

public class MainActivity extends AppCompatActivity {


    private Button btnCadastroProdutos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.btnCadastroProdutos = (Button) findViewById(R.id.btnCadastroProdutos);
        this.btnCadastroProdutos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // tudo que estiver aqui dentro será executado ao clicar no botão.
                startActivity(new Intent(MainActivity.this, ActivityProduto.class));
            }
        });

        {

        }
    }
}
