package entities;

public class Product {
    private String nome;
    private double price;
    private int qtd;

    public Product() {
    }

    public Product(String nome, double price, int qtd) {
        this.nome = nome;
        this.price = price;
        this.qtd = qtd;
    }

    public Product(String nome, double price) {
        this.nome = nome;
        this.price = price;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQtd() {
        return qtd;
    }

    public double valorTotalEstoque() {

        return this.price * this.qtd;
    }

    public void adicionarProduto(int valor){

        this.qtd += valor;
    }

    public void removerProduto(int valor){

        this.qtd -= valor;
    }

    public String toString(){
        return nome
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + qtd
                + " unitsm Total: $ "
                + String.format("%.2f", valorTotalEstoque());
    }
}

