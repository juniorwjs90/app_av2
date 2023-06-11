package com.example.app_av2;

public class Produto {
    String nomeProduto;
    double valorProduto;

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }
    public void addPrice(double valorProduto){
        this.valorProduto = valorProduto + 1;
    }

    public void removePrice(double valorProduto){
        this.valorProduto = valorProduto - 0.50;
    }
}
