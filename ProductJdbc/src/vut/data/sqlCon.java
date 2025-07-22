/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut.data;

import java.sql.*;

/**
 *
 * @author Nthabi
 */
public class sqlCon {

    public static void main(String[] args) {
        try {
         Class.forName("com.mysql.jdbc.Driver");
            Connection myConn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
            Statement stat=myConn.createStatement();
            ResultSet rs= stat.executeQuery("select * from student");
            while(rs.next())
                System.out.println(rs.getInt("")+ " "+rs.getString("Student Name")+ " " +rs.getInt("age"));
            
        } catch (Exception e) {
        }
 
    }
    
}
