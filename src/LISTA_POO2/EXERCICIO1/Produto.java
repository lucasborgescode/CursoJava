
package LISTA_POO2.EXERCICIO1;


public class Produto {
    
    private String nome;
    private double preco;
    private int qtde;
    
    public Produto(String nome, double preco, int qtde) {
        this.nome = nome;
        this.preco = preco;
        this.qtde = qtde;
    }
    
    public void exibirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("preco" + this.preco);
        System.out.println("Qtde: " + this.qtde);
    }
    
    public void calcularTotalEstoque() {
        System.out.println("O valor total em estoque é: R$" + this.preco * this.qtde);
    }
}
