package br.rodrigues.estantepdf.negocio;

import br.rodrigues.estantepdf.dados.RepositorioPDF;
import br.rodrigues.estantepdf.negocio.beans.Arquivo;
import br.rodrigues.estantepdf.negocio.beans.Artigo;

public class GerenciadorPDF {
	
	private RepositorioPDF repoPdf;
	
	private static GerenciadorPDF instance;
	
	private GerenciadorPDF (){
		
		this.repoPdf = RepositorioPDF.getInstance();
	}
	
	public static GerenciadorPDF getInstance(){
		if(instance==null)
			instance= new GerenciadorPDF();
		return instance;
	}
	
	public void armzenarPDF(int tipo, Arquivo arquivo){
		
		switch (tipo) {
		case 1:
			//Arquivo aquivo=new Artigo(null, tipo, null, null, null, null, null, null, tipo, tipo);
			break;

		default:
			break;
		}
		
		
	}
	
	
	
}
