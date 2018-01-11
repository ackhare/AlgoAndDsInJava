package Arrays.TriangularArray;

/**
 * Created by chetan on 10/9/16.
 */
public class TriangleArray {

   String[][] myStringArray;
    public TriangleArray(int numRows)
    {
//           int numRows = int.Parse(numRowsTextBox.Text);

     myStringArray = new String [numRows][numRows];
                // Initialize all values to empry strings not null (for display).
                for (int row = 0; row < numRows - 1; row++)
                {
                    for (int column = row + 1; column < numRows; column++)
                    {
                        myStringArray[row][column]="";
                    }
                }

    }

//    public dump()
//    {
//
//        for (String value : myStringArray)
////        valuesListBox.Items.Add(value.ToString());
//    }




}
