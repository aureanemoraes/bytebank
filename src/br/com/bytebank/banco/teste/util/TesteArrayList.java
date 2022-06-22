package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayList {

	public static void main(String[] args) {
		ArrayList lista = new ArrayList();

		for(int i = 0 ; i < 5 ; i++) {
			lista.add(new ContaCorrente(i+i,i*i));
			lista.add(new ContaPoupanca(i+i,i*i));
		}
		
		for(Object o : lista) {
			System.out.println(o);
		}
	}

}
