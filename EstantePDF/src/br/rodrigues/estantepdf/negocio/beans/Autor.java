package br.rodrigues.estantepdf.negocio.beans;

public class Autor {
	
	private String nome;
	private String instituicao;
	
	public Autor(String nome, String instituicao){
		this.nome= nome;
		this.instituicao= instituicao;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void setNome(String nome){
		this.nome=nome;
	}
	
	public String getInstituicao(){
		return this.instituicao;
	}
	
	public void setInstituicao(String instituicao){
		this.instituicao=instituicao;
	}
	
	boolean equals(Autor a){
		boolean r;
		if(a!=null&&a.getNome()!=null)
			r=(this.nome.equals(a.getNome())&&this.instituicao.equals(a.getInstituicao()));
		else 
			r=false;
		return r;
	}
	
	@Override
	public String toString(){
		return String.format("%s", getNome());
	}

}
