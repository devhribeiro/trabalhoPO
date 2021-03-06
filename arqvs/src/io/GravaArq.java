package io;

import java.io.*;


public class GravaArq {
	private FileWriter writer; 
	private	PrintWriter saida;

	/**
	 * Construtor da classe
	 * @param nome => nome do arquivo que ser� abero para grava��o
	 * @throws IOException => Exce��o se houver algum problema se o 
	 * 					 arquivo n�o puder ser aberto para grava��o
	 */
	public GravaArq (String nome, boolean append) throws IOException{
		try{
			this.writer = new FileWriter(new File(nome),append);
			saida = new PrintWriter (writer);
		}
		catch (IOException e){
			throw new IOException ("ARQUIVO NAO PODE SER ABERTO PARA GRAVACAO");
		}
	}
	
	public void gravaArquivo (String str)throws IOException	{
				this.saida.print(str);
	}
	
	public void fechaArquivo ()throws IOException{
		try{
			this.saida.close();
			this.writer.close();
		}
		catch (IOException e){
			throw new IOException ("ERRO AO FECHAR O ARQUIVO");
		}
	}
}
