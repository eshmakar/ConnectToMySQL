package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    private static final String user = "root";
    private static final String password = "root";

    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/first_lesson+?verifyServerCertificate=false&useSSL=false&requireSSL=false&allowPublicKeyRetrieval=true&useLegacyDatetimeCode=false&amp&serverTimezone=UTC";
        try {
            Connection connection = DriverManager.getConnection(url, "root", "root");
            System.out.println("work");
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

}
