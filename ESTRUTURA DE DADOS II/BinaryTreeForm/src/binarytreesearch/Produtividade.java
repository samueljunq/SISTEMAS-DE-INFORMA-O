package binarytreesearch;

public class Produtividade implements Comparable<Produtividade> {
    private int ano;
    private double indiceProdutividade;

    public Produtividade(int ano, double indiceProdutividade) {
        this.ano = ano;
        this.indiceProdutividade = indiceProdutividade;
    }

    Produtividade() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getIndiceProdutividade() {
        return indiceProdutividade;
    }

    public void setIndiceProdutividade(double indiceProdutividade) {
        this.indiceProdutividade = indiceProdutividade;
    }

    @Override
    public int compareTo(Produtividade outro) {
        return Integer.compare(this.ano, outro.ano);
    }

    @Override
    public String toString() {
        return "Ano: " + this.ano + " Índice de Produtividade: " + this.indiceProdutividade;
    }
}