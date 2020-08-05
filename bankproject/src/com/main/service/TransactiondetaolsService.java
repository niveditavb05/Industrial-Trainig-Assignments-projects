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
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author home
 */
public class TransactiondetaolsService {
    static java.sql.Date date;
    public static void transaction(int accno,int amount,String type ){
            int balance=0;
    
    
         try {
             // System.out.println("Enter account no");                            //prints the double quoted text on output console screen
             //// int accno2 = s.nextInt(), balance1 = 0;
             // System.out.println("date : " + date);
             // System.out.println("Enter amount");                                //prints the double quoted text on output console screen
             // int amount = s.nextInt();                                            //scan amount entered by user and store it in amount variable
             // System.out.println("Enter transaction type");                      //prints the double quoted text on output console screen
 

 
  

           
             // String trantype = s.next();
             Statement stmt1 = null;
             String sqlbal = "SELECT balance FROM `tbl_transaction` WHERE accountnumber ='" + accno + "' )";
             ResultSet rs = SingoltonConnection.makePreparedStatement(sqlbal).executeQuery();
             
             while (rs.next()) {
                 balance = rs.getInt("balance");
             }
             if (type.equals("deposit")) {
                 balance = balance + amount;
                // stmt1 = connection.createStatement();
                 System.out.println("Inserting records into the table...");
//                String sql2 = "INSERT INTO `tbl_transaction` VALUES('" + accno2 + "','" + date + "','" + trantype + "','" + amount + "','" + balance1 + "')";
String sql2 = "INSERT INTO `tbl_transaction` (`accountnumber`, `transaction_date`, `transaction_type`, "
        + "`ammount`, `balance`) "
        + "VALUES ('" + accno + "', '" + date + "', 'deposit',"
        + " '" + amount + "', '" + balance + "')";

 SingoltonConnection.makePreparedStatement(sql2).execute();
System.out.println("Inserted records into the table...");

             } else if (type.equals("withdrawal")) {
                 if (balance > amount) {
                     balance = balance - amount;
                   //  stmt1 = connection.createStatement();
                     System.out.println("Inserting records into the table...");
                     
                     String sql2 = "INSERT INTO `tbl_transaction` (`accountnumber`, `transaction_date`, `transaction_type`, "
                             + "`ammount`, `balance`) "
                             + "VALUES ('" + accno + "', '" + date + "', 'withdrawal',"
                             + " '" + amount + "', '" + balance + "')";
                      SingoltonConnection.makePreparedStatement(sql2).execute();
                     System.out.println("Inserted records into the table...");
                 } else {
                     System.out.println("Not sufficient balance ... Please Check your balance first");
                 }
             }
         } //handles error for JDBC
         catch (SQLException | ClassNotFoundException ex) {
             Logger.getLogger(TransactiondetaolsService.class.getName()).log(Level.SEVERE, null, ex);
         }

        //}
        ///catch (SQLException se) {
         //  se.printStackTrace();
        //}
}
      // System.out.println("Transaction Successfully done!");
}
