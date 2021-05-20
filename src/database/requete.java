/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class requete {
      public requete() {
        connection.getInstance();
//            pd=new propertiesData();

    }
      
      
      
      
//       public void saveAgent(int id) {
//        ResultSet rs = null;
//        try {
//            Statement st;
//            String sql = "SELECT * FROM `t_identifica_agent` WHERE `pk_agent`=" + id + ";";
//            st = connection.getInstance().createStatement();
//
//            rs = st.executeQuery(sql);
//            if (rs.next()) {
////               pd.agentPropertie(rs.getString("nom"), rs.getString("email"), rs.getString("telephone"));
//            }
//
//        } catch (SQLException ex) {
//            Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//    }
      
      
      
      
        public boolean saveQuestion(String question, String reponse, String categorie) {
        try {
            String requete = "INSERT INTO `t_question_reponse`( `question`, `reponse`, `categorie`) VALUES (?,?,?)";
            PreparedStatement preparedStmt = connection.getInstance().prepareStatement(requete);
            preparedStmt.setString(1, question.toLowerCase());
            preparedStmt.setString(2,reponse.toLowerCase());
             preparedStmt.setInt(3,getIdCategorie(categorie));
            preparedStmt.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }
      
      
      
      
        public ResultSet getAllCategorie() {
        ResultSet rs = null;
        try {
            Statement st;
            String sql = "SELECT * FROM `t_categorie`";
            st = connection.getInstance().createStatement();

            rs = st.executeQuery(sql);
            return rs;

        } catch (SQLException ex) {
            Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }
        
        
        
        
           public ResultSet getQuestions(int id) {
        ResultSet rs = null;
    
        try {
            Statement st;
            String sql = "SELECT * FROM `t_question_reponse` WHERE `categorie`="+id;
            st = connection.getInstance().createStatement();

            rs = st.executeQuery(sql);
            return rs;

        } catch (SQLException ex) {
            Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }
           
           
           
           
           
        
         public int getIdCategorie(String nom) {
        ResultSet rs = null;
        try {
            Statement st;
            String sql = "SELECT * FROM `t_categorie` where nom='"+nom+"'";
            st = connection.getInstance().createStatement();

            rs = st.executeQuery(sql);
          if(rs.next()){
              return rs.getInt("id");
          }

        } catch (SQLException ex) {
            Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;

        
    }
         
         
         public String getNomCategorie(int id) {
        ResultSet rs = null;
        try {
            Statement st;
            String sql = "SELECT * FROM `t_categorie` where id="+id;
            st = connection.getInstance().createStatement();

            rs = st.executeQuery(sql);
          if(rs.next()){
              return rs.getString("nom");
          }

        } catch (SQLException ex) {
            Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";

    }
         
         
         
         
          public String getReponsee(String quest) {
        ResultSet rs = null;
        try {
           
            String sql = "SELECT `reponse` FROM `t_question_reponse` WHERE `question`=?";
              
            PreparedStatement preparedStmt = connection.getInstance().prepareStatement(sql);
            preparedStmt.setString(1, quest.toLowerCase());
            rs= preparedStmt.executeQuery();
            if(rs.next()){
                return rs.getString("reponse");
            }
            
          if(rs.next()){
              return rs.getString("reponse");
          }

        } catch (SQLException ex) {
            Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";

    }
}
