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
        System.out.println(".....");
        int starter;
        int end = 3;
        for (starter = 0; starter < end; starter++)
        {
            this.printBoard();
        }
        ///this.printBoard();


    }

    public void printStatus(int inPlayer) //inPlayer : int 
    //i think inPlayer refers to which player is occupying which square 
    //in the possible places where a X or O could be placed
    {

    }
    public void printBoard()
    {
        System.out.println("Okay, now I need to make the lines to resemble the columns and rows");

    }

    public void printSymbol(int column, char value) //(in column : int, in value : char)
    {

    }

    //i believe boolean return data type

    public boolean validMove(int row, int column) //(in row: int, in column: int ) bool
    {
        boolean res = false;

        return res;
    }
}