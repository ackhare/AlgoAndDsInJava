package org.chetanDs.HashTables.Chaining;

import java.util.Random;
/**
 * Created by chetan on 1/10/16.
 */
public class ChainingOps {
    Random Rand = new Random(1111);
    // The hash table.
    static int TableSize = 10;
    static int MinValue = 0;
    static int MaxValue = 0;
    static int NumUsed = 0;

    // Make the hash table.
   static private void create(Cell[] HashTable)
    {
        try
        {
            // Make the buckets. Make each a sentinel.
             TableSize = 10;

            for (int i = 0; i < TableSize; i++)
            {
                HashTable[i] = new Cell();
            }

            //ShowStatistics();


        }
        catch (Exception ex)
        {

        }
    }

    // Make some items.
    static private void makeItems(Cell[] Hashtable)
    {

       Random random= new Random();
        try
        {
            int numItems = 15;
            int MinValue = 0;
            int MaxValue = 20;
            int itemsAdded = 0;
            int index=0;
            while (itemsAdded < numItems)
            {
                try
                {
                    AddItem(random.nextInt(20),index,Hashtable);
                    itemsAdded++;
                }
                catch (Exception e)
                {
                    // Duplicate value. Try again.
                }
            }
        }
        catch (Exception ex)
        {

        }

        //ShowStatistics();
    }

//    private void insert()
//    {
//        int probes;
//        try
//        {
//            int key = 5;
//            int index=0;
//            probes = AddItem(key,index);
//            System.out.println("Item added. Index: " + index +
//                    ", Probes: " + probes);
//
//            ShowStatistics();
//        }
//        catch (Exception ex)
//        {
//
//        }
//    }
//
//    // Find the indicated item.
//    private void find()
//    {
//        try
//        {
//            int key = 5;
//            Cell cell;
//            int probes = FindItem(key,cell);
//            if (cell == null)
//                System.out.println("Item not found. Probes: " + probes);
//            else
//               System.out.println("Item found. Probes: " + probes);
//        }
//        catch (Exception ex)
//        {
//
//        }
//    }
//
//    // Remove an item.
//    private void remove()
//    {
//        try
//        {
//            int key = 5;
//            int probes = RemoveItem(key);
//            System.out.println("Removed item. Probes: " + probes);
//            ShowStatistics();
//        }
//        catch (Exception ex)
//        {
//
//        }
//    }

    // Display the table's contents and statistics.
   static private void showStatistics(int TableSize,Cell[] HashTable)
    {
        String newline = System.getProperty("line.separator");
        // Display the items in the table.
        String text = "";
        for (int i = 0; i < TableSize; i++)
        {
            text += ">";
            for (Cell cell = HashTable[i].Next; cell != null; cell = cell.Next)
            {
                text += cell.Value;
            }
            text += newline;
        }
         System.out.println(text);

//        int NumUsed=0;
//        // Keys per bucket.
//        float keysPerBucket = NumUsed / TableSize;
//        System.out.println(keysPerBucket);
//
//        // Check probe sequences.
//        int total = 0;
//        Cell itemCell;
//        int maxProbes = 0;
//        for (int i = MinValue; i <= MaxValue; i++)
//        {
//            int probes = FindItem(i,itemCell);
//            total += probes;
//            if (maxProbes < probes) maxProbes = probes;
//        }
//        System.out.println(maxProbes.ToString());
//        float ave = total / (MaxValue - MinValue + 1f);
//        System.out.println(ave.ToString("0.00"));
    }

    // Add an item to the hash table.
    // Return the length of the probe sequence.
    // Index is the bucket number.
    // Throw an exception if the item is already in the table.
    static private int AddItem(int key,int index,Cell[] HashTable) throws Exception {
        // Find the key's bucket.
        int TableSize = 10;
        index = key % TableSize;
        Cell bucket = HashTable[index];
        int NumUsed = 0;
        // Search for the item.
        int probes = 0;
        for (Cell cell = bucket.Next; cell != null; cell = cell.Next)
        {
            probes++;
            if (cell.Value == key)
                throw new Exception(
                        "This key is already in the hash table. Bucket: " +
                                index);
        }

        // Add the item at the beginning of the list.
        Cell newCell = new Cell(key, bucket.Next);
        bucket.Next = newCell;

        NumUsed++;
        return probes;
    }
//
//    // Find an item in the hash table.
//    // Set cell to its cell or null if the item isn't present.
//    // Return the length of the probe sequence.
//    private int FindItem(int key, Cell cell)
//    {
//        // Find the key's bucket.
//        int index = key % TableSize;
//        Cell bucket = HashTable[index];
//
//        // Search for the item.
//        int probes = 0;
//        for (Cell testCell = bucket.Next; testCell != null; testCell = testCell.Next)
//        {
//            probes++;
//            if (testCell.Value == key)
//            {
//                cell = testCell;
//                return probes;
//            }
//        }
//
//        // The item is not present.
//        cell = null;
//        return probes;
//    }
//
//    // Remove an item. Return the number of probes required.
//    // Throw an exception if the item isn't in the hash table.
//    private int RemoveItem(int key) throws Exception {
//        // Find the key's bucket.
//        int index = key % TableSize;
//        Cell bucket = HashTable[index];
//
//        // Find the item.
//        int probes = 0;
//        for (Cell cell = bucket; cell.Next != null; cell = cell.Next)
//        {
//            probes++;
//            if (cell.Next.Value == key)
//            {
//                cell = cell.Next;
//                NumUsed--;
//                return probes;
//            }
//        }
//
//        // The item is not present.
//        throw new Exception(
//                "This key is not present in the hash table. Bucket: " +
//                        index + ", Probes: " + probes);
//    }


    public static void main(String[] args) {


        Cell[] HashTable = new Cell[TableSize];
        create(HashTable);
        makeItems(HashTable);
        showStatistics(10,HashTable);

    }
}

