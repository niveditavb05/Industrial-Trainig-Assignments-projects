/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.main.service;
import com.main.controller.SingoltonConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//import java.util.Calendar;
import  java.util.logging.Level;
import  java.util.logging.Logger;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author home
 */
public class DeleteAccountService {
    static java.sql.Date date;
    public static void deleteacc(int accno){
     try {
            Statement stmt4 = null;
            //stmt4 = connection.createStatement();
         

            String sqlacc = "SELECT name FROM `tbl_account` WHERE accountnumber ='" + accno + "'";
            ResultSet rs = SingoltonConnection.makePreparedStatement(sqlacc).executeQuery();
            String name = null;
            while (rs.next()) {
                name = rs.getString("name");
            }

            String sql4 = "DELETE FROM `tbl_transaction` WHERE accountnumber='" + accno + "'";
            //execute query
            stmt4.executeUpdate(sql4);
            String sql5 = "DELETE FROM `tbl_account` WHERE accountnumber='" + accno + "'";
            //execute query
            stmt4.executeUpdate(sql5);
            String filename = name + ".txt";
            System.out.println("filename " + filename);
            File f = new File(filename);           //file to be delete  
            if (f.delete()) //returns Boolean value  
            {
                System.out.println(f.getName() + " deleted");   //getting and printing the file name  
            } else {
                System.out.println("failed");
            }
            System.out.println("Account is being deleted ...!");

        } //handles jdbc errors
     catch (SQLException | ClassNotFoundException ex) {
             Logger.getLogger(TransactiondetaolsService.class.getName()).log(Level.SEVERE, null, ex);
         }
        //catch (SQLException se) {
          //  se.printStackTrace();
        //}

    }
}
