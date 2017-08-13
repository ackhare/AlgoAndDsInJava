package Tree.BFS;

/**
 * Created by chetan on 13/8/17.
 */
// Recursive Java program for level order traversal of Binary Tree

/* Class containing left and right child of current
   node and key value*/
//same as it was in creating a binary tee program
class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}

class BinaryTree {
    // Root of the Binary Tree
    Node root;

    public BinaryTree() {
        root = null;
    }

    /* function to print level order traversal of tree*/
    //execute once
    void printLevelOrder() {
        int h = height(root);
        int i;
        System.out.println("Height of tree " + h);//3
        System.out.println("<-----------------height ends---->");//3
        for (i = 1; i <= h; i++)
            printGivenLevel(root, i);
    }

    /* Compute the "height" of a tree -- the number of
    nodes along the longest path from the root node
    down to the farthest leaf node.*/
    //Through print it has come to know that this function is postorder traversal dfs(45231)
    int height(Node root) {


        if (root == null)
            return 0;
        else {
            //root has value 1 and root.left has 2 and root.right has 3 as in attached image
            /* compute  height of each subtree */
            //so loop is being rolled by moving towards leaves now root = 2 intially
            // then root = 4 then root=null
            //then there will be time when root will be null and height will return 0 so
            //  lheight and rheight will be 0
            //when both are 0 it will return rheight + 1 which will be 1
            int lheight = height(root.left);//will again call function height recursively
            int rheight = height(root.right);//will be called first time when lheight is 0 then again recursion will take place and below will if will be called when rheight will also be 0
            //the above recursive call will be on till an integer value is not returned
            System.out.println("inside lheight rheight");
            System.out.println("lheight "+lheight);
            System.out.println("rheight "+rheight);
            System.out.println("root "+root);
            /* use the larger one */
            if (lheight > rheight)
                return (lheight + 1);
            else return (rheight + 1);
        }
    }

    /* Print nodes at the given level */
    //will be executed number of times == height iterativelyt and will be iterated n number of times recursively

    void printGivenLevel(Node root, int level) {

        if (root == null)
            return;
        if (level == 1)
            //At end all calls will go here for printing as there will be a time when height() will decrease to leve 1
            //System.out.println("for level " + level + " ");
            System.out.println("root value is "+root.data);

        else if (level > 1) {
            System.out.println("Inside printGivenLevel");
            System.out.println("Level of tree is "+level);
            System.out.println("root data is "+root);
            //As can be seen level is being constantly reduced and root is being replaced by its left or right branch
            printGivenLevel(root.left, level - 1);//for tree left to root  // will end when root.left=null which will occur on root.data=3
            printGivenLevel(root.right, level - 1);//for tree left to right // will end when root.right=null which will occur on root.data=3
            //All calls will end to if(level==1) as level will decrease in recursive function
        }
    }

    /* Driver program to test above functions */
    public static void main(String args[]) {
        //creating the tree ---> see tree122.gif
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Level order traversal of binary tree is ");
        tree.printLevelOrder();//12345(bfs)
    }
}