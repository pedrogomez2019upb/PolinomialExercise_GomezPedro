package edu.upb.ds.linkedList;

public class Polinomial {
    String coeficient;
    String exponent;

    public String getCoeficient() {
        return coeficient;
    }

    public void setCoeficient(String coeficient) {
        this.coeficient = coeficient;
    }

    public String getExponent() {
        return exponent;
    }

    public void setExponent(String exponent) {
        this.exponent = exponent;
    }

    public Polinomial(){}

    public Polinomial(String coeficient, String exponent) {
        this.coeficient = coeficient;
        this.exponent = exponent;
    }

    @Override
    public String toString() {

        return "Polinomial{" +
                "coeficient='" + coeficient + '\'' +
                ", exponent='" + exponent + '\'' +
                '}';
    }
}
