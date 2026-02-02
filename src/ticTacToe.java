public class TicTacToe 
{
    import java.util.Scanner;

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
        System.out.println(".....");
        int starter;
        int end = 1;
        for (starter = 0; starter < end; starter++) //this will change to status later, 
        ///i might use a while loop instead
        {
            this.printBoard();

            int playerX = 1;
            int playerY = 2; //maybe these can be const at the top of TTT class
            //check to see who's turn it is, i might change this to be in the beginning of for loop
            if (firstPlayer == false)
            {
                this.printStatus(playerX);
            
    

            }
            else
            {
                this.printStatus(playerY);
                //now u call valid move
            }

            System.out.println("Player " + playerX + ": Enter row (0, 1, 2) : ");
            //ask for input now, 
            Scanner hisRow = new Scanner(System.in);
            



                //now u call valid move
                             //////boolean ress = this.validMove(1,4);
          
        }
        ///this.printBoard();


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
             System.out.println("Player " + "Y's " + " turn.");
        }
        
    

    }
    public void printBoard()
    {
        System.out.println("Okay, now I need to make the lines to resemble the columns and rows");
        // i will use this |
        int i;
        int e = 5;

        System.out.println(" ________________________________________");

        //System.out.println("------");
        //for (i = 0; i < e; i++) //will see which horizontal line i use
        //{

   //     }
    }

    public void printSymbol(int column, char value) //(in column : int, in value : char)
    {

    }

    //i believe boolean return data type

    public boolean validMove(int row, int column) //(in row: int, in column: int ) bool
    {
        boolean res = false;
        System.out.println("w");
      //  if (row < )
       // {
            
       // }

        return res;
    }
}