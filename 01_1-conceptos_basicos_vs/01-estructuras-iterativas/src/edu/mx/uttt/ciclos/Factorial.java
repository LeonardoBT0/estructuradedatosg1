package edu.mx.uttt.ciclos;

public class Factorial {
    private int n;

    public Factorial (){
        this.n = 1;
    }

    public Factorial(int n) {

        // if (n > 0) {
        // this.n = n;
        // } else {
        // this.n = 1;
        // }
        this.n = (n <= 0) ? 1 : n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = (n > 0) ? n : 1;
    }

    public double calcularFor(){

        long fact = 1;

        for (int i = 1; i <= this.n; i++) {
            fact *= i;
        }
        return fact;
    }

    public double calcularWhile(){
        long fact = 1;
        int i = 1;
         while (i<=this.n) {
            fact*=i;
            i++;
         }
         return fact;
    }

    @Override
    public String toString() {
        return "Serie [n=" + n + "]";
    }
    
}
