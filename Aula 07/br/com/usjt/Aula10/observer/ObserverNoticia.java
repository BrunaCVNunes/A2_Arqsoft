package br.com.usjt.Aula10.observer;

public class ObserverNoticia implements ConsomeNoticia {
	public ObserverNoticia(NoticiarioAssina not) {
		this.sub = not;
		this.observerID = ++observerIDTracker;
		System.out.println("Novo observador: " + this.observerID);
		not.register(this);
	}

	private String textoNoticia;
	private int dia;
	private int mes;
	private String topico;

	private int observerID;

	private static int observerIDTracker = 0;

	private NoticiarioAssina sub;

	@Override
	public void notificaNoticia(String textoNoticia, int dia, int mes, String topico) {
		this.textoNoticia = textoNoticia;
		this.dia = dia;
		this.mes = mes;
		this.topico = topico;

	}

	@Override
	public String toString() {
		return "ObserverNoticia [textoNoticia=" + textoNoticia + ", dia=" + dia + ", mes=" + mes + ", topico=" + topico
				+ ", observerID=" + observerID + ", sub=" + sub + "]";
	}
	
	

}
