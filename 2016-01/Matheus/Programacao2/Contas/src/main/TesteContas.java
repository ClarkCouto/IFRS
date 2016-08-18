package main;

import java.util.Date;

import classes.Cliente;
import classes.ContaCorrente;
import classes.ContaPoupanca;
import classes.DetalheHistorico;

public class TesteContas {

	public static void main(String[] args) {

		
		Cliente cli1 = new Cliente("Ricardo", "999.999.999-99");
		
		ContaCorrente c1 = new ContaCorrente(100, 220, cli1);
		ContaPoupanca c2 = new ContaPoupanca(100, 221, cli1);
			
		System.out.println("CONTA CORRENTE");
		c1.creditar(200.00d);
		System.out.println("Creditados 200 reais (Saldo: " + c1.getSaldo() + ")");		
		c1.debitar(20.0d);
		System.out.println("Debitados 20 reais + impostos. (Saldo: " + c1.getSaldo() + ")");		
		System.out.println("Total de CPFM descontado: " + c1.getTotalCPMF());
		System.out.println(">> Histórico");
		System.out.println();
		for(DetalheHistorico temp : c1.getHistorico()) {			
			System.out.println("Data: " + temp.getDataHora().toString());
			System.out.println("Tipo de operação: " + temp.getTipoOperacao());
			System.out.println("Valor da operação: " + temp.getValor());
			System.out.println();
		}
		System.out.println();
		
		System.out.println("CONTA POUPANÇA");
		c2.creditar(150);
		System.out.println("Creditados 150 reais. (Saldo: " + c2.getSaldo() + ")");		
		c2.debitar(10.0d);
		System.out.println("Debitados 10 reais. (Saldo: " + c2.getSaldo() + ")");
		c2.aplicarJuros();
		System.out.println("Aplicados juros (" + ContaPoupanca.getTaxaJuros() + ")");
		System.out.println("Saldo final: " + c2.getSaldo());	
		System.out.println(">> Histórico");
		System.out.println();
		for(DetalheHistorico temp : c2.getHistorico()) {			
			System.out.println("Data: " + temp.getDataHora().toString());
			System.out.println("Tipo de operação: " + temp.getTipoOperacao());
			System.out.println("Valor da operação: " + temp.getValor());
			System.out.println();
		}
	}

}
