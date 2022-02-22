package exercicios.ex1;

import java.util.*;

/*
Crie uma conjunto contendo as cores do arco-íris e:
a) Exiba todas as cores o arco-íris uma abaixo da outra;
b) A quantidade de cores que o arco-íris tem;
c) Exiba as cores em ordem alfabética;
d) Exiba as cores na ordem inversa da que foi informada;
e) Exiba todas as cores que começam com a letra ”v”;
f) Remova todas as cores que não começam com a letra “v”;
g) Limpe o conjunto;
h) Confira se o conjunto está vazio;
 */

public class Exercicio1 {
    public static void main(String[] args) {

        Set<String> arcoIris = new LinkedHashSet<>(Arrays.asList(
                "vermelho",
                "laranja",
                "amarela",
                "verde",
                "azul",
                "anil",
                "violeta"
        ));

        System.out.println("a) Exiba todas as cores o arco-íris uma abaixo da outra;");
        for (String cor : arcoIris) {
            System.out.println(cor);
        }

        System.out.println("\n b) A quantidade de cores que o arco-íris tem;");
        System.out.println(arcoIris.size());

        System.out.println("\n c) Exiba as cores em ordem alfabética;");
        Set<String> coresOrdemAlfabetica = new TreeSet<>(arcoIris);
        System.out.println(coresOrdemAlfabetica);

        System.out.println("\n d) Exiba as cores na ordem inversa da que foi informada;");
        List<String> arcoIrisInverso = new ArrayList<>(arcoIris);
        Collections.reverse(arcoIrisInverso);
        System.out.println(arcoIrisInverso);

        System.out.println("\n e) Exiba todas as cores que começam com a letra ”v”" );
        for (String cor : arcoIris) {
            if (cor.startsWith("v"))
                System.out.println(cor);
        }

        System.out.println("\n Remova todas as cores que não começam com a letra “v”");
        arcoIris.removeIf(cor -> !cor.startsWith("v"));
        System.out.println(arcoIris);

        System.out.println("\n Limpe o conjunto");
        arcoIris.clear();
        arcoIrisInverso.clear();
        coresOrdemAlfabetica.clear();

        System.out.println("\n Confira se o conjunto está vazio");
        System.out.println("conjunto " + (arcoIris.isEmpty() ? "vazio" : "não vazio"));
    }
}
