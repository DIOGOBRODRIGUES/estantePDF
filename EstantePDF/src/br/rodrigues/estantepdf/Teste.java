package br.rodrigues.estantepdf;

import java.io.File;

import br.rodrigues.estantepdf.gui.TelaTextual;
import javafx.event.ActionEvent;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;


public class Teste {
	public static void main(String[] args) {
		TelaTextual tt =new TelaTextual();
		tt.testandoCRUD();
//teste do git
	}
	
//	public static void main(String[] args) {
//		
//	}
//	
////	public void InserindoArquivoNaPasta(){
////		FileChooser fileChooser = new FileChooser();
////		 fileChooser.setTitle("Open Resource File");
////		 fileChooser.getExtensionFilters().addAll(
////		         new ExtensionFilter("Text Files", "*.txt"),
////		         new ExtensionFilter("Image Files", "*.png", "*.jpg", "*.gif"),
////		         new ExtensionFilter("Audio Files", "*.wav", "*.mp3", "*.aac"),
////		         new ExtensionFilter("All Files", "*.*"));
////		 File selectedFile = fileChooser.showOpenDialog(mainStage);
////		 if (selectedFile != null) {
////		    mainStage.display(selectedFile);
////	}
	
}
