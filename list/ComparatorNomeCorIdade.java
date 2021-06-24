import java.util.Comparator;

class ComparatorNomeCorIdade implements Comparator<Gato> {
    ComparatorNomeCorIdade() {
    }

    public int compare(Gato g1, Gato g2) {
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if (nome != 0) {
            return nome;
        } else {
            int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
            return cor != 0 ? cor : Integer.compare(g1.getIdade(), g2.getIdade());
        }
    }
}