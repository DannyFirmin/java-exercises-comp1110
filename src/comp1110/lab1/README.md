# COMP1110 Lab 1

## Purpose

The first lab is intended to ensure that you have become familiar with the basic tools we will be using throughout the semester in the labs at ANU and on your own computer (if you plan to use one).

**It is essential that you complete this lab and have a tutor mark each of the
three deliverables off:**
1. Your pledge of academic integrity.
2. Completion of the HelloWorld example on the lab computer.
3. Completion of the HelloWorld example on your laptop.

We want you to do this **now**, in week one, so that you can focus on course content from the first day of week two rather than be distracted by concerns over how the tools work.   This is your chance to get yourself established and familiar with the tools with the assistance of the course tutors.  Please make the most of the opportunity.

I have created a step-by-step [video](https://cs.anu.edu.au/courses/comp1110/help/mp4/lab1.mp4) showing you how to complete this lab in the lab environment.

## Tasks

### **Set up GitLab**
1. **Set up your GitLab account.**

    You will use GitLab throughout the semester to manage all of your coursework.

    First you need to set up your GitLab account.  Log in to a lab computer,
    open a browser, and go to GitLab http://gitlab.cecs.anu.edu.au (ensure that
    you remember the .cecs. in the URL).   Log in to GitLab using the LDAP tab
    of the Sign in section of the front page.   You should type your student
    ID and your normal password.

    Go to Profile Settings, which is accessible via a gear icon at top right.
    Feel free to update your GitLab personal profile if you wish.

    This completes your GitLab setup.
2.  **Fork the comp1110 labs repository.**

    In GitLab jargon, to [fork](http://docs.gitlab.com/ee/gitlab-basics/fork-project.html)
    a repository means to create a fresh copy of the repo where the copy will be owned
    by you.   The class has its own labs repo which serves as a template for
    yours.   You and every other student will fork the class labs repo to create
    your own.  You  can't commit changes to the class repo (only the lecturer
    can do that), but you can commit changes to your own forked repo.

    To fork the repo, go to the GitLab page for the labs repo: https://gitlab.cecs.anu.edu.au/comp1110/comp1110-labs.
    Notice that when you go to that page, the name of the repo at upper left is
    `comp1110 / comp1110-labs`.  This tells you that the owner of this repo is 
    `comp1110` (before the `/`), and that among their repos this one is called
    `comp1110-labs` (after the `/`).

    Now click  `Fork`  (upper center-left).   You may have to select which GitLab
    account to use; select your account.
    
    You now have your own copy ('clone') of the
    labs repo.  Notice that the name at top left will have changed to reflect
    that you own this new repo.   It should now say something like
    `Your Name/comp1110-labs`.  Text below will remind you of where this new 
    repo came from (*"Forked from comp1110-labs"*).
    You will use this clone of the class repo to complete the remainder of your labs (not just this
    week).   Unlike the class repo, this one is yours; you can make changes to
    it.    So far, however, your repo exists only on GitLab (i.e. *in 'the
    cloud'*).

    Soon you will be making a working copy (clone) that you can edit on the lab
    computer.   Later you can do the same on your own computer.   *Although you
    might have multiple clones of your repo on different devices, the*
    **definitive** *version always resides on GitLab, in the cloud.*
    
    At the end of this lab, you can repeat this process for the [homework](https://gitlab.cecs.anu.edu.au/comp1110/comp1110-homework)
and [assignment 1](https://gitlab.cecs.anu.edu.au/comp1110/comp1110-ass1) repos.
    
3.  **Find this document within your labs repo.**

    At this point in the lab you should see `Your Name/comp1110-labs` at top
    left of your GitLab page in your browser. 
    If not, you can navigate there via the navigation menu at the top left
    (three dark grey horizontal lines).
    To find your project, *either* use the navigation menu and click on 
    `Projects`, which will bring up a projects page, or else click on your
    avatar at the top right of the page, select `Profile`, and then select the
    `Personal projects` tab.
    
    Once you can see `Your Name/comp1110-labs` at the top left, you can click
    the `Repository` tab at top center of the page, and then the `Files` tab in
    the `comp1110-labs` project's repository view.
    Then you can navigate to your own version of *this* document within GitLab.
    Navigate through `src/comp1110`, and then to `lab1`.  The files inside
    `lab1` should be shown at the top, followed by your own copy of this document.
    If you're in any doubt about whose version of the document you're looking at,
    check the banner at the top and you should see your name.   You can also
    check the URL in the navigation bar of your browser and it should be
    something like: `https://gitlab.cecs.anu.edu.au/u1234567/comp1110-labs/tree/master/src/comp1110/lab1`.
4. **Find Open Issues**
 
    One of the items in your navigation menu (the three horizontal bars
    at top left) is **Issues**.   To the right of the word 'Issues' is a number
    which indicates the number of issues assigned to you that are currently 
    open (this should be '0' right now).  If you navigate to your clone of the
    comp1110-labs repo (you'll see `Your Name/comp1110-labs` at the upper top
    left), you should see a menu across the top that starts with the word
    'Project'.  Navigate to 'Issues', and you should see a list of all the 
    issues associated with this project/repo.  Issue #1 refers to the
    task you're doing now.  Throughout the semester
    we'll use issues to help assign and track work.  These issues are 'unassigned' 
    (no one is yet responsible for them).   You now need to assign them all
    to yourself (these are the lab tasks you'll do throughout semester).  To
    do this, click the little checkbox at the top left of the table of issues,
    which should have the effect of selecting *all* of the issues.   Once
    you have done that, use the pull-down menu 'Assignee' to assign the issues
    to yourself.   You should now see this reflected in the number of open
    issues in your navigation menu.  You are welcome (and encouraged) to make
    use of issues to track your own work and milestones, and once you start
    your group project, you may use issues to assign tasks among your team.
    You can now follow along with this lab exercise either by continuing to read
    on the web page, or by working through the issues (which point to the same
    info).
    
### **Pledge of Academic Integrity.**

Before doing anything more, check again that you are reading this from your
own fork of the labs (you will see `Your Name/comp1110-labs` at top left of
your GitLab page in your browser).   If not, repeat the step above, or ask
for help.
    
Now follow [this link](Integrity.md) to the pledge of academic integrity. You 
will now need to edit the file with your name, University ID, and date.
    
Click on the `Edit` tab to the top right of the document.  Go to the bottom
of the document and replace `<your name>` with your name, `<your uid>` with your
UID, and replace
`<today's date>` with the date.  Then scroll to the bottom and type a
commit message, such as 'Added my name', then commit the changes.
    
Print the pledge, sign it, and **hand it in to your tutor**.

*NOTE: Due to a bug in the current version of GitLab, you may have difficulty
printing the file.  Try using your mouse to select the text in the file, and
then right-click your mouse and select print.   If that does not work, please
ask your tutor for a pre-printed copy of the file, and fill the blanks in by
hand.*

### **Set up IntelliJ (lab)**
1.  **Start and Configure IntelliJ**

    Use the menu at top left on the lab machine, and find IntelliJ under the
    `Programming` sub-menu.

    If this is the first time you have started IntelliJ on the lab machines,
    there a few once-only steps occur behind the scenes which may make the
    startup a little slow.

    You should now see a splash screen titled `Welcome to IntelliJ IDEA`.

    In the next step you will use this splash screen to clone your labs repo.
2. **Clone your labs repo.**

    In task #1, you browsed your own repo in your browser, using the GitLab
    web interface.   Now you will make your own local *clone* (copy) of your
    repo, using IntelliJ.   You can have multiple clones/copies (for example, one on
    your ANU account, and one on your laptop), but the definitive version is
    *always* the one in GitLab, so to keep everything synchronized, after editing
    your local version you always need to *push* your changes back to your remote
    repo (which is on GitLab, in 'the clound') and conversly  you need to pull
    changes from  your remote repo
    (on GitLab), before you start work on a different clone of the repo.
    
    Select `Git` from the drop-down menu `Check out from Version Control` on the
    initial IntelliJ splash screen.  Use your browser to navigate to your GitLab
    project page and find the URL of your repo.   When you're on the correct
    GitLab page, you should have the lab repo name at the top left
    (`Your Name/comp1110-labs`).   Click on the project icon at top left of your
    GitLab page.  You should see the address of your repo.   Click `HTTPS` to
    see the http form of the address.  It will be something like
    `https://gitlab.cecs.anu.edu.au/u1234567/comp1110-labs.git`
    (you can [configure IntelliJ](https://www.jetbrains.com/idea/help/using-git-integration.html)
    to use ssh rather than https, but that is optional and outside the scope of
    this lab).  Select that text and copy it into the IntelliJ dialogue.
    Click `Test` to verify that you are correctly set up.    If the test fails,
    carefully check that you've copied the URL correctly, and that you've
    selected `HTTPS` on drop-down tab next to the URL on the GitLab page.
    You may see a warning message in the IntelliJ dialogue that tells you that
    `The parent path /students/u1234567/IdeaProjects must exist.`   To fix this,
    click the little ellipsis (...) below the `Test` button.  Press `Alt+Insert`
    to create a new folder in your home directory.   Name it `IdeaProjects`
    and click OK.   The error message should go away allowing you to clone the
    repo.   Press `Clone`.   You will be prompted for your username and password
    and a checkbox will ask if you would like the password to be remembered.
    IntelliJ will also ask whether you wish to [set up a master password](https://www.jetbrains.com/idea/help/handling-passwords-for-git-remote-repositories.html#d686468e18637).
    The choice is yours but having IntelliJ remember the password and protect it
    with a master password is convenient and secure.  You will now see a
    `Tip of the Day` from IntelliJ.   You may find it helpful to read these tips
    as you learn more about IntelliJ.
        
    IntelliJ may take a minute or so to initialize.  Check the bottom status
    bar; if it says *"Indexing..."*, you should wait until that is complete before
    proceeding with the rest of the lab.

3. **Complete initial setup of the IntelliJ environment.**

    Press `Alt+1` to open the comp1110-labs project (if it is not already open).
    You should see `L1 HelloWorldTest` next to a green arrow at the top right of your
    IntelliJ window.   If you press the green arrow while `L1 HelloWorldTest` is selected
    in the drop-down, then IntelliJ will run a set of tests for Lab1.   Click the
    green arrow, and you should now see a
     message:  `java.lang.NoClassDefFoundError: comp1110/lab1/HelloWorld`.
    This means you've not yet created the code that IntelliJ is trying to test.
    That's OK.  The
    next task solves this problem.

### Create a simple class (lab)

Do the following task in the lab, on a lab computer.

* **Add a new class**. Navigate to the blue `src` folder.   Continue to navigate
    to `comp1110` and `lab1`.  Inside that folder you'll see `README.md`, which is a copy of
    this file, the lab instructions.  While the `lab1` folder is selected,
    right-click and select `New...` and the choose `Java class`.   Name the class
    `HelloWorld` (be sure to be precise about the naming of the class, including
    the upper case `W`).   You will be asked whether you would like to add the
    class to Git.   Say `Yes`.
    
    You should now see a very simple piece of code.  Click your mouse to the left
    of the closing brace (`}`), which is just below the word `public`.  Type the
    letters `psvm` and you should find an IntelliJ dialogue that recognises this
    as a shortcut for a main() method declaration.   If you press enter you should
    find new text appears, with your cursor below the newly added word `public`.
    This is the main method for your new class; the code that will be run by
    default when your class is executed.   Right now the method is empty, so it
    will do nothing.

* Now **add code to print out `Hi`**.  Type `sout`, which is another IntelliJ
shortcut, this time for producing code for printing strings.   Press enter
to generate the code `System.out.println()`.  This will print a new line
containing what is between the brackets (nothing!).   Move your cursor between
the brackets and add the word `"Hi"` (include the quotes).   Save your file (either via the `File`
menu or with `Ctr+S`). Now use the `Run` menu and select `Run...`.   Choose
`HelloWorld`.  Your little program should now run.   You should see a new
sub-window with the word `Hi` in black text.

* Now **test your program** by choosing `L1 HelloWorldTest` from the dropdown menu next to
the green arrow at the top of the screen towards the right.   Look carefully
at the output below.   It should state that it has `Done: 6 of 6` and
`Failed: 6`, and there will be a bar of red to the left.  Look more carefully
at the brownish text below and you'll discover what's wrong with your code.
 Change your program
so that it prints `Hello`.  Re-run the test and you should find that you
failed fewer tests.   Try again with `Hello world`, and then finally with
`Hello world!`.  You should pass all tests.   Notice that the testing is
*very* pedantic.  You need to have the correct number of spaces, correct
punctuation, correct case, etc.

To finish in the lab with the lab computer, you need to commit and push your
work and then close the associated issues.

1.  Once you have completed your work on  the lab computer, you should commit
    your new HelloWorld class and push it to GitLab.  Use the `VCS` menu
    (Version Control Systems) to find  `Git`, `Commit File..`.  You should see
    your HelloWorld file highlighted.   Type in a commit message, such as
    `Finished HelloWorld and passed all tests!`.  Click `Commit`.   Committing
    will commit all of the changes you've made as a single change, but will
    *not* propagate those changes back to GitLab or any other repo.  For your
    changes to be visible on GitLab or on clones on other devices, you need to
    first *commit*, and then *push* your changes.  Ignore the warning, and
    click `Commit` on the next dialogue.  Select `Commit and Push`.   You should
    see a small notification stating that the Push was successful.   Now go to
    your GitLab page.  Click the `Commits` tab and you should see your commit
    has shown up on GitLab.   This means that the change you made in IntelliJ
    has been committed and propagated into GitLab.  You can now see that change
    on other devices when you clone and pull from GitLab.
2. You can now close each of the Issues (tasks) that you've completed.  Go to
   your GitLab web page, in the navigation menu click on `Issues`.
   For each of the issues you've competed, click on the issue, assign it to 
   yourself (meaning that you did it) and then close
   the issue, writing a brief message to indicate that you've finished it
   (eg *"All done, completed without any problems"*).  If you don't see any
   issues, go [back](#set-up-gitlab) to the first task and check that you
   *assigned* the issues to yourself correctly.   If you did not, they won't
   show up as issues in your navigation bar.  By default GitLab only
   shows *open* issues, so once you've closed them, they'll disappear.   However,
   you can list *all* issues or the *closed* ones by selecting the appropriate
   tab.

### Set up IntelliJ (home)

You now need to configure your home computer/laptop.  **Before you start**, you
must have [set up the software for your home computer](https://cs.anu.edu.au/courses/comp1110/help/05-working-remotely/).

Once you have the software installed, you will need to
carefully repeat the [process from the start of this lab](#set-up-intellij-lab)
of:
1. setting up IntelliJ, and
2. cloning your labs repo,

just as you did in the lab environment, but this time on your *own computer*.
The only major difference will be
that when you clone your labs repo this time, you will see the HelloWorld
class you created at the start of the lab.

### Modify HelloWorld (home)

1. In IntelliJ on your own computer, go to your comp1110-labs project, and
navigate to HelloWorld.
2. Check that HelloWorld runs correctly (use the Run menu), and that it passes
the HelloWorld test, using the `L1 HelloWorldTest` option from the Run menu, just as it
did in the [earlier exercise](#create-a-simple-class-lab).
3. Modify HelloWorld so that it prints out `Goodbye World`.  Confirm that it 
does *not* pass the tests any longer.
4. Commit your change.  Use a commit message such as "Broke program".
5. Fix your program so that it works correctly.
6. Commit your change.  Use a commit message such as "Fixed program".
7. Be sure to *push* your commits if you have not already done so (`VCS`, `Git`,
`...Push`) in IntelliJ.

### Have your lab marked

Once you have completed the tasks for the lab, approach your tutor to have them
marked off.  Be sure to show them:
* Your signed pledge (give this to them now if you have not already)
* Your work on the lab machine
* Your work on your laptop (they will want to see the Git log that shows your work).
   
### Accessing homework and assignment repos

You should fork and clone the [homework](https://gitlab.cecs.anu.edu.au/comp1110/comp1110-homework)
and [assignment 1](https://gitlab.cecs.anu.edu.au/comp1110/comp1110-ass1) repos
in exactly the same way as you have for the labs repo, above.