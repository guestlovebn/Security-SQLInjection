/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j.demo.sqlInjection.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author FIA
 */
public class DBConnector {

    private static final String user = "root";
    private static final String pass = "0412";
    private static final String url = "jdbc:derby://localhost:1527/DemoSql";
    private Connection connection = null;

    public Connection getConnection() throws ClassNotFoundException, SQLException {

        if (connection == null) {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            connection = DriverManager.getConnection(url, user, pass);
            return connection;
        }
        return connection;
    }
}
