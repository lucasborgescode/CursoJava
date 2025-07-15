
package POO_EXERCICIO2;


public class Retangulo {
    
    public double largura;
    public double altura;
    
    public double Area() {
        return largura * altura;
    }
    public double Perimetro() {
        return (largura * 2) + (altura * 2);
    }
    
    public double Diagonal() {
        return altura * Math.sqrt(2.0);
    }
}
