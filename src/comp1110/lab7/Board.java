package comp1110.lab7;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Board extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Board");
        Group root = new Group();
        Scene scene = new Scene(root, 600, 519);


        ArrayList<Triangle> list = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            for (int j = -2; j < 3; j++) {
                Triangle t = new Triangle(j * 100 + 300, 86.6 + 173.2 * i, 196);
                if (Math.abs(j % 2) == 1) {
                    t.setRotate(180);
                }
                list.add(t);
            }
        }

        for (Triangle t : list) {
            root.getChildren().addAll(t);
        }

        primaryStage.setScene(scene);
        primaryStage.show();
    }


    class Triangle extends Polygon {
        Triangle(double x, double y, double side) {
            super(side / 2, Math.sqrt(Math.pow(side, 2) - Math.pow(side / 2, 2)) / 2, -1 * side / 2, Math.sqrt(Math.pow(side, 2) - Math.pow(side / 2, 2)) / 2, 0, -1 * Math.sqrt(Math.pow(side, 2) - Math.pow(side / 2, 2)) / 2);

            this.setLayoutX(x);
            this.setLayoutY(y);
            this.setFill(Color.LIGHTGREY);
        }
    }


}