package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteOrdenamentoLista {
	public static void main(String[] args) {
		Conta c1 = new ContaCorrente(11, 11);
		Cliente cl1 = new Cliente("Joao");
		c1.setTitular(cl1);
		c1.deposita(500.0);
		
		Conta c2 = new ContaCorrente(33, 33);
		Cliente cl2 = new Cliente("Maria");
		c2.setTitular(cl2);
		c2.deposita(350.0);
		
		Conta c3 = new ContaCorrente(22, 22);
		Cliente cl3 = new Cliente("Antonieta");
		c3.setTitular(cl3);
		c3.deposita(900.0);
		
		Conta c4 = new ContaCorrente(44, 44);
		Cliente cl4 = new Cliente("Carlos");
		c4.setTitular(cl4);
		c4.deposita(50.0);
		
		List<Conta> listaContas = new ArrayList<>(); 
		listaContas.add(c1);
		listaContas.add(c2);
		listaContas.add(c3);
		listaContas.add(c4);
		
		System.out.println("Sem ordenamento:");
		for (Conta conta : listaContas) {
			System.out.println(conta);
		}
		
		listaContas.sort(new NumeroDaContaComparator());
		
		System.out.println("Com ordenamento por numero da conta:");
		for (Conta conta : listaContas) {
			System.out.println(conta);
		}
		
		listaContas.sort(new TitularDaContaComparator());
		
		System.out.println("Com ordenamento por titular da conta:");
		
		for (Conta conta : listaContas) {
			System.out.println(conta);
		}
		
		Collections.sort(listaContas);
		
		System.out.println("Com ordenamento natural (por saldo) :");
		
		for (Conta conta : listaContas) {
			System.out.println(conta);
		}
		
	}
}

class NumeroDaContaComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) {
		// TODO Auto-generated method stub
		return Integer.compare(c1.getNumero(), c2.getNumero());
	}
	
}

class TitularDaContaComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) {
		String t1 = c1.getTitular().getNome();
		String t2 = c2.getTitular().getNome();
		return t1.compareTo(t2);
	}
	
}
