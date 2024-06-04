package main.java.list.OperacoesBasicas.CarinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    //atributo
    private static List<Item> itemList;

    public CarrinhoDeCompras() {

        this.itemList = new ArrayList<>();
    }

    public void adiconarItem(String nome, double preco, int quantidade){

        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        for (Item item : itemList){
            if(item.getNome().equalsIgnoreCase(nome)){
                itensParaRemover.add(item);
            }
        }
        itemList.removeAll(itensParaRemover);
    }

    public double calcularValorTotal() {
        double total = 0.0;
        for (Item item : itemList) {
            total += item.getPreco() * item.getQuantidade();
        }
        return total;
    }

    public void exibirItens(){

        System.out.println(itemList);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.exibirItens();

        carrinhoDeCompras.adiconarItem("Batedeira", 220.0, 1);
        carrinhoDeCompras.adiconarItem("Liquidificador", 120.0, 2);
        carrinhoDeCompras.adiconarItem("Ventilador", 260.0, 1);
        carrinhoDeCompras.adiconarItem("Lampada", 10.4, 1);
        carrinhoDeCompras.adiconarItem("Carrinho", 22.0, 3);
        carrinhoDeCompras.exibirItens();

        System.out.println("Removendo a batedeira do carrinho: ");
        carrinhoDeCompras.removerItem("batedeira");
        carrinhoDeCompras.exibirItens();

        double valorTotal = carrinhoDeCompras.calcularValorTotal();
        System.out.println(valorTotal);


    }


}
