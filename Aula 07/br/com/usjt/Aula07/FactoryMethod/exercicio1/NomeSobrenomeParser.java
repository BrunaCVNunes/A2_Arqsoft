package br.com.usjt.Aula07.FactoryMethod.exercicio1;

public class NomeSobrenomeParser implements NomeParser {

	@Override
	public String parse(Nome nome) {
		return nome.nome + " " + nome.sobrenome + ";";
	}
}
