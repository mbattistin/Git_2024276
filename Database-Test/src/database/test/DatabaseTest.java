/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package database.test;

import java.sql.*;
import java.util.Scanner;
/**
 *
 * @author Mariana
 */
public class DatabaseTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
          Class.forName("com.mysql.cj.jdbc.Driver");
          Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/car_rental","root","123456");
          System.out.println("Connected");
        }
        catch(SQLException ex){
            System.out.println("SQL Error:");
            System.out.println(ex.getMessage());
            System.out.println(ex.getSQLState());
        }
        catch(ClassNotFoundException ex){
            System.out.println("Class error: " + ex.getMessage());
        }
    }
    
}
