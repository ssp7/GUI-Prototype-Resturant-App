# GUI Prototype

In this assignment you will prepare a GUI prototype based off of the wireframe
you prepared in the previous assignment.

-   Assignment Due: October 24, 2019 at 9:30am
-   Peer Assessment Due: October 24, 2019 at 11:59pm

## Objectives

You will:

-   Gain limited familiarity with the JavaFX framework
-   Demonstrate prototyping an application GUI, given a wireframe
-   Gain additional experience using a version control system with multiple
    developers
-   Demonstrate formatting commit messages in accordance with accepted
    convention

## Instructions

This assignment is to be completed in assigned pairs; except as noted below,
**no collaboration other than with your assigned partner is permitted**.  One
of the purposes of pair-assignments is to practice teamwork. After completing
the assignment you will need to complete a peer assessment. Your contribution
grade will be based on the peer assessments and on the git history.

*Commit material that you worked on individually under your own name* using the
defaults that you set. *When (and only when) you commit material that was
developed using pair programming, override the default commit author to reflect
both authors* so that we can properly credit both authors for their contribution
grades. When you override the default commit author list both students' names,
and for the email address use a fake email address that is unique to the pair
of students by concatenating your Canvas login IDs (the angle brackets around
the email address are required):
```
git commit --author="Herbie Husker and Lil Red <hhusker20lred19@dev.null>"
```

### WARNING

It will be very tempting to decide to do some of this assignment during Fall
Break. Experience has shown that this rarely happens. For this reason, the
assignment is due  *Thursday* after the break instead of Wednesday. If you do
get some of it done during the break, that's fine, but don't plan on it
happening.

##  Setup

1.  You and your partner will work on a shared repository, which has been
    prepared for you.

    1.  Navigate to your shared directory
        (<https://git.unl.edu/csce_361/fall2019/21bpairNN/>, where *NN* is your
        team number).

    1.  Verify that the repository is private, and that you and your partner
        both have Maintainer access.

1.  Both students should:

    1.  Clone the project: `git clone <URL>` (here the angle brackets should
        not be included).

    1.  Import the project into your IDE. The project is set up as a Maven
        project, so you can follow your IDE's instructions to import a Maven
        project.

##  Assignment

1.  You only need to prepare a prototype based off of one wireframe. You and
    your partner should decide whose wireframe you will refine into a prototype.

    -   Place the pdf file of the selected prototype in the top-level directory
        of your shared repository.

1.  Using JavaFX Scene Builder, begin the GUI prototype that corresponds to the
    selected wireframe. You may make some deviations based on what you learned
    from the Human Performance Testing in-class activity, but it should
    recognizably be based on the wireframe.

    -   You may initiate Scene Builder from your IDE, or you may launch Scene
        Builder's stand-alone application.

    -   You may find the
        [JavaFX Scene Builder tutorial](https://git.unl.edu/csce_361/examples/javafx-scenebuilder-examples) useful in preparing the GUI, including
        navigation between screens.

    -   You may also consult other sources for JavaFX and/or Scene Builder
        help. If you find any of these useful, please post links to
        <https://piazza.com/class/jznjj4tj1d9796?cid=115>

    -   You may copy artwork from outside sources to include in your project if
        and only if you have the license to do so.  If the artwork is in the
        public domain or is licensed under a Creative Commons license then you
        likely do not need to take explicit action to obtain the license.  
        Otherwise, you probably will have to pay for the license (be sure that
        the license permits redistribution).  *Be sure to comply with the terms
        of the license, whether it's a Creative Commons license or a commercial
        license, and be sure to indicate the source in the deliverables*.

1.  Include enough Java code to navigate the GUI.

1.  You do NOT need to provide full functionality for your application. Because
    this is a prototype GUI, you should provide enough output for a scripted
    scenario. For example:

    -   When the user is placing their order, they should get the experience of
        placing an order; however, their inputs may be ignored.

    -   After placing the order, the application should provide the display
        appropriate to the scripted scenario, such as always displaying a
        hamburger, fries, and a drink on the order summary (regardless of what
        the user actually entered).

1.  If there is any artwork used in your GUI, edit `README.md` to indicate the
    sources. If you created original artwork, indicate this in `README.md`. If
    you downloaded artwork, indicate in `README.md` where you obtained the
    artwork and the nature of the license.

    -   You do *not* need to credit sources or cite licenses for emojis, as
        these are Unicode characters.

## Deliverables

For grading, after the assignment is due we will clone the repository that you
identified, and we will look for:

-   Wireframe pdf file
-   `.fxml` files and supporting `.java` files for GUI prototype
-   Artwork credit in `README.md` as needed

*It is your responsibility to ensure that your work is in the **correct
repository** and that we can access the repository at the **time the assignment
is due**.  We will grade what we can retrieve from the repository at the time
it is due.  Any work that is not in the correct repository, or that we cannot
access, will not be graded.*

## Assignment Rubric

The assignment is worth **20 points**:

-   **8 points** for having the visual elements / widgets shown in the
    wireframe
    -   As noted, deviation based off of HPT activity is acceptable, but the
        GUI prototype must be recognizably derived from the wireframe

-   **3 points** for the GUI prototype being navigable

-   **3 points** for the GUI prototype supporting a scripted scenario

-   **2 points** for making regular commits; *i.e.*, not waiting until the end
    of the project to make a massive commit.

-   **4 point** for meaningful and *well-formatted* commit messages.

-   **deduct 50%** if violating license for artwork.

-   ***Using another person's artwork without crediting the source will be
    treated as plagiarism.***


This assignment is scoped for a team of 2 students. If, despite your attempts
to engage your partner, your partner does not contribute to the assignment then
we will take that into account when grading.

*If **at any time** your repository is public or has internal visibility then
you will receive a 10% penalty. Further, if another student accesses your
non-private repository and copies your solution then I will assume that you are
complicit in their academic dishonesty.*


## Contribution Rubric

The contribution is worth **6 points**:

-   **1 point** for completing peer assessment
-   **5 points** for equitable contribution based on peer assessments
<!--
-   **0 points** for equitable contribution based on git history
-->
