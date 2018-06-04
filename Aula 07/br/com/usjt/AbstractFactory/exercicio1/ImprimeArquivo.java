package br.com.usjt.AbstractFactory.exercicio1;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;

public class ImprimeArquivo implements Impressao {

	@Override
	public void imprime(String texto) {
		// TODO Auto-generated method stub
		System.out.println("Imprime no arquivo..." + texto);
		Writer writer = null;
		try {
			writer = new BufferedWriter(new OutputStreamWriter(
					new FileOutputStream("C:\\USJT_CCP3AN\\output.txt"), "utf-8"));
			writer.write(texto);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			 try {
				 writer.close();
			 } catch (Exception e) {
				 e.printStackTrace();
			 }
		}
	}

}
