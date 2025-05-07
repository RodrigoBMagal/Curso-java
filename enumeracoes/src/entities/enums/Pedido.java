package entities.enums;

import java.util.Date;

public class Pedido {
    private Integer id;
    private Date momento;
    private StatusOrdem status;

    public Pedido() {
    }

    public Pedido(Integer id, Date momento, StatusOrdem status) {
        this.id = id;
        this.momento = momento;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public StatusOrdem getStatus() {
        return status;
    }

    public void setStatus(StatusOrdem status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", momento=" + momento +
                ", status=" + status +
                '}';
    }
}
