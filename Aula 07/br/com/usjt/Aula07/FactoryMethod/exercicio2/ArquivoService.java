package br.com.usjt.Aula07.FactoryMethod.exercicio2;

public abstract class ArquivoService {
	public void gerarArquivo() {
		ArquivoParser arquivoParser = getParser();
		arquivoParser.parse();
	}
	
	protected abstract ArquivoParser getParser();

}
