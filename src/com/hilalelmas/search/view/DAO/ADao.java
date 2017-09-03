package com.hilalelmas.search.view.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ADao {
    Connection connection;

    public ADao() {
        String URL = "jdbc:mysql://localhost:3306/person";
        try {
            this.connection = DriverManager.getConnection(URL, "root", "hilal2603");
            if (connection != null)
                System.out.println("bağlandı");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
