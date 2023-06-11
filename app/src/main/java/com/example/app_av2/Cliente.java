package com.example.app_av2;

public class Cliente {
    String nomeCliente;
    String nomeClienteResponsavel;
    String telefoneClienteResponsavel;
    String creditoInicialCliente;

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNomeClienteResponsavel() {
        return nomeClienteResponsavel;
    }

    public void setNomeClienteResponsavel(String nomeClienteResponsavel) {
        this.nomeClienteResponsavel = nomeClienteResponsavel;
    }

    public String getTelefoneCliente() {
        return telefoneClienteResponsavel;
    }

    public void setTelefoneCliente(String telefoneCliente) {
        this.telefoneClienteResponsavel = telefoneClienteResponsavel;
    }

    public String getCreditoInicialCliente() {
        return creditoInicialCliente;
    }

    public void setCreditoInicialCliente(String creditoInicialCliente) {
        this.creditoInicialCliente = creditoInicialCliente;
    }
}
