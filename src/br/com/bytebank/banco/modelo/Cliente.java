package br.com.bytebank.banco.modelo;

public class Cliente implements Autenticavel{

    private AutenticacaoUtil autenticador;
    private String nome;

    public Cliente(String nome){
    	this.nome = nome;
        this.autenticador = new AutenticacaoUtil();
    }

    @Override
    public void setSenha(int senha){
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha){
        return this.autenticador.autentica(senha);
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}