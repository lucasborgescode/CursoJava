
package Exercicio.entities;

import Exercicio.entities.enums.NivelTrabalhador;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


public class Trabalhador {
    
    private String nome;
    private NivelTrabalhador nivel;
    private double baseSalarial;
    
    private Departamento departamento;
    private List<HoraContrato> contratos = new ArrayList<>();
    
    public Trabalhador() {
        
    }

    public Trabalhador(String nome, NivelTrabalhador nivel, double baseSalarial, Departamento departamento) {
        this.nome = nome;
        this.nivel = nivel;
        this.baseSalarial = baseSalarial;
        this.departamento = departamento;
    }
    
    public void addContrato(HoraContrato contrato) {
        contratos.add(contrato);
    }
    public void removeContrato(HoraContrato contrato) {
        contratos.remove(contrato);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public NivelTrabalhador getNivel() {
        return nivel;
    }

    public void setNivel(NivelTrabalhador nivel) {
        this.nivel = nivel;
    }

    public double getBaseSalarial() {
        return baseSalarial;
    }

    public void setBaseSalarial(double baseSalarial) {
        this.baseSalarial = baseSalarial;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<HoraContrato> getContratos() {
        return contratos;
    }
    public double salarioAno(int ano, int mes) {
        double soma = baseSalarial;
        Calendar cal = Calendar.getInstance();
        for(HoraContrato c : contratos) {
            cal.setTime(c.getData());
            int c_ano = cal.get(Calendar.YEAR);
            int c_mes = 1 + cal.get(Calendar.MONTH);
            if(ano == c_ano && mes == c_mes) {
                soma += c.totalValor();
            } 
        }
        return soma;
    }
    
}
