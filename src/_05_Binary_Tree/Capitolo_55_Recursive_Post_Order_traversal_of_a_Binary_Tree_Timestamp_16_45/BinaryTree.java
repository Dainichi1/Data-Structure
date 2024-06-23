package _05_Binary_Tree.Capitolo_55_Recursive_Post_Order_traversal_of_a_Binary_Tree_Timestamp_16_45;

public class BinaryTree {

    private TreeNode root;
    private class TreeNode{
        private TreeNode left;
        private TreeNode right;
        private int data;

        public TreeNode(int data) {
            this.data = data;
        }
    }

    // CREO L'ALBERO BINARIO
    public void createBinaryTree() {
        TreeNode first = new TreeNode(9);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);
        TreeNode sixth = new TreeNode(6);


        root = first; // root --> first
        first.left = second;
        first.right = third;
        second.left = fourth; // second <-- first --> third
        second.right = fifth;
        third.left = sixth;




    }

    // ATTRAVERSO IN PROFONDITà L'ALBERO E STAMPO I NUMERI DEI NODI
    public void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        postOrder(root.left);
        postOrder (root.right);
        System.out.print(root.data+ " ");

    }
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.createBinaryTree();
        bt.postOrder(bt.root);
    }
}

/*
             9
            /  \
           /    \
          2      3
         / \    / \
        /   \   6  null
       4    5 null
    null null
 */