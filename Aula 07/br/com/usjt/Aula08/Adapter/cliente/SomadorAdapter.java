package br.com.usjt.Aula08.Adapter.cliente;

import java.util.ArrayList;
import java.util.List;

public class SomadorAdapter extends SomadorExistente implements SomadorEsperado{

	@Override
	public int somaVetor(int[] vetor) {
		List<Integer> lista = new ArrayList<Integer>();
		for (int i = 0 ; i<vetor.length;i++) {
			lista.add(i);
		}
		return somaLista(lista);
	}

}
