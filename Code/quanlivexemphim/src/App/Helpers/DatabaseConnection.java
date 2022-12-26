/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App.Helpers;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
    public static Connection openConnection() throws Exception{
        String url ="jdbc:mysql://localhost:3306/qlivexemphim";
        String user ="root";
        String pass ="123456";
        Connection conn = DriverManager.getConnection(url,user,pass);
        return conn;
    }
}
