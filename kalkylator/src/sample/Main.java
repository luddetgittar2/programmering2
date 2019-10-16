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




        Button button1 = new Button();
        Button button2= new Button();
        Button button3 = new Button();
        Button button4 = new Button();
        Button button5 = new Button();
        Button button6 = new Button();
        Button button7 = new Button();
        Button button8 = new Button();
        Button button9 = new Button();

        GridPane grid = new GridPane();
        grid.add(button1, 0,1);
        grid.add(button2, 1,1);
        grid.add(button3, 2,1);
        grid.add(button4, 0,2);
        grid.add(button5, 1,2);
        grid.add(button6, 2,2);
        grid.add(button7, 0,3);
        grid.add(button8, 1,3);
        grid.add(button9, 2,3);

        pane.setCenter(grid);

        primaryStage.setTitle("Kalkylator");
        primaryStage.setScene(new Scene(pane, 500, 700));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
