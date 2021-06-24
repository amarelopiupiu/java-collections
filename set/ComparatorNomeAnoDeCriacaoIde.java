import java.util.Comparator;

class ComparatorNomeAnoDeCriacaoIde implements Comparator<LinguagemFavorita> {
    ComparatorNomeAnoDeCriacaoIde() {
    }

    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
        int nome = lf1.nome.compareToIgnoreCase(lf2.nome);
        int anoDeCriacao = Integer.compare(lf1.anoDeCriacao, lf2.anoDeCriacao);
        if (nome != 0) {
            return nome;
        } else {
            return anoDeCriacao != 0 ? anoDeCriacao : lf1.ide.compareToIgnoreCase(lf2.ide);
        }
    }
}
