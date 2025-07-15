
package Vetores;

import java.util.Scanner;


public class Exercicio {
    
    private String nome;
    private double preco;

    public Exercicio(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    
    
    
    public static void main(String[]args) {
        
        Scanner sc = new Scanner(System.in);
        
        int numero = sc.nextInt();
        
        Exercicio[] vect = new Exercicio[numero];
        
        for(int i = 0; i < numero; i++) {
            sc.nextLine();
            String nome = sc.nextLine();
            double preco = sc.nextDouble();
            
            vect[i] = new Exercicio(nome, preco);
        }
        
        double sum = 0.0;
        for(int i = 0; i < numero; i++) {
            sum += vect[i].getPreco();
        }
        double avg = sum / numero;
        System.out.println(avg);
        
       
        
        
    }
}
