package com.project;
import java.util.*;

public class rock_paper_scissor{

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

            //1. RANDOMIZED COMPUTER MOVE

            String[] availableMoves = {"Rock", "Paper", "Scissors"};

            String computerMove = availableMoves[new Random().nextInt(availableMoves.length)];

            System.out.println("Computer has chosen it's move.");
            System.out.println();
            System.out.println("Now it's your turn to choose. Good Luck!");
            System.out.println();

            //2. PLAYER MOVE

            //input
            String userMove;

            // loop until the user chooses the correct move
            while (true) {
                System.out.println("Please choose your move from these available moves : 'Rock' 'Paper' 'Scissors' ");
                System.out.println("Enter the move you chose : ");
                userMove = scn.nextLine();

                // checking if user's move is one of the available moves or not
                if (userMove.equals("Rock") || userMove.equals("Paper") || userMove.equals("Scissors")) {
                    System.out.println();
                    break;
                }

                // if user didn't enter a valid input
                System.out.println();
                System.out.println("Invalid Move!!");
                System.out.println("Please enter the move from the available moves only!");
                System.out.println();
            }

            //printing what computer chose
            System.out.println("Computer chose : " + computerMove);

            //3. COMPARING THE MOVES & DECIDING THE WINNER

            // checking for tie

            if (userMove.equals(computerMove)) {
                System.out.println("Its a tie!");
            }

            //checking for all other moves possible

            else if (userMove.equals("Rock")) {

                if (computerMove.equals("Paper")) {
                    System.out.println("Computer won!");
                    System.out.println("Better luck next time!");
                } else if (computerMove.equals("Scissors")) {
                    System.out.println("You won!");
                    System.out.println("Congratulations!");
                }
            } else if (userMove.equals("Paper")) {

                if (computerMove.equals("Rock")) {
                    System.out.println("You won!");
                    System.out.println("Congratulations!");
                } else if (computerMove.equals("Scissors")) {
                    System.out.println("Computer won!");
                    System.out.println("Better luck next time!");
                }
            } else if (userMove.equals("Scissors")) {

                if (computerMove.equals("Paper")) {
                    System.out.println("You won!");
                    System.out.println("Congratulations!");
                } else if (computerMove.equals("Rock")) {
                    System.out.println("Computer won!");
                    System.out.println("Better luck next time!");
                }
            }
        }
    }