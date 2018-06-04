package br.com.usjt.Aula10.observer;


public class NoticiaTeste {
	public static void main(String[] args) {
		
		NoticiarioAssina noticia = new NoticiarioAssina();
		System.out.println(noticia);
		ObserverNoticia obsNot = new ObserverNoticia(noticia);
		
		noticia.setDia(30);
		noticia.setMes(4);	
		noticia.setTopico("Financeiro");
		noticia.setTextoNoticia("Notícia:\n O dólar continua em alta enquanto o bitcoin sofre queda significante.");
		
		System.out.println(noticia);

		
	}

}
