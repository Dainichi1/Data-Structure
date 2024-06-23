package _05_Binary_Tree.Capitolo_56_Iterative_Post_Order_traversal_of_a_Binary_Tree_Timestamp_17_11;

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
        fifth.right = sixth;
    }

    // ATTRAVERSO IN PROFONDITà L'ALBERO E STAMPO I NUMERI DEI NODI
    public void postOrder() {
        TreeNode current = root;
        Stack<TreeNode> stack = new Stack<>();
        while (current != null || !stack.isEmpty()) {
            if (current != null) {
                stack.push(current);
                current = current.left;
            } else {
                TreeNode temp = stack.peek().right;
                if (temp == null) {
                    temp = stack.pop();
                    System.out.println(temp.data+" " );
                    while (!stack.isEmpty() && temp == stack.peek().right) {
                        temp = stack.pop();
                        System.out.println(temp.data+" ");
                    }
                } else {
                    current = temp;
                }
                }
            }
        }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.createBinaryTree();
        bt.postOrder();
    }
}

/*
             9
            /  \
           /    \
          2      3
         / \     / \
        /   \    nul 6
       4      5     / \
    null null  null    nul
 */