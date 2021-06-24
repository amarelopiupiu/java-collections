import java.util.Comparator;
import java.util.Map.Entry;

class ComparatorOrdemNumerica implements Comparator<Entry<Integer, Contato>> {
    ComparatorOrdemNumerica() {
    }

    public int compare(Entry<Integer, Contato> cont1, Entry<Integer, Contato> cont2) {
        return Integer.compare(((Contato)cont1.getValue()).getNumero(), ((Contato)cont2.getValue()).getNumero());
    }
}