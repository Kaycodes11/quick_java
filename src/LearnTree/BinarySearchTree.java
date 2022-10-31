package LearnTree;

// Binary Tree and Binary Search Tree are different
// BST is more efficient with insert and deletion of nodes and its left subtree values are <= parent node, right subtree >

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
    BinaryNodeForBST root;

    public BinarySearchTree() {
        root = null;
    }

    // insert : time and space O(Log N)
    private BinaryNodeForBST insert(BinaryNodeForBST currentNode, int value) {
        if (currentNode == null) {
            BinaryNodeForBST newNode = new BinaryNodeForBST();
            newNode.value = value;
//            System.out.println("The value has successfully inserted");
            return newNode;
        } else if (value <= currentNode.value) {
            currentNode.left = insert(currentNode.left, value);
            return currentNode;
        } else {
            currentNode.right = insert(currentNode.right, value);
            return currentNode;
        }
    }

    void insert(int value) {
        insert(root, value);
    }

    // DFS: PreOrder: time and space complexity  O(N)
    public void preOrder(BinaryNodeForBST node) {
        if (node == null) return;
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    // DFS: InOrder: time and space complexity  O(N)
    public void inOrder(BinaryNodeForBST node) {
        if (node == null) return;
        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }

    // DFS: postOrder: time and space complexity  O(N)
    public void postOrder(BinaryNodeForBST node) {
        if (node == null) return;
        inOrder(node.left);
        inOrder(node.right);
        System.out.print(node.value + " ");
    }


    // BFS : LevelOrder : time and space complexity  O(N)
    void levelOrder() {
        Queue<BinaryNodeForBST> queue = new LinkedList<BinaryNodeForBST>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNodeForBST presentNode = queue.remove();
            System.out.println(presentNode.value + " ");
            if (presentNode.left != null) queue.add(presentNode.left);
            if (presentNode.right != null) queue.add(presentNode.right);
        }
    }

    // search : time and space O(Log N)
    BinaryNodeForBST search(BinaryNodeForBST node, int value) {
        if (node == null) {
            System.out.println("Value: " + value + " not found within BST");
            return null;
        } else if (node.value == value) {
            System.out.println("Value: " + value + " found within BST");
            return node;
        } else if (value < node.value) {
            return search(node.left, value); // O(N/2)
        } else {
            return search(node.right, value); // // O(N/2)
        }
    }

    // Minimum node : helper method for delete
    public static BinaryNodeForBST minimumNode(BinaryNodeForBST root) {
        if (root.left == null) {
            return root;
        } else {
            return minimumNode(root.left);
        }
    }

    // delete node : time and space O(Log N)
    public BinaryNodeForBST deleteNode(BinaryNodeForBST root, int value) {
        if (root == null) {
            System.out.println("Value is not found within BST");
            return null;
        }
        if (value < root.value) {
            root.left = deleteNode(root.left, value);
        } else if (value > root.value) {
            root.right = deleteNode(root.right, value);
        } else {
            if (root.left != null && root.right != null) {
                BinaryNodeForBST temp = root;
                BinaryNodeForBST minNodeForRight = minimumNode(temp.right);
                root.value = minNodeForRight.value;
                root.right = deleteNode(root.right, minNodeForRight.value);
            } else if (root.left != null) {
                root = root.left;
            } else if (root.right != null) {
                root = root.right;
            } else {
                root = null;
            }
        }
        return root;
    }


    // deleteBST :   time and space O(1)
    public void deleteBST() {
        root = null;
        System.out.println("BST deleted");
    }


}
