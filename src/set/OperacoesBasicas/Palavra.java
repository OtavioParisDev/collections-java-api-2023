package set.OperacoesBasicas;

import java.util.Objects;

public class Palavra {
    private String palavra;

    public Palavra(String palavra) {
        this.palavra = palavra;
    }

    public String getPalavra() {
        return palavra;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Palavra palavra1 = (Palavra) o;
        return Objects.equals(palavra, palavra1.palavra);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(palavra);
    }

    @Override
    public String toString() {
        return  palavra;
    }
}
