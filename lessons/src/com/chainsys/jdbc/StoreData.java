package com.chainsys.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class StoreData {

	public static void main(String[] args) {
		
		 try {
	          Class.forName("oracle.jdbc.driver.OracleDriver");
	          Connection myCon = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","harithacsys017");
	          PreparedStatement s = myCon.prepareStatement("insert into FileTable values(?,?)");
	          s.setInt(1, 1555501);
	          s.setInt(1, 7678);
	        //  ps.setCharacterStream(2, fr,(int)f.length());
	          s.setString(2, "kytmar");
	          int i = s.executeUpdate();
	          System.out.println(i + " " + "record affected");
	          myCon.close();
	      }catch(Exception err) {
	          err.printStackTrace();
	      }

	}

}
