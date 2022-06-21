package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayReferencia {

	public static void main(String[] args) {
		ContaCorrente[] arrayCC = new ContaCorrente[5];
		
		for(int i = 0 ; i < arrayCC.length ; i++) {
			arrayCC[i] = new ContaCorrente(i+i, i*i);
		}
		
		for(int i = 0 ; i < arrayCC.length ; i++) {
			System.out.println(arrayCC[i]);
		}

	}

}
