package entities;

public class CurrencyConverter {


    public double dolar;
    public double real(){
        return dolar * 3.10;
    }

    public  double total(){
        return real() + (real() * 0.06);
    }
    public String toString() {
        return "Preço a pagar em reais: " + real();
    }

}
