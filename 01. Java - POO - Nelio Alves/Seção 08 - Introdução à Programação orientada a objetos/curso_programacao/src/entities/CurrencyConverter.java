package entities;

public class CurrencyConverter {

    public static double dollarToReal(double valor, double qtd){
        return valor * qtd * 1.06;
    };
}
