package com.example.app_av2;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;

public class AdicionarCliente extends Activity {
    private EditText innomeCliente;
    private EditText innomeClienteResponsavel;
    private EditText intelefoneClienteResponsavel;
    private EditText increditoInicialCliente;
    private ConectarDB db;

    public void voltarAoMenu(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
        finish();
    }

    public void adicionarCliente(View view){
        this.db = ConectarDB.SharedInstance(this);

        innomeCliente = (EditText) findViewById(R.id.entNomeCliente);
        innomeClienteResponsavel = (EditText) findViewById(R.id.nomeClienteResponsavel);
        intelefoneClienteResponsavel = (EditText) findViewById(R.id.entTelefoneResponsavel);
        increditoInicialCliente = (EditText) findViewById(R.id.entCreditos);

        Cliente cliente = new Cliente();

        cliente.setNomeCliente(innomeCliente.getText().toString());
        cliente.setNomeClienteResponsavel(innomeClienteResponsavel.getText().toString());
        cliente.setTelefoneCliente(intelefoneClienteResponsavel.getText().toString());
        cliente.setCreditoInicialCliente(increditoInicialCliente.getText().toString());

        long aux = db.insertCliente(cliente);

    }
}
