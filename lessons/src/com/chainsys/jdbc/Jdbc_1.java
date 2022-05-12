package com.chainsys.jdbc;

    import java.sql.*;

    public class Jdbc_1 {
       public static void main(String[] args) {
        try {
               Connection mycon  = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","harithacsys017"); 
               Statement mystat = mycon.createStatement();
               ResultSet myRs  = mystat.executeQuery("select * from help");
               while(myRs.next()) {
                   System.out.println(myRs.getString("topic") + ", " +myRs.getString("seq"));
               }
               mycon.close();
           }catch(Exception err) {
               err.printStackTrace();
           }
    }
    }


