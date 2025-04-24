package br.com.alura.desafio.java.listas;

import java.util.List;
import java.util.ArrayList;

public class CartaoDeCredito {
    private double limite;
    private double saldo;
    private List<Compra> compras;

    public CartaoDeCredito(double limite) {
        this.limite = limite;
        this.saldo = limite; // Inicialização correta do saldo como o limite
        this.compras = new ArrayList<>();
    }

    public boolean lancaCompra(Compra compra) {
        if (this.saldo >= compra.getValor()) { // Corrigido para saldo >= compra.getValor
            this.saldo -= compra.getValor();
            this.compras.add(compra);
            return true;
        }
        return false;
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo; // Mantendo o método de consulta do saldo
    }

    public List<Compra> getCompras() { // Retornando a lista real de compras
        return compras;
    }
}
