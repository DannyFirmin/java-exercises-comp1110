# COMP1110 Lab 5

## Purpose

In this lab you will write a simple Java FX program and use any spare time to prepare for lab test 2.

**It is essential that you complete this lab and have a tutor mark it off during the lab**.

## A simple JavaFX animation

Your objective here is to famimliarize yourself further with JavaFX by creating 
a simple window with a moving 'ant'.

In the Java package comp1110.lab5, within your comp1110-labs repository, create a new Java class, `Ant`, that draws the path of an ant that is walking randomly around a JavaFX window. This should look a little like a scribbling on a page. If the ant walks off the edge of the screen re-center the ant and continue the random walk. Use the basic template from the code from lecture X01. In addition to that, you may find the following helpful:

````java
...
primaryStage.setScene(scene);

Timeline timeline = new Timeline(new KeyFrame(Duration.millis(100),
                            ae -> {
                                   /* your code goes here */
                                  }));
timeline.setCycleCount(Animation.INDEFINITE);
timeline.play();
primaryStage.show();
...
````
that little bit of code will be called once every 100 milliseconds (10 times a second).

## Prepare for lab test 2.

Use any spare time you have to work on preparing for lab test 2 and working on your group assignment.
