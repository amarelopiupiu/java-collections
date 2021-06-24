import java.util.Comparator;

class ComparatorIdade implements Comparator<Gato> {
    ComparatorIdade() {
    }

    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}