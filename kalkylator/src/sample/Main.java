package sample;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;

import java.awt.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        BorderPane pane = new BorderPane();

        TextField text = new TextField();
        pane.setTop(text);



        Button button1 = new Button("1");
        button1.setMinSize(125, 100);
        Button button2= new Button("2");
        button2.setMinSize(125, 100);
        Button button3 = new Button("3");
        button3.setMinSize(125, 100);
        Button button4 = new Button("4");
        button4.setMinSize(125, 100);
        Button button5 = new Button("5");
        button5.setMinSize(125, 100);
        Button button6 = new Button("6");
        button6.setMinSize(125, 100);
        Button button7 = new Button("7");
        button7.setMinSize(125, 100);
        Button button8 = new Button("8");
        button8.setMinSize(125, 100);
        Button button9 = new Button("9");
        button9.setMinSize(125, 100);
        Button button0 = new Button("0");
        button0.setMinSize(125, 100);
        Button buttonPlus = new Button("+");
        buttonPlus.setMinSize(125, 100);
        Button buttonMin = new Button("-");
        buttonMin.setMinSize(125, 100);
        Button buttonTimes = new Button("X");
        buttonTimes.setMinSize(125, 100);
        Button buttonDivide = new Button("/");
        buttonDivide.setMinSize(125, 100);
        Button buttonClear = new Button("Clear");
        buttonClear.setMinSize(500, 100);
        Button buttonDot = new Button(".");
        buttonDot.setMinSize(125, 100);
        Button buttonEct = new Button("=");
        buttonEct.setMinSize(125, 100);

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

        button1.setOnAction();


        primaryStage.setTitle("Kalkylator");
        primaryStage.setScene(new Scene(pane, 490, 500));
        primaryStage.setResizable(false);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
