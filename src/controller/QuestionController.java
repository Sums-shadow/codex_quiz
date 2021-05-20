/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import database.Setting;
import database.requete;
import java.net.URL;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
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
public class QuestionController implements Initializable {
    @FXML
    private ImageView iclose;
    @FXML
    private Label lblTime;
    @FXML
    private Label lblNum;
    @FXML
    private Label lblQuestion;
    @FXML
    private JFXTextField treponse;
    @FXML
    private JFXButton btnNext;
    @FXML
    private Label lblechec;
    @FXML
    private Label lblreussi;

    
    
     ResultSet rs;
    Setting s = new Setting();
    requete req = new requete();
    int index = 0;
    List<String> questions = new ArrayList<>();
    HashMap<String, String> quest = new HashMap<String, String>();
       int id,r,e,tot=10;
    @FXML
    private JFXButton btnRep;
    @FXML
    private Label lblrep;
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        iclose.setImage(new Image("/images/close.png"));
        
      
    }    

   
    void init(int id) {
        rs = req.getQuestions(id);
        this.id=id;
        try {
            while (rs.next()) {
                questions.add(rs.getString("question"));
            }
            Collections.shuffle(questions);
            
        } catch (Exception e) {
            System.err.println("error on get questions " + e);
        }
        
         refreshQuestion();
        
    }
    
    void refreshQuestion(){
        lblQuestion.setText(questions.get(index));
        lblNum.setText(""+(index+1));
        lblTime.setText(""+(index+1)+"/"+""+(tot));
        lblrep.setText("");
    }

    @FXML
    private void onExit(MouseEvent event) {
        s.gotoScene("home", iclose);
    }

    @FXML
    private void onNext(ActionEvent event) {
       String re=req.getReponsee(lblQuestion.getText());
        System.out.println("Question "+re);
       // System.out.println("reponse "+reponses.get(index)+" SAISIE "+treponse.getText());
        if(re.toLowerCase().equals(treponse.getText().toLowerCase())){
            System.out.println("Reussi");
            r++;
            lblreussi.setText(""+r);
            
        }else{
            System.err.println("Echec!");
             e++;
            lblechec.setText(""+e);
        } 
        treponse.setText("");
        index++;
        if(index<10){
           
                    refreshQuestion();
                    

        }else{
            System.out.println("Complete");
          try {
             
             FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/view/result.fxml"));
        AnchorPane catcont = loader.load();
        
      
        //access the controller and call a method
        ResultController result = loader.getController();
        result.getData("Invention",""+r,""+e,id);
        
        //This line gets the Stage information
       Stage s=new Stage();
            s.setScene(new Scene(catcont));
            s.show();
            Stage stage = (Stage) lblNum.getScene().getWindow();
                        stage.close();
           } catch (Exception e) {
               System.out.println("error "+e);
           }
        }
    }

    @FXML
    private void onRep(ActionEvent event) {
         String re=req.getReponsee(lblQuestion.getText());
         lblrep.setText(re);
    }

    
}
