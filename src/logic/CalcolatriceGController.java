package logic;

import java.util.StringTokenizer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class CalcolatriceGController {

    @FXML
    private Button btnMoltiplicazione;

    @FXML
    private Button btnNove;

    @FXML
    private Label lbResult;

    @FXML
    private Button btnDue;

    @FXML
    private Button btnSottrazione;

    @FXML
    private Button btnSomma;

    @FXML
    private Button btnZero;

    @FXML
    private Button btnSei;

    @FXML
    private Button btnSette;

    @FXML
    private Button btnCinque;

    @FXML
    private Button btnQuattro;

    @FXML
    private Button bntUno;

    @FXML
    private Button btnOtto;

    @FXML
    private Button btnDelete;

    @FXML
    private Button btnDIvisione;

    @FXML
    private Button btnTre;

    @FXML
    private Label lbCalcolo;

    @FXML
    private Button btnUguale;
    
    private String calcolo = "";
    
    @FXML
    void handleUno(ActionEvent event) {
    	deleteResultSet();
    	calcolo = calcolo.concat("1");
    	lbCalcolo.setText(calcolo);
    }

    @FXML
    void handleDue(ActionEvent event) {
    	deleteResultSet();
    	calcolo = calcolo.concat("2");
    	lbCalcolo.setText(calcolo);
    }

    @FXML
    void handleTre(ActionEvent event) {
    	deleteResultSet();
    	calcolo = calcolo.concat("3");
    	lbCalcolo.setText(calcolo);
    }

    @FXML
    void handleSomma(ActionEvent event) {
    	deleteResultSet();
    	calcolo = calcolo.concat(" + ");
    	lbCalcolo.setText(calcolo);
    }

    @FXML
    void handleQuattro(ActionEvent event) {
    	deleteResultSet();
    	calcolo = calcolo.concat("4");
    	lbCalcolo.setText(calcolo);
    }

    @FXML
    void handleCinque(ActionEvent event) {
    	deleteResultSet();
    	calcolo = calcolo.concat("5");
    	lbCalcolo.setText(calcolo);
    }

    @FXML
    void handleSei(ActionEvent event) {
    	deleteResultSet();
    	calcolo = calcolo.concat("6");
    	lbCalcolo.setText(calcolo);
    }

    @FXML
    void handleSottrazione(ActionEvent event) {
    	deleteResultSet();
    	calcolo = calcolo.concat(" - ");
    	lbCalcolo.setText(calcolo);
    }

    @FXML
    void handleSette(ActionEvent event) {
    	deleteResultSet();
    	calcolo = calcolo.concat("7");
    	lbCalcolo.setText(calcolo);
    }

    @FXML
    void handleOtto(ActionEvent event) {
    	deleteResultSet();
    	calcolo = calcolo.concat("8");
    	lbCalcolo.setText(calcolo);
    }

    @FXML
    void handleNove(ActionEvent event) {
    	deleteResultSet();
    	calcolo = calcolo.concat("9");
    	lbCalcolo.setText(calcolo);
    }

    @FXML
    void handleMoltiplicazione(ActionEvent event) {
    	deleteResultSet();
    	calcolo = calcolo.concat(" * ");
    	lbCalcolo.setText(calcolo);
    }

    @FXML
    void handleZero(ActionEvent event) {
    	deleteResultSet();
    	calcolo = calcolo.concat("0");
    	lbCalcolo.setText(calcolo);
    }

    @FXML
    void handleDelete(ActionEvent event) {
    	deleteResultSet();
    	calcolo = lbCalcolo.getText();
    	int lenght = calcolo.length();
    	if(calcolo.charAt(lenght-1) == ' ') {
    		calcolo = calcolo.substring(0, lenght - 4);
    	} else {
    		calcolo = calcolo.substring(0, lenght - 2);
    	}
    	lbCalcolo.setText(calcolo);
    }

    @FXML
    void handleDivisione(ActionEvent event) {
    	deleteResultSet();
    	calcolo = calcolo.concat(" / ");
    	lbCalcolo.setText(calcolo);
    }
    

    @FXML
    void handleUguale(ActionEvent event) {
    	calcolo = lbCalcolo.getText();
    	var st = new StringTokenizer(calcolo, " ");
    	int ris = 0;
    	int num = 0;
    	while(st.hasMoreElements()) {
    		var type = String.valueOf(st.nextElement());
    		switch(type) {
    			case "+":
    				ris += num;
    				break;
    			case "-":
    				ris -= num;
    				break;
    			case "/":
    				ris /= num;
    				break;
    			case "*":
    				ris *= num;
    				break;
    			default:
    				num = Integer.valueOf(type);
    		}
    	}
    	
    	lbResult.setText(String.valueOf(ris));
    }
    
    private void deleteResultSet() {
    	if(lbResult.getText().equals("")) {
    		lbResult.setText("");
    	}
    }
}
