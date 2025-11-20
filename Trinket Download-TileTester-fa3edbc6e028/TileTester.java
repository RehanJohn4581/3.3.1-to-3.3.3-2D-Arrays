/*
 * Activity 3.3.1
 */
public class TileTester
{
  private static String[] tileValues =
  { "lion", "lion",
    "penguin", "penguin",
    "dolphin", "dolphin",
    "fox", "fox",
    "monkey", "monkey",
    "turtle", "turtle" }; 

  public static void main(String[] args)
  {
    
    /* your code here */
     Tile[][] gameboard = new Tile[3][4];

    int index = 0;
    for (int r = 0; r < gameboard.length; r++)
    {
      for (int c = 0; c < gameboard[0].length; c++)
      {
        gameboard[r][c] = new Tile(tileValues[index]);
        index++;
      }
    }

    for (int r = 0; r < gameboard.length; r++)
    {
      for (int c = 0; c < gameboard[0].length; c++)
      {
        System.out.print(gameboard[r][c] + " ");
      }
      System.out.println();
    }
  }
}
