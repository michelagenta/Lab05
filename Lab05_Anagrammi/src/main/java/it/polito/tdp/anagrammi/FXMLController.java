package it.polito.tdp.anagrammi;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.Set;

import it.polito.tdp.model.AnagrammiModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	AnagrammiModel model;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtParola;

    @FXML
    private Button btmCalcola;

    @FXML
    private TextArea txtCorretti;

    @FXML
    private TextArea txtErrati;

    @FXML
    private Button btmReset;

    @FXML
    void doCalcola(ActionEvent event) {
    	String parola;
    	txtCorretti.clear();
    	txtErrati.clear();
    	
    	parola=txtParola.getText();
    	if(parola.length()<2) {
    		txtCorretti.appendText("troppo corta");
    		return; 
    	}
    	if(parola.length()>8) {
    		txtCorretti.appendText("troppo lunga");
    		return; 
    	}
    	Set<String> anagrammi = this.model.calcolaAnagrammi(parola);
    	
    	for(String anagramma: anagrammi ) {
    		if(this.model.isCorrect(anagramma)) {
    			txtCorretti.appendText(anagramma+"\n");
    		} else {
    			txtErrati.appendText(anagramma+"\n");
    		}
    	}
    }

    @FXML
    void doReset(ActionEvent event) {
    	
    	txtCorretti.clear();
    	txtErrati.clear();
    	txtParola.clear();

    }

    @FXML
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btmCalcola != null : "fx:id=\"btmCalcola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtCorretti != null : "fx:id=\"txtCorretti\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtErrati != null : "fx:id=\"txtErrati\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btmReset != null : "fx:id=\"btmReset\" was not injected: check your FXML file 'Scene.fxml'.";

    }
}
