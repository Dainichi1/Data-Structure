package _05_Binary_Tree.Capitolo_57_Level_order_traversal_of_a_Binary_Tree_Timestamp_17_54;

import javax.swing.tree.TreeNode;
import java.util.LinkedList;
import java.util.Queue;
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
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);
        TreeNode sixth = new TreeNode(6);


        root = first; // root --> first
        first.left = second;
        first.right = third; // second <-- first --> third
        second.left = fourth;
        second.right = fifth;
        third.left = sixth;
    }

    // ATTRAVERSO IN PROFONDITà L'ALBERO E STAMPO I NUMERI DEI NODI
    public void levelOrder() {
        if (root == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            System.out.print(temp.data+" ");
            if (temp.left != null) {
                queue.offer(temp.left);
            }
            if (temp.right != null) {
                if (temp.right != null) {
                    queue.offer(temp.right);
                }
            }
        }
        }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.createBinaryTree();
        bt.levelOrder();
    }
}

/*
             9
            /  \
           /    \
          2      3
         / \     | \
        /   \    | null
       4      5  6
    null null  null null
 */