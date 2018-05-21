package system.control;

import table.mode.MindDisplay;

public class MindContrpoller
{
		  //Step 4,6
		  //add constants for particle types here
		  public static final int BLUE = 0;
		  public static final int RED = 1;
		  public static final int YELLOW = 2;
		  public static final int GREEN = 3;
		  
		  
		  //do not add any more fields below
		  private int[][] grid;
		  private MindDisplay display;
		  
		  
		  /**
		   * Constructor for SandLab
		   * @param numRows The number of rows to start with
		   * @param numCols The number of columns to start with;
		   */
		  public SandLab(int numRows, int numCols)
		  {
		    String[] names;
		    // Change this value to add more buttons
		    //Step 4,6
		    names = new String[4];
		    // Each value needs a name for the button
		    names[EMPTY] = "Empty";
		    names[METAL] = "Metal";
		    names[COAL] = "Coal";
		    names[WOOD] = "Wood";
		    
	//1. Add code to initialize the data member grid with same dimensions
	grid = new int[numRows][numCols];
		    		
	display = new SandDisplay("Falling Sand", numRows, numCols, names);
	}

}
