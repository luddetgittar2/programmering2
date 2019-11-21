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

    public void clear(){//tömmer alla värden.
        list.clear();
        number = "";
        activeNumb = "";
    }

    public void addNumb() {//lägger in talet och operatorn i listan, och operatorn i number för att visas till användaren.
        list.add(activeNumb);
        list.add("+");
        number += " + ";
        activeNumb = "";
    }
    public void minNumb(){//lägger in talet och operatorn i listan, och operatorn i number för att visas till användaren.
        list.add(activeNumb);
        list.add("-");
        number += " - ";
        activeNumb = "";
    }

    public void timNumb(){//lägger in talet och operatorn i listan, och operatorn i number för att visas till användaren.
        list.add(activeNumb);
        list.add("x");
        number += " x ";
        activeNumb = "";
    }
    public void devNumb(){//lägger in talet och operatorn i listan, och operatorn i number för att visas till användaren.
        list.add(activeNumb);
        list.add("/");
        number += " / ";
        activeNumb = "";
    }
    public void ect(){
        list.add(activeNumb);
        String aktivOperator = "";
        boolean operator = false;
        ArrayList<Character> nummer = new ArrayList<Character>(Arrays.asList('0', '1', '2', '3', '4', '5', '6', '7', '8', '9'));//lista med alla siffror

        for (int i = 0; i < list.size(); i++){
            if(!nummer.contains(list.get(i).charAt(0))){//kör om den första charen i list(i)  inte finns i arrayen.
                aktivOperator = list.get(i);
                operator = true; //sätter operator till operator i list(i) och sätter operator till true.
            }
            if (aktivOperator.equals("") && !operator){//om aktivoperator är tom så är det första talet i listan och så sätts summan till första talet.
                summa = Double.parseDouble(list.get(i));
            }
            if (aktivOperator.equals("+") && !operator){//om aktivoperator är + och operator är false så adderas talet vid list(i)
                summa += Double.parseDouble(list.get(i));
            }
            if (aktivOperator.equals("-") && !operator){//om aktivoperator är - och operator är false så suptraheras talet vid list(i)
                summa -= Double.parseDouble(list.get(i));
            }
            if (aktivOperator.equals("x") && !operator){//om aktivoperator är x och operator är false så multipliseras talet vid list(i)
                summa *= Double.parseDouble(list.get(i));
            }
            if (aktivOperator.equals("/") && !operator){//om aktivoperator är / och operator är false så divideras talet vid list(i)
                summa /= Double.parseDouble(list.get(i));
            }
            operator = false;
        }

        number = Double.toString(summa);
        activeNumb = Double.toString(summa);
        list.clear();
        summa = 0;//här återställs allt
    }
}
