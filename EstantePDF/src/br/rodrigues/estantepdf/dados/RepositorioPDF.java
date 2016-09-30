package br.rodrigues.estantepdf.dados;

import java.util.ArrayList;


import br.rodrigues.estantepdf.negocio.beans.Arquivo;

public class RepositorioPDF {
	
	private static RepositorioPDF instance;
	private ArrayList<Arquivo> listaArquivos;

	
	private RepositorioPDF (){
		this.listaArquivos=new ArrayList<>();
	}
	
	public static RepositorioPDF getInstance(){
		if(instance==null)
			instance= new RepositorioPDF();
		return instance;
	}
	
		
	public void adicionar(Arquivo a){
		this.listaArquivos.add(a);
	}
	
	public void remover(Arquivo a){
		this.listaArquivos.remove(a);
	}
	
	public Arquivo Procurar(Arquivo a){
		Arquivo resultado=null;
		boolean Contem=false;
		Contem=this.listaArquivos.contains(a);
		if(Contem!=false)
			resultado=a;
		return resultado;
	}
}
