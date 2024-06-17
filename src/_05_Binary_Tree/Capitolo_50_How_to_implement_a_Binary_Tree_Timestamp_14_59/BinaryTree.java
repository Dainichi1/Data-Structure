package _05_Binary_Tree.Capitolo_50_How_to_implement_a_Binary_Tree_Timestamp_14_59;

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

        root = first; // root --> first
        first.left = second;
        first.right = third; // second <-- first --> third

        second.left = fourth;
        second.right = fifth;


    }
    public static void main(String[] args) {

    }
}

/*
             1
            /  \
           /    \
          2      3
         / \    null null
        /   \
       4      5
    null null   null
 */