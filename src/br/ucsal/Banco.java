package br.ucsal;

import java.util.ArrayList;

public class Banco {
	
	private ArrayList<Ccorrente> lista = new ArrayList<Ccorrente>();
	
	public ArrayList<Ccorrente> getlista(){
		return lista;
	}
	public void setlista(ArrayList<Ccorrente> lista) {
		this.lista = lista ;
	}
	
	public void adicionarConta(Ccorrente cc) {
		if(!this.lista.contains(cc)) {
			this.lista.add(cc);
		}
		
	}
	
	public void remove(Ccorrente cc) {
		this.lista.remove(cc);
	}
	
	public Ccorrente obterConta(String numero, String agencia) {
		Ccorrente exemplo = new Ccorrente("", agencia, numero);
		int index = this.lista.indexOf(exemplo);
		if(index != -1) {
			return this.lista.get(index);
		}else {
			return null;
		}
		
	}
}
