package com.ListaDuplaEncadeada;

public class Main {
    public static void main(String[] args) {

        ListaDuplamenteEncadeada<String> ListaEncadeada = new ListaDuplamenteEncadeada<>();
        ListaEncadeada.add("c1");
        ListaEncadeada.add("c2");
        ListaEncadeada.add("c3");
        ListaEncadeada.add("c4");
        ListaEncadeada.add("c5");
        ListaEncadeada.add("c6");
        ListaEncadeada.add("c7");

        System.out.println(ListaEncadeada);
        ListaEncadeada.remove(3);
        ListaEncadeada.add(3,"99");
        System.out.println(ListaEncadeada);
        System.out.println(ListaEncadeada.get(3));
    }

}
