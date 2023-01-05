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
import java.util.ArrayList;
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
    public Film check(String idFilm) throws Exception{
        String sql = " SELECT * FROM FILM"
                + " WHERE IdFilm=?";
        try(Connection conn = DatabaseConnection.openConnection(); PreparedStatement pstmt = conn.prepareStatement(sql);){
            pstmt.setString(1, idFilm);
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
    
    public ArrayList<Film> select() throws Exception{
        String sql = " SELECT * FROM FILM";
        ArrayList<Film> list = new ArrayList<>();
        try(Connection conn = DatabaseConnection.openConnection(); PreparedStatement pstmt = conn.prepareStatement(sql);){
            try ( ResultSet res = pstmt.executeQuery();) {
                {
                    while (res.next()) {
                        Film film = new Film(res.getString(1),res.getString(2),res.getBoolean(3));
                        list.add(film);
                    }
                }
            }
        }
        return list;
    }
    public void insert (String idFilm, String nameFilm, String statusFilm) throws Exception{
        String sql = "INSERT into FILM values"
                + " (?,?,?)";
        try ( Connection conn = DatabaseConnection.openConnection();  PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, nameFilm);
            pstmt.setString(2, idFilm);
            if(statusFilm.equals("Chiếu")) pstmt.setBoolean(3, true);
            else pstmt.setBoolean(3, false);
            pstmt.execute();
        }
    }
    public void status (String idFilm, String statusFilm) throws Exception{
        String sql = "UPDATE FILM "
                + " SET StatusFilm = ?"
                + " WHERE IdFilm = ?";
        try ( Connection conn = DatabaseConnection.openConnection();  PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(2, idFilm);
            if(statusFilm.equals("Chiếu")) pstmt.setBoolean(1, true);
            else pstmt.setBoolean(1, false);
            pstmt.execute();
        }
    }
}
