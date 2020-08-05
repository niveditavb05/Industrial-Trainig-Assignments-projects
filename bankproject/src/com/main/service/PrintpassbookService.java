/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.main.service;
import com.main.controller.SingoltonConnection;
import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.Calendar;
//import java.util.logging.Level;
//import java.util.logging.Logger;
import java.io.*;
/**
 *
 * @author home
 */
public class PrintpassbookService {
    
    public static void print(int accno){
   try {
            
            String sql5 = "select a.accountnumber,a.name,a.age,a.address,t.transaction_date,"
                    + "t.transaction_type,t.ammount,t.balance from tbl_account a, "
                    + "tbl_transaction t where a.accountnumber=t.accountnumber and t.accountnumber='"+accno+"'";
            System.out.println("sql5 : " + sql5);
            try {
                String name = "";
                PrintWriter outputfile = null;

                StringBuffer sbf1 = new StringBuffer();
                sbf1.append("\n*******************\n"
                        + "Date \t\t" + "Amount\t"
                        + "\tTransactionType \t" + "Balance\n");
                ResultSet rs = SingoltonConnection.makePreparedStatement(sql5).executeQuery();//here resultset is used fetch data from database
                while (rs.next()) {

                    //create StringBuffer object
                    StringBuffer sbf = new StringBuffer();
                    name = rs.getString("a.name");
                    sbf.append("\nName:" + rs.getString("a.name"));
                    sbf.append("\nAccount: " + rs.getInt("a.accno"));
                    sbf.append("\nAddress: " + rs.getString("a.address"));
                    sbf.append("\nBalance: " + rs.getInt("t.balance1"));
                    sbf.append("\nTransaction:");
                    System.out.println("print data : " + sbf);
                    sbf1.append("\n" + rs.getString("t.date1"));
                    sbf1.append("\t" + rs.getString("t.amount"));
                    sbf1.append("\t\t" + rs.getString("t.trantype"));
                    sbf1.append("\t\t\t" + rs.getInt("t.balance1"));

                    System.out.println("print data : " + sbf);
                    String filename = name + ".txt";
                    outputfile = new PrintWriter(filename);

                    outputfile.append(sbf.toString());

                    System.out.println("Successfully wrote to the file.");
                }

                outputfile.append(sbf1.toString());
                outputfile.close();
                
   
            }//handles file operation errors
            catch (Exception e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        } catch (Exception e) {
        }   
    }
}

