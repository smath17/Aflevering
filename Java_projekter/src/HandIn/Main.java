package HandIn;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;


public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) {
        primaryStage.setTitle("Calculator");

        HBox root = new HBox();

        Scene scene1 = new Scene(root, 800, 600);
        primaryStage.setScene(scene1);
        primaryStage.show();

        //Label showing result
        Label ResultLabel = new Label("Hejsa");
        ResultLabel.setFont(Font.font(20));
        //Gør intet i grid?
        //ResultLabel.setTextAlignment(TextAlignment.CENTER);
        root.getChildren().add(ResultLabel);

        //Create and add buttons with font size 18
        Button Num0 = new Button("0");
        Num0.setFont(Font.font(18));
        root.getChildren().add(Num0);

        Button Num1 = new Button("1");
        Num1.setFont(Font.font(18));
        root.getChildren().add(Num1);

        Button Num2 = new Button("2");
        Num2.setFont(Font.font(18));
        root.getChildren().add(Num2);

        Button Num3 = new Button("3");
        Num3.setFont(Font.font(18));
        root.getChildren().add(Num3);

        Button Num4 = new Button("4");
        Num4.setFont(Font.font(18));
        root.getChildren().add(Num4);

        Button Num5 = new Button("5");
        Num5.setFont(Font.font(18));
        root.getChildren().add(Num5);

        Button Num6 = new Button("6");
        Num6.setFont(Font.font(18));
        root.getChildren().add(Num6);

        Button Num7 = new Button("7");
        Num7.setFont(Font.font(18));
        root.getChildren().add(Num7);

        Button Num8 = new Button("8");
        Num8.setFont(Font.font(18));
        root.getChildren().add(Num8);

        Button Num9 = new Button("9");
        Num9.setFont(Font.font(18));
        root.getChildren().add(Num9);

        Button Addition = new Button("+");
        Addition.setFont(Font.font(18));
        root.getChildren().add(Addition);

        Button Subtraction = new Button("-");
        Subtraction.setFont(Font.font(18));
        root.getChildren().add(Subtraction);

        Button Division = new Button("÷");
        Division.setFont(Font.font(18));
        root.getChildren().add(Division);

        Button Mult = new Button("*");
        Mult.setFont(Font.font(18));
        root.getChildren().add(Mult);

        Button Compute = new Button("=");
        Compute.setFont(Font.font(18));
        root.getChildren().add(Compute);

        //Grid arranging the buttons
        GridPane NumGrid = new GridPane();
        root.getChildren().add(NumGrid);

        //Label gets an entire row to avoid pushing buttons
        GridPane.setRowIndex(ResultLabel, 0);

        //Numbers
        GridPane.setConstraints(Num1, 0, 3);
        GridPane.setConstraints(Num2, 1, 3);
        GridPane.setConstraints(Num3, 2, 3);
        GridPane.setConstraints(Num4, 0, 2);
        GridPane.setConstraints(Num5, 1, 2);
        GridPane.setConstraints(Num6, 2, 2);
        GridPane.setConstraints(Num7, 0, 1);
        GridPane.setConstraints(Num8, 1, 1);
        GridPane.setConstraints(Num9, 2, 1);
        GridPane.setConstraints(Num0, 0, 4);

        //Operator
        GridPane.setConstraints(Addition, 3, 1);
        GridPane.setConstraints(Subtraction, 3, 2);
        GridPane.setConstraints(Division, 3, 3);
        GridPane.setConstraints(Mult, 3, 4);
        GridPane.setConstraints(Compute, 2, 4);


        NumGrid.getChildren().addAll(Num1, Num2, Num3, Num4, Num5, Num6, Num7, Num8, Num9, Num0, ResultLabel, Addition, Subtraction, Division, Mult, Compute);
    }
}
