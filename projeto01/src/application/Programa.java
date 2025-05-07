package application;

import entities.CD;
import entities.DVD;
import entities.Livro;
import entities.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Produto> estoque = new ArrayList<>();

        System.out.print("Insira uma quantidade de produtos para começarmos: ");
        int qndprodutos = sc.nextInt();

        for (int i = 1; i <= qndprodutos; i++) {
            System.out.print("Qual tipo de produto você quer inserir, seja ele livro, CD, ou DVD (l/c/d)?");

            char tipo = sc.next().charAt(0);

            System.out.print("Nome do produto: ");
            sc.nextLine();
            String nome = sc.nextLine();

            if (tipo == 'l') {
                System.out.print("Coloque o autor do livro: ");
                String autor = sc.nextLine();
                System.out.print("Coloque a editora: ");
                String editora = sc.nextLine();
                System.out.print("Escreva uma sinopse: ");
                String sinopse = sc.nextLine();

                estoque.add(new Livro(nome, autor, editora, sinopse));
            }
            else if (tipo == 'c') {
                System.out.print("Coloque o artista do CD: ");
                String artista = sc.nextLine();
                System.out.print("Coloque o ano do CD: ");
                int ano = sc.nextInt();
                System.out.print("Coloque o gênero do CD: ");
                sc.nextLine();
                String genero = sc.nextLine();

                estoque.add(new CD(nome, artista, ano, genero));
            }
            else {
                System.out.print("Coloque o ano do DVD: ");
                int ano = sc.nextInt();
                System.out.print("Coloque o diretor do DVD: ");
                sc.nextLine();
                String diretor = sc.nextLine();
                System.out.print("Coloque o gênero do DVD: ");
                String genero = sc.nextLine();

                estoque.add(new DVD(nome, ano, diretor, genero));
            }

        }


        int menu = 0;

        while (menu != 4) {
            System.out.print(
                    "1 - Adicionar um produto:"
                            + "\n2 - Listar todos os produtos: "
                            + "\n3 - Listar um tipo de produto seja ele livro, CD, ou DVD (l/c/d):"
                            + "\n4 - Sair: \n");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    System.out.print("Qual tipo de produto você quer inserir, seja ele livro, CD, ou DVD (l/c/d)?");
                    char tipo = sc.next().charAt(0);

                    System.out.print("Nome do produto: ");
                    sc.nextLine();
                    String nome = sc.nextLine();

                    if (tipo == 'l') {
                        System.out.print("Coloque o autor do livro: ");
                        String autor = sc.nextLine();
                        System.out.print("Coloque a editora: ");
                        String editora = sc.nextLine();
                        System.out.print("Escreva uma sinopse: ");
                        String sinopse = sc.nextLine();

                        estoque.add(new Livro(nome, autor, editora, sinopse));
                    }
                    else if (tipo == 'c') {
                        System.out.print("Coloque o artista do CD: ");
                        String artista = sc.nextLine();
                        System.out.print("Coloque o ano do CD: ");
                        int ano = sc.nextInt();
                        System.out.print("Coloque o gênero do CD: ");
                        sc.nextLine();
                        String genero = sc.nextLine();

                        estoque.add(new CD(nome, artista, ano, genero));
                    }
                    else {
                        System.out.print("Coloque o ano do DVD: ");
                        int ano = sc.nextInt();
                        System.out.print("Coloque o diretor do DVD: ");
                        sc.nextLine();
                        String diretor = sc.nextLine();
                        System.out.print("Coloque o gênero do DVD: ");
                        String genero = sc.nextLine();

                        estoque.add(new DVD(nome, ano, diretor, genero));
                    }
                    break;
                case 2:
                    for (Produto produto : estoque) {
                        System.out.println(produto.getNome());
                    }
                    break;
                case 3:
                    System.out.println("Qual tipo de produto você quer listar? ");
                    tipo = sc.next().charAt(0);
                    if (tipo == 'l') {
                        for (Produto produto : estoque) {
                            if (produto instanceof Livro) {
                                System.out.println(produto);
                            }
                        }

                    }
                    else if (tipo == 'c') {
                        for (Produto produto : estoque) {
                            if (produto instanceof CD) {
                                System.out.println(produto);
                            }
                        }
                    }
                    else {
                        for (Produto produto : estoque) {
                            if (produto instanceof DVD) {
                                System.out.println(produto);
                            }
                        }
                    }

            }
        }
    }
}
