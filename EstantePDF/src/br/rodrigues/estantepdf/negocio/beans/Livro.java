package br.rodrigues.estantepdf.negocio.beans;

public class Livro extends Arquivo {
	
	private String editora;
	private int edicao;
	private String cidade;
	
		
	public Livro(String titulo, int ano, String pagina, Autor[] autor, String editora, int edicao, String cidade) {
		super(titulo, ano, pagina, autor);
		this.editora = editora;
		this.edicao = edicao;
		this.cidade = cidade;
	}
	
	
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public int getEdicao() {
		return edicao;
	}
	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	

}
