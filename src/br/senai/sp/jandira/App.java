package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Menu;

public class App {

    public static void main(String[] args) {
       System.out.println("Bem-vindo a agência SENAI");

        Menu menu = new Menu();
        menu.executarMenu();
    }
}