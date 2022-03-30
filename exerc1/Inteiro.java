package exerc1;

import java.lang.Math;
public class Inteiro {
    private int valor;
    
    public int devolveValor() {
        return valor;
    }

    public void carregaValor(int v) {
        this.valor = v;
    }
    
    public int devolveValorAbsoluto() {
        return Math.abs(valor);
    }
    
    public void imprime() {
        System.out.printf("Valor: %d\n", this.valor);
    }
    
    public int soma(int v) {
        return this.valor + v;
    }
    
    public int subtrai(int v) {
        return this.valor - v;
    }
    
    public int multiplicaPor(int v) {
        return this.valor * v;
    }
    
    public double dividePor(int divisor) {
        if (divisor == 0) {
            System.out.println("Erro.");
            return this.valor;
        } else {
            return this.valor/divisor;
        }
    }
    
}
