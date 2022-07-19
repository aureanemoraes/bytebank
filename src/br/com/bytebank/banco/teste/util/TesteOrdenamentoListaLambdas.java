package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteOrdenamentoListaLambdas {
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
		
		listaContas.forEach( (conta) -> System.out.println(conta) );
		
		listaContas.sort( (conta1, conta2) -> Integer.compare(conta1.getNumero(), conta2.getNumero()) );
		
		System.out.println("---------------------------");
		
		listaContas.forEach( (conta) -> System.out.println(conta) );
		
		Comparator<Conta> titularContaComparator = (Conta conta1, Conta conta2) -> {
			String t1 = conta1.getTitular().getNome();
			String t2 = conta2.getTitular().getNome();
			return t1.compareTo(t2);
		};
		
		Collections.sort(listaContas, titularContaComparator);
		
		System.out.println("---------------------------");
		
		listaContas.forEach( (conta) -> System.out.println(conta) );
		
	}
}

