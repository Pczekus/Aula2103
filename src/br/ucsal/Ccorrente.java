package br.ucsal;

import java.math.BigDecimal;

public class Ccorrente {
	private String nome;
	private String agencia;
	private BigDecimal saldo;
	private String numero;

	public Ccorrente(String nome) {
		this(nome,"","");     			

	} 
	public Ccorrente(String nome, String agencia,String numero ) {
		this(nome, agencia, numero, BigDecimal.ZERO);
		//this.nome = nome;
		//this.saldo = BigDecimal.ZERO;
		///this.numero = numero;     		
		// this.agencia = agencia;

	}
	public Ccorrente(String nome, String agencia,String numero, BigDecimal saldo ) {

		this.nome = nome;
		this.saldo = saldo;
		this.numero = numero;     		
		this.agencia = agencia;

	}

	public boolean saque (String valor) {
		BigDecimal bigdecimal = new BigDecimal(valor);
		return this.saque(bigdecimal);
	}
	public boolean saque(BigDecimal valor) {
		boolean sucesso = false;
		if (! (this.saldo.compareTo(valor) < 0 )) {
			this.saldo = this.saldo.subtract(valor);
			sucesso = true;
		}            		
		return sucesso;            	

	}

	public boolean deposito(BigDecimal valor) {
		this.saldo = this.saldo.add(valor);

		return true;
	}
	public BigDecimal saldo() {
		return this.saldo;
	}

	 
	public boolean transferencia(Ccorrente conta, BigDecimal valor) {
		boolean sucesso = false;
		sucesso = this.saque(valor);
		if(sucesso) {
			sucesso = conta.deposito(valor);
			if(!sucesso) {
				this.deposito(valor);
			}
		}
		return true;
	}
	public boolean transferencia(String numero, String agencia, BigDecimal valor ) {
		this.numero = numero; 
		this.agencia = agencia;
		return true;
	}


    
}
