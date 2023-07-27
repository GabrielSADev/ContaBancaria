package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Usuario usuario = new Usuario();



        int x = 0;
        while( x== 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\n \n Seja bem vindo(a) ao Banco!!" +
                    "\n 1 - Dados da conta" + "\n 2 - Depósito" + "\n 3 - Saque" + "\n 4 - Investimento");

            if (usuario.getNome() == null) {
                System.out.print("Insira seu nome completo: ");
                String nome = scanner.nextLine();
                usuario.setNome(nome);
                System.out.println("Nome: " + usuario.getNome());
            }

            System.out.print("escolha a operação:");
            int opc = scanner.nextInt();

            switch (opc) {
                case 1:
                    System.out.print("\n Nome do usuário:" + usuario.getNome() + "\n Saldo:" + usuario.getSaldo() + "\n Valor investido:" + usuario.getInvestimento());

                    break;

                case 2:
                    System.out.print("Digite o valor do depósito:");
                    float deposito = scanner.nextFloat();
                    usuario.setSaldo(usuario.getSaldo() + deposito);
                    System.out.println("Valor do depósito: " + deposito);
                    System.out.println("Valor do saldo atual: " + usuario.getSaldo());
                    break;
                case 3:
                    System.out.print("Digite o valor do saque:");
                    float saque = scanner.nextFloat();
                    if(usuario.getSaldo() > saque) {
                        usuario.setSaldo(usuario.getSaldo() - saque);
                        System.out.println("Valor do saque: " + saque);
                        System.out.println("Valor do saldo atual: " + usuario.getSaldo());
                    }
                    else {
                        System.out.println("Saldo insuficiente");
                    }
                    break;
                case 4:
                    System.out.print("Digite o valor do investimento:");
                    float investimento = scanner.nextFloat();
                    if(usuario.getSaldo() > investimento) {
                        usuario.setSaldo(usuario.getSaldo() - investimento);
                        usuario.setInvestimento(usuario.getInvestimento() + investimento);
                        System.out.println("Valor do investimento: " + investimento);
                        System.out.println("Valor do saldo atual: " + usuario.getSaldo());
                    }
                    break;

            }
            usuario.setInvestimento((float) (usuario.getInvestimento()*1.05));
        }















    }
}