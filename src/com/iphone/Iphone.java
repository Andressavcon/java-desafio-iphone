package com.iphone;

import com.funcionalidades.NavegadorInternet;
import com.funcionalidades.AparelhoTelefonico;
import com.funcionalidades.ReprodutorMusical;

public class Iphone implements NavegadorInternet, AparelhoTelefonico, ReprodutorMusical {

    public void exibirPagina() {
        System.out.println("Exibindo página!");
    }
    public void adicionarNovaAba() {
        System.out.println("Adicionando uma nova aba.");
    }
    public void atualizarPagina() {
        System.out.println("Página Atualizada");
    }

    public void ligar() {
        System.out.println("Ligando...");
    }
    public void atender() {
        System.out.println("Atendeu...");
    }
    public void iniciarCorreioVoz() {
        System.out.println("Encaminhando para o Correio de Voz...");
    }

    public void tocar() {
        System.out.println("Tocando musica...");
    }
    public void pausar() {
        System.out.println("Musica pausada!");
    }
    public void selecionarMusica() {
        System.out.println("Selecionando musica...");
    }
}
