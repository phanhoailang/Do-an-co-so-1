/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App.Dao;

import App.Helpers.DatabaseConnection;
import App.Helpers.ToStringDate;
import App.Model.User;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;

/**
 *
 * @author win10
 */
public class UserDao {

    public User checkLogin(String phoneNumber, String passWord) throws Exception {
        String sql = "SELECT * from KHACHHANG "
                + " WHERE PhoneNumber=? AND PassWord=?";
        try ( Connection conn = DatabaseConnection.openConnection();  PreparedStatement pstmt = conn.prepareStatement(sql);) {
            pstmt.setString(1, phoneNumber);
            pstmt.setString(2, passWord);
            try ( ResultSet res = pstmt.executeQuery();) {
                {
                    if (res.next()) {
                        User user = new User(res.getString(2), res.getString(3), res.getString(1), res.getString(4), res.getString(5));
                        return user;
                    }
                }
            }
        }
        return null;
    }

    public User checkSignUp(String phoneNumber) throws Exception {
        String sql = "SELECT * from KHACHHANG "
                + " WHERE PhoneNumber=?";
        try ( Connection conn = DatabaseConnection.openConnection();  PreparedStatement pstmt = conn.prepareStatement(sql);) {
            pstmt.setString(1, phoneNumber);
            try ( ResultSet res = pstmt.executeQuery();) {
                {
                    if (res.next()) {
                        User user = new User(res.getString(2), res.getString(3), res.getString(1), res.getString(4), res.getString(5));
                        return user;
                    }
                }
            }
        }
        return null;
    }

    public void Singup(String phoneNumber, String fullName, String passWord, String dateOfBirth, String genDer) throws Exception {
        ToStringDate d = new ToStringDate();
        //String s = "('" + phoneNumber + "','" + fullName + "','" + passWord + "','" + d.change(dateOfBirth) + "','" + genDer + "');";
        String sql = "INSERT INTO KHACHHANG VALUES "
                + "(?,?,?,?,?)";
        try ( Connection conn = DatabaseConnection.openConnection();  PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, phoneNumber);
            pstmt.setString(2, fullName);
            pstmt.setString(3, passWord);
            pstmt.setString(4, d.change(dateOfBirth));
            pstmt.setString(5, genDer);
            pstmt.execute();
            
        }
    }
    
    public void Delete(String phoneNumber) throws Exception{
        String sql = "DELETE FROM KHACHHANG " 
                + " WHERE PhoneNumber = ?";
        try( Connection conn = DatabaseConnection.openConnection();  PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, phoneNumber);
            pstmt.execute();
        }
    }
}
