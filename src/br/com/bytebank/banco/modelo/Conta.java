package br.com.bytebank.banco.modelo;

/**
 * Classe criada para representar o objeto Conta.
 * 
 * @author Nane Moraes
 *
 */

public abstract class Conta implements Comparable<Conta>{

    double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total = 0;
    
    /**
     * Construtor da classe Conta
     * 
     * @param agencia
     * @param numero
     */
    
    public Conta(int agencia, int numero){
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = 100; //isso significa que toda conta começa com 100 de saldo.
    }

    public abstract void deposita(double valor);

    public boolean saca(double valor) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * Método para transferir valor de uma Conta para outra.
     * @param valor
     * @param destino
     * @return
     */
    
    public boolean transfere(double valor, Conta destino) {

        if(this.saca(valor)) {
            destino.deposita(valor);
            return true;
        } else {
            return false;
        }
    }
    
    @Override
	public int compareTo(Conta outra) {
		return Double.compare(this.saldo, outra.saldo);
	}
    
    @Override
    public String toString() {
    	return "Conta: " + this.numero + " Agencia: " 
    			+ this.agencia + " Titular: " + this.titular.getNome()
    			+ " Saldo: " + this.saldo;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public int getAgencia(){
        return this.agencia;
    }

    public void setAgencia(int agencia){
        this.agencia = agencia;
    }

    public void setTitular(Cliente titular){
        this.titular = titular;
    }

    public Cliente getTitular(){
        return this.titular;
    }

    public static int getTotal(){
        return Conta.total;
    }
}