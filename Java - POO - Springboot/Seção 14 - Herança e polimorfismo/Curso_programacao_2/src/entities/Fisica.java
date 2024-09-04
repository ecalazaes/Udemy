package entities;

public class Fisica extends Pessoa {

    private Double gastosSaude;

    public Fisica() {
        super();
    }

    public Fisica(String nome, Double rendaAnual, Double gastpsSaude) {
        super(nome, rendaAnual);
        this.gastosSaude = gastpsSaude;
    }

    public Double getGastpsSaude() {
        return gastosSaude;
    }

    public void setGastpsSaude(Double gastpsSaude) {
        this.gastosSaude = gastpsSaude;
    }

    public double calcularImposto() {
        if (getRendaAnual() < 20000) {
            if (gastosSaude > 0) {
                return (getRendaAnual() * 0.15) - (this.gastosSaude * 0.50);
            } else {
                return getRendaAnual() * 0.15;
            }
        } else {
            if (gastosSaude > 0) {
                return (getRendaAnual() * 0.25) - (this.gastosSaude * 0.50);
            } else {
                return getRendaAnual() * 0.25;
            }
        }
    }
}

