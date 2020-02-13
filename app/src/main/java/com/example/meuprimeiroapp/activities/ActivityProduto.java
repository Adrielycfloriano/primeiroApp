package com.example.meuprimeiroapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.meuprimeiroapp.Model.Produto;
import com.example.meuprimeiroapp.R;

public class ActivityProduto extends AppCompatActivity{

    private EditText edtNomeProduto;
    private EditText edtQuantidadeProduto;
    private EditText edtPrecoProduto;
    private TextView tvSucesso;
    private Button   bntSalvarProduto;
    private Produto  produto;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produto);

        edtNomeProduto = (EditText) findViewById(R.id.edtNomeProduto);
        edtQuantidadeProduto = (EditText) findViewById(R.id.edtQuantidadeProduto);
        edtPrecoProduto = (EditText) findViewById(R.id.edtPrecoProduto);
        tvSucesso = (TextView) findViewById(R.id.teste);
        bntSalvarProduto = (Button) findViewById(R.id.bntSalvarProduto);
//        bntSalvarProduto.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View v) {
////
////            }
//        });

    }
    private Produto getDadosProdutoDoFormulario () {
        this.produto = new Produto();
        if (!this.edtNomeProduto.getText().toString().isEmpty()) {
            this.produto.setNome(this.edtNomeProduto.getText().toString());
        }
        if (this.edtQuantidadeProduto.getText().toString().isEmpty() == false) {
            int quantidadeProduto = Integer.parseInt(this.edtQuantidadeProduto.getText().toString());
            this.produto.setQuantidadeEmEstoque(quantidadeProduto);
        }
        if (edtPrecoProduto.getText().toString().isEmpty() == false) {
            Double precoProduto = Double.parseDouble(this.edtPrecoProduto.getText().toString());
            this.produto.setPreco(precoProduto);
        }
        return produto;

    }

}
