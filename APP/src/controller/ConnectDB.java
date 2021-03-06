/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class ConnectDB {

    static String JDBC_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    static String DB_URL = "jdbc:sqlserver://PC-PC\\SQLEXPRESS:1433;";
    static String DATABASENAME = "databaseName=permission;";
    static String USER = "user=sa;";
    static String PASS = "password=123";

    static public Connection connectSQLServer() throws ClassNotFoundException, SQLException {
        Class.forName(JDBC_DRIVER);
        Connection connection = DriverManager.getConnection(DB_URL + DATABASENAME + USER + PASS);
        return connection;
    }

    public static Connection getConnectTable() throws SQLException {
        Connection conn = null;
        Statement stmt = null;

        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL + DATABASENAME + USER + PASS);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);
        }

        return conn;
    }
}
