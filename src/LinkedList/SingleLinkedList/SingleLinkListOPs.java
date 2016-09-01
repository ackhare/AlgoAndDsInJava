package LinkedList.SingleLinkedList;

import java.util.Random;

/**
 * Created by chetan on 1/9/16.
 */
public class SingleLinkListOPs {


    // The top of the list.
    private static Cell top = null;
    public static void main(String[] args) {

        SingleLinkListOPs singleLinkListOPs= new SingleLinkListOPs();
        singleLinkListOPs.addItemAtTop(100);
        singleLinkListOPs.addItemAtTop(200);
        singleLinkListOPs.addItemAtTop(300);
        singleLinkListOPs.addItemAtTop(400);
        singleLinkListOPs.addItemAtTop(500);
        singleLinkListOPs.addItemAtBottom(600);
        singleLinkListOPs.addItemAtBottom(700);
        singleLinkListOPs.addItemAtBottom(800);
        singleLinkListOPs.addItemAtBottom(900);
        singleLinkListOPs.addItemAtBottom(1000);

showValues();
/*
500
400
300
200
100
600
700
800
900
1000
 */


    }

    void addItemAtTop(int value)
    {

            Cell newCell = new Cell();
            newCell.Value = value;
            newCell.Next = top;
            top = newCell;


        }


    void addItemAtBottom(int value)
    {
  // Find the bottom of the list.
            Cell current = top;
            while (current.Next != null) current = current.Next;

            // Add the item.
            Cell newCell = new Cell();
            newCell.Value=value;
            newCell.Next = null;

            current.Next = newCell;
           // showValues();


    }


    static void  showValues()
    {
        // Version 1.
        Cell current = top;
        while (current != null)
        {
            System.out.println(current.Value);
            current = current.Next;
        }


    }

}
