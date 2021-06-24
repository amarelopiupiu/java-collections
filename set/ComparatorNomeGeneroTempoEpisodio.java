import java.util.Comparator;

class ComparatorNomeGeneroTempoEpisodio implements Comparator<Serie> {
    ComparatorNomeGeneroTempoEpisodio() {
    }

    public int compare(Serie s1, Serie s2) {
        int nome = s1.getNome().compareTo(s2.getNome());
        if (nome != 0) {
            return nome;
        } else {
            int genero = s1.getGenero().compareTo(s2.getGenero());
            return genero != 0 ? genero : Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
        }
    }
}
