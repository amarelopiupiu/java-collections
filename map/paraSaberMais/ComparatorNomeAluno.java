import java.util.Comparator;
import java.util.Map.Entry;

class ComparatorNomeAluno implements Comparator<Entry<Disciplina, Aluno>> {
    ComparatorNomeAluno() {
    }

    public int compare(Entry<Disciplina, Aluno> al1, Entry<Disciplina, Aluno> al2) {
        return ((Aluno)al1.getValue()).getNome().compareToIgnoreCase(((Aluno)al2.getValue()).getNome());
    }
}
