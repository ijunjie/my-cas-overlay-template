package com.wang;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Main {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found");
            return;
        }

        final String db = "jdbc:mysql://cas.h3cloudos.com:3306/castest?createDatabaseIfNotExist=true&useUnicode=true&characterEncoding=UTF-8&autoReconnect=true";

        try (
            Connection conn = DriverManager.getConnection(db, "root", "123456");
            PreparedStatement preparedStatement = conn.prepareStatement("SELECT password FROM t_admin_user WHERE login_name=?");
            ){

            preparedStatement.setString(1, "hello");
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()) {
                System.out.println(resultSet.getString("password"));
            }


        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Connection failed!");
        }


    }
}
