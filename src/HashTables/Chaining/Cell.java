package HashTables.Chaining;

/**
 * Created by chetan on 1/10/16.
 */
public class Cell
    {
        public int Value;
        public Cell Next;
        public Cell()
        {
        }
        public Cell(int value)
        {
            Value = value;
        }
        public Cell(int value, Cell next)
        {
            Value = value;
            Next = next;
        }
    }
