package br.rodrigues.estantepdf.gui;

import javax.swing.plaf.synth.SynthSeparatorUI;

import br.rodrigues.estantepdf.negocio.GerenciadorPDF;
import br.rodrigues.estantepdf.negocio.IGerenciadorPDF;
import br.rodrigues.estantepdf.negocio.beans.Arquivo;
import br.rodrigues.estantepdf.negocio.beans.Artigo;
import br.rodrigues.estantepdf.negocio.beans.Autor;
import br.rodrigues.estantepdf.negocio.beans.DissertacaoTese;
import br.rodrigues.estantepdf.negocio.beans.Livro;

public class TelaTextual {
	
	public void testandoCRUD(){
		
		IGerenciadorPDF gerenciador = (IGerenciadorPDF) GerenciadorPDF.getInstance();
		
		//teste armazenamento de dados do arquivo
		gerenciador.armzenarPDF(new DissertacaoTese("Desenvolvimento de uma aplicação WebMapping", 2011, "p.125", null, "engenharia civil e ambiental","UFCG", "dissetação"));
		gerenciador.armzenarPDF(new DissertacaoTese("Software design for wireless sensor", 2009, "p.159", null, null,null, "dissertação"));
				
		Autor autorUnico[]= new Autor[1];
		autorUnico[0]=new Autor("Diogo Rodrigues", "UFRPE");
		Arquivo dissertacao1 = new DissertacaoTese("Irrigação", 2013, "p.190", autorUnico, "DEAGRI", "UFRPE", "Tese");
		gerenciador.armzenarPDF(dissertacao1);
				
		Autor autoresDeArtig []= new Autor[3];
		autoresDeArtig[0]= new Autor("Hargreaves", "NASA");
		autoresDeArtig[1]= new Autor ("Thorntwaite", "FCAP");
		autoresDeArtig[2] = new Autor ("Penman", "Monte");
		Arquivo artigo1 = new Artigo("Evapotranspiration", 1970, "10", autoresDeArtig, "Earth", "10-10-1970", "12321029", null, 2, 3);
		gerenciador.armzenarPDF(artigo1);
		
		Autor autorLivro[] = new Autor[1];
		autorLivro[0]=new Autor("Santos", "UFPE");
		gerenciador.armzenarPDF(new Livro("Introdução ao R", 2007, "180", autorLivro,"Jovem", 2, "Recife"));
		
		System.out.println(gerenciador.toString());
		
		//teste de busca
		System.out.println(gerenciador.procurarPDFTitulo("Evapotranspiration"));
		
		//teste remoção 
		gerenciador.removerPDF("Irrigação");
		System.out.println(gerenciador.toString());
		
		//testanto atualizar
		gerenciador.atualizarPDF("qualquer");
		
		
	}

}
