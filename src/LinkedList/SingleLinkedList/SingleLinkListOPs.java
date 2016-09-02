package LinkedList.SingleLinkedList;

import java.util.Random;

/**
 * Created by chetan on 1/9/16.
 */
public class SingleLinkListOPs {


    // The top of the list.
    private static Cell top = null;
    private static Cell current = null;
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

//removeFormTop();
//showValues();
//removeFromBottom();
//showValues();




    }

    void addItemAtTop(int value)
    {


            Cell newCell = new Cell();
            newCell.Value = value;
           if(current!=null)
           {
               current.Next = newCell;
           }

           else
           {
               top=newCell;
           }
            current=newCell;


        System.out.println("guigkg"+current.Value);


        }


    void addItemAtBottom(int value)
    {
  // Find the bottom of the list.
//            Cell current = top;
            //while (current.Next != null) current = current.Next;

            // Add the item.
            Cell newCell = new Cell();
            newCell.Value=value;
            newCell.Next = null;
            current.Next=newCell;
            current = newCell;

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
//        // Version 1.
      //top1= top;
        Cell top1=top;

        // do
//         while (top != null);
        do
        {
            System.out.println(top.Value);
          //if(top!=null)
            top=top.Next;
           // current = current.Next;
        }
        while (top != null);

        top=top1;
        //System.out.println("cdc"+top1.Value);

    }

}
