/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App.Helpers;

/**
 *
 * @author win10
 */
public class ToStringDate {
    public String change(String s){
        String res = "";
        String[] words = s.split(" ");
        res += words[5];
        res += "-";
        if(words[1].equals("Jan")) res += "01";
        else if(words[1].equals("Feb")) res += "02";
        else if(words[1].equals("Mar")) res += "03";
        else if(words[1].equals("Apr")) res += "04";
        else if(words[1].equals("May")) res += "05";
        else if(words[1].equals("Jun")) res += "06";
        else if(words[1].equals("Jul")) res += "07";
        else if(words[1].equals("Aug")) res += "08";
        else if(words[1].equals("Sep")) res += "09";
        else if(words[1].equals("Oct")) res += "10";
        else if(words[1].equals("Nov")) res += "11";
        else if(words[1].equals("Dec")) res += "12";
        res += "-";
        res += words[2];
        return res;
    }
}
