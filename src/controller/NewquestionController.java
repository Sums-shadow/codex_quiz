/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextArea;
import database.requete;
import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class NewquestionController implements Initializable {

    @FXML
    private JFXTextArea tquestion;
    @FXML
    private JFXTextArea treponse;
    @FXML
    private JFXButton btnsave;
    @FXML
    private JFXComboBox<String> cmbcat;

    requete req = new requete();
    ResultSet rs;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        init();
    }

    void init() {
        try {
            rs = req.getAllCategorie();
            while (rs.next()) {
                cmbcat.getItems().add(rs.getString("nom"));
            }
        } catch (Exception e) {
            System.err.println("erreur get categorie " + e);
        }
    }

    @FXML
    private void onSave(ActionEvent event) {
        try {
            if (tquestion.getText().equals("") || treponse.getText().equals("")) {

            } else {
                boolean res = req.saveQuestion(tquestion.getText(), treponse.getText(), cmbcat.getValue().toString().toLowerCase());
                if (res) {
                    Stage stage = new Stage();
                    stage = (Stage) btnsave.getScene().getWindow();
                    stage.close();
                } else {
                    Alert alert = new Alert(AlertType.ERROR);
                    alert.setTitle("CODEX");
                    alert.setHeaderText("ERREUR");
                    alert.setContentText("Oops!! une erreur s'est produite veuillez réessayer!");

                    alert.showAndWait();
                }

            }
        } catch (Exception e) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("CODEX");
            alert.setHeaderText("ERREUR");
            alert.setContentText("Oops!! une erreur s'est produite veuillez réessayer!");

            alert.showAndWait();
        }
    }

}
