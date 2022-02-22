package exercicios.ex2;

import exercicios.ex2.comparadores.ComparatorAnoNome;
import exercicios.ex2.comparadores.ComparatorIde;
import exercicios.ex2.comparadores.ComparatorNomeAnoDeCriacaoIde;

import java.util.*;

/*
Crie uma classe LinguagemFavorita que possua os atributos nome, anoDeCriacao e IDE.
Em seguida, crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por:
a) Ordem de inserção;
b) Ordem natural(nome);
c) IDE;
d) Ano de criação e nome;
e) Nome, ano de criação e IDE;
Ao final, exiba as linguagens no console, um abaixo da outra.
*/

public class Exercicio2 {
    public static void main(String[] args) {

        Set<LinguagemFavorita> linguagensFavoritas = new LinkedHashSet<>(Arrays.asList(
           new LinguagemFavorita("Java", 1995, "Eclipse"),
           new LinguagemFavorita("TypeScript", 2012 , "VS Code"),
           new LinguagemFavorita("JavaScript", 1996 , "IntelliJ")
        ));

        System.out.println("a) Ordem de inserção");
        System.out.println(linguagensFavoritas);

        System.out.println("\nOrdem natural(nome)");
        Set<LinguagemFavorita> linguagemFavoritas2 = new TreeSet<>(linguagensFavoritas);
        System.out.println(linguagemFavoritas2);

        System.out.println("\n Ordem por IDE");
        Set<LinguagemFavorita> linguagemFavoritas3 = new TreeSet<>(new ComparatorIde());
        linguagemFavoritas3.addAll(linguagensFavoritas);
        for (LinguagemFavorita linguagem: linguagemFavoritas3) {
            System.out.println(linguagem);
        }

        System.out.println("\n Ordem Ano de criação e nome");
        Set<LinguagemFavorita> linguagemFavoritas4 = new TreeSet<>(new ComparatorAnoNome());
        linguagemFavoritas4.addAll(linguagensFavoritas);
        for (LinguagemFavorita linguagem: linguagemFavoritas4) {
            System.out.println(linguagem);
        }

        System.out.println("\n Ordem Nome, ano de criação e IDE");
        Set<LinguagemFavorita> linguagemFavoritas5 = new TreeSet<>(new ComparatorNomeAnoDeCriacaoIde());
        linguagemFavoritas5.addAll(linguagensFavoritas);
        for (LinguagemFavorita linguagem: linguagemFavoritas5) {
            System.out.println(linguagem);
        }

    }
}
