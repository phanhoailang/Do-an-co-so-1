/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App.Dao;

import App.Helpers.DatabaseConnection;
import App.Model.Film;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author win10
 */
public class FilmDao {
    public Film check(String nameFilm, String idFilm) throws Exception{
        String sql = " SELECT * FROM FILM"
                + " WHERE NameFilm=? AND IdFilm=?";
        try(Connection conn = DatabaseConnection.openConnection(); PreparedStatement pstmt = conn.prepareStatement(sql);){
            pstmt.setString(1, nameFilm);
            pstmt.setString(2, idFilm);
            try ( ResultSet res = pstmt.executeQuery();) {
                {
                    if (res.next()) {
                        Film film = new Film(res.getString(1),res.getString(2),res.getBoolean(3));
                        return film;
                    }
                }
            }
        }
        return null;
    }
}
