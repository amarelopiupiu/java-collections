import java.io.PrintStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploOrdenacaoSet {
    public ExemploOrdenacaoSet() {
    }

    public static void main(String[] args) {
        System.out.println("--\tOrdem aleatória\t--");
        Set<Serie> minhasSeries = new HashSet<Serie>() {
            {
                this.add(new Serie("got", "fantasia", 60));
                this.add(new Serie("dark", "drama", 60));
                this.add(new Serie("that '70s show", "comédia", 25));
            }
        };
        Iterator var2 = minhasSeries.iterator();

        PrintStream var10000;
        String var10001;
        while(var2.hasNext()) {
            Serie serie = (Serie)var2.next();
            var10000 = System.out;
            var10001 = serie.getNome();
            var10000.println(var10001 + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println("--\tOrdem inserção\t--");
        Set<Serie> minhasSeries1 = new LinkedHashSet<Serie>() {
            {
                this.add(new Serie("got", "fantasia", 60));
                this.add(new Serie("dark", "drama", 60));
                this.add(new Serie("that '70s show", "comédia", 25));
            }
        };
        Iterator var8 = minhasSeries1.iterator();

        while(var8.hasNext()) {
            Serie serie = (Serie)var8.next();
            var10000 = System.out;
            var10001 = serie.getNome();
            var10000.println(var10001 + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println("--\tOrdem natural (TempoEpisodio)\t--");
        Set<Serie> minhasSeries2 = new TreeSet(minhasSeries1);
        Iterator var10 = minhasSeries2.iterator();

        while(var10.hasNext()) {
            Serie serie = (Serie)var10.next();
            var10000 = System.out;
            var10001 = serie.getNome();
            var10000.println(var10001 + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println("--\tOrdem Nome/Gênero/TempoEpisodio\t--");
        Set<Serie> minhasSeries3 = new TreeSet(new ComparatorNomeGeneroTempoEpisodio());
        minhasSeries3.addAll(minhasSeries);
        Iterator var12 = minhasSeries3.iterator();

        while(var12.hasNext()) {
            Serie serie = (Serie)var12.next();
            var10000 = System.out;
            var10001 = serie.getNome();
            var10000.println(var10001 + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

    }
}