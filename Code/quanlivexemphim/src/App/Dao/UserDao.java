/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App.Dao;

import App.Helpers.DatabaseConnection;
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
                        User user = new User(res.getString(2),res.getString(3),res.getString(1),res.getString(4),res.getString(5));
                        return user;
                    }
                }
            }
        }
        return null;
    }
}
