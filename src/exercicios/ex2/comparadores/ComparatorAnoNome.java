package exercicios.ex2.comparadores;

import exercicios.ex2.LinguagemFavorita;

import java.util.Comparator;

public class ComparatorAnoNome implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
        int anoDeCriacao = Integer.compare(lf1.anoDeCriacao, lf2.anoDeCriacao);
        if (anoDeCriacao != 0) return anoDeCriacao;
        return lf1.nome.compareToIgnoreCase(lf2.nome);
    }
}
