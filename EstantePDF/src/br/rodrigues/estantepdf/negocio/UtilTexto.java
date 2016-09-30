//package br.rodrigues.estantepdf.negocio;
//import java.io.*;
//import org.apache.pdfbox.pdmodel.*;
//import org.apache.pdfbox.text.PDFTextStripper;
//import org.apache.pdfbox.util.*;
//
//
//public class UtilTexto {
//	/**
//	  * Le o conteudo (texto) de um arquivo pdf
//	  *
//	  */
//	public static String extraiTextoDoPDF(String caminho) {
//		
//	PDDocument pdfDocument = null;
//	
//	try {
//	    pdfDocument = PDDocument.load(caminho);
//	    PDFTextStripper stripper = new PDFTextStripper();
//	    String texto = stripper.getText(pdfDocument);
//	    return texto;
//	    
//	} catch (IOException e) {
//	   throw new RuntimeException(e);
//	  } finally {
//	     if (pdfDocument != null) try {
//	    pdfDocument.close();
//	   } catch (IOException e) {
//          throw new RuntimeException(e);
//	      }
//	    }
//	  }
//
//	/**
//	  *
//	  * Extrai o conteudo do arquivo indicado
//	  *
//	  */
//	 public static void main(String[] args) {
//	   String caminho = "/Users/diogo/Downloads/testeDeLeito.pdf";
//	   String texto = extraiTextoDoPDF(caminho);
//	   
//	   System.out.println(texto);
//	  }
//	}
//

