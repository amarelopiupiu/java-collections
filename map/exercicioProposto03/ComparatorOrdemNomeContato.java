import java.util.Comparator;
import java.util.Map.Entry;

class ComparatorOrdemNomeContato implements Comparator<Entry<Integer, Contato>> {
    ComparatorOrdemNomeContato() {
    }

    public int compare(Entry<Integer, Contato> cont1, Entry<Integer, Contato> cont2) {
        return ((Contato)cont1.getValue()).getNome().compareToIgnoreCase(((Contato)cont2.getValue()).getNome());
    }
}