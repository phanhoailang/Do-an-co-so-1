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
    public ArrayList<Ticket_model> list(String idFilm) throws Exception{
        ArrayList<Ticket_model> list = new ArrayList<>();
        String sql = "SELECT * FROM TICKET"
                + " WHERE IdFilm = ?";
        try(Connection conn = DatabaseConnection.openConnection(); PreparedStatement pstmt = conn.prepareStatement(sql);){
            pstmt.setString(1, idFilm);
            try ( ResultSet res = pstmt.executeQuery();) {
                {
                    while(res.next()){
                        Ticket_model t = new Ticket_model(res.getString(1),res.getString(4),res.getString(5),res.getDouble(3),res.getInt(2));
                        list.add(t);
                    }
                }
            }
        }
        return list;
    }
}
