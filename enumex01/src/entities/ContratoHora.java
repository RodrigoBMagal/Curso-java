package entities;

import java.util.Date;

public class ContratoHora {
    private Date data;
    private Double valorhora;
    private Integer hora;

    public ContratoHora() {
    }

    public ContratoHora(Date data, Double valorhora, Integer hora) {
        this.data = data;
        this.valorhora = valorhora;
        this.hora = hora;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Double getValorhora() {
        return valorhora;
    }

    public void setValorhora(Double valorhora) {
        this.valorhora = valorhora;
    }

    public Integer getHora() {
        return hora;
    }

    public void setHora(Integer hora) {
        this.hora = hora;
    }
    public double valorTotal(){
        return valorhora * hora;
    }
}
