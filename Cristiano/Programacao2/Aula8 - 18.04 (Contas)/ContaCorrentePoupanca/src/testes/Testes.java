/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import classes.Cliente;
import classes.ContaCorrente;
import classes.ContaPoupanca;

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
        ContaCorrente ccJoao = new ContaCorrente(1, 1, 1000, c1);
        ContaPoupanca cpJoao = new ContaPoupanca(2, 1, c1);
        ContaCorrente ccMaria = new ContaCorrente(1, 2, 2000, c2);
        System.out.println("--------------------------------");
        System.out.println("Imprimindo Informações..\n");
        System.out.println(ccJoao.toString());
        System.out.println("\n" + cpJoao.toString());
        System.out.println("\n" + ccMaria.toString());
        System.out.println("--------------------------------");
        System.out.println("Definindo Taxa de Juros e CPMF");
        ccJoao.setTaxaCPMF(0.5);
        cpJoao.setTaxaJuros(0.5);
        System.out.println("\nCPMF = " + ccJoao.getTaxaCPMF());
        System.out.println("Taxa de Juros = " + cpJoao.getTaxaJuros());
        System.out.println("--------------------------------");
        System.out.println("Efetuando Operações..\n");
        
        System.out.println("TRANSFERIR R$1000.00 DA MARIA PARA A CONTA CORRENTE DO JOÃO\n");
        System.out.println("Saldos ANTES da transferência:");
        imprimirSaldo(ccJoao, ccMaria, cpJoao);
        ccMaria.transferir(ccJoao, 1000);
        System.out.println("Saldos DEPOIS da transferência:");
        imprimirSaldo(ccJoao, ccMaria, cpJoao);
        
        System.out.println("\nTRANSFERIR R$500.00 DA CONTA CORRENTE PARA A CONTA POUPANÇA DO JOÃO\n");
        System.out.println("Saldos ANTES da transferência:");
        imprimirSaldo(ccJoao, ccMaria, cpJoao);
        ccJoao.transferir(cpJoao, 500);
        System.out.println("Saldos DEPOIS da transferência:");
        imprimirSaldo(ccJoao, ccMaria, cpJoao);
        
        System.out.println("\nTRANSFERIR R$500.00 DA CONTA CORRENTE DA MARIA PARA A CONTA POUPANÇA DO JOÃO\n");
        System.out.println("Saldos ANTES da transferência:");
        imprimirSaldo(ccJoao, ccMaria, cpJoao);
        ccMaria.transferir(cpJoao, 500);
        System.out.println("Saldos DEPOIS da transferência:");
        imprimirSaldo(ccJoao, ccMaria, cpJoao);
        
        System.out.println("\nCREDITAR O RENDIMENTO MENSAL DAS CONTAS POUPANÇA\n");
        System.out.println("Saldos ANTES do crédito do rendimento:");
        imprimirSaldo(ccJoao, ccMaria, cpJoao);
        cpJoao.aplicarJuros();
        System.out.println("Saldos DEPOIS do crédito do rendimento:");
        imprimirSaldo(ccJoao, ccMaria, cpJoao);
        
        System.out.println("\nVALOR TOTAL PAGO DE CPMF\n");
        System.out.println("CC João = " + ccJoao.getTotalCPMF());
        System.out.println("CC Maria = " + ccMaria.getTotalCPMF());
    }
    
    public static void imprimirSaldo(ContaCorrente ccJoao, ContaCorrente ccMaria, ContaPoupanca cpJoao){
        System.out.println("Saldo CC João = " + ccJoao.getSaldo());
        System.out.println("Saldo CP João = " + cpJoao.getSaldo());
        System.out.println("Saldo CC Maria = " + ccMaria.getSaldo());
    }
}
