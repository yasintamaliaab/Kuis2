/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuisnew;

import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author User
 */
public class FXMLkeduaController implements Initializable {

    @FXML
    private JFXTextField nama2;
    @FXML
    private JFXTextField totalh2;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  
    
    void proses(String namap, int totalhp){
        nama2.setText(namap);
        totalh2.setText(""+totalhp);
    }
    
}
