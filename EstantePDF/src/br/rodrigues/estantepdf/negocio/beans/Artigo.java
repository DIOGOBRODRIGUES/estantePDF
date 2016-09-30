package br.rodrigues.estantepdf.negocio.beans;

import java.util.Arrays;

public class Artigo extends Arquivo {
	
	private String revista;
	private String dataPublicacao;
	private String doi;
	private String keywords[];
	private int voulume;
	private int numero;
	
	
	public Artigo(String titulo, int ano, String pagina, Autor[] autor, String revista, String dataPublicacao,
			String doi, String[] keywords, int voulume, int numero) {
		super(titulo, ano, pagina, autor);
		this.revista = revista;
		this.dataPublicacao = dataPublicacao;
		this.doi = doi;
		this.keywords = keywords;
		this.voulume = voulume;
		this.numero = numero;
	}
	
	
	public int getVoulume() {
		return voulume;
	}
	public void setVoulume(int voulume) {
		this.voulume = voulume;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getRevista() {
		return revista;
	}
	public void setRevista(String revista) {
		this.revista = revista;
	}
	public String getDataPublicacao() {
		return dataPublicacao;
	}
	public void setDataPublicacao(String dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}
	public String getDoi() {
		return doi;
	}
	public void setDoi(String doi) {
		this.doi = doi;
	}
	public String[] getKeywords() {
		return keywords;
	}
	public void setKeywords(String[] keywords) {
		this.keywords = keywords;
	}
	
	@Override
	public String toString(){
		return Arrays.toString(getAutor())+". "+getTitulo()+". "+revista+". "+voulume+","+numero+", "+getPagina()+
				", "+getAno();
	}
	
}
