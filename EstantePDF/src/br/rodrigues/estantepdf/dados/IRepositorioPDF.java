package br.rodrigues.estantepdf.dados;

import br.rodrigues.estantepdf.negocio.beans.Arquivo;

public interface IRepositorioPDF {

	void adicionar(Arquivo a);

	void remover(String titulo);

	Arquivo procurar(String nome);

	void Atualizar(String titulo);

	String toString();

}