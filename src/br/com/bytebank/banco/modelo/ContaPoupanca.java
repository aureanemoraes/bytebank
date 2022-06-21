package br.com.bytebank.banco.modelo;

public class ContaPoupanca extends Conta {
	public ContaPoupanca(int agencia, int numero){
	    super(agencia, numero);
	}
	
	@Override
	public String toString() {
		return "CONTA POUPANCA - " + super.toString();
	}
	
	@Override
	public void deposita(double valor){
	    super.saldo += valor;
	}
}
