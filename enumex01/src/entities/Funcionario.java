package entities;

import entities.enums.NivelTrabalhador;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Funcionario {
    private String nome;
    private NivelTrabalhador nivelTrabalhador;
    private double salario;

    private Departamento departamento;
    private List<ContratoHora> contratoHoras = new ArrayList<>();

    public Funcionario() {
    }

    public Funcionario(Departamento departamento, String nome, NivelTrabalhador nivelTrabalhador, double salario) {
        this.departamento = departamento;
        this.nome = nome;
        this.nivelTrabalhador = nivelTrabalhador;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public NivelTrabalhador getNivelTrabalhador() {
        return nivelTrabalhador;
    }

    public void setNivelTrabalhador(NivelTrabalhador nivelTrabalhador) {
        this.nivelTrabalhador = nivelTrabalhador;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<ContratoHora> getContratoHoras() {
        return contratoHoras;
    }

    public void adicionarContrato(ContratoHora contratoHora) {
        contratoHoras.add(contratoHora);
    }
    public void removerContrato(ContratoHora contratoHora) {
        contratoHoras.remove(contratoHora);
    }
    public double calcularSalario(int ano, int mes) {
        double soma = salario;
        Calendar cal = Calendar.getInstance();
        for (ContratoHora c : contratoHoras) {
            cal.setTime(c.getData());
            int c_ano = cal.get(Calendar.YEAR);
            int c_mes = 1 + cal.get(Calendar.MONTH);
            if(ano == c_ano && mes == c_mes) {
                soma += c.valorTotal();
            }
        }
        return soma;
    }
}
