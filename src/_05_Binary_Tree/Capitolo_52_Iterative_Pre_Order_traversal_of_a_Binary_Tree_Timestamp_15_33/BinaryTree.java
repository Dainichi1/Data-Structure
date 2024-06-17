package _05_Binary_Tree.Capitolo_52_Iterative_Pre_Order_traversal_of_a_Binary_Tree_Timestamp_15_33;

import java.util.Stack;

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


        root = first; // root --> first
        first.left = second;
        first.right = third; // second <-- first --> third

        second.left = fourth;
    }

    // ATTRAVERSO IN PROFONDITà L'ALBERO E STAMPO I NUMERI DEI NODI
    public void preOrder() {
        if (root == null) {
            return;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            System.out.print(temp.data+" ");
            if (temp.right != null) {
                stack.push(temp.right);
            }
            if (temp.left != null) {
                stack.push(temp.left);
            }
        }
    }
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.createBinaryTree();
        bt.preOrder();
    }
}

/*
             9
            /  \
           /    \
          2      3
         / \    null null
        /   \
       4    null null
    null null
 */