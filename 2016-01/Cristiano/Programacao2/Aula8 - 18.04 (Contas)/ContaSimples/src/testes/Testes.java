/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import classes.Cliente;
import classes.Conta;

/**
 *
 * @author Clark
 */
public class Testes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("--------------------------------");
        System.out.println("Criando clientes..");
        Cliente c1 = new Cliente("João", "123");
        c1.toString();
        Cliente c2 = new Cliente("Maria", "456");
        c2.toString();
        System.out.println("--------------------------------");
        System.out.println("Criando contas..");
        Conta conta1Joao = new Conta(1, 1, 1000, c1);
        Conta conta2Joao = new Conta(2, 1, c1);
        Conta contaMaria = new Conta(1, 2, 2000, c2);
        System.out.println("--------------------------------");
        System.out.println("Imprimindo Informações..\n");
        System.out.println(conta1Joao.toString());
        System.out.println("\n" + conta2Joao.toString());
        System.out.println("\n" + contaMaria.toString());
        System.out.println("--------------------------------");
        System.out.println("Efetuando Operações..\n");
        System.out.println("Transferir R$1000.00 da Maria para a Conta 1 do João\n");
        System.out.println("Saldos ANTES da transferência:");
        System.out.println("Saldo Conta 1 João = " + conta1Joao.getSaldo());
        System.out.println("Saldo Conta 2 João = " + conta2Joao.getSaldo());
        System.out.println("Saldo Conta Maria = " + contaMaria.getSaldo());
        contaMaria.transferir(conta1Joao, 1000);
        System.out.println("Saldos DEPOIS da transferência:");
        System.out.println("Saldo Conta 1 João = " + conta1Joao.getSaldo());
        System.out.println("Saldo Conta 2 João = " + conta2Joao.getSaldo());
        System.out.println("Saldo Conta Maria = " + contaMaria.getSaldo());
        System.out.println("\nTransferir R$500.00 da Conta 1 para a Conta 2 do João\n");
        System.out.println("Saldos ANTES da transferência:");
        System.out.println("Saldo Conta 1 João = " + conta1Joao.getSaldo());
        System.out.println("Saldo Conta 2 João = " + conta2Joao.getSaldo());
        System.out.println("Saldo Conta Maria = " + contaMaria.getSaldo());
        conta1Joao.transferir(conta2Joao, 500);
        System.out.println("Saldos DEPOIS da transferência:");
        System.out.println("Saldo Conta 1 João = " + conta1Joao.getSaldo());
        System.out.println("Saldo Conta 2 João = " + conta2Joao.getSaldo());
        System.out.println("Saldo Conta Maria = " + contaMaria.getSaldo());
    }
    
}
