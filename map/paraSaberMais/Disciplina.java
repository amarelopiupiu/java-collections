import java.util.Objects;

public class Disciplina implements Comparable<Disciplina> {
    private String nome;
    private Integer duracao;

    public Disciplina(String disciplina, Integer duracao) {
        this.nome = disciplina;
        this.duracao = duracao;
    }

    public String getNome() {
        return this.nome;
    }

    public Integer getDuracao() {
        return this.duracao;
    }

    public String toString() {
        return "Curso{disciplina='" + this.nome + "', duracao=" + this.duracao + "}";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Disciplina disciplina = (Disciplina)o;
            return this.nome.equals(disciplina.nome) && this.duracao.equals(disciplina.duracao);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.nome, this.duracao});
    }

    public int compareTo(Disciplina disciplina) {
        return this.getNome().compareToIgnoreCase(disciplina.getNome());
    }
}
