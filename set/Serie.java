import java.util.Objects;

class Serie implements Comparable<Serie> {
    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    public Serie(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    public String getNome() {
        return this.nome;
    }

    public String getGenero() {
        return this.genero;
    }

    public Integer getTempoEpisodio() {
        return this.tempoEpisodio;
    }

    public String toString() {
        return "{nome='" + this.nome + "', genero='" + this.genero + "', tempoEpisodio=" + this.tempoEpisodio + "}";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Serie serie = (Serie)o;
            return this.nome.equals(serie.nome) && this.genero.equals(serie.genero) && this.tempoEpisodio.equals(serie.tempoEpisodio);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.nome, this.genero, this.tempoEpisodio});
    }

    public int compareTo(Serie serie) {
        int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
        return tempoEpisodio != 0 ? tempoEpisodio : this.getGenero().compareTo(serie.getGenero());
    }
}
