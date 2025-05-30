package vut.data;

import javax.xml.bind.DataBindingException;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.lang.Throwable;

/**
 *
 *
 */
public class AdelaneFashionsDA {
    private static Connection con;
    private static PreparedStatement ps;
    private static ResultSet rs;



    public static void initConnection() throws DataStorageException {
        final String USERNAME = "root";
        final String PASSWORD = "";
        final String URL = "jdbc:mysql://localhost/";
        final String DRIVER = "com.mysql.jdbc.Driver";
        try{
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL,USERNAME,PASSWORD);
        } catch (ClassNotFoundException e ){
            throw new DataStorageException("base driver is missing\n" + e.getMessage());

        } catch (SQLException e){
            throw new DataStorageException("database connection failed\n" + e.getMessage());
        }
}
