
package Exercicio.Aplicacao;

import Exercicio.entities.Departamento;
import Exercicio.entities.HoraContrato;
import Exercicio.entities.Trabalhador;
import Exercicio.entities.enums.NivelTrabalhador;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;


public class Programa {
    
    public static void main(String[] args) throws ParseException {
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        System.out.print("Entre com o nome do departamento: ");
        String nomeDepartamento = sc.nextLine();
        System.out.println("Entre com os dados do trabalho: ");
        System.out.print("Nome: ");
        String nomeTrabalhador = sc.nextLine();
        System.out.print("Nivel de cargo: ");
        String nivelCargo = sc.nextLine();
        System.out.println("Base salario: ");
        double salarioBase = sc.nextDouble();
        
        Trabalhador trabalhador = new Trabalhador(nomeTrabalhador, NivelTrabalhador.valueOf(nivelCargo), 
                salarioBase, new Departamento(nomeDepartamento));
        
        System.out.print("Quantos contratos de trabalho o trabalhador tera?: ");
        int n = sc.nextInt();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            for(int i = 0; i < n; i++) {
            System.out.println("Entre com o numero do contrato: " + i);
            Date dataContrato = sdf.parse(sc.next());
            System.out.print("Valor por hora: ");
            double valorHora = sc.nextDouble();
            System.out.println("Duração (horas): ");
            int horas = sc.nextInt();    
            
            HoraContrato contrato = new HoraContrato(dataContrato, valorHora, horas);
            trabalhador.addContrato(contrato);
            }
            System.out.println();
            System.out.print("Entre com mes e ano para calcular salario anual:  ");
            String mesAno = sc.next();
            int mes = Integer.parseInt(mesAno.substring(0, 2));
            int ano = Integer.parseInt(mesAno.substring(3));
            System.out.println("Nome: " + trabalhador.getNome());
            System.out.println("Departamento: " + trabalhador.getDepartamento().getName());
            System.out.println("Salario anual" + mesAno + ": " + trabalhador.salarioAno(ano, mes));
            
        }catch(ParseException e) {
            System.out.println(e.getMessage());
        }
      
        
        sc.close();
    }
}
