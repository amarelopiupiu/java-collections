import java.io.PrintStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map.Entry;

public class ExercicioProposto03 {
    public ExercicioProposto03() {
    }

    public static void main(String[] args) {
        System.out.println("--\tOrdem aleatória\t--");
        Map<Integer, Contato> agenda = new HashMap<Integer, Contato>() {
            {
                this.put(1, new Contato("Simba", 5555));
                this.put(4, new Contato("Cami", 1111));
                this.put(3, new Contato("Jon", 2222));
            }
        };
        System.out.println(agenda);
        Iterator var2 = agenda.entrySet().iterator();

        PrintStream var10000;
        Object var10001;
        while(var2.hasNext()) {
            Entry<Integer, Contato> entry = (Entry)var2.next();
            var10000 = System.out;
            var10001 = entry.getKey();
            var10000.println(var10001 + " - " + ((Contato)entry.getValue()).getNome());
        }

        System.out.println("--\tOrdem Inserção\t--");
        Map<Integer, Contato> agenda1 = new LinkedHashMap<Integer, Contato>() {
            {
                this.put(1, new Contato("Simba", 5555));
                this.put(4, new Contato("Cami", 1111));
                this.put(3, new Contato("Jon", 2222));
            }
        };
        System.out.println(agenda1);
        Iterator var9 = agenda1.entrySet().iterator();

        while(var9.hasNext()) {
            Entry<Integer, Contato> entry = (Entry)var9.next();
            var10000 = System.out;
            var10001 = entry.getKey();
            var10000.println(var10001 + " - " + ((Contato)entry.getValue()).getNome());
        }

        System.out.println("--\tOrdem id\t--");
        Map<Integer, Contato> agenda2 = new TreeMap(agenda);
        System.out.println(agenda2);
        Iterator var11 = agenda2.entrySet().iterator();

        while(var11.hasNext()) {
            Entry<Integer, Contato> entry = (Entry)var11.next();
            var10000 = System.out;
            var10001 = entry.getKey();
            var10000.println(var10001 + " - " + ((Contato)entry.getValue()).getNome());
        }

        System.out.println("--\tOrdem número telefone\t--");
        Set<Entry<Integer, Contato>> set = new TreeSet(new ComparatorOrdemNumerica());
        set.addAll(agenda.entrySet());
        Iterator var13 = set.iterator();

        while(var13.hasNext()) {
            Entry<Integer, Contato> entry = (Entry)var13.next();
            var10000 = System.out;
            var10001 = entry.getKey();
            var10000.println(var10001 + " - " + ((Contato)entry.getValue()).getNumero() + ": " + ((Contato)entry.getValue()).getNome());
        }

        System.out.println("--\tOrdem nome contato\t--");
        Set<Entry<Integer, Contato>> set1 = new TreeSet(new ComparatorOrdemNomeContato());
        set1.addAll(agenda.entrySet());
        Iterator var15 = set1.iterator();

        while(var15.hasNext()) {
            Entry<Integer, Contato> entry = (Entry)var15.next();
            var10000 = System.out;
            var10001 = entry.getKey();
            var10000.println(var10001 + " - " + ((Contato)entry.getValue()).getNome());
        }

    }
}
