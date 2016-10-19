package br.rodrigues.estantepdf.negocio;

import br.rodrigues.estantepdf.negocio.beans.Arquivo;

public interface IGerenciadorPDF {

	void armzenarPDF(Arquivo arquivo);

	void removerPDF(String titulo);

	Arquivo procurarPDFTitulo(String titulo);

	void atualizarPDF(String titulo);

	//Método que criara pasta onde armazenara os arquivos 
	void criarDiretorio();

	String toString();

}