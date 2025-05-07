package application;

import entities.Coment;
import entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Coment c1 = new Coment("Tenha uma ótima viagem!");
        Coment c2 = new Coment("Uau, isso é incrivel!");
        Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"),
                "Viajando para Nova Zelandia",
                "Vou visitar esse país maravilhoso",
                12);
        p1.addComentario(c1);
        p1.addComentario(c2);

        System.out.println(p1);

        Coment c3 = new Coment("Boa noite");
        Coment c4 = new Coment("Que a força esteja convosco!");

        Post p2 = new Post(sdf.parse("28/07/2018 23:14:19"),
                            "Boa noite pessoal",
                            "Vejo vocês amanhã",
                            5);
        p2.addComentario(c3);
        p2.addComentario(c4);

        System.out.println(p2);
    }
}
