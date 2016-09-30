package br.rodrigues.estantepdf.negocio.beans;

import java.util.Arrays;

public class DissertacaoTese extends Arquivo{
	
	private String programa;
	private String universidade;
	private String tipo; //monografia dissertação ou tese
		
	public DissertacaoTese(String titulo, int ano, String pagina, Autor[] autor, String programa, String universidade,
			String tipo) {
		super(titulo, ano, pagina, autor);
		this.programa = programa;
		this.universidade = universidade;
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getPrograma() {
		return programa;
	}
	public void setPrograma(String programa) {
		this.programa = programa;
	}
	public String getUniversidade() {
		return universidade;
	}
	public void setUniversidade(String universidade) {
		this.universidade = universidade;
	}

	@Override
	public String toString() {
		return String.format("DissertacaoTese / titulo = %s, programa=%s, universidade=%s, tipo=%s \n", super.getTitulo(), programa, universidade, tipo);
	}


	

	
}
