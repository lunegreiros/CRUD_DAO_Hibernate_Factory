/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author aluno
 */
public class DBConnection {

    private static DBConnection instance = null;
    private Connection connection;
    private Statement statement;

    private DBConnection() {
        try {
            Class.forName(java.util.ResourceBundle.getBundle("crud/CRUD").getString("jdbc.driver")).newInstance();
            connection = DriverManager.getConnection(
                    java.util.ResourceBundle.getBundle("crud/CRUD").getString("jdbc.url"),
                    java.util.ResourceBundle.getBundle("crud/CRUD").getString("jdbc.user"),
                    java.util.ResourceBundle.getBundle("crud/CRUD").getString("jdbc.password"));
            statement = connection.createStatement();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public Statement getStatement() {
        return statement;
    }
    
    public static DBConnection getInstance() {
        if (instance == null) {
            instance = new DBConnection();
        }
        return instance;
    }

    @Override
    protected void finalize() throws Throwable {
        statement.close();
        connection.close();
    }

}
