
package INTERFACE;


public class Aluno implements Crud, CrudRemove {

    @Override
    public void loader() {
        System.out.println("Carregando dados da interface");
    }
    
    @Override
    public void alunoRemove() {
        System.out.println("Removendo dados");
    }
    
    
    
}
