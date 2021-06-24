import java.util.Comparator;

class ComparatorIde implements Comparator<LinguagemFavorita> {
    ComparatorIde() {
    }

    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
        return lf1.ide.compareToIgnoreCase(lf2.ide);
    }
}
