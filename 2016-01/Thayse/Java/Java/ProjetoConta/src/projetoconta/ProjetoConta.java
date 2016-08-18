/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoconta;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class ProjetoConta {

    
    public static void main(String[] args) {
        Cliente cli = new Cliente("José", "653423");
        
        ContaPoupanca cp = new ContaPoupanca(1000, 123456, 2000, cli);
        ContaCorrente cc = new ContaCorrente(2000, 423454, 4000, cli);
        ContaPoupanca cDestino = new ContaPoupanca(3000, 451233, 5000, cli);
        
        cp.creditar(500);
        cp.setTaxaJuros(10);
        cp.aplicarJuros();
        
        cp.debitar(200);
        cp.debitar(100);
        cp.creditar(70);
        
        
        
        cc.creditar(30);
        cc.debitar(50);
        cc.creditar(200);
        cc.creditar(40);
        cc.debitar(100);
        cc.getTotalCPMF();
        
        System.out.println("--- ContaCorrente ---");
        System.out.println("Agencia: " + cc.getAgencia());
        System.out.println("Conta: " + cc.getNumero());
        System.out.println("Saldo: " + cc.getSaldo());
        System.out.println(cc.getCliente().toString());
        
        System.out.println("Total CPMF: " + cc.getTotalCPMF());
        
        System.out.println("Saldo: " + cc.getSaldo());
        cc.transferir(cDestino, 900);
        
        System.out.println("Saldo após transferência: " + cc.getSaldo());
        
        //System.out.println("Histórico de Operações: \n");
        //for(DetalheHistorico hist : cc.getHistorico()) {
        //     System.out.println(hist.toString());
        //}
        System.out.println("--- Inserindo dados para consultar um intervalo de histórico ---");
        System.out.println("--- As transações vão de 20-JAN-2015 até 20-FEV-2015 ---");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Data inicial:\n");

        String dateI = scanner.next();
        
        System.out.println("Data final:\n");

        String dateF = scanner.next();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
        Date dataInicio = null;
        Date dataFim = null;
        try {
            //Parsing the String
            dataInicio = dateFormat.parse(dateI);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            //Parsing the String
            dataFim = dateFormat.parse(dateF);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        
        for(DetalheHistorico inter : cc.getHistorico(dataInicio, dataFim)) {
            System.out.println(inter.toString());
        }
        
        System.out.println("\nQuantidade de Débitos nesse Intervalo: " + cc.quantidadeDepositos(dataInicio, dataFim) + "\n");
        System.out.println("\nValor de Débitos nesse Intervalo: " + cc.totalDepositos(dataInicio, dataFim) + "\n");
        
        System.out.println("--- ContaPoupança ---");
        System.out.println("Agencia: " + cp.getAgencia());
        System.out.println("Conta: " + cp.getNumero());
        System.out.println("Saldo: " + cp.getSaldo());
        System.out.println(cp.getCliente().toString());
        
        System.out.println("Taxa de Juros: " + cp.getTaxaJuros());
        
        System.out.println("Saldo: " + cp.getSaldo());
        cp.transferir(cDestino, 800);
        
        System.out.println("Saldo após transferência: " + cp.getSaldo());
        
        System.out.println("Histórico de Operações: \n");
        for(DetalheHistorico hist : cp.getHistorico()) {
             System.out.println(hist.toString());
        }
    }
    
    
    
}
