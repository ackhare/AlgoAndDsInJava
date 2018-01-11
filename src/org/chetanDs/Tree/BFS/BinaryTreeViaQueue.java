package Tree.BFS;

/**
 * Created by chetan on 13/8/17.
 * http://www.geeksforgeeks.org/level-order-tree-traversal/
 */
/*

*/
// Iterative Queue based Java program to do level order traversal
// of Binary Tree

/* importing the inbuilt java classes required for the program */

import java.util.LinkedList;
import java.util.Queue;


/* Class to print Level Order Traversal */
class BinaryTreeViaQueue {

    Node root;

    /* Given a binary tree. Print its nodes in level order
     using array for implementing queue  */
    void printLevelOrder()
    {
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);//here root contains entire tree(see its value at line number 68)  being added and
        // iteration will continue
        // till this becomes null
        while (!queue.isEmpty())
        {

            /* poll() removes the present head.*/
            Node tempNode = queue.poll();
            System.out.print(tempNode.data + " ");//so at first root data will come out which tells why we are using queue

            /*Enqueue left child */
            //Basically on first attempt queue will be empty with poll then enque
            // with 2 & 3 which are left
            // and right with 2 as its head which will be printed and popped in
            // second recursion
            //In third recursion 4 and 5 will be added and then subsequently
            // popped till no leave is
            // left to enque and queue is subsequently empty

            if (tempNode.left != null) {
                //At first (the sub tree of 234 will be added)
                queue.add(tempNode.left);
            }

            /*Enqueue right child */
            if (tempNode.right != null) {
                //At first (the sub tree of 5 will be added)
                queue.add(tempNode.right);
            }
            //Eventually queue will have 2 node intsnaces one having (sub tree 2,4,5) and one having 3
            //which are left and right
        }
    }
    public static void main(String args[])
    {
        /* creating a binary tree and entering
         the nodes */
        BinaryTreeViaQueue tree_level = new BinaryTreeViaQueue();
        tree_level.root = new Node(1);
        tree_level.root.left = new Node(2);
        tree_level.root.right = new Node(3);
        tree_level.root.left.left = new Node(4);
        tree_level.root.left.right = new Node(5);
//Till here (Node root) declared here will have entire treee through pointers
//The value as of now is
// Node{data=1, left=Node{data=2, left=Node{data=4, left=null, right=null}, right=Node{data=5, left=null, right=null}}, right=Node{data=3, left=null, right=null}}

        System.out.println("Level order traversal of binary tree is - ");
        tree_level.printLevelOrder();
    }
}