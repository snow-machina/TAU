package chapter4;
/*
The objective of this game is to travel the entire game board of 20 spaces within 5 die rolls.

* Roll the die for the user (generate a Random number between 1 – 6) and advance the user that number of spaces on the game board.
Here’s the code to do this ((import is java.util.Random):

* After each roll, tell the user which game space they are on and how many more spaces they have to go to win.

* Repeat this 4 additional times, for 5 rolls in total.

* However, if the user gets to 20 before 5 rolls, end the game - they’ve won.

* If they are greater than or less than 20 spaces exactly, they lose.

* Remember there are only 20 spaces on the board, so a message like “You advanced to space 22” is a bug.
 */

import java.util.Random;

public class DiceGame {

    public static void main(String args[]){

        int allowedSpace = 20;
        int allowedRoll = 5;

        int spaces = 0;
           for (int i=0; i<allowedRoll; i++){
               Random random = new Random();
               int die = random.nextInt(6) + 1;
               System.out.println("You roll " + die + ".");
               spaces = spaces + die;

               if(spaces == allowedSpace){
                   System.out.println("You advanced to space " + spaces +  ". You won!");
                   break;
               }
               else if (spaces > allowedSpace)
               {
                   System.out.println("Oops, you passed the finish line by " + (spaces-allowedSpace) + ".");
                   break;
               } else
               {
                   if(i<4) {
                           System.out.println("You advanced to space " + spaces + ". You need to advance " + (allowedSpace - spaces) + " spaces more.");
                       } else
                       {
                           System.out.println("You advanced to space " + spaces + ". You have no more rolls." );
                       }
               }

               }

               if(spaces != allowedSpace){
                   System.out.println("You lost. Try again.");
               }

    }
}
