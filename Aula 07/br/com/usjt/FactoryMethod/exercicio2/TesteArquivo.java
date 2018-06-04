package br.com.usjt.FactoryMethod.exercicio2;

public class TesteArquivo {
	public static void main(String[] args) {
		ArquivoService service = new ArquivoConfidencialService();
		service.gerarArquivo();
		
		service = new ArquivoPublicoService();
		service.gerarArquivo();
	}
}
