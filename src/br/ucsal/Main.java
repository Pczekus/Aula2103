package br.ucsal;

import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) {
		Banco banco = new Banco();		
		
		Ccorrente joao1 = new Ccorrente("Joao", "1", "1");
		
		banco.adicionaConta().add(joao1);
		
		Ccorrente joao2 = new Ccorrente("Joao","2","2");
		banco.getlista().add(joao2);
		
		System.out.println("Contas"+banco.getlista().size());
		
		
		System.out.println(joao1);
		System.out.println(joao2);
		
		
		System.out.println(joao1.saldo());
		joao1.deposito(BigDecimal.TEN);
		System.out.println(joao1.saldo());
		joao1.saque("5.00");
		System.out.println("Saldo Joao 1"+joao1.saldo());
		System.out.println("Saldo Joao 2"+joao2.saldo());
	    joao1.transferencia(joao2, new BigDecimal("3.00"));
	    System.out.println("Saldo Joao 1: "+ joao1.saldo());
	    System.out.println("Saldo Joao 2: "+ joao2.saldo());
		
	   // Ccorrente cc = banco.obterConta("1", "1");
	   // System.out.println("Saldo:"+ cc.consultarsaldo());
	}

}
