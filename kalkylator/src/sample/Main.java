package sample;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import sun.security.pkcs11.wrapper.Functions;

import java.awt.*;
import java.lang.reflect.Field;
import java.util.function.Function;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        BorderPane pane = new BorderPane();

        TextField text = new TextField();
        pane.setTop(text);


        Button button1 = new Button("1");
        button1.setMinSize(125, 100);
        button1.setText("1");
        Button button2= new Button("2");
        button2.setMinSize(125, 100);
        button2.setText("2");
        Button button3 = new Button("3");
        button3.setMinSize(125, 100);
        button3.setText("3");
        Button button4 = new Button("4");
        button4.setMinSize(125, 100);
        button4.setText("4");
        Button button5 = new Button("5");
        button5.setMinSize(125, 100);
        button5.setText("5");
        Button button6 = new Button("6");
        button6.setMinSize(125, 100);
        button6.setText("6");
        Button button7 = new Button("7");
        button7.setMinSize(125, 100);
        button7.setText("7");
        Button button8 = new Button("8");
        button8.setMinSize(125, 100);
        button8.setText("8");
        Button button9 = new Button("9");
        button9.setMinSize(125, 100);
        button9.setText("9");
        Button button0 = new Button("0");
        button0.setMinSize(125, 100);
        button0.setText("0");
        Button buttonPlus = new Button("+");
        buttonPlus.setMinSize(125, 100);
        buttonPlus.setText("+");
        Button buttonMin = new Button("-");
        buttonMin.setMinSize(125, 100);
        buttonMin.setText("-");
        Button buttonTimes = new Button("X");
        buttonTimes.setMinSize(125, 100);
        buttonTimes.setText("x");
        Button buttonDivide = new Button("/");
        buttonDivide.setMinSize(125, 100);
        buttonDivide.setText("/");
        Button buttonClear = new Button("Clear");
        buttonClear.setMinSize(500, 100);
        buttonClear.setText("Clear");
        Button buttonDot = new Button(".");
        buttonDot.setMinSize(125, 100);
        buttonDot.setText(".");
        Button buttonEct = new Button("=");
        buttonEct.setMinSize(125, 100);
        buttonEct.setText("=");

        GridPane grid = new GridPane();

        grid.add(button1, 0,3);
        grid.add(button2, 1,3);
        grid.add(button3, 2,3);
        grid.add(button4, 0,2);
        grid.add(button5, 1,2);
        grid.add(button6, 2,2);
        grid.add(button7, 0,1);
        grid.add(button8, 1,1);
        grid.add(button9, 2,1);
        grid.add(button0, 1,4);
        grid.add(buttonPlus, 0,4);
        grid.add(buttonMin, 2,4);
        grid.add(buttonDivide, 3,1);
        grid.add(buttonTimes, 3,2);
        grid.add(buttonDot, 3,3);
        grid.add(buttonEct, 3,4);

        pane.setCenter(grid);
        pane.setBottom(buttonClear);



        primaryStage.setTitle("Kalkylator");
        primaryStage.setScene(new Scene(pane, 490, 500));
        primaryStage.setResizable(false);
        primaryStage.show();

        Controller Controller = new Controller();

        button1.setOnAction(event -> {
            Controller.number("1");
            text.setText(Controller.number);
        });

        button2.setOnAction(event -> {
            Controller.number("2");
            text.setText(Controller.number);
        });

        button3.setOnAction(event -> {
            Controller.number("3");
            text.setText(Controller.number);
        });

        button4.setOnAction(event -> {
            Controller.number("4");
            text.setText(Controller.number);
        });

        button5.setOnAction(event -> {
            Controller.number("5");
            text.setText(Controller.number);
        });

        button6.setOnAction(event -> {
            Controller.number("6");
            text.setText(Controller.number);
        });

        button7.setOnAction(event -> {
            Controller.number("7");
            text.setText(Controller.number);
        });

        button8.setOnAction(event -> {
            Controller.number("8");
            text.setText(Controller.number);
        });

        button9.setOnAction(event -> {
            Controller.number("9");
            text.setText(Controller.number);
        });

        buttonPlus.setOnAction(event -> {
            Controller.activeNumb += "+";
            text.setText(Controller.activeNumb);
        });


        buttonMin.setOnAction(event -> {
            Controller.minNumb();
            text.setText(Controller.number);
        });


        buttonDivide.setOnAction(event -> {
            Controller.devNumb();
            text.setText(Controller.number);
        });


        buttonTimes.setOnAction(event -> {
            Controller.timNumb();
            text.setText(Controller.number);
        });


        buttonDot.setOnAction(event -> {
            Controller.number += (".");
            text.setText(Controller.number);
        });

        buttonClear.setOnAction(event -> {
            Controller.activeNumb = " ";
            text.setText(Controller.activeNumb);
        });

        button0.setOnAction(event -> {
            Controller.number("0");
            text.setText(Controller.number);
        });

        buttonPlus.setOnAction(event -> {
            Controller.addNumb();
            text.setText(Controller.number);
        });









    }


    public static void main(String[] args) {
        launch(args);
    }
}
