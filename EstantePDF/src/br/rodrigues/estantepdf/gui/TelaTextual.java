package br.rodrigues.estantepdf.gui;

import br.rodrigues.estantepdf.negocio.GerenciadorPDF;
import br.rodrigues.estantepdf.negocio.beans.DissertacaoTese;

public class TelaTextual {
	
	public void testandoCRUD(){
		
		GerenciadorPDF gerenciador = GerenciadorPDF.getInstance();
		
		gerenciador.armzenarPDF(new DissertacaoTese("Desenvolvimento de uma aplicação WebMapping", 2011, "p.125", null, "engenharia civil e ambiental","UFCG", "dissetação"));
		gerenciador.armzenarPDF(new DissertacaoTese("Software design for wireless sensor", 2009, "p.159", null, null,null, "dissetação"));
		
		System.out.println(gerenciador.toString());
		
		
		
	}

}
