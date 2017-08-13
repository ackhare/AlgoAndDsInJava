package Tree.BFS;

/**
 * Created by chetan on 13/8/17.
 * http://www.geeksforgeeks.org/level-order-tree-traversal/
 */
/*
<-----------------Algo starts--------------------------->
Algorithm:
For each node, first the node is visited and then it’s child nodes are put in a FIFO queue.
printLevelorder(tree)
1) Create an empty queue q
2) temp_node = root /*start from root*/
/*
3) Loop while temp_node is not NULL
        a) print temp_node->data.
        b) Enqueue temp_node’s children (first left then right children) to q
        c) Dequeue a node from q and assign it’s value to temp_node

<-----------------Algo ends--------------------------->
*/
// Iterative Queue based Java program to do level order traversal
// of Binary Tree

/* importing the inbuilt java classes required for the program */
import java.util.Queue;
import java.util.LinkedList;

/* Class to represent Tree node */
//class Node {
//    int data;
//    Node left, right;
//
//    public Node(int item) {
//        data = item;
//        left = null;
//        right = null;
//    }
//}

/* Class to print Level Order Traversal */
class BinaryTreeViaQueue {

    Node root;

    /* Given a binary tree. Print its nodes in level order
     using array for implementing queue  */
    void printLevelOrder()
    {
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);//this is a temporary node being added and itewration will continue till this becomes null
        while (!queue.isEmpty())
        {

            /* poll() removes the present head.
            For more information on poll() visit
            http://www.tutorialspoint.com/java/util/linkedlist_poll.htm */
            Node tempNode = queue.poll();
            System.out.print(tempNode.data + " ");

            /*Enqueue left child */
            //Basically on first attempt queue will be empty with poll then enque with 2 & 3 which are left
            // and right with 2 as its head which will be printed and popped in second recursion
            //In third recursion 4 and 5 will be added and then subsequently popped till no leave is
            // left to enque and queue is subsequently empty

            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }

            /*Enqueue right child */
            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }
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

        System.out.println("Level order traversal of binary tree is - ");
        tree_level.printLevelOrder();
    }
}