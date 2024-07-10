package main.java.set.OperacoesBasicas;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    //atributos
    private Set<Palavra> palavraSet;

    public ConjuntoPalavrasUnicas() {
        this.palavraSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavraSet.add(new Palavra(palavra));
    }

    public void removerPalavra(String palavra){
        Palavra palavraParaRemover = null;
        for (Palavra p : palavraSet){
            if(p.getPalavra() == palavra){
                palavraParaRemover = p;
                break;
            }
        }
        palavraSet.remove(palavraParaRemover);
    }

    public void verificarPalavra(String palavra) {
        Palavra palavraParaVerificar = null;

        for (Palavra p : palavraSet){
            if(p.getPalavra().equalsIgnoreCase(palavra)) {
                palavraParaVerificar = p;
                System.out.println("A palavra " +palavraParaVerificar+ " existe no conjunto.");
                break;
            }
        }

    }


//    public void verificarPalavra(String palavra){
//        Palavra palavraParaVerificar = null;
//        for (Palavra p : palavraSet){
//            palavraParaVerificar = p;
//            if(palavraSet.contains(p)){
//                System.out.println("A palavra " +p+ "existe" );
//                break;
//            }
//        }
//
//    }


    public void exibirPalavrasUnicas(){
        System.out.println(palavraSet);
    }

    public static void main(String[] args) {

        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("Palavra1");
        conjuntoPalavrasUnicas.adicionarPalavra("Palavra2");
        conjuntoPalavrasUnicas.adicionarPalavra("Palavra3");
        conjuntoPalavrasUnicas.adicionarPalavra("Palavra3");
        conjuntoPalavrasUnicas.adicionarPalavra("Palavra4");


        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.removerPalavra("Palavra3");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.verificarPalavra("Palav");



    }
}
