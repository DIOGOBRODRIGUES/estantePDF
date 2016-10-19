package br.rodrigues.estantepdf.negocio;

import java.io.File;

import br.rodrigues.estantepdf.dados.IRepositorioPDF;
import br.rodrigues.estantepdf.dados.RepositorioPDF;
import br.rodrigues.estantepdf.negocio.beans.Arquivo;
import br.rodrigues.estantepdf.negocio.beans.Artigo;

public class GerenciadorPDF implements IGerenciadorPDF {
	
	private IRepositorioPDF repoPdf;
	
	private static IGerenciadorPDF instance;
	
	private GerenciadorPDF (){
		
		this.repoPdf = RepositorioPDF.getInstance();
	}
	
	public static IGerenciadorPDF getInstance(){
		if(instance==null)
			instance= new GerenciadorPDF();
		return instance;
	}
	
	/* (non-Javadoc)
	 * @see br.rodrigues.estantepdf.negocio.IGerenciadorPDF#armzenarPDF(br.rodrigues.estantepdf.negocio.beans.Arquivo)
	 */
	@Override
	public void armzenarPDF(Arquivo arquivo){
		criarDiretorio();
		repoPdf.adicionar(arquivo);		
	}
	
	/* (non-Javadoc)
	 * @see br.rodrigues.estantepdf.negocio.IGerenciadorPDF#removerPDF(java.lang.String)
	 */
	@Override
	public void removerPDF(String titulo){
		repoPdf.remover(titulo);
	}
	
	/* (non-Javadoc)
	 * @see br.rodrigues.estantepdf.negocio.IGerenciadorPDF#procurarPDFTitulo(java.lang.String)
	 */
	@Override
	public Arquivo procurarPDFTitulo(String titulo){
		return repoPdf.procurar(titulo);
	}
	
	/* (non-Javadoc)
	 * @see br.rodrigues.estantepdf.negocio.IGerenciadorPDF#atualizarPDF(java.lang.String)
	 */
	@Override
	public void atualizarPDF (String titulo){
		repoPdf.Atualizar(titulo);
	}

	//Método que criara pasta onde armazenara os arquivos 
	/* (non-Javadoc)
	 * @see br.rodrigues.estantepdf.negocio.IGerenciadorPDF#criarDiretorio()
	 */
	@Override
	public void criarDiretorio() {
		

        try {
            File diretorio = new File("C:\\Users\\diogo\\Documents\\EstantePDF");
            diretorio.mkdir();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
	
	/* (non-Javadoc)
	 * @see br.rodrigues.estantepdf.negocio.IGerenciadorPDF#toString()
	 */
	@Override
	public String toString() {
		return String.format("%s", repoPdf);
	}

	
}
