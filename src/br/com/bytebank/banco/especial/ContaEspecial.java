package br.com.bytebank.banco.especial;

import br.com.bytebank.banco.modelo.Conta;

/**
 * Classe criada para testar a visibilidadr default
 * 
 * @author Nane Moraes
 *
 */

public class ContaEspecial extends Conta {
 
	public ContaEspecial(int agencia, int numero){
	    super(agencia, numero);
	}
	
	@Override
	public void deposita(double valor) {
		// TODO Auto-generated method stub

	}

}
