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
	
	public void armzenarPDF(Arquivo arquivo){
		repoPdf.adicionar(arquivo);		
	}
	
	public void removerPDF(Arquivo arquivo){
		repoPdf.remover(arquivo);
	}

	@Override
	public String toString() {
		return String.format("%s", repoPdf);
	}
	
	
	
	
	
}
