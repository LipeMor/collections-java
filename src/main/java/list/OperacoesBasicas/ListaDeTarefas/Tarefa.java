package main.java.list.OperacoesBasicas.ListaDeTarefas;

public class Tarefa {
    //atributo
    private String descricao;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getnome() {
        return descricao;
    }

    @Override
    public String toString() {
        return  descricao ;
    }
}
