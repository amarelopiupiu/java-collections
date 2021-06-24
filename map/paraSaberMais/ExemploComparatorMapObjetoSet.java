import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class ExemploComparatorMapObjetoSet {
    public ExemploComparatorMapObjetoSet() {
    }

    public static void main(String[] args) {
        final Aluno aluno2 = new Aluno("Jon", 124);
        final Aluno aluno3 = new Aluno("Simba", 125);
        final Aluno aluno1 = new Aluno("Camila", 123);
        Disciplina disc3 = new Disciplina("Python", 9);
        Disciplina disc1 = new Disciplina("Java", 10);
        Disciplina disc2 = new Disciplina("JavaScript", 12);
        final Set<Disciplina> disciplinas1 = new HashSet(Arrays.asList(disc1, disc2));
        final Set<Disciplina> disciplinas2 = new HashSet(Arrays.asList(disc2, disc3));
        final Set<Disciplina> disciplinas3 = new HashSet(Arrays.asList(disc1, disc3));
        Map<Aluno, Set<Disciplina>> alunosEDisciplinas = new HashMap<Aluno, Set<Disciplina>>() {
            {
                this.put(aluno1, disciplinas1);
                this.put(aluno2, disciplinas2);
                this.put(aluno3, disciplinas3);
            }
        };
        System.out.println("Exibindo Dicionário:");
        Iterator var11 = alunosEDisciplinas.entrySet().iterator();

        while(var11.hasNext()) {
            Entry<Aluno, Set<Disciplina>> entry = (Entry)var11.next();
            PrintStream var10000 = System.out;
            String var10001 = ((Aluno)entry.getKey()).getNome();
            var10000.print(var10001 + " - " + ((Aluno)entry.getKey()).getMatricula() + ": ");
            Iterator var13 = ((Set)entry.getValue()).iterator();

            while(var13.hasNext()) {
                Disciplina entry1 = (Disciplina)var13.next();
                System.out.print(entry1.getNome() + " ");
            }

            System.out.println();
        }

    }
}
