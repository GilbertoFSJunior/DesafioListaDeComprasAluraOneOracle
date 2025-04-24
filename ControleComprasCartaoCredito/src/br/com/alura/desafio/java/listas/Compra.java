package br.com.alura.desafio.java.listas;

public class Compra implements Comparable<Compra> {
    private String Descricao;
    private double valor;

    public Compra(String descricao, double valor) {
        Descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return Descricao;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Compra: descrição = " + Descricao + ", valor = " + valor;
    }

    @Override
    public int compareTo(Compra outraCompra) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(outraCompra.valor));
    }
}
