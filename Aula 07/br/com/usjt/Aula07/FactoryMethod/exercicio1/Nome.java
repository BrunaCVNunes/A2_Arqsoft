package br.com.usjt.Aula07.FactoryMethod.exercicio1;

public class Nome {
	String nome;
	String sobrenome;	
	Tipo tipo;
	
	public Nome() {}
	
	public Nome(String nome, String sobrenome, Tipo tipo) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.tipo = tipo;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	
	
}
