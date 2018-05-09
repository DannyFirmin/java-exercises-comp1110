package comp1110.lab7;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

import java.util.ArrayList;

import static javafx.scene.paint.Color.GREEN;
import static javafx.scene.paint.Color.LIGHTGREY;

public class Board extends Application {
    Triangle highlighted = null;
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


        DraggableTriangle DT = new DraggableTriangle(300, 260, 200, this);

        root.getChildren().add(DT);
    }
    class Triangle extends Polygon {
        Triangle(double x, double y, double side) {
            super(side / 2, Math.sqrt(Math.pow(side, 2) - Math.pow(side / 2, 2)) / 2, -1 * side / 2, Math.sqrt(Math.pow(side, 2) - Math.pow(side / 2, 2)) / 2, 0, -1 * Math.sqrt(Math.pow(side, 2) - Math.pow(side / 2, 2)) / 2);

            this.setLayoutX(x);
            this.setLayoutY(y);
            this.setFill(Color.LIGHTGREY);
        }
        private double distance(double x, double y){
            return Math.sqrt(x*x+y*y);
        }
    }

    class DraggableTriangle extends Triangle{
        private Board board;
        private double mousex;
        private double mousey;
        private double mouseXmoved;
        private double mouseYmoved;
        DraggableTriangle(double x, double y, double side, Board board){
            super(x,y,side);
            this.setFill(Color.RED);
            this.board = board;

            this.setOnMousePressed(event -> {
                mousex = event.getSceneX();
                mousey = event.getSceneY();
                this.toFront();
            });

            this.setOnMouseDragged(event ->{
                mouseXmoved = event.getSceneX() - mousex;
                mouseYmoved = event.getSceneY() - mousey;
                setLayoutX(getLayoutX()+mouseXmoved);
                setLayoutY(getLayoutY()+mouseYmoved);
                mousex = event.getSceneX();
                mousey = event.getSceneY();
                board.highlightNearestTriangle(mousex,mousey);
            });
        }


    }

    Triangle findNearestTriangle(double x, double y){
        Triangle nearest = null;
        ArrayList<Triangle> store = new ArrayList<>();
        for (Triangle n:store) {
            if (nearest == null || n.distance(x, y) < nearest.distance (x, y)) {
                nearest = n;
            }
        }
        return nearest;
    }


    void highlightNearestTriangle(double x, double y){
        if(highlighted!=null)
            highlighted.setFill(LIGHTGREY);
        highlighted = findNearestTriangle(x,y);
        highlighted.setFill(GREEN);
    }
}