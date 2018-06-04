package br.com.usjt.Aula08.Template.strings;

public class Upper extends Leitura {


	@Override
	String upper(String s) {
		s = s.toUpperCase();
		return s;
	}


	@Override
	String inverte(String s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	String duplicate(String s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	String lower(String s) {
		// TODO Auto-generated method stub
		return null;
	}
	
	boolean upperBool() {
		return true;
	}
	
	boolean inverteBool() {
		return false;
	}

	boolean duplicateBool() {
		return false;
	}

	

	boolean lowerBool() {
		return false;
	}


}
