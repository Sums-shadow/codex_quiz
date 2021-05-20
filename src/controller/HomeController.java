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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class HomeController implements Initializable {
    @FXML
    private ImageView ibg1;
    @FXML
    private ImageView ibg2;
    @FXML
    private ImageView ibg3;
    @FXML
    private ImageView ibg4;
    @FXML
    private JFXButton btnAddQuestion;
Setting s=new Setting();
    @FXML
    private ImageView ibg41;
    @FXML
    private ImageView ibg21;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       ibg1.setImage(new Image("/images/bg1.jpg"));
        ibg2.setImage(new Image("/images/bg2.jpg"));
         ibg3.setImage(new Image("/images/bg3.jpg"));
          ibg4.setImage(new Image("/images/bg4.jpg"));
    }    

    @FXML
    private void onInventeur(MouseEvent event) {
        System.out.println("on inventeur clicked");
        s.gotoScene("invention", ibg1);
        try {
             
             FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/view/question.fxml"));
        AnchorPane catcont = loader.load();
        
      
        //access the controller and call a method
     QuestionController result = loader.getController();
       result.init(1);
        
        //This line gets the Stage information
       Stage s=new Stage();
            s.setScene(new Scene(catcont));
            s.show();
            Stage stage = (Stage) ibg1.getScene().getWindow();
                        stage.close();
           } catch (Exception e) {
               System.out.println("error "+e);
           }
    }

    @FXML
    private void onPrixTuring(MouseEvent event) {
          try {
             
             FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/view/question.fxml"));
        AnchorPane catcont = loader.load();
        
      
        //access the controller and call a method
     QuestionController result = loader.getController();
       result.init(2);
        
        //This line gets the Stage information
       Stage s=new Stage();
            s.setScene(new Scene(catcont));
            s.show();
             Stage stage = (Stage) ibg1.getScene().getWindow();
                        stage.close();
           } catch (Exception e) {
               System.out.println("error "+e);
           }
    }

    @FXML
    private void onEntreprise(MouseEvent event) {
          try {
             
             FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/view/question.fxml"));
        AnchorPane catcont = loader.load();
        
      
        //access the controller and call a method
     QuestionController result = loader.getController();
       result.init(3);
        
        //This line gets the Stage information
       Stage s=new Stage();
            s.setScene(new Scene(catcont));
            s.show();
             Stage stage = (Stage) ibg1.getScene().getWindow();
                        stage.close();
           } catch (Exception e) {
               System.out.println("error "+e);
           }
    }

    @FXML
    private void onCulture(MouseEvent event) {
          try {
             
             FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/view/question.fxml"));
        AnchorPane catcont = loader.load();
        
      
        //access the controller and call a method
     QuestionController result = loader.getController();
       result.init(4);
        
        //This line gets the Stage information
       Stage s=new Stage();
            s.setScene(new Scene(catcont));
            s.show();
             Stage stage = (Stage) ibg1.getScene().getWindow();
                        stage.close();
           } catch (Exception e) {
               System.out.println("error "+e);
           }
    }

    @FXML
    private void onAddQuestion(ActionEvent event) {
       s.goto2("newquestion");
    }

    @FXML
    private void onGeneration(MouseEvent event) {
         try {
             
             FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/view/question.fxml"));
        AnchorPane catcont = loader.load();
        
      
        //access the controller and call a method
     QuestionController result = loader.getController();
       result.init(5);
        
        //This line gets the Stage information
       Stage s=new Stage();
            s.setScene(new Scene(catcont));
            s.show();
             Stage stage = (Stage) ibg1.getScene().getWindow();
                        stage.close();
           } catch (Exception e) {
               System.out.println("error "+e);
           }
    }
    
}
