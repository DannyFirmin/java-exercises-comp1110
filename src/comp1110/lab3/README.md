# COMP1110 Lab 3

## Purpose

In this lab you will develop a very simple object-oriented Java program and will form
groups for the group assignment.

**It is essential that you complete this lab and have a tutor mark it off during the lab**.

Remember to [pull from upstream](https://gitlab.cecs.anu.edu.au/comp1110/comp1110-labs/blob/master/src/comp1110/lab2/README.md#gitlab-task) before beginning this lab.

## Tasks

1. **Create, debug and test the Bucket class.**

    This exercise develops the concept of an *object*.
    
    In the Java package `comp1110.lab3`, within your labs repo, create a new
    Java class, `Bucket`.  Instances of this class will represent a bucket
    that can be filled with water.  When you create a new `Bucket` object, that new object will
    represent a bucket with a particular capacity, `capacity` and certain contents, `contents`.
    The units of measurement are not important to this exercise, but you could imagine
    that it was litres.
    
    The constructor for a Bucket should take the capacity as an argument.   The constructor's
    signature should thus be `Bucket(double capacity)`.
    
    In your object, both `capacity`
    and `contents` should be stored as `doubles`.  Because `capacity` and `contents` are distinct
    properties of *each object* (not properties of the class), they need to be
    declared as **instance** fields, not *class* fields.  This means you don't
    use a `static` qualifier when you declare the field.   The `capacity` field will never
    change (the capacity of a bucket is something that does not (normally) change), so it
    can be declared as `final`.   Both fields should be private to the `Bucket` class.
    
    The `Bucket` class should have four public **instance** methods (not *static*
    methods). 
    
    The first is `getCapacity()`, which returns a double reflecting the capacity of the bucket.
    The second is `getContents()`, which returns a double reflecting the current contents of the bucket.
    The third is `empty()`, which will empty the bucket (its contents will then be zero), and will
    return the contents of the bucket before it was empty (i.e. how much was emptied from the bucket).
    The fourth is `add(double amount)`, which will add the given amount to the bucket, and increase
    the contents accordingly, but it will never increase the contents to be more than the capacity
    (i.e. any extra water will be spilled, so the total contents can never be higher than the capacity).
    The `add` method does not return a value, therefore the return type is `void`.
    
    You should create a main method, and in that method, declare two local variables:
    `big` and `small`, both of type `Bucket`.   Initialize `big` by 
    instantiating a new bucket with capacity 10.0.   Initialize `small` by instantiating
    a new bucket with capacity 1.0.  Use the `add()` method to add 20.0 to each bucket
    then print out the bucket contents using `getContents()`.  You should find that 
    both buckets are full to capacity, but not more.   Then use `empty()` to empty
    the `big` bucket and  print out the bucket's contents, and ensure that it
    is in fact empty.   Then empty the `small` bucket into the `big` bucket.  Print
    out the contents of each of them and ensure that the `small` bucket is empty
    and the `big` bucket has 1.0 in it.
    
    Test your work using the provided `L3 BucketTest` class.
    
    Commit all of your work to git, push, close the associated issue (#10), and
    show your tutor.

2. **Assignment Groups.**

    During today's lab you will be assigned a group for the assignment.
    The group will be composed only of members of your lab group, and may have
    two or three members (because lab sizes are not necessarily multiples of 
    three, we may allow a maximum of two groups per lab to have two members).
    A key element of this course is completion of this group project, so
    successful planning with your group is a very important step.

    Meet with your group to discuss expectations and responsibilities for the
    assignment. Some suggested points for discussion:

    - What do you want to achieve in this assignment?
    - How will you communicate between group members?
    - Will you meet regularly to discuss your work?
    - What commitments can each member make today?

    One *and only one* member of your group should fork the [assignment 
    repository](https://gitlab.cecs.anu.edu.au/comp1110/comp1110-ass2) for
    all members of the group to use.
    Let your tutor know who forked the repository.
    
    Close the associated issue (#11) and inform your tutor of your group
    composition.
    

##  Preparing for lab test 2

Use any spare time you have to work on your homework exercises, preparing for [lab test 2](https://cs.anu.edu.au/courses/comp1110/assessments/labtest2/)
and working on your group assignment.
