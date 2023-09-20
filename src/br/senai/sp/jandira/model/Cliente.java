package br.senai.sp.jandira.model;

import java.util.Scanner;

import java.util.Scanner;
    public class Cliente {

        Scanner scanner = new Scanner(System.in);
        public String nome;
        public long cpf, rg, telefone;

        public void cadastrarCliente() {

            System.out.println("---------- CADASTRO USUÁRIO----------");
            System.out.println("Informe seu nome: ");
            nome = scanner.nextLine();
            System.out.println("Informe seu cpf: ");
            cpf = scanner.nextLong();
            System.out.println("Informe seu RG: ");
            rg = scanner.nextLong();
            System.out.println("Informe seu telefone: ");
            telefone = scanner.nextLong();
            scanner.nextLine();
            System.out.println("----------------------------------------");
        }
    }

