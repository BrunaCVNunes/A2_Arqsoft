package br.com.usjt.FactoryMethod.exercicio1;

public class NomeSobrenomeParser implements NomeParser {

	@Override
	public String parse(Nome nome) {
		return nome.nome + " " + nome.sobrenome + ";";
	}
}
