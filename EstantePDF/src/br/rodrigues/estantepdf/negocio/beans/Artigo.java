package br.rodrigues.estantepdf.negocio.beans;

import java.util.Arrays;

public class Artigo extends Arquivo {
	
	private String revista;
	private String dataPublicacao;
	private String doi;
	private String keywords[];
	private int volume;
	private int numero;
	
	
	public Artigo(String titulo, int ano, String pagina, Autor[] autor, String revista, String dataPublicacao,
			String doi, String[] keywords, int voulume, int numero) {
		super(titulo, ano, pagina, autor);
		this.revista = revista;
		this.dataPublicacao = dataPublicacao;
		this.doi = doi;
		this.keywords = keywords;
		this.volume = voulume;
		this.numero = numero;
	}
	
	
	public int getVolume() {
		return volume;
	}
	public void setVolume(int voulume) {
		this.volume = voulume;
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
		return String.format("Artigo de Revista: Autor %s.  Titulo = %s, Revista= %s, v.%s, n.%s, p.%s, %s\n", Arrays.toString(getAutor()), getTitulo(), getRevista(),
				getVolume(), getNumero(), getPagina(), getAno());
	}
	
}
