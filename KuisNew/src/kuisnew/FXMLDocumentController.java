/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuisnew;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private JFXTextField nama;
    @FXML
    private JFXTextField daging1;
    @FXML
    private JFXTextField selada1;
    @FXML
    private JFXTextField tomat1;
    @FXML
    private JFXTextField keju1;
    @FXML
    private JFXButton bttnorder;
    @FXML
    private JFXButton bttntotal1;
    @FXML
    private TextArea total1;

    int hdaging,htomat,hselada,hkeju,totalh;
    String namakirim;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void order(ActionEvent event) {
        datakirim();
        try {
            // Hide this current window (if this is what you want)
            ((Node)(event.getSource())).getScene().getWindow().hide();
            
            // Load the new fxml
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("FXMLkedua.fxml"));
            Scene scene = new Scene((Parent) fxmlLoader.load());
            
            FXMLkeduaController data = new FXMLkeduaController();
            data = fxmlLoader.getController();
            
            data.proses(namakirim, totalh);
            
            // Create new stage (window), then set the new Scene
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Burger Tuan Crabs");
            stage.show();
            
        } catch (IOException e) {
            System.out.println("Failed to create new Window." + e);
        }
    }
    
    void datakirim(){
        namakirim = nama.getText();
        hdaging = Integer.parseInt(daging1.getText()) * 4000;
        hselada = Integer.parseInt(selada1.getText()) * 1000;
        htomat = Integer.parseInt(tomat1.getText()) * 1000;
        hkeju = Integer.parseInt(keju1.getText()) * 3000;
        totalh = hdaging + hselada + htomat + hkeju;
        
        
    }

    @FXML
    private void total(ActionEvent event) {
        int ttl=0;
        int dgng = Integer.parseInt(daging1.getText());
       int tmt = Integer.parseInt(tomat1.getText());
       int sld = Integer.parseInt(selada1.getText());
       int kj = Integer.parseInt(keju1.getText());
       ttl = dgng + tmt + sld +kj;
       total1.setText(""+ttl);
    }
    
}
