
/**
 * Write a description of class TemperatureTable here.
 *
 * @author Neel Lal
 * @version 11/1/20
 */
public class TemperatureTable
{
    // instance variables - replace the example below with your own
    private String name;
    private int[][] temperaturesArray;
    private int rows;
    private int cols;
    
    /**
     * Constructor for objects of class TemperatureTable
     * 
     * @param location, the name of the city.
     * 
     * @param array, the 2d array used to store values.
     */
    public TemperatureTable(String location, int[][] array)
    {
        // initialise instance variables
        name = location;
        temperaturesArray = array;
        rows = temperaturesArray.length;
        cols = temperaturesArray[0].length;
    }

    /**
     * Gets the element in the last column of the last row
     *
     * @return an integer representing the element in the last column of the last row.
     */
    public int last()
    {
        // put your code here
        return temperaturesArray[temperaturesArray.length - 1][temperaturesArray[0].length - 1];
    }
    
    /**
     * Gets the name of the location
     * 
     * @return the name of the location.
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Gets the largest value in the 2-D array
     * 
     * @return the largest value in the 2-d array.
     */
    public int getHighest()
    {
        int max = temperaturesArray[0][0];
        for (int row = 0; row < rows; row++)
        {
            for (int col = 0; col < cols; col++)
            {
                if (temperaturesArray[row][col] > max)
                {
                    max = temperaturesArray[row][col];
                }
            }
        }
        return max;
    }
    
    /**
     * returns the lowest value in the array
     */
    public int getLowest()
    {
       int lowest = temperaturesArray[0][1];
       for (int row = 0; row < rows; row++)
       {
          for (int col = 0; col < cols; col++)
          {
             int currentColumn = temperaturesArray[row][col];
             // System.out.println(currentColumn);
             if (currentColumn < lowest)
             {
                lowest = currentColumn;
             }
          }
       }   
       return lowest;
    }
    
    /**
     * Returns true if the target is in the array, otherwise false.
     * 
     * @param target, the value to search for in the array.
     * 
     * @return either true or false, depending on whether the target is in the array.
     */
    public boolean contains(int target)
    {
        for (int row = 0; row < rows; row++)
        {
            for (int col = 0; col < cols; col++)
            {
                if (temperaturesArray[row][col] == target)
                {
                    return true;
                }
            }
        }
        return false;
    }
}
