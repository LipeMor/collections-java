package main.java.set.OperacoesBasicas;

import java.util.Objects;

public class Palavra {
    //atributo
    private String palavra;

    public Palavra(String palavra) {
        this.palavra = palavra;
    }

    public String getPalavra() {
        return palavra;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Palavra that)) return false;
        return Objects.equals(getPalavra(), that.getPalavra());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPalavra());
    }

    @Override
    public String toString() {
        return  palavra;
    }
}
