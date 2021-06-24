import java.util.Objects;

public class Aluno {
    private String nome;
    private Integer matricula;

    public Aluno(String nome, Integer matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return this.nome;
    }

    public Integer getMatricula() {
        return this.matricula;
    }

    public String toString() {
        return "Aluno{nome='" + this.nome + "', matricula=" + this.matricula + "}";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Aluno aluno = (Aluno)o;
            return this.nome.equals(aluno.nome) && this.matricula.equals(aluno.matricula);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.nome, this.matricula});
    }
}
