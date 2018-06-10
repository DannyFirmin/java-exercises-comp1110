package comp1110.lab6;

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
//        Triangle triangle = new Triangle();
//        root.getChildren().add(triangle);

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


//        Polygon triangle = new Polygon(0, -86.6, 100, 86.6, -100, 86.6);
//        triangle.setLayoutX(300);
//        triangle.setLayoutY(259.5);

//        triangle.setFill(Color.LIGHTGREY);
    //       root.getChildren().add(triangle);

    class Triangle extends Polygon {
        Triangle(double x, double y, double side) {
            super(side / 2, Math.sqrt(Math.pow(side, 2) - Math.pow(side / 2, 2)) / 2, -1 * side / 2, Math.sqrt(Math.pow(side, 2) - Math.pow(side / 2, 2)) / 2, 0, -1 * Math.sqrt(Math.pow(side, 2) - Math.pow(side / 2, 2)) / 2);

            this.setLayoutX(x);
            this.setLayoutY(y);
            this.setFill(Color.LIGHTGREY);

       //     double h = side * Math.sin(Math.PI * 60 / 180);



//            double x1 = x;
//            double y1 = y + h / 2;
//            double x2 = x - side;
//            double y2 = y - h / 2;
//            double x3 = x + side;
//            double y3 = y - h / 2;

//                            getPoints().addAll(x1,y1,x2,y2,x3,y3);

//                Polygon triangle = new Polygon(x1, y1, x2, y2, x3, y3);// centered at (x,y), with sides of length side.
        }
    }


}


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


//package comp1110.lab6;
//
//        import javafx.application.Application;
//        import javafx.scene.Group;
//        import javafx.scene.Scene;
//        import javafx.scene.paint.Color;
//        import javafx.scene.shape.Polygon;
//        import javafx.stage.Stage;
//
//        import java.util.ArrayList;
//
//
//public class board2 extends Application {
//    class Triangle extends Polygon {
//        Triangle(double x, double y, double side) {
//            super(side / 2, Math.sqrt(Math.pow(side, 2) - Math.pow(side / 2, 2)) / 2, -1 * side / 2, Math.sqrt(Math.pow(side, 2) - Math.pow(side / 2, 2)) / 2, 0, -1 * Math.sqrt(Math.pow(side, 2) - Math.pow(side / 2, 2)) / 2);
//            super.setLayoutX(x);
//            super.setLayoutY(y);
//            super.setFill(Color.LIGHTGREY);
//        }
//
//
//    }
//
//    @Override
//    public void start(Stage primaryStage) throws Exception {
//        primaryStage.setMaxWidth(600);
//        primaryStage.setWidth(600);
//        primaryStage.setMaxHeight(519);
//        primaryStage.setHeight(519);
//        Group root = new Group();
//
//        ArrayList<Triangle> list = new ArrayList<>();
//
//        for (int i = 0; i < 3; i++) {
//            for (int j = -2; j < 3; j++) {
//                Triangle t = new Triangle(j * 100 + 300, 86.6 + 173.2 * i, 196);
//                if (Math.abs(j % 2) == 1) {
//                    t.setRotate(180);
//                }
//                list.add(t);
//            }
//        }
//
//        for (Triangle t : list) {
//            root.getChildren().addAll(t);
//        }
//        primaryStage.setScene(new Scene(root));
//        primaryStage.show();
//    }
//
//
//}