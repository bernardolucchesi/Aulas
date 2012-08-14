package br.com.senac.brl.labprog.Aula3;

public class Chefe extends Funcionario{

	private Secretaria secretaria = new Secretaria();

	public Secretaria getSecretaria() {
		return secretaria;
	}

	public void setSecretaria(Secretaria secretaria) {
		this.secretaria = secretaria;
	}
	
	
}
