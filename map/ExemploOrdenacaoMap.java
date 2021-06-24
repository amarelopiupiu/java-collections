import java.io.PrintStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map.Entry;

public class ExemploOrdenacaoMap {
    public ExemploOrdenacaoMap() {
    }

    public static void main(String[] args) {
        System.out.println("--\tOrdem aleatória\t--");
        Map<String, Livro> meusLivros = new HashMap<String, Livro>() {
            {
                this.put(" Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
                this.put(" Duhigg, Charles", new Livro("O Poder do Hábito", 408));
                this.put(" Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));
            }
        };
        Iterator var2 = meusLivros.entrySet().iterator();

        PrintStream var10000;
        String var10001;
        while(var2.hasNext()) {
            Entry<String, Livro> livro = (Entry)var2.next();
            var10000 = System.out;
            var10001 = (String)livro.getKey();
            var10000.println(var10001 + " - " + ((Livro)livro.getValue()).getNome());
        }

        System.out.println("--\tOrdem Inserção\t--");
        Map<String, Livro> meusLivros1 = new LinkedHashMap<String, Livro>() {
            {
                this.put(" Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
                this.put(" Duhigg, Charles", new Livro("O Poder do Hábito", 408));
                this.put(" Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));
            }
        };
        Iterator var8 = meusLivros1.entrySet().iterator();

        while(var8.hasNext()) {
            Entry<String, Livro> livro = (Entry)var8.next();
            var10000 = System.out;
            var10001 = (String)livro.getKey();
            var10000.println(var10001 + " - " + ((Livro)livro.getValue()).getNome());
        }

        System.out.println("--\tOrdem alfabética autores\t--");
        Map<String, Livro> meusLivros2 = new TreeMap(meusLivros1);
        Iterator var10 = meusLivros2.entrySet().iterator();

        while(var10.hasNext()) {
            Entry<String, Livro> livro = (Entry)var10.next();
            var10000 = System.out;
            var10001 = (String)livro.getKey();
            var10000.println(var10001 + " - " + ((Livro)livro.getValue()).getNome());
        }

        System.out.println("--\tOrdem alfabética nomes dos livros\t--");
        Set<Entry<String, Livro>> meusLivros3 = new TreeSet(new ComparatorNome());
        meusLivros3.addAll(meusLivros.entrySet());
        Iterator var12 = meusLivros3.iterator();

        while(var12.hasNext()) {
            Entry<String, Livro> livro = (Entry)var12.next();
            var10000 = System.out;
            var10001 = (String)livro.getKey();
            var10000.println(var10001 + " - " + ((Livro)livro.getValue()).getNome());
        }

    }
}
