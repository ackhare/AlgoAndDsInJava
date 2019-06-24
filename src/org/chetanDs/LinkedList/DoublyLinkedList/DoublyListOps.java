package org.chetanDs.LinkedList.DoublyLinkedList;



/**
 * Created by chetan on 2/9/16.
 */
public class DoublyListOps {


    // The top of the list.
    private static Cell top = null;//As in linked list or tree root is intaliazed to null
    private static Cell previous = null;//As in linked list or tree root is intaliazed to null
    public static void main(String[] args) {

        DoublyListOps singleLinkListOPs= new DoublyListOps();
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

///showValues();
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

removeFormTop();
showValues();
removeFromBottom();
showValues();




    }
//void addSentinelAttop()
//{
//
//  Cell cell= new Cell()
//
//}
//
//    void addSentinelAtBottom()
//    {
//
//
//    }
    void addItemAtTop(int value)
    {

            Cell newCell = new Cell();
            newCell.Value = value;
            newCell.Next = top;
            newCell.Previous=previous;
            previous=
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


    // Remove the top item.
    static void removeFormTop()
    {
        top = top.Next;

    }

    // Remove the bottom item.
    static  void removeFromBottom()
    {
        // Find the bottom of the list.
        Cell before = top;
        while (before.Next.Next != null) before = before.Next;

        // Remove the item after before.
        before.Next = null;

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

