package br.com.usjt.Aula08.Template.arrays;

public abstract class Template {
	
	
	final int[] main() {
		double[] x = { 1.1, 2.2, 3.2, 4.4,5.5};
		
		if(sortBol()==true) {
			return sort(x);
			
		}
		
		return null;
		
	}
	abstract int[] sort(double[] x) ;
	
	private boolean sortBol() {
		// TODO Auto-generated method stub
		return true;
	}

}

