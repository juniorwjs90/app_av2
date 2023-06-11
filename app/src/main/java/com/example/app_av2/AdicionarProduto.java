package com.example.app_av2;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AdicionarProduto extends Activity {

    private EditText innomeProduto;
    private EditText invalorProduto;
    private ConectarDB db;

    public void voltarAoMenu(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
        finish();
    }

    public void adicionarNovoProduto(View view) {
        Produto produto = new Produto();

        produto.setNomeProduto(innomeProduto.getText().toString());
        produto.setValorProduto(Double.parseDouble(invalorProduto.getText().toString()));
    }
}
