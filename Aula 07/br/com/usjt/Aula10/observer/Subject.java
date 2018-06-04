package br.com.usjt.Aula10.observer;

public interface Subject {
	
	public void register(ConsomeNoticia consNot);
	public void unregister(ConsomeNoticia consNot);
	public void notifyObserver();
	

}
