package comp1110.lab6;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class Board extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Board");
        Group root = new Group();
        Scene scene = new Scene(root,600,519);
        primaryStage.setScene(scene);
        primaryStage.show();

        Polygon triangle = new Polygon(0,-86.6,100,86.6,-100,86.6);//where to put postion(0,0)?
        triangle.setLayoutX(300);
        triangle.setLayoutY(259.5);
        triangle.setFill(Color.LIGHTGREY);
        root.getChildren().add(triangle);

        class Triangle extends Polygon{
            Triangle(double x, double y, double side){
                Polygon triangle = new Polygon(x,y,side,side);// centered at (x,y), with sides of length side.
            }
        }


    }
}
