package entities;

public class Juridica extends Pessoa {

    private Integer numeroFuncionarios;

    public Juridica() {
        super();
    }

    public Juridica(String nome, Double rendaAnual, Integer numeroFuncionarios) {
        super(nome, rendaAnual);
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public Integer getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void setNumeroFuncionarios(Integer numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }

    @Override
    public double calcularImposto() {
        return (this.numeroFuncionarios > 10) ? getRendaAnual() * 0.14 : getRendaAnual() * 0.16;
    }
}
