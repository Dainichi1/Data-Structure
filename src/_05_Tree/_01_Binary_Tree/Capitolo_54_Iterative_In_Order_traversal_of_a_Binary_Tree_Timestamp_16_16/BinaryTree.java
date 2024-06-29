package _05_Tree._01_Binary_Tree.Capitolo_54_Iterative_In_Order_traversal_of_a_Binary_Tree_Timestamp_16_16;

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
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(4);
        TreeNode fourth = new TreeNode(5);
        TreeNode fifth = new TreeNode(3);
        TreeNode sixth = new TreeNode(6);


        root = first; // root --> first
        first.left = second;
        first.right = fifth; // second <-- first --> third
        second.left = third;
        second.right = fourth;
        fifth.left = sixth;
    }

    // ATTRAVERSO IN PROFONDITà L'ALBERO E STAMPO I NUMERI DEI NODI
    public void inOrder() {
        if (root == null) {
            return;
        }

        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;

        while (!stack.isEmpty() || temp != null) {
            if (temp != null) {
                stack.push(temp);
                temp = temp.left;
            } else {
                temp = stack.pop();
                System.out.println(temp.data+" ");
                    temp = temp.right;
                }
            }
        }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.createBinaryTree();
        bt.inOrder();
    }
}

/*
             9
            /  \
           /    \
          2      3
         / \     / \
        /   \   6    null
       4      5
    null null  null
 */