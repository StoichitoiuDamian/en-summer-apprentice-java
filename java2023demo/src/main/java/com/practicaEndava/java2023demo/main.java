package com.practicaEndava.java2023demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class main {
    public static void main(String[] args){
        String connectionString = "jdbc:sqlserver://DESKTOP-85CE4MB\\SQLEXPRESS:1433;databaseName=endavaPracticaV2;integratedSecurity=true;trustServerCertificate=true";

        try{
            try(Connection connection = DriverManager.getConnection(connectionString)){
                System.out.println("connection succes");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
