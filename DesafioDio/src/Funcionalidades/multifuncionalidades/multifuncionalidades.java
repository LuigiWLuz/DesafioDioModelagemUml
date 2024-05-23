package Funcionalidades.multifuncionalidades;

import Funcionalidades.AparelhoTelefonico.AparelhoTelefonico;
import Funcionalidades.NavegadorDeInternet.NavegadorDeInternet;
import Funcionalidades.ReprodutorMusical.ReprodutorMusical;

public class multifuncionalidades implements AparelhoTelefonico,NavegadorDeInternet,ReprodutorMusical {

    public void ligar(String numTelefone){
        System.out.println("Ligando...");
    };
    public void desligar(){
        System.out.println("Desligando...");

    };
    public void iniciarCorreioDeVoz(){
        System.out.println("Inciando correio de voz...");
    };
    public void exibirPagina(String url){
        System.out.println("Ligando...");
    };
    public void atualizarPagina(){
        System.out.println("Atualizando pagina...");
    };
    public void adicionarNovaAba(){
        System.out.println("Adiconando nova Aba...");
    };
    public void tocar(){
        System.out.println("Ligando...");
    };
    public void pausar(){
        System.out.println("Pausando...");
    };
    public void selecionarMusica(String Musica){
        System.out.println("Selecionando musica...");
    };


}
