import java.util.Comparator;

class ComparatorCor implements Comparator<Gato> {
    ComparatorCor() {
    }

    public int compare(Gato g1, Gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}