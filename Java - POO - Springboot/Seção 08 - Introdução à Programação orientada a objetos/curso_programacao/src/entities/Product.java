package entities;

public class Product {
    public String nome;
    public double price;
    public int qtd;

    public double valorTotalEstoque() {
        return this.price *  this.qtd;
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
