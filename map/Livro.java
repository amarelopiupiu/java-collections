import java.util.Objects;

class Livro {
    private String nome;
    private Integer paginas;

    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return this.nome;
    }

    public Integer getPaginas() {
        return this.paginas;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Livro livro = (Livro)o;
            return this.nome.equals(livro.nome) && this.paginas.equals(livro.paginas);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.nome, this.paginas});
    }

    public String toString() {
        return "Livro{nome='" + this.nome + "', paginas=" + this.paginas + "}";
    }
}