package comp1110.lab5;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.Random;

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
        Rectangle myant = new Rectangle(100, 100, 5, 5);
        root.getChildren().add(myant);



        Timeline timeline = new Timeline(new KeyFrame(Duration.millis(100),
                ae -> {
                    Random rand = new Random();

                    double origX = myant.getX();
                    double origY = myant.getY();

                    int x = rand.nextInt(11) - 5;
                    int y = rand.nextInt(11) - 5;
                    myant.setX((int)origX + x);
                    myant.setY((int)origY + y);
                    if (x > 300 || x < -300 || y > 300 || y < -300) {
                        x = 0;
                        y = 0;
                    }
                    Rectangle path = new Rectangle(myant.getX(), myant.getY(), 5, 5);
                    root.getChildren().add(path);


                }));
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
        primaryStage.show();


    }
}
