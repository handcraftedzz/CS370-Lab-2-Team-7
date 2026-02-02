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

    final int BOARDSIZE = 3; //const

    //put status here, i don't get enum yet

    public enum Status {    
        WIN,
        DRAW,
        CONTINUE
    }


    char[][] board = new char[BOARDSIZE][BOARDSIZE];

    boolean firstPlayer = false; //what will the purpose of this var serve?
    boolean gameOver = false;

    public void play(String[] args)
    {

    }
    public static void printStatus(int inPlayer) //inPlayer : int *maybe a 2d array as a param.
    //i think inPlayer refers to which player is occupying which square 
    //in the possible places where a X or O could be placed
    {

    }
    public void printBoard()
    {

    }

    public void printSymbol() //(in column : int, in value : char)
    {

    }

    //i believe boolean return data type

    public boolean validMove() //(in row: int, in column: int ) bool
    {
        boolean res = false;

        return res;
    }
}