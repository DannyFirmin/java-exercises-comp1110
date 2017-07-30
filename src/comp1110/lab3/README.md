# COMP1110 Lab 3

## Purpose

In this lab you will develop a very simple object-oriented Java program and will form
groups for the group assignment.

**It is essential that you complete this lab and have a tutor mark it off during the lab**.

## Tasks

1. **Create, debug and test the Point class.**

    This exercise develops the concept of an *object*.
    
    In the Java package `comp1110.lab3`, within your labs repo, create a new
    Java class, `Point`.  Instances of this class will represent a cartesian (xy)
    point.  When you create a new `Point` object, that new object will
    represent a single cartesian point.  In your object, both `x`
    and `y` should be stored as `doubles`.  Because `x` and `y` are distinct
    properties of *each object* (not properties of the class), they need to be
    declared as **instance** fields, not *class* fields.  This means you don't
    use a `static` qualifier when you declare the field.
    The `Point` class should have two public **instance** methods (not *static*
    methods). The first is
    `toString()`, which displays the point as a String
    (e.g. if x = 10.0 and y = 3.0 then it would return the String `(10.0, 3.0)`).
    The second, called `euc`, returns, as a double, the distance between the
    point represented by that instance, and the origin (i.e. the euclidian 
    distance to the origin, the distance between the point and (0.0, 0.0)).
    Implement the class `Point` with a main method that reads in two doubles
    (on separate lines), uses them to create a new `Point` object, calls the
    `euc` method, and then prints out the distance to the origin for the
    new object. Test your work using the provided `L3 PointTest` class.
    
    Commit all of your work to git, push, close the associated issue (#10), and
    show your tutor.

2. **Assignment Groups.**

    During today's lab you are required to form a group for the assignment.
    The group must be composed only of members of your lab group, and must have
    three members (because lab sizes are not necessarily multiples of three,
    your tutor may allow a maximum of two groups per lab to have have two members).
    A key element of this course is completion of this group project, so
    successful group formation is a very important step.
    
    Close the associated issue (#11) and inform your tutor of your group
    composition.
    

##  Preparing for lab test 2

Use any spare time you have to work on preparing for [lab test 2](https://cs.anu.edu.au/courses/comp1110/assessments/labtest2/)
and working on your group assignment.
