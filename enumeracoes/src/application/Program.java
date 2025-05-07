package application;

import entities.enums.Pedido;
import entities.enums.StatusOrdem;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        Pedido pedido = new Pedido(1080, new Date(), StatusOrdem.PAGAMENTO_PENDENTE);

        System.out.println(pedido);

        StatusOrdem so1 = StatusOrdem.ENTREGUE;

        StatusOrdem so2 = StatusOrdem.valueOf("ENTREGUE");

        System.out.println(so1);
        System.out.println(so2);
    }
}
