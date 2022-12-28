/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App.Model;

/**
 *
 * @author win10
 */
public class Film {

    private String nameFilm;
    private String idFilm;
    private boolean statusFilm;

    public Film() {
    }

    public Film(String nameFilm, String idFilm, boolean statusFilm) {
        this.nameFilm = nameFilm;
        this.idFilm = idFilm;
        this.statusFilm = statusFilm;
    }

    public String getNameFilm() {
        return nameFilm;
    }

    public void setNameFilm(String nameFilm) {
        this.nameFilm = nameFilm;
    }

    public String getIdFilm() {
        return idFilm;
    }

    public void setIdFilm(String idFilm) {
        this.idFilm = idFilm;
    }

    public boolean isStatusFilm() {
        return statusFilm;
    }

    public void setStatusFilm(boolean statusFilm) {
        this.statusFilm = statusFilm;
    }

    @Override
    public String toString() {
        return "Film{" + "nameFilm=" + nameFilm + ", idFilm=" + idFilm + '}';
    }

}
