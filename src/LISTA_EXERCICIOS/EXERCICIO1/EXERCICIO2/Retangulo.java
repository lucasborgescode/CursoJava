
package LISTA_EXERCICIOS.EXERCICIO1.EXERCICIO2;

public class Retangulo {
    
    private double largura;
    private double altura;
    
    public Retangulo(double largura, double altura) {
        
        this.largura = largura;
        this.altura = altura;
    }
    
    public double Area() {
        
        return this.largura * this.altura;
    }
    
    public double Perimetro() {
        
        return (this.altura * 2) + (this.largura * 2);
    }
}
