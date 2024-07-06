package _05_Tree._02_Binary_Search_Tree.Capitolo_62_Validate_Binary_Search_Tree_Timestamp_19_54;

public class BinarySearchTree {

    private TreeNode root;

    private class TreeNode {
        private int data;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int data) {
            this.data = data;
        }
    }

    /*
    Questo metodo è pubblico e serve come punto di ingresso per inserire un nuovo valore nell'albero binario di ricerca (BST).
    Semplifica il processo di inserimento per gli utenti della classe BinarySearchTree.
    Quando chiami bst.insert(5); viene utilizzato questo metodo pubblico.
     */
    public void insert(int value) {
        root = insert  (root, value); // fa riferimento al metodo 'insert' privato sotto.
    }

    /*
    Questo metodo è privato e si occupa dell'effettivo inserimento del valore nell'albero.
    Prende come parametro il nodo radice corrente (che può essere null se l'albero è vuoto) e il valore da inserire.
    Il metodo lavora ricorsivamente:
    Se il nodo corrente (root) è null, crea un nuovo nodo con il valore dato e lo ritorna.

    Se il valore da inserire è minore del valore del nodo corrente, chiama ricorsivamente insert sul sottoalbero
    sinistro.

    Se il valore da inserire è maggiore o uguale al valore del nodo corrente, chiama ricorsivamente insert sul
    sottoalbero destro.
     */
    private TreeNode insert (TreeNode root, int value) {
        if (root == null) {
            root = new TreeNode(value);
            return root;
        }
        if (value < root.data) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }
        return root;
    }

    /*
    Supponiamo di voler inserire il valore 5 nell'albero:

    Chiamiamo bst.insert(5);:

    Il metodo pubblico insert viene chiamato con il valore 5.
    Questo chiama il metodo privato insert, passando la radice attuale (root, che può essere null se l'albero è vuoto) e il valore 5.
    Il metodo privato insert verifica:

    Se root è null, crea un nuovo nodo con il valore 5 e lo ritorna.
    Il metodo pubblico insert aggiorna la radice dell'albero con questo nuovo nodo.
     */

    public boolean isValid(TreeNode root, long min, long max) {
        if (root == null) {
            return true;
        }
        if (root.data <= min || root.data >= max) {
            return false;
        }
        boolean left = isValid(root.left, min, root.data);
        if (left) {
            boolean right = isValid(root.right, root.data, max);
            return right;
        }
        return false;
    }

    public boolean isValidBST() {
        return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE); // riferimento al metodo 'isValid' sopra
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(5);
        bst.insert(2);
        bst.insert(1);
        bst.insert(3);
        bst.insert(6);
        System.out.println();

        if (bst.isValidBST()) {
            System.out.println("The tree is a valid binary search tree.");
        } else {
            System.out.println("The tree is not a valid binary search tree.");
        }
    }
}
