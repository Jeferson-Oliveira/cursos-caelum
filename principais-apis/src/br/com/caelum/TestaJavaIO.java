package br.com.caelum;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.util.Scanner;


public class TestaJavaIO {

	public static void main(String[] args) throws IOException {
		// baixo nível
		
		// leitor
		InputStream is = new FileInputStream("entrada.txt");// bytes
		InputStreamReader isr = new InputStreamReader(is);// character
		BufferedReader br = new BufferedReader(isr);// cadeia de caracteres
		//escritor
		OutputStream os = new FileOutputStream("saida.txt");
		OutputStreamWriter osr = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osr);
		
		String linha = br.readLine();
		while(linha != null){
			bw.append(linha);
			bw.newLine();
			linha = br.readLine();
		}
		
		br.close();
		bw.close();
		fechaArquivos(br,bw);
	
		
		
		//alto nível
		
		Scanner sc = new Scanner(new FileInputStream("entrada.txt"));
		PrintStream ps = new PrintStream(new FileOutputStream("saida.txt"));
		
		while(sc.hasNextLine()){
			ps.println(sc.nextLine());
		}
		
		fechaArquivos(sc,ps);


	}
	
	static void fechaArquivos(Closeable...closeables) throws IOException{
		for(Closeable closeable: closeables){
			closeable.close();
		}
	}
}
