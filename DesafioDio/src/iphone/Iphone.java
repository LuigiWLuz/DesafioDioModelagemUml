package iphone;

import Funcionalidades.AparelhoTelefonico.AparelhoTelefonico;
import Funcionalidades.NavegadorDeInternet.NavegadorDeInternet;
import Funcionalidades.ReprodutorMusical.ReprodutorMusical;
import Funcionalidades.multifuncionalidades.multifuncionalidades;

public class Iphone   {
    public static void main(String[] args) {
        
        multifuncionalidades iphone = new multifuncionalidades();

        AparelhoTelefonico funcionalidade1 = iphone;
        funcionalidade1.ligar("4002-8922");
        funcionalidade1.desligar();
        funcionalidade1.iniciarCorreioDeVoz();


        NavegadorDeInternet funcionalidade2 = iphone;
        funcionalidade2.exibirPagina("www.google.com");
        funcionalidade2.atualizarPagina();
        funcionalidade2.adicionarNovaAba();


        ReprodutorMusical funcionalidade3 = iphone;
        funcionalidade3.selecionarMusica("Hino do Corinthians");
        funcionalidade3.tocar();
        funcionalidade3.pausar();
    }
}
