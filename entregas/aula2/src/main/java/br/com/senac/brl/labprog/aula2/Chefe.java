package br.com.senac.brl.labprog.aula2;

public class Chefe extends Funcionario{
	
	private Secretaria secretaria = new Secretaria();

	public Secretaria getSecretaria() {
		return secretaria;
	}

	public void setSecretaria(Secretaria secretaria) {
		this.secretaria = secretaria;
	}
	
	

}
