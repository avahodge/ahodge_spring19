package textExcel;

//Update this file with your own code.

public class SpreadsheetLocation implements Location {
	private int row;
	private int col;
	
    @Override
    public int getRow()
    {
        row = theRow - 'A';
        return row;
    }

    @Override
    public int getCol()
    {
        // TODO Auto-generated method stub
        return col;
    }
    
    public SpreadsheetLocation(String cellName)
    {
    	String theRow = cellName.substring(0, 1);
    	String theCol = cellName.substring(1);
    }

}

//Takes letter + number like A2 and returns row and column
