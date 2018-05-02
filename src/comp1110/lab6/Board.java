package comp1110.lab6;

import comp1110.lab2.Triangle;
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
        Scene scene = new Scene(root, 600, 519);
        primaryStage.setScene(scene);
        primaryStage.show();

        Polygon triangle = new Polygon(0, -86.6, 100, 86.6, -100, 86.6);
        triangle.setLayoutX(300);
        triangle.setLayoutY(259.5);

        triangle.setFill(Color.LIGHTGREY);
        root.getChildren().add(triangle);

//        class Triangle extends Polygon {
//            double x;
//            double y;
//            double side;
//
//            Triangle(double x, double y, double side){
//                this.x = x;
//                this.y = y;
//                this.side = side;
//
//                setLayoutX(x);
//                setLayoutY(y);
//                getPoints().addAll(
//                        x, (-(Math.sqrt((side*side)-((side/2)*(side/2)))/2)),
//                        (side/2), Math.sqrt((side*side)-((side/2)*(side/2)))/2,
//                        (-(side/2)), Math.sqrt((side*side)-((side/2)*(side/2)))/2);
//            }
//        }


        class Triangle extends Polygon {


            Triangle(double x, double y, double side) {
                double h = side * Math.sin(Math.PI * 60 / 180);
                double x1 = x;
                double y1 = y + h / 2;
                double x2 = x - side;
                double y2 = y - h / 2;
                double x3 = x + side;
                double y3 = y - h / 2;
                Polygon triangle = new Polygon(x1, y1, x2, y2, x3, y3);// centered at (x,y), with sides of length side.
            }
        }


    }}

