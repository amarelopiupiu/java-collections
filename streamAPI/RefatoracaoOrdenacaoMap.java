import br.com.dio.collection.map.exercicioProposto03.Contato;
import java.io.PrintStream;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map.Entry;

public class RefatoracaoOrdenacaoMap {
    public RefatoracaoOrdenacaoMap() {
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
        Iterator var8 = agenda1.entrySet().iterator();

        while(var8.hasNext()) {
            Entry<Integer, Contato> entry = (Entry)var8.next();
            var10000 = System.out;
            var10001 = entry.getKey();
            var10000.println(var10001 + " - " + ((Contato)entry.getValue()).getNome());
        }

        System.out.println("--\tOrdem id\t--");
        Map<Integer, Contato> agenda2 = new TreeMap(agenda);
        System.out.println(agenda2);
        Iterator var10 = agenda2.entrySet().iterator();

        while(var10.hasNext()) {
            Entry<Integer, Contato> entry = (Entry)var10.next();
            var10000 = System.out;
            var10001 = entry.getKey();
            var10000.println(var10001 + " - " + ((Contato)entry.getValue()).getNome());
        }

        System.out.println("--\tOrdem número telefone\t--");
        Set<Entry<Integer, Contato>> set = new TreeSet(Comparator.comparing((cont) -> {
            return ((Contato)cont.getValue()).getNumero();
        }));
        set.addAll(agenda.entrySet());
        Iterator var12 = set.iterator();

        while(var12.hasNext()) {
            Entry<Integer, Contato> entry = (Entry)var12.next();
            var10000 = System.out;
            var10001 = entry.getKey();
            var10000.println(var10001 + " - " + ((Contato)entry.getValue()).getNumero() + ": " + ((Contato)entry.getValue()).getNome());
        }

        System.out.println("--\tOrdem nome contato\t--");
        Set<Entry<Integer, Contato>> set1 = new TreeSet(Comparator.comparing((cont) -> {
            return ((Contato)cont.getValue()).getNome();
        }));
        set1.addAll(agenda.entrySet());
        set1.forEach((entryx) -> {
            PrintStream var10000 = System.out;
            Object var10001 = entryx.getKey();
            var10000.println(var10001 + " - " + ((Contato)entryx.getValue()).getNome());
        });
    }
}