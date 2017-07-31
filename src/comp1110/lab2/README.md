# COMP1110 Lab 2

## Purpose

In this lab you will learn a little more about GitLab before you write,
test, and debug some small, *imperative* Java programs.   

All of the exercises are done with your labs
repo, and the Java exercises are done in IntelliJ.   You may work on your own
computer, but you will need to share your
work with your tutor and discuss it with them in your lab.

**It is essential that you complete this lab and have a tutor mark it off during the lab**.

## GitLab Task

1.  **Pulling upstream commits in GitLab**

	Remember that your labs and assignment repos are *forks*; your own variation
	of some other repo.   Once you've made the fork, your repo is independent
	and won't see any subsequent changes to the repo from which your fork was
	taken.

	Sometimes it is valuable to be able to pull changes from the repo from which
	you originally forked, and apply those changes to your repo.   In the case
	of our class, this is true if the master repo is updated with corrections
	or improvements.  In such cases, it would be good if you could relatively
	easily merge those changes into your own repo.   In this lab exercise you
	will learn how to do that.

	The [terminology](http://stackoverflow.com/questions/2739376/definition-of-downstream-and-upstream)
	of an *upstream* repo is often used to refer to the one from which a repo
	is derived.   In your case, the *upstream* repo is the one from which your
	repo was forked (one created by your lecturer).  Git has [advanced](https://git-scm.com/book/en/v2/Git-Basics-Working-with-Remotes)
	mechanisms for pulling changes from an upstream repo; we'll just look at
	something quite specific in this lab.

	You should compete the following exercise.   In these steps you will update
	your *personal* comp1110-labs repo with some changes.

	1. Open your comp1110-labs repo in IntelliJ.
	2. Select VCS -> Git -> Remotes...
	3. Select the "+" button to add the comp1110 labs repo as a remote upstream repo
	(Name: `upstream` URL:`https://gitlab.cecs.anu.edu.au/comp1110/comp1110-labs.git`). Select OK.
	4. Prepare to pull changes (VCS -> Git -> Pull...).
	5. Use the drop-down menu to change the 'Remote' to be
	`upstream(https://gitlab.cecs.anu.edu.au/comp1110/comp1110-labs.git)`.
	6. Refresh the list of branches by clicking the refresh button to the right of the dropdown.
	7. Select the `upstream/master` branch.
	8. Click `Pull`.  This should behave just like a merge from your last lab
	exercise, and work without further interaction.   If not, you may need to
	merge, in which case you should consult your tutor if you're unsure what
	to do.
	9. Bring up the `Version Control` panel at the bottom of your IntelliJ
	window, and select `Log`, and notice that you now have new changes in your history.
	10. `Push` your merge.

After you pull remote commits into your repo, commit, and push them, they will
be visible to all clones of your repo.   Go to the GitLab web page for your labs
repo, and use the `Commits` and `Network` menu options (on the left menu) to
see how the changes you pulled have been integrated into your own repo.
 
You can also pull your changes into other clones of your labs repo (such as on your
home computer) using the process described above.

Once you have completed this task, close the associated issue (#8) with a
suitable comment.

You can **repeat the above exercise for the homework and assignment repos**.  The
steps are the same, but you need to change the repo name (in the obvious way)
in steps 1, 3, and 5 (using `comp1110-homework` and `comp1110-ass1` respectively, instead
of `comp1110-labs`).

## Imperative Coding Tasks

The following programming tasks exercise simple *imperative* programming,
demonstrating **sequence**, **selection**, and **repetition**.  We will start
*object-oriented* programming in the next lab.

1. **Countries**

    Inside the package `comp1110.lab2` make a new class `Countries`. Inside your
    new class create an array of `String`s that has the names of the following
    countries: Germany, Argentina, Netherlands, Brazil. Print out the elements
    of the array on separate lines (you do not need to use a loop for this,
    just use fixed indices into the array).
    
    Test your program using the `L2 Countries` test.

2. **Reverse**

    Make a new class `Reverse` within the `comp1110.lab2` package and using a
    `while` loop, write a program that prints (on separate lines) the numbers
    between and including 10 and 30 in reverse order. i.e. the program should
    print on separate lines: 30 29 28 ... 10.
    
    Test your program using the `L2 Reverse` test.

3. **Triangle**

    Create a class `Triangle` within the `comp1110.lab2` package, that draws
    simple triangles using ASCII characters and prints to standard output. The
    program should read in from the console an integer which represents the
    height (in characters) of the triangle. Use the `*` character to draw the
    resulting triangle. The first line should have one`*`, the second will have
    a `*` followed by one space, followed by a `*`, the third will have three
    spaces, the fourth will have five, etc. The last line will have (height x 2) - 1
    `*`'s. For example, for an input of 5, the output might look like this
    (here a '_' is drawn to represent a space character):
```
____*
___*_*
__*___*
_*_____*
*********
```
Test your program using the `L2 TriangleTest` test.

4. **Commit and push your work**

    Commit your changes locally (navigate through `VCS` and select `Commit changes...` (*or* press `Ctrl + K`). Write a commit message that says: `Done with Lab 2!`. Leave everything else to its defaults.

    Push your changes, which will allow your tutor to see them (`VCS` -> `Git` -> `Push` (*or* `Crl + Shift + K`).

    Close the associated issue (#9) with a suitable comment.
    
## Prepare for the lab test

If you finish early, use any spare time you have to do further preparation
for [lab test 1](https://cs.anu.edu.au/courses/comp1110/assessments/labtest1/). You are encouraged to ask your tutor
for help in understanding how to complete any of those questions.
