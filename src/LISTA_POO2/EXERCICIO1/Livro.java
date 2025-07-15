
package LISTA_POO2.EXERCICIO1;


public class Livro {
    
    private String titulo;
    private String autor;
    private int ano;
    
    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }
    
    public void exibirDados() {
        System.out.println("Titulo livro: " + this.titulo);
        System.out.println("Autor livro: " + this.autor);
        System.out.println("Ano" + this.ano);
    }
}
