//package HashTables.QuadraticProbing;
//
//import java.util.Random;
//
///**
// * Created by chetan on 1/10/16.
// */
//public class QuadraticProbing {
//    // Used to make random values.
//    Random Rand = new Random(1111);
//
//    // The hash table.
//    private int[] HashTable;
//    private int TableSize = 0;
//    private int MinValue = 0;
//    private int MaxValue = 0;
//    private int NumUsed = 0;
//
//    // The special value marking empty spots.
//    private final int Empty = 0;
//
//    // Make the hash table.
//    private void create()
//    {
//        try
//        {
//            TableSize = 20;
//            HashTable = new int[TableSize];
//            for (int i = 0; i < TableSize; i++) HashTable[i] = Empty;
//
//            ShowStatistics();
//
//        }
//        catch (Exception ex)
//        {
//        }
//    }
//
//    // Make some items.
//    private void makeItems()
//    {
//        try
//        {
//            int numItems = 20;
//            MinValue = 0;
//            MaxValue = 15;
//            int itemsAdded = 0;
//            int index=0;
//            while (itemsAdded < numItems)
//            {
//                try
//                {
//                    AddItem(Rand.Next(MinValue, MaxValue + 1),index);
//                    itemsAdded++;
//                }
//                catch (Exception e)
//                {
//                    // Duplicate value. Try again.
//                }
//            }
//        }
//        catch (Exception ex)
//        {
//
//        }
//
//        ShowStatistics();
//    }
//
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
//            int index=0;
//            int probes = FindItem(key,index);
//            System.out.println("Index: " + index + ", Probes: " + probes);
//        }
//        catch (Exception ex)
//        {
//
//        }
//    }
//
//    // Display the table's contents and statistics.
//    private void ShowStatistics()
//    {
//        // Display the items in the table.
//        String text = "";
//        for (int i = 0; i < TableSize; i++)
//        {
//            if (HashTable[i] == Empty)
//            {
//                text += String.format("{0,4} ", "---");
//            }
//            else
//            {
//                text +=String.format("{0,4} ", HashTable[i]);
//            }
//            if ((i + 1) % 10 == 0)
//                text = text.substring(0, text.length() - 1) +"/n";
////                        Environment.NewLine;
//        }
//        System.out.println(text);
////        tableTextBox.Select(0, 0);
//
//        // Percent full.
//        float pct = 100f * NumUsed / TableSize;
//        System.out.println(pct);
//
//        // Check probe sequences.
//        int total = 0;
//        int index=0;
//        int maxProbes = 0;
//        for (int i = MinValue; i <= MaxValue; i++)
//        {
//            int probes = FindItem(i,index);
//            total += probes;
//            if (maxProbes < probes) maxProbes = probes;
//        }
//        System.out.println(maxProbes);
//        float ave = total / (MaxValue - MinValue + 1f);
//        System.out.println(ave);
//    }
//
//    // Add an item to the hash table.
//    // Return the length of the probe sequence.
//    // Throw an exception if the table is full
//    // or the item is already in the table.
//    private int AddItem(int key,int index) throws Exception {
//        int probe = key % TableSize;
//        for (int probes = 1; probes <= TableSize; probes++)
//        {
//            // See if this spot is empty.
//            if (HashTable[probe] == Empty)
//            {
//                // Put the value here.
//                HashTable[probe] = key;
//                index = probe;
//                NumUsed++;
//                return probes;
//            }
//
//            // See if the target key is here.
//            if (HashTable[probe] == key)
//                throw new Exception(
//                        "This key is already in the hash table. Index: " +
//                                probe + ", Probes: " + probes);
//
//            // Try a new probe.
//            probe = (key + probes * probes) % TableSize;
//        }
//
//        throw new Exception("The hash table is full");
//    }
//
//    // Find an item in the hash table.
//    // Set index to its location or -1 if the item isn't present.
//    // Return the length of the probe sequence.
//    private int FindItem(int key,int index)
//    {
//        int probe = key % TableSize;
//        for (int probes = 1; probes <= TableSize; probes++)
//        {
//            // See if this spot is empty.
//            if (HashTable[probe] == Empty)
//            {
//                // The key isn't in the table.
//                index = -1;
//                return probes;
//            }
//
//            // See if the key is here.
//            if (HashTable[probe] == key)
//            {
//                // We found the key.
//                index = probe;
//                return probes;
//            }
//
//            // Try the next probe.
//            probe = (key + probes * probes) % TableSize;
//        }
//
//        // The key isn't in the table (and the table is full).
//        index = -1;
//        return TableSize;
//    }
//}
//
