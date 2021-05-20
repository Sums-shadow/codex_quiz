/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.jfoenix.controls.JFXButton;
import database.Setting;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class ResultController implements Initializable {
    @FXML
    private Label lblcat;
    @FXML
    private Label lblR;
    @FXML
    private Label lblE;
    @FXML
    private JFXButton btnRetry;
    @FXML
    private ImageView iretry;
    @FXML
    private JFXButton btnHome;
    @FXML
    private ImageView ihome;
    @FXML
    private JFXButton btnExit;
    @FXML
    private ImageView iexit;
Setting s=new Setting();
    @FXML
    private ImageView imgRes;
    int id;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        iexit.setImage(new Image("/images/exit.png"));
        ihome.setImage(new Image("/images/home.png"));
        iretry.setImage(new Image("/images/retry.png"));
        
        
    }    

    @FXML
    private void onRetry(ActionEvent event) {
        try {
             
             FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/view/question.fxml"));
        AnchorPane catcont = loader.load();
        
      
        //access the controller and call a method
     QuestionController result = loader.getController();
       result.init(id);
        
        //This line gets the Stage information
       Stage s=new Stage();
            s.setScene(new Scene(catcont));
            s.show();
             Stage stage = (Stage) iexit.getScene().getWindow();
                        stage.close();
           } catch (Exception e) {
               System.out.println("error "+e);
           }
    }

    @FXML
    private void onHome(ActionEvent event) {
        s.gotoScene("home", ihome);
    }

    @FXML
    private void onExit(ActionEvent event) {
        Stage stage = (Stage) ihome.getScene().getWindow();
                        stage.close();
    }
    
    void getData(String cat, String r, String e,int id){
        System.err.println("ID "+id);
       this.id=id;
        lblE.setText(lblE.getText()+e);
        lblR.setText(lblR.getText()+r);
        lblcat.setText(lblcat.getText()+cat);
        if(Integer.parseInt(r)>Integer.parseInt(e)){
            imgRes.setImage(new Image("/images/ok.jpg"));
        }else{
                       imgRes.setImage(new Image("/images/fail.jpg"));
 
        }
    }
    
}
