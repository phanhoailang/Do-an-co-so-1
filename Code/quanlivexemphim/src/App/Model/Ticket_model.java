/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App.Model;


public class Ticket_model {
    private String idTicket,idFilm,phoneNumber ;
    private double price;
    private int statusTicket;

    public Ticket_model() {
    }

    public Ticket_model(String idTicket, String idFilm, String phoneNumber, double price, int statusTicket) {
        this.idTicket = idTicket;
        this.idFilm = idFilm;
        this.phoneNumber = phoneNumber;
        this.price = price;
        this.statusTicket = statusTicket;
    }

    public String getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(String idTicket) {
        this.idTicket = idTicket;
    }

    public String getIdFilm() {
        return idFilm;
    }

    public void setIdFilm(String idFilm) {
        this.idFilm = idFilm;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int isStatusTicket() {
        return statusTicket;
    }

    public void setStatusTicket(int statusTicket) {
        this.statusTicket = statusTicket;
    }
    
}
