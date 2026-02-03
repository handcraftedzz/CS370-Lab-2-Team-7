import java.util.Scanner;

public class TicTacToe
{

    //(name of the variable): data type = data
    //BOARDSIZE: int = 3
    //status {WIN, DRAW, CONTINUE} : enum
    //board [][] : char
    //firstPlayer : bool
    //gameOver : bool
    //play() 
    //printStatus(in player : int) 
    //gameStatus() : Status
    //h
    //printBoard()
    //printSymbol(in column : int, in value : char)
    //validMove(in row: int, in column: int ) bool
    final int BOARDSIZE = 3; ///const

    public enum Status {    
        WIN,
        DRAW,
        CONTINUE
    }

    char[][] board = new char[BOARDSIZE][BOARDSIZE];

    boolean firstPlayer = false; //what w

    boolean gameOver = false;
 
  
    public void play() // this member function will be running the game
    //make sure the values are ready for the users of the game to use;
    {
        Status gStatus = Status.CONTINUE;

        System.out.println(".....");
   
        Scanner RowColumn = new Scanner(System.in); //change instance name to scanner
    

        while (gStatus == Status.CONTINUE) //this will change to status later, 
        //make a while loop and make sure status aint win, tie , nor loss
        ///i might use a while loop instead
        {
            boolean invalidInput = true;

            this.printBoard();

            int playerX = 1;
            int playerY = 2; //maybe these can be const at the top of TTT class
            //check to see who's turn it is, i might change this to be in the beginning of for loop
            if (firstPlayer == false)
            {
                this.printStatus(playerX);

                while (invalidInput == true) //maybe while u don't get invalid string and u don't get invalid int (will x < 0 ) throw an error
                //this var should be called invalidString
                {
                    //NumberFormatException e;
                    try {
                        System.out.print("Player X: Enter row ( 0, 1 or 2 ) : ");
                        String xRow = RowColumn.nextLine();
                        System.out.print("Player X: Enter column ( 0, 1 or 2 ) : ");
                        String xColumn = RowColumn.nextLine();
                        int ROWWW = Integer.parseInt(xRow);
                        int COLUMNN = Integer.parseInt(xColumn);
                        //System.out.println(ROWWW);

                        //check to see it's not less than the first row nor greater than the last row. same process for column

                        if (ROWWW < 0 || ROWWW >= BOARDSIZE || COLUMNN < 0 || COLUMNN >= BOARDSIZE)
                        {
                            System.out.println("An out of bounds index(s), need valid ints within the range. Try again.");
                            continue;
                        }   

                        // i need to have something with valid move here called

                        if (validMove(ROWWW,COLUMNN) == false)
                        {
                            System.out.println("Current spot is taken, try again.");
                            continue;
                        }

                        board[ROWWW][COLUMNN] = 'X';
                        firstPlayer = !firstPlayer;
                        invalidInput = false;
                        gStatus = gameStatus();

                    } catch (NumberFormatException e) {
                        if (e.getMessage().substring(0,16).equals("For input string"))
                       {
                            System.out.println("Please, try to give an integer.");
                            continue;
                       }
                       else
                       {
                             System.out.println("Please enter a number within the bounds! Try again.");
                       }
                    }
                }

               // printBoard();
                //i have to close the scanner once done but let's see if i should
                //only close it once the program ends, not in the game loop.
            }
            else
            {
               // this.printStatus(playerY);

               this.printStatus(playerY);

                while (invalidInput == true) //maybe while u don't get invalid string and u don't get invalid int (will x < 0 ) throw an error
                //this var should be called invalidString
                {
                    //NumberFormatException e;
                    try {
                        System.out.print("Player O: Enter row ( 0, 1 or 2 ) : ");
                        String xRow = RowColumn.nextLine();
                        System.out.print("Player O: Enter column ( 0, 1 or 2 ) : ");
                        String xColumn = RowColumn.nextLine();
                        int ROWWW = Integer.parseInt(xRow);
                        int COLUMNN = Integer.parseInt(xColumn);
                        //System.out.println(ROWWW);

                        //check to see it's not less than the first row nor greater than the last row. same process for column

                        if (ROWWW < 0 || ROWWW >= BOARDSIZE || COLUMNN < 0 || COLUMNN >= BOARDSIZE)
                        {
                            System.out.println("An out of bounds index(s), need valid ints within the range. Try again.");
                            continue;
                        }   

                        // i need to have something with valid move here called

                        if (validMove(ROWWW,COLUMNN) == false)
                        {
                            System.out.println("Current spot is taken, try again.");
                            continue;
                        }

                 
                        board[ROWWW][COLUMNN]= 'O';
                        firstPlayer = !firstPlayer;
                        invalidInput = false;
                        gStatus = gameStatus();
                    

                    } catch (NumberFormatException e) {
                        if (e.getMessage().substring(0,16).equals("For input string"))
                       {
                            System.out.println("Please, try to give an integer.");
                            continue;
                       }
                       else
                       {
                             System.out.println("Please enter a number within the bounds! Try again.");
                       }
                    }
                }

               // printBoard();


                //now u call valid move
            }
         
        if (gStatus == Status.WIN)
            {
            if (firstPlayer == true)
                {
                    System.out.println("Player X is the winner!");
                }
                else
                {
                    System.out.println("Player O is the winner!");
                }
             }

            else if (gStatus == Status.DRAW)
            {   
                System.out.println("DRAW!");
            }          
            //ask for input now, 
            ///Scanner hisRow = new Scanner(System.in);

               // //now u call valid move
                             //////boolean ress = this.validMove(1,4);
        }

        ///this.printBoard();
        printBoard();
        RowColumn.close();
    }

    public void printStatus(int inPlayer) //inPlayer : int 
    //i think inPlayer refers to which player is occupying which square 
    //in the possible places where a X or O could be placed
    {
        if (inPlayer == 1) //def have in player's nums be global
        {
            System.out.println("Player " + "X's " + "turn.");
        }
        else if (inPlayer == 2)
        {
             System.out.println("Player " + "O's " + " turn.");
        }

    }


    public Status gameStatus()
    {
    // check rows
    for (int r = 0; r < BOARDSIZE; r++) 
    {
        if (board[r][0] != '\0' && board[r][0] == board[r][1] && board[r][1] == board[r][2]) 
            {
                return Status.WIN;
            }
    }

    // check columns
    for (int c = 0; c < BOARDSIZE; c++)
    {
        if (board[0][c] != '\0' && board[0][c] == board[1][c] && board[1][c] == board[2][c]) 
            {
                return Status.WIN;
            }
    }

    // diagonally won, 
    if (board[0][0] != '\0' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) 
        {
            return Status.WIN;
        }

    if (board[0][2] != '\0' && board[0][2] == board[1][1] && board[1][1] == board[2][0]) 
        {
            return Status.WIN;
        }

    // draw , all spots taken up
    for (int r = 0; r < BOARDSIZE; r++) 
        {
        for (int c = 0; c < BOARDSIZE; c++)
             {
                if (board[r][c] == '\0') 
                {
                    return Status.CONTINUE;
                }
            }
        }
        return Status.DRAW;
    }

        
    public void printBoard()
    {
        for (int r = 0; r < BOARDSIZE; r++)
            {
                System.out.println(" ___________ ");
                for (int c = 0; c < BOARDSIZE; c++)
                    {
                        char symbol = board[r][c];
                        printSymbol(c,symbol);
                        if (c == BOARDSIZE-1)
                            {
                            System.out.print("|");
                            }
                    }
            System.out.println();
            }
         System.out.println(" ___________ ");
    }

    public void printSymbol(int column, char s) //(in column : int, in value : char)
    {
      System.out.print("|");


      if (s == '\0')
      {
        System.out.print("   ");
      }

      else
      {
        System.out.print(" " + s + " ");
      }
    }
    //i believe boolean return data type

    public boolean validMove(int row, int column) //(in row: int, in column: int ) bool
    {
        boolean res = true;

        if (board[row][column] == 'X' || board[row][column] == 'O')
        {
            res = false;
        }
        return res;
    }
}