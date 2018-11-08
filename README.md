# SnakesAndLadders #
This is a Java 8 module that propose a solution for the **Feature 1**
of the the **Snakes and Ladders kata**.
http://agilekatas.co.uk/katas/SnakesAndLadders-Kata

### Development process ###
It's designed using outside-in classicist approach. Starting from BDD
examples I progressed creating unit tests (jUnit) and using mocks
(Mockito) to emulate collaborators behavior. I Followed the TDD cycle,
so at the end I have a set of tests, or examples, that make easy to
understand the expected game operation.

The only collaborator, a **Dice**, is injected as a parameters on the
**Game** class constructor.

To implement this exercise I used Git and a technique called 'micro
commits' to have enough granularity on every commit to let me read the
TDD cycle as it was developed.

I used Mockito to test the behaviour of the SUT (subject under test).
Specifically I used a different way of doing _Behaviour Verification_
called _Expected Behavior Specification_. I use this approach when I
know exactly which behavior I'm expecting.

### Design ###
The entry point is the **Game** class that has two main public methods:
one to move our Token through the board and another to know if the game
has finished.

The **Game** class let the player roll a dice to know how many spaces
will the token be moved on. That **Dice** class is an Interface, so the
final implementation to be used is injected.

### Assumptions ###
During the development, and just to implement this first feature, I
assumed the following assumptions:

* Since the beginning, the **Game** is ready to play, so it's not
necessary any other procedure to place the token on the board.
* There is, at this point, only one player.
* There is, as well, just one token per player.
* The game will finish **only** when the token reach the last square of
the board. This meaning position 100. Otherwise the game will remain
open.
* If we try to move the token beyond the board size, the token will
stay on the same position. It wont bounce nor reach the last square
position discarding the remaining spaces.
* Code style will follow IntelliJ default settings.

### Possible improvements ###
Some improvements that could be made:

* Instead of using the matcher library Hamcrest, I think that the tests
could gain more expressiveness using AsertJ.


## Build and test execution ##
The **SnakesAndLadders** module is based on a Maven 2 quickstart
archetype and follows Maven philosophy: convention over configuration.

For the execution of the tests you should have installed:

* Java SE 8. For security reasons always use, preferable, last version.
* Maven 3.x

_Note: All commands are suppose to be executed from inside project
folder._

### Compile ###
For a fresh compile of the module we will use this command:

> mvn clean compile


### Run the unit tests ###
We can run the unit tests executing the following command:

> mvn test
