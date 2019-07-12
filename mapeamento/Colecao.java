package mapeamento;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Colecao {

  public static void main(String[] args) {
    Collection<String> c1 = new ArrayList<>();
    // Adiciona itens
    c1.add("A");
    c1.add("E");
    c1.add("i");
    
    // Exibe os elementos da coleção
    System.out.println(c1.toString());
    // Verifica se a coleção está vazia, retorna true or false
    System.out.println(c1.isEmpty());
    // Veriica se contém o elemento A, retorna true or false
    System.out.println(c1.contains("A"));
    // Remove o elemento A da coleção
    c1.remove("A");
    
    /*PPARA TRABALHAR COM GRUPOS DE ELEMENTOS*/
    // Transforma um array em uma lista (que é uma coleção)
    Collection<String> c2 = Arrays.asList("O", "U");
    // Adiciona os elementos à coleção principal
    c1.addAll(c2);
    // Exibe os elementos da coleção
    System.out.println(c1.toString());
  }
}
