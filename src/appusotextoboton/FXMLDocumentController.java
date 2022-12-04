/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package appusotextoboton;

import componentes_zambranaivan.CustomControl;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author Ivan
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private CustomControl control1;
    @FXML
    private CustomControl control2;
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
         control1.setOnAction((ActionEvent event) -> {
            label.setText("Se ha grabado: " + control1.getText());
        });
         control2.setOnAction((ActionEvent event) -> {
            label.setText("Se ha grabado: " + control2.getText());
            //Hacer algo cuando se capture el evento
        });


    }    

    
}
