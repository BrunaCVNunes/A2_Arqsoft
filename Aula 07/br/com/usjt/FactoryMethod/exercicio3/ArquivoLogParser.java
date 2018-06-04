package br.com.usjt.FactoryMethod.exercicio3;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class ArquivoLogParser implements LogParser {

	@Override
	public void imprime(int size) {
		String texto = "";
		for (int i = 0; i < size; i++) {
			texto += (i+1) + "\r\n";
		}
		Writer writer = null;
		try {
			writer = new BufferedWriter(new OutputStreamWriter(
					new FileOutputStream("C:\\USJT_CCP3AN\\log.txt"), "utf-8"));
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
