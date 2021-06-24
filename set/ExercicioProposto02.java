import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExercicioProposto02 {
    public ExercicioProposto02() {
    }

    public static void main(String[] args) {
        Set<LinguagemFavorita> minhasLinguagensFavoritas = new HashSet();
        minhasLinguagensFavoritas.add(new LinguagemFavorita("Python", 1991, "Pycharm"));
        minhasLinguagensFavoritas.add(new LinguagemFavorita("JavaScript", 1995, "IntelliJ"));
        minhasLinguagensFavoritas.add(new LinguagemFavorita("Java", 1991, "Visual Studio Code"));
        System.out.println("--------\tOrdem de Inserção\t--------");
        Set<LinguagemFavorita> minhasLinguagensFavoritas1 = new LinkedHashSet(Arrays.asList(new LinguagemFavorita("Python", 1991, "Pycharm"), new LinguagemFavorita("JavaScript", 1995, "IntelliJ"), new LinguagemFavorita("Java", 1991, "Visual Studio Code")));
        Iterator var3 = minhasLinguagensFavoritas1.iterator();

        while(var3.hasNext()) {
            LinguagemFavorita linguagem = (LinguagemFavorita)var3.next();
            System.out.println(linguagem);
        }

        System.out.println("--------\tOrdem Natural: Nome\t--------");
        Set<LinguagemFavorita> minhasLinguagensFavoritas2 = new TreeSet(minhasLinguagensFavoritas);
        Iterator var10 = minhasLinguagensFavoritas2.iterator();

        while(var10.hasNext()) {
            LinguagemFavorita linguagem = (LinguagemFavorita)var10.next();
            System.out.println(linguagem);
        }

        System.out.println("--------\tOrdem IDE\t--------");
        Set<LinguagemFavorita> minhasLinguagensFavoritas3 = new TreeSet(new ComparatorIde());
        minhasLinguagensFavoritas3.addAll(minhasLinguagensFavoritas);
        Iterator var12 = minhasLinguagensFavoritas3.iterator();

        while(var12.hasNext()) {
            LinguagemFavorita linguagem = (LinguagemFavorita)var12.next();
            System.out.println(linguagem);
        }

        System.out.println("--------\tOrdem Ano de Criacao e Nome\t--------");
        Set<LinguagemFavorita> minhasLinguagensFavoritas4 = new TreeSet(new ComparatorAnoDeCriacaoENome());
        minhasLinguagensFavoritas4.addAll(minhasLinguagensFavoritas);
        Iterator var14 = minhasLinguagensFavoritas4.iterator();

        while(var14.hasNext()) {
            LinguagemFavorita linguagem = (LinguagemFavorita)var14.next();
            System.out.println(linguagem);
        }

        System.out.println("--------\tOrdem Nome - Ano de Criacao - IDE\t--------");
        Set<LinguagemFavorita> minhasLinguagensFavoritas5 = new TreeSet(new ComparatorNomeAnoDeCriacaoIde());
        minhasLinguagensFavoritas5.addAll(minhasLinguagensFavoritas3);
        Iterator var16 = minhasLinguagensFavoritas5.iterator();

        while(var16.hasNext()) {
            LinguagemFavorita linguagem = (LinguagemFavorita)var16.next();
            System.out.println(linguagem);
        }

    }
}
