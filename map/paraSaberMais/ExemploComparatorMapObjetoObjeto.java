import java.io.PrintStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map.Entry;

public class ExemploComparatorMapObjetoObjeto {
    public ExemploComparatorMapObjetoObjeto() {
    }

    public static void main(String[] args) {
        final Aluno aluno2 = new Aluno("Jon", 124);
        final Aluno aluno3 = new Aluno("Simba", 125);
        final Aluno aluno1 = new Aluno("Camila", 123);
        final Disciplina disciplina3 = new Disciplina("Python", 9);
        final Disciplina disciplina1 = new Disciplina("Java", 10);
        final Disciplina disciplina2 = new Disciplina("JavaScript", 12);
        Map<Disciplina, Aluno> cursos = new HashMap<Disciplina, Aluno>() {
            {
                this.put(disciplina1, aluno1);
                this.put(disciplina2, aluno2);
                this.put(disciplina3, aluno3);
            }
        };
        System.out.println("Exibindo Dicionário:");
        Iterator var8 = cursos.entrySet().iterator();

        PrintStream var10000;
        Object var10001;
        while(var8.hasNext()) {
            Entry<Disciplina, Aluno> entry = (Entry)var8.next();
            var10000 = System.out;
            var10001 = entry.getKey();
            var10000.println(var10001 + " - " + entry.getValue());
        }

        System.out.println("-------\nNome Disciplina:");
        Map<Disciplina, Aluno> cursos2 = new TreeMap(cursos);
        Iterator var15 = cursos2.entrySet().iterator();

        while(var15.hasNext()) {
            Entry<Disciplina, Aluno> entry = (Entry)var15.next();
            var10000 = System.out;
            var10001 = entry.getKey();
            var10000.println(var10001 + " - " + entry.getValue());
        }

        System.out.println("-------\nDuração Disciplina:");
        Map<Disciplina, Aluno> cursos3 = new TreeMap(new ComparatorDuracaoDisciplina());
        cursos3.putAll(cursos);
        Iterator var17 = cursos3.entrySet().iterator();

        while(var17.hasNext()) {
            Entry<Disciplina, Aluno> entry = (Entry)var17.next();
            var10000 = System.out;
            var10001 = entry.getKey();
            var10000.println(var10001 + " - " + entry.getValue());
        }

        System.out.println("-------\nNome do Aluno:");
        Set<Entry<Disciplina, Aluno>> set = new TreeSet(new ComparatorNomeAluno());
        set.addAll(cursos.entrySet());
        Iterator var19 = set.iterator();

        while(var19.hasNext()) {
            Entry<Disciplina, Aluno> entry = (Entry)var19.next();
            var10000 = System.out;
            var10001 = entry.getKey();
            var10000.println(var10001 + " - " + entry.getValue());
        }

        System.out.println("-------\nMatricula do Aluno:");
        Set<Entry<Disciplina, Aluno>> set1 = new TreeSet(new ComparatorMatriculaAluno());
        set1.addAll(cursos.entrySet());
        Iterator var21 = set1.iterator();

        while(var21.hasNext()) {
            Entry<Disciplina, Aluno> entry = (Entry)var21.next();
            var10000 = System.out;
            var10001 = entry.getKey();
            var10000.println(var10001 + " - " + entry.getValue());
        }

    }
}
