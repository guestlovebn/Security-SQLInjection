/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j.demo.sqlInjection.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author FIA
 */
public class DBModel {

    public static boolean login(String user, String pass) throws ClassNotFoundException, SQLException {
        Connection connection = new DBConnector().getConnection();
        String query = "SELECT * FROM Users WHERE (username='" + user + "'AND password='" + pass + "')";
        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery(query);
        return result.next();
    }
}
