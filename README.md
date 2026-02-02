# CS370-Lab-2-Team-7 
# Description: this repo contains the source code for CS 370's Lab 2
# Prompt: make a tic-tac-toe game for two human beings
# Due date: feb 2nd, 2026

Problems:
A.	[40 points] Java Exercise 
(Tic-Tac-Toe) Create a class TicTacToe that will enable you to play game Tic-Tac-Toe. 
 
•	The class contains a private 3-by-3 two-dimensional array for representing board elements. 
•	Use an enumeration to represent the status of the final game result. The enumeration’s constants should be named WIN, DRAW, and CONTINUE. 
•	Allow two human players. Whenever the first player moves, place an X in the specified square, and place an O wherever the second player moves. 
•	Each move must be to an empty square. After each move, determine whether the game has been won and whether it’s a draw. 

Sample Output

……
 _______________________ 
|       |       |       |
|   X   |   O   |   	|
|_______|_______|_______|
|       |       |       |
|	  |   X   |		|
|_______|_______|_______|
|       |       |       |
|	  |       |		|
|_______|_______|_______|
Player O's turn.
Player O: Enter row ( 0, 1 or 2 ): 1
Player O: Enter column ( 0, 1 or 2 ): 2

 _______________________ 
|       |       |       |
|   X   |   O   |   	|
|_______|_______|_______|
|       |       |       |
|	  |   X   |	  O	|
|_______|_______|_______|
|       |       |       |
|	  |       |		|
|_______|_______|_______|

Player X's turn.
Player X: Enter row ( 0, 1 or 2 ): 2
Player X: Enter column ( 0, 1 or 2 ): 2

 _______________________ 
|       |       |       |
|   X   |   O   |   	|
|_______|_______|_______|
|       |       |       |
|	  |   X   |	  O	|
|_______|_______|_______|
|       |       |       |
|	  |       |	  X	|
|_______|_______|_______|

Player X wins.