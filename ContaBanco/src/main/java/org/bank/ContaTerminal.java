package org.bank;


import java.text.Format;
import java.util.Objects;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner sc = new Scanner(System.in);
        String adicionarCorrentista = "S";

        while (Objects.equals(adicionarCorrentista, "S")){
            System.out.println("Deseja adicionar um novo correntista? (S) - Sim (N) - Não");
            adicionarCorrentista = sc.next();

            if (Objects.equals(adicionarCorrentista, "S")){
                System.out.println("Digite o número da conta:");
                numero = sc.nextInt();

                System.out.println("Digite a agência da conta:");
                agencia = sc.next();

                System.out.println("Digite o nome do cliente da conta:");
                nomeCliente = sc.next();

                System.out.println("Digite o saldo da conta:");
                saldo = sc.nextDouble();

                System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                                   ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

            } else if (!Objects.equals(adicionarCorrentista, "N")){
                System.out.println("Opção inválida");
                adicionarCorrentista = "S";
            }
        }
    }
}