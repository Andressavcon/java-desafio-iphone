package com.principal;

import com.iphone.Iphone;

public class Principal {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        System.out.println("--- Reprodutor Musical ---");
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();
        System.out.println("=============================");

        System.out.println("--- Aparelho Telefônico ---");
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();
        System.out.println("=============================");

        System.out.println("--- Navegador Internet ---");
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

    }
}
