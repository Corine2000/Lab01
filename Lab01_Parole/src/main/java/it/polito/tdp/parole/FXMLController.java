package it.polito.tdp.parole;

import it.polito.tdp.parole.model.Parole;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	Parole elenco ;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtParola;

    @FXML
    private Button btnInserisci;

    @FXML
    private TextArea txtResult;

    @FXML
    private Button btnReset;

    @FXML
    void doInsert(ActionEvent event) { //dopo aver premuto il buttone inserisce cosa faccio ?
    	
    	elenco.addParola(txtParola.getText()); //aggiungo la parola inserita dall'utente
    	
    //	System.out.println(elenco.getElenco());
    		
    //	txtResult.appendText(elenco.getElenco()); // come faccio a stampare una lista nell'aria dei risultati?
    	
    	
    //	String lista = elenco.toString();
    //	txtResult.setText(lista);
    	
    	String list = "";
    	for(String p: elenco.getElenco()) {
    		list+= p+"\n";
    	}
    	txtResult.setText(list);
    	
    }

    @FXML
    void doReset(ActionEvent event) {
    	elenco.reset();
    	txtResult.setText(elenco.toString());
    }

    @FXML
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";

        elenco = new Parole() ;
    }
}
