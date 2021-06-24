import java.util.Comparator;

class ComparatorAnoDeCriacaoENome implements Comparator<LinguagemFavorita> {
    ComparatorAnoDeCriacaoENome() {
    }

    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
        int anoDeCriacao = Integer.compare(lf1.anoDeCriacao, lf2.anoDeCriacao);
        return anoDeCriacao != 0 ? anoDeCriacao : lf1.nome.compareToIgnoreCase(lf2.nome);
    }
}
