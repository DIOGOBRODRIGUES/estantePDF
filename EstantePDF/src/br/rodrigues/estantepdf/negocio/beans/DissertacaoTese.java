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

	
	public String toString() {
		return String.format(
				"Dissertação ou Tese: autor %s. titulo %s, programa %s, universidade %s, pagina %s, ano %s\n",
				   Arrays.toString(getAutor()), getTitulo(), getPrograma(), getUniversidade(), getPagina(), getAno() );
	}
		
}
