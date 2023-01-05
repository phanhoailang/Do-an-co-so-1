/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App.Dao;

import App.Helpers.DatabaseConnection;
import App.Model.Ticket_model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author win10
 */
public class TicketDao {

    public ArrayList<Ticket_model> list(String idFilm) throws Exception {
        ArrayList<Ticket_model> list = new ArrayList<>();
        String sql = "SELECT * FROM TICKET"
                + " WHERE IdFilm = ?";
        try ( Connection conn = DatabaseConnection.openConnection();  PreparedStatement pstmt = conn.prepareStatement(sql);) {
            pstmt.setString(1, idFilm);
            try ( ResultSet res = pstmt.executeQuery();) {
                {
                    while (res.next()) {
                        Ticket_model t = new Ticket_model(res.getString(1), res.getString(4), res.getString(5), res.getDouble(3), res.getInt(2));
                        list.add(t);
                    }
                }
            }
        }
        return list;
    }

    public ArrayList<Ticket_model> list1(String phoneNumber) throws Exception {
        ArrayList<Ticket_model> list = new ArrayList<>();
        String sql = "SELECT * FROM TICKET"
                + " WHERE PhoneNumber = ?";
        try ( Connection conn = DatabaseConnection.openConnection();  PreparedStatement pstmt = conn.prepareStatement(sql);) {
            pstmt.setString(1, phoneNumber);
            try ( ResultSet res = pstmt.executeQuery();) {
                {
                    while (res.next()) {
                        Ticket_model t = new Ticket_model(res.getString(1), res.getString(4), res.getString(5), res.getDouble(3), res.getInt(2));
                        list.add(t);
                    }
                }
            }
        }
        return list;
    }

    public int list2(String idFilm) throws Exception {
        int count = 0;
        String sql = "SELECT * FROM TICKET"
                + " WHERE IdFilm = ?";
        try ( Connection conn = DatabaseConnection.openConnection();  PreparedStatement pstmt = conn.prepareStatement(sql);) {
            pstmt.setString(1, idFilm);
            try ( ResultSet res = pstmt.executeQuery();) {
                {
                    while (res.next()) {
                        if (res.getInt(2) == 3) {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }

    public double price(String idFilm) throws Exception {
        String sql = "SELECT * FROM TICKET"
                + " WHERE IdFilm = ?";
        Ticket_model t = new Ticket_model();
        try ( Connection conn = DatabaseConnection.openConnection();  PreparedStatement pstmt = conn.prepareStatement(sql);) {
            pstmt.setString(1, idFilm);
            try ( ResultSet res = pstmt.executeQuery();) {
                {
                    while(res.next()){
                        t = new Ticket_model(res.getString(1), res.getString(4), res.getString(5), res.getDouble(3), res.getInt(2));
                        break;
                    }
                    return t.getPrice();
                }
            }
        }
    }

    public void UpdateStatus(String idTicket) throws Exception {
        String sql = " UPDATE TICKET "
                + " SET StatusTicket = 3"
                + " WHERE IdTicket = ?";
        try ( Connection conn = DatabaseConnection.openConnection();  PreparedStatement pstmt = conn.prepareStatement(sql);) {
            pstmt.setString(1, idTicket);
            pstmt.execute();
        }
    }

    public void UpdatePhoneNumber(String idTicket, String phoneNumber) throws Exception {
        String sql = " UPDATE TICKET "
                + " SET PhoneNumber = ?"
                + " WHERE IdTicket = ?";
        try ( Connection conn = DatabaseConnection.openConnection();  PreparedStatement pstmt = conn.prepareStatement(sql);) {
            pstmt.setString(1, phoneNumber);
            pstmt.setString(2, idTicket);
            pstmt.execute();
        }
    }

    public void UpdatePhoneNumber(String phoneNumber) throws Exception {
        String sql = " UPDATE TICKET "
                + " SET PhoneNumber = null"
                + " WHERE PhoneNumber = ?";
        try ( Connection conn = DatabaseConnection.openConnection();  PreparedStatement pstmt = conn.prepareStatement(sql);) {
            pstmt.setString(1, phoneNumber);
            pstmt.execute();
        }
    }

    public void insert(String idTicket, String idFilm, double price) throws Exception {
        String sql = " INSERT INTO TICKET values"
                + " (?,?,?,?,?)";
        try ( Connection conn = DatabaseConnection.openConnection();  PreparedStatement pstmt = conn.prepareStatement(sql);) {
            pstmt.setString(1, idTicket);
            pstmt.setInt(2, 1);
            pstmt.setDouble(3, price);
            pstmt.setString(4, idFilm);
            pstmt.setString(5, null);
            pstmt.execute();
        }
    }
    public void update(String idFilm, double price) throws Exception{
        String sql = "UPDATE TICKET "
                + " SET Price = ?"
                + " WHERE IdFilm = ?";
        try ( Connection conn = DatabaseConnection.openConnection();  PreparedStatement pstmt = conn.prepareStatement(sql);) {
            pstmt.setDouble(1, price);
            pstmt.setString(2, idFilm);
            pstmt.execute();
        }
    }
}
