# COMP1110 Lab 7

## Purpose

In this lab you will write a Java FX program that demonstrates drag-and-drop.

**It is essential that you complete this lab and have a tutor mark it off**.

## JavaFX Drag and Drop

1.  **Copy your Board class.**

    It is not normally good practice to copy classes (better to refer to them or
    extend them), but for the sake of this lab, you will copy the class you
    created in [lab 6](src/comp1110/lab6/README.md).

    Navigate to your `comp1110.lab6.Board` class, copy it either using keyboard
    short cuts or the file menu (`Edit` -> `Copy`).  Navigate to your
    `comp1110.lab7` folder and paste the selection.   IntelliJ should bring up
    a dialogue which asks you to confirm the desitnation.   Once you've copied
    the class, you will notice that IntelliJ correctly changed the package of
    the new file from `comp1110.lab6` to `comp1110.lab7` (see the first line in
    the file).
    
2. **Create an inner class**

    Create a new inner class `DraggableTriangle`, that extends your inner class `Triangle`.

3. **Add a constructor**

    Add a constructor to your new inner class with the following signature: `DraggableTriangle(double x, double y, double size, Board board)`. Ensure that this constructor calls its parent constructor (`super(x, y, size)`), and then sets the fill color to`RED`.

4. **Add a new field**

    Add a private instance field `board` to your `DraggableTriangle` inner class and initialize it in the constructor (i.e. `this.board = board;`).

5. **Create a draggable triangle**

    Within the `start()` method of your `Board` class, create a new `DraggableTriangle` of size 200, centered at (300, 260), and with the board (i.e. `this`) passed as the fourth argument to the constructor. Remember to add the draggable triangle to your root group.

    ![alt board](assets/lab7a.png)

6. **Make the inner class draggable**

    Make the inner class `DraggableTriangle` draggable. The approach here is to identify how much the mouse has moved (by comparing its current position to its last position), and then move the triangle by that same amount.
    * Add two private instances fields to the inner class, both doubles, to track the location of the mouse as the object is dragged. Call them `mousex` and `mousey`.
	* Remember where the mouse is when it is first pressed, and ensure your triangle remains visible. Do this within the constructor by establishing a handler for mouse presses. You need to add code to the constructor for `DraggableTriangle` that looks something like this:
	
    ````Java
        this.setOnMousePressed(event -> {
        .. your code here ..
        });
    ````
	* Your code should store the current mouse x and y positions in the private fields (e.g. `mousex = event.getSceneX()`, etc), and should ensure the draggable triangle is not covered by other nodes in the scene (call `toFront()` to ensure this).
	* Move the triangle as the mouse is dragged using a handler via `setOnMouseDragged()` in much the same way as you did for `setOnMousePressed()` in the previous step. In that code, find out how much the mouse has moved (e.g. use `event.getSceneX() - mousex`), and change the location of the triangle by the same amount (use `setLayoutX()`, etc). Then remember the new mouse location (updating `mousex` and `mousey`), so that it is all ready for the next time the event occurs.
	
	You should now be able to drag the red triagle around.

7. **Add a distance calculator**

    Add a method to your inner class `Triangle` with signature `private double distance(double x, double y)` that returns the euclidian distance from the center of the triangle to the point (x,y), (using Pythagoras' theorem :-).

8. **Find the nearest triangle**

    Add an instance method to your `Board` class that allows you to find the nearest triangle to a given point, it should have a signature something like `Triangle findNearestTriangle(double x, double y)`. You can do this by simply iterating over all the triangles in your `ArrayList<Triangle>`, and returning the triangle with the smallest distance from (`x`,`y`).

9. **Highlight the nearest**

    Highlight the triangle nearest the draggable triangle:
	* Add a new field to your `Board` class that allows you to remember a 'highlighted' triangle, and initialize the field to `null` (e.g. `Triangle highlighted = null;`).
	* Add a method `void highlightNearestTriangle(double x, double y)` that highlights the triangle nearest a point (`x`, `y`). This method should first un-highlight the currently highlighted triangle (if there is one), by filling it with `LIGHTGREY`. It should then set the variable `highlighted` to be equal to the nearest triangle to (`x`, `y`), and then it should set the fill color of the highlighted triangle to `GREEN` (or whatever color you prefer).
	* Add a line to your `setOnMouseDragged()` event in the constructor of `DraggableTriangle` that calls `board.highlightNearestTriangle()` with the location of your draggable triangle as arguments. You should now find that as you drag your red triangle around, the triangle nearest it is highlighted green.

    ![alt board](assets/lab7b.png)

10. **Snap to nearest triangle**

    Finally, make your draggable triangle snap to the nearest triangle. To do this, add a handler for mouse release (use `setOnMouseReleased()`, just like you did for `setOnMousePressed()` and `setOnMouseDragged()`). In that code, find the nearest triangle to your draggable triangle, and then make the location and orientation of the draggable triangle be the same as that of the nearest triangle (using `setRotate()`, `getRotate()`, `setLayoutX()`, etc.).

11. **Finish off**

    Commit and push your work, close the relevant issue (#17), and notify your tutor.

## Work on your group assignment

Use any spare time to work on your group assignment.

