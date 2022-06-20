package br.com.bytebank.banco.modelo;

public class CriaConta {

	public static void main(String args[]){
	    Conta conta = new ContaCorrente(123,456);
	    System.out.println(Conta.getTotal());
	}
}