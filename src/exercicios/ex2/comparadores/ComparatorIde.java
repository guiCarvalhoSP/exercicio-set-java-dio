package exercicios.ex2.comparadores;

import exercicios.ex2.LinguagemFavorita;

import java.util.Comparator;

public class ComparatorIde implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
        return lf1.ide.compareToIgnoreCase(lf2.ide);
    }
}
