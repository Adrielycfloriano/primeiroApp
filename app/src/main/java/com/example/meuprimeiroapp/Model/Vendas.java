package com.example.meuprimeiroapp.Model;

import java.util.Date;

public class Vendas {

    private long id;
    private Produto produtoVendido;
    private Date dataDaVenda;
    private String nomeDoCliente;

    public Vendas() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Produto getProdutoVendido() {
        return produtoVendido;
    }

    public void setProdutoVendido(Produto produtoVendido) {
        this.produtoVendido = produtoVendido;
    }

    public Date getDataDaVenda() {
        return dataDaVenda;
    }

    public void setDataDaVenda(Date dataDaVenda) {
        this.dataDaVenda = dataDaVenda;
    }

    public String getNomeDoCliente() {
        return nomeDoCliente;
    }

    public void setNomeDoCliente(String nomeDoCliente) {
        this.nomeDoCliente = nomeDoCliente;
    }

    @Override
    public String toString() {
        return "Vendas{" +
                "id=" + id +
                ", produtoVendido=" + produtoVendido +
                ", dataDaVenda=" + dataDaVenda +
                ", nomeDoCliente='" + nomeDoCliente + '\'' +
                '}';
    }
}

