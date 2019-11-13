package sample;

import javafx.event.ActionEvent;

import java.awt.*;
import java.util.ArrayList;
import java.util.FormatFlagsConversionMismatchException;


public class Controller {

    public String activeNumb = "";
    public String number = "";
    public double summa;
    ArrayList<Double> tal = new ArrayList<Double>();
    ArrayList<Character> talTyp = new ArrayList<Character>();


    public static void main(String[] args) {

    }

    public void number(String numb){
        number += numb;
        activeNumb += numb;
    }

    public void addNumb() {
        tal.add(Double.parseDouble(activeNumb));
        talTyp.add('+');
        number += " + ";
        activeNumb = "";
    }
    public void minNumb(){
        tal.add(Double.parseDouble(activeNumb));
        talTyp.add('-');
        number += " - ";
        activeNumb = "";
    }

    public void timNumb(){
        tal.add(Double.parseDouble(activeNumb));
        talTyp.add('x');
        number += " x ";
        activeNumb = "";
    }
    public void devNumb(){
        tal.add(Double.parseDouble(activeNumb));
        talTyp.add('/');
        number += " / ";
        activeNumb = "";
    }
    public void ect(){
        
    }
}
