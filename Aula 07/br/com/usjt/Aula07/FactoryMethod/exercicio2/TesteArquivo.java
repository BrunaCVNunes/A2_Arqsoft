package br.com.usjt.Aula07.FactoryMethod.exercicio2;

public class TesteArquivo {
	public static void main(String[] args) {
		ArquivoService service = new ArquivoConfidencialService();
		service.gerarArquivo();
		
		service = new ArquivoPublicoService();
		service.gerarArquivo();
	}
}
