/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author User
 */
public class Setting {
    
    
    
       public void gotoScene(String path, Node node){
         try {
                AnchorPane loader = FXMLLoader.load(getClass().getResource("/view/"+path+".fxml"));
             
            Scene scene=new Scene(loader);
            Stage s=new Stage();
            s.setScene(scene);
            s.show();
           Stage stage = (Stage) node.getScene().getWindow();
                        stage.close();
           } catch (Exception e) {
               System.out.println("error scene"+e);
           }
    }
       
        public void goto2(String path){
         try {
                AnchorPane loader = FXMLLoader.load(getClass().getResource("/view/"+path+".fxml"));
             
            Scene scene=new Scene(loader);
            Stage s=new Stage();
            s.setScene(scene);
            s.show();
          
           } catch (Exception e) {
               System.out.println("error "+e);
           }
    }
}
