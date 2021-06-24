import java.util.Comparator;
import java.util.Map.Entry;

class ComparatorNome implements Comparator<Entry<String, Livro>> {
    ComparatorNome() {
    }

    public int compare(Entry<String, Livro> l1, Entry<String, Livro> l2) {
        return ((Livro)l1.getValue()).getNome().compareToIgnoreCase(((Livro)l2.getValue()).getNome());
    }
}
