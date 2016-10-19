package br.rodrigues.estantepdf.dados;

import java.util.ArrayList;


import br.rodrigues.estantepdf.negocio.beans.Arquivo;
import br.rodrigues.estantepdf.negocio.beans.Artigo;
import br.rodrigues.estantepdf.negocio.beans.DissertacaoTese;
import br.rodrigues.estantepdf.negocio.beans.Livro;

public class RepositorioPDF implements IRepositorioPDF {
	
	private static IRepositorioPDF instance;
	
	private ArrayList<Arquivo> listaArquivos;

	
	private RepositorioPDF (){
		this.listaArquivos=new ArrayList<>();
	}
	
	public static IRepositorioPDF getInstance(){
		if(instance==null)
			instance= new RepositorioPDF();
		return instance;
	}
	
		
	/* (non-Javadoc)
	 * @see br.rodrigues.estantepdf.dados.IRepositorioPDF#adicionar(br.rodrigues.estantepdf.negocio.beans.Arquivo)
	 */
	@Override
	public void adicionar(Arquivo a){
		this.listaArquivos.add(a);
	}
	
	/* (non-Javadoc)
	 * @see br.rodrigues.estantepdf.dados.IRepositorioPDF#remover(java.lang.String)
	 */
	@Override
	public void remover(String titulo){
		this.listaArquivos.remove(procurar(titulo));
	}
	
	/* (non-Javadoc)
	 * @see br.rodrigues.estantepdf.dados.IRepositorioPDF#procurar(java.lang.String)
	 */
	@Override
	public Arquivo procurar (String nome){
		Arquivo arquivo = null;
		for (int i = 0; i < listaArquivos.size(); i++) {
			if(listaArquivos.get(i).getTitulo().equals(nome)){
				arquivo=listaArquivos.get(i);
				break;
			}
		} 
		return arquivo;
	}
	
	/* (non-Javadoc)
	 * @see br.rodrigues.estantepdf.dados.IRepositorioPDF#Atualizar(java.lang.String)
	 */
	@Override
	public void Atualizar (String titulo){
		Arquivo arquivo = procurar(titulo);
		if( arquivo instanceof Artigo){
			
		}if (arquivo instanceof DissertacaoTese){
			
		}if (arquivo instanceof Livro){
			
		}
	}
	
	/* (non-Javadoc)
	 * @see br.rodrigues.estantepdf.dados.IRepositorioPDF#toString()
	 */
	@Override
	public String toString() {
		return String.format("%s", listaArquivos);
	}
	
	
}
