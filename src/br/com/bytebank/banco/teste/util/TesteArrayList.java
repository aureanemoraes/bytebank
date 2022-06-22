package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
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
		
		System.out.println("------------------");
		
		// Generics
		ArrayList<Conta> listaDeContas = new ArrayList<Conta>();
		for(int i = 0 ; i < 5 ; i++) {
			listaDeContas.add(new ContaCorrente(i+i,i*i));
			listaDeContas.add(new ContaPoupanca(i+i,i*i));
		}
		
		for(Conta conta : listaDeContas) {
			System.out.println(conta);
		}
		
		// Criação de arrays com arrays
		ArrayList<String> listaDeEstados = new ArrayList<String>(16);
		listaDeEstados.add("AP");
		listaDeEstados.add("PA");
		
		ArrayList<String> listaDeEstadosAtualizada = new ArrayList<String>(listaDeEstados);
		listaDeEstadosAtualizada.add("SP");
		
		System.out.println(listaDeEstadosAtualizada);
		
		for(String uf : listaDeEstadosAtualizada) {
			System.out.println(uf);
		}
		
	}

}
