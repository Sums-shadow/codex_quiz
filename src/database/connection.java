/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author User
 */
public class connection {
       private String url = "jdbc:mysql://localhost:3306/db_codex";
  private String user = "root";
  private String passwd = "";
  private static Connection connect;

    private connection() {
 try {
      connect = DriverManager.getConnection(url, user, passwd);
    } catch (SQLException e) {
      e.printStackTrace();
    }
    }
 public static Connection getInstance(){
    if(connect == null){
      new connection();// appel du constructeur seulement une fois lorsque l'objet connect est null sinon on retourne l'objet déja crée
    }
    return connect;   
  }  
}
