package br.rodrigues.estantepdf.negocio.beans;

//adicionar 
public class Arquivo {
	private String titulo;
	private int ano;
	private String pagina;
	private Autor autor[];
	
		
	public Arquivo(String titulo, int ano, String pagina, Autor[] autor) {
		super();
		this.titulo = titulo;
		this.ano = ano;
		this.pagina = pagina;
		this.autor = autor;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getPagina() {
		return pagina;
	}
	public void setPagina(String pagina) {
		this.pagina = pagina;
	}
	public Autor[] getAutor() {
		return autor;
	}
	public void setAutor(Autor[] autor) {
		this.autor = autor;
	}
	
	
	
}
