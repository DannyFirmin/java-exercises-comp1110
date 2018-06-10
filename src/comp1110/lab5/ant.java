package comp1110.lab5;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.Random;

import static javafx.scene.paint.Color.GREY;

public class ant extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Running Ants");
        Group root = new Group();
        Scene scene = new Scene(root, 400, 300);
        primaryStage.setScene(scene);
        Circle myant = new Circle(100, 100, 3);
        root.getChildren().add(myant);



        Timeline timeline = new Timeline(new KeyFrame(Duration.millis(1),
                ae -> {
                    Random rand = new Random();

                    double origX = myant.getCenterX();
                    double origY = myant.getCenterY();

                    int x = rand.nextInt(11) - 5;
                    int y = rand.nextInt(11) - 5;
                    if (origX + x > 400 || origX + x < 0 || origY + y > 300 || origY + y < 0) {
                        x = 0;
                        y = 0;
                    }

                    myant.setCenterX((int)origX + x);
                    myant.setCenterY((int)origY + y);

                    Circle path = new Circle(myant.getCenterX(), myant.getCenterY(), 3, GREY);
                    root.getChildren().add(path);


                }));
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
        primaryStage.show();


    }
}
