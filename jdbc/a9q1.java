import java.sql.*;
import java.util.*;
import java.io.*;
import java.lang.*;
public class a9q1 {
 

   
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
    static final String DB_URL = "jdbc:mysql://localhost:3306/db_filedata";

  
    static final String USER = "root";
    static final String PASS = "";
   
   public static void main(String[] args) {

   Connection conn = null;
   Statement stmt = null;
   try{
     
      Class.forName("com.mysql.jdbc.Driver");

  
      System.out.println("Connecting to database...");
      conn = DriverManager.getConnection(DB_URL,USER,PASS);

    
      System.out.println("Creating statement...");
      stmt = conn.createStatement();
      String sql;
File file = new File("read.txt"); 
    BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
    String line;
 while((line = br.readLine())!= null)
{
 String [] tokens = line.split("\\s+");
        String var_1 = tokens[0];
        String var_2 = tokens[1];
        String var_3 = tokens[2];
        String var_4=tokens[3];
int roll,marks,per; 
     
 roll=Integer.parseInt(var_2);
 marks=Integer.parseInt(var_3);
 per=Integer.parseInt(var_4);
System.out.println(var_1);
System.out.println(roll);
System.out.println(marks);
System.out.println(per);

sql = "INSERT INTO `tbl_data` (`id`, `name`, `rollnumber`, `marks`,`per`) VALUES (NULL, '"+var_1 +"','"+roll+"', '"+marks+"','"+per+"')";
      stmt.executeUpdate(sql);
      
  
    }
  System.out.println("Data inserted"); 
stmt.close();
      conn.close();
   }
catch(SQLException se){

      se.printStackTrace();
   }catch(Exception e){
    
      e.printStackTrace();
   }

finally{

      try{
         if(stmt!=null)
            stmt.close();
      }catch(SQLException se2){
      }
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se)
{
         se.printStackTrace();
      }
   }
   System.out.println("Goodbye!");
}
}