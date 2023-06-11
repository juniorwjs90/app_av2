package com.example.app_av2;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class ConectarDB extends SQLiteOpenHelper {
    private static ConectarDB instance = null;

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "bancoAppAv2.sqlite";

    private Context context;

    public ConectarDB(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public static ConectarDB SharedInstance(Context context){
        if (instance == null){
            instance = new ConectarDB(context);
        } return instance;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query1, query2;
        query1 = "CREATE TABLE IF NOT EXISTS TbProduto (nomeProduto TEXT NOT NULL, " +
                "valorProduto TEXT NOT NULL)";
        query2 = "CREATE TABLE IF NOT EXISTS TbCliente (nomeCliente TEXT NOT NULL, " +
                "nomeClienteResponsavel TEXT NOT NULL, telefoneClienteResponsavel TEXT, creditoInicialCliente TEXT NOT NULL)";
        db.execSQL(query1);
        db.execSQL(query2);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }

    public long insertCliente(Cliente cliente){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put("nomeCliente", cliente.getNomeCliente());
        values.put("nomeClienteResponsavel", cliente.getNomeClienteResponsavel());
        values.put("telefoneClienteResponsavel", cliente.getTelefoneCliente());
        values.put("creditoInicialCliente", cliente.getCreditoInicialCliente());

        long ocorrinsertCliente = db.insert("TbCliente","", values);
        db.close();

        return ocorrinsertCliente;
    }

    public long insetProduto(Produto produto) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put("nomeProduto", produto.getNomeProduto());
        values.put("valorProduto", produto.getValorProduto());

        long ocorreinsertProduto = db.insert("TbProduto", "", values);
        db.close();

        return ocorreinsertProduto;
    }
}
