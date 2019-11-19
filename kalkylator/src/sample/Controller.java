package sample;

import javafx.event.ActionEvent;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.FormatFlagsConversionMismatchException;


public class Controller {

    public String activeNumb = "";
    public String number = "";
    public double summa = 0;
    ArrayList<String> list = new ArrayList<String>();


    public static void main(String[] args) {

    }

    public void number(String numb){
        number += numb;
        activeNumb += numb;
    }

    public void clear(){
        list.clear();
        number = "";
        activeNumb = "";
    }

    public void addNumb() {
        list.add(activeNumb);
        list.add("+");
        number += " + ";
        activeNumb = "";
    }
    public void minNumb(){
        list.add(activeNumb);
        list.add("-");
        number += " - ";
        activeNumb = "";
    }

    public void timNumb(){
        list.add(activeNumb);
        list.add("x");
        number += " x ";
        activeNumb = "";
    }
    public void devNumb(){
        list.add(activeNumb);
        list.add("/");
        number += " / ";
        activeNumb = "";
    }
    public void ect(){
        list.add(activeNumb);
        String aktivOperator = "";
        boolean operator = false;
        ArrayList<Character> nummer = new ArrayList<Character>(Arrays.asList('0', '1', '2', '3', '4', '5', '6', '7', '8', '9'));

        for (int i = 0; i < list.size(); i++){
            if(!nummer.contains(list.get(i).charAt(0))){
                aktivOperator = list.get(i);
                operator = true;
            }
            if (aktivOperator.equals("") && !operator){
                summa = Double.parseDouble(list.get(i));
            }
            if (aktivOperator.equals("+") && !operator){
                summa += Double.parseDouble(list.get(i));
            }
            if (aktivOperator.equals("-") && !operator){
                summa -= Double.parseDouble(list.get(i));
            }
            if (aktivOperator.equals("x") && !operator){
                summa *= Double.parseDouble(list.get(i));
            }
            if (aktivOperator.equals("/") && !operator){
                summa /= Double.parseDouble(list.get(i));
            }
            operator = false;
        }

        number = Double.toString(summa);
        activeNumb = Double.toString(summa);
        list.clear();
        summa = 0;
    }
}
