package LearnTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLL {
    BinaryNode root;

    public BinaryTreeLL() {
        this.root = null;
    }

    // traversing on a binary tree by using preorder traversal

    void preOrder(BinaryNode node) {
        if (node == null) return; // O(1)
        System.out.println(node.value + " "); // O(1)
        preOrder(node.left); // O(N/2)
        preOrder(node.right); // O(N/2)
        // O(N) time complexity space complexity O(N)
    }

    void inOrder(BinaryNode node) {
        if (node == null) return; // O(1)
        inOrder(node.left); // O(N/2)
        System.out.print(node.value + " "); // O(1)
        inOrder(node.right); // O(N/2)
        // O(N) time complexity space complexity O(N)
    }

    void postOrder(BinaryNode node) {
        if (node == null) return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
        // O(N) time complexity space complexity O(N)
    }

    void levelOrder() {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>(); // O(1)
        queue.add(root); // // O(1)
        while (!queue.isEmpty()) { // O(N)
            BinaryNode presentNode = queue.remove(); // O(1)
            System.out.print(presentNode.value + " ");
            if (presentNode.left != null) queue.add(presentNode.left); // O(1)
            if (presentNode.right != null) queue.add(presentNode.right); // O(1)
        }
        // O(N) time complexity space complexity O(N)
    }

    // searching
    public void search(String value) {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            if (presentNode.value == value) {
                System.out.println("The value " + value + " is found in tree");
                return;
            } else {
                if (presentNode.left != null) queue.add(presentNode.left);
                if (presentNode.right != null) queue.add(presentNode.right);
            }
        }
        System.out.println("The value - " + value + " is not found in tree");
        // O(N) time complexity space complexity O(N)
    }

    // insert
    void insert(String value) {
        BinaryNode newNode = new BinaryNode();
        newNode.value = value;
        if (root == null) {
            root = newNode;
            System.out.println("inserted a new node at root");
            return;
        }
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            if (presentNode.left == null) {
                presentNode.left = newNode;
                System.out.println("Successfully inserted");
                break;
            } else if (presentNode.right == null) {
                presentNode.right = newNode;
                System.out.println("Successfully inserted");
                break;
            } else {
                queue.add(presentNode.left);
                queue.add(presentNode.right);
            }
        }
        // O(N) time complexity space complexity O(N)
    }

    // Get the deepest node
    public BinaryNode getDeepestNode() {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        BinaryNode presentNode = null;
        while (!queue.isEmpty()) {
            presentNode = queue.remove();

            if (presentNode.left != null) {
                queue.add(presentNode.left);
            }

            if (presentNode.right != null) {
                queue.add(presentNode.right);
            }
        }
        return presentNode;
    }

    // delete the deepest node
    public void deleteDeepestNode() {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        BinaryNode previousNode, presentNode = null;
        while (!queue.isEmpty()) {
            previousNode = presentNode;
            presentNode = queue.remove();

            if (presentNode.left == null) {
                previousNode.right = null;
                return;
            } else if (presentNode.right == null) {
                presentNode.left = null;
                return;
            }
            queue.add(presentNode.left);
            queue.add(presentNode.right);
        }
    }

    // delete the given node
    void deleteNode(String value) {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);

        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            if (presentNode.value == value) {
                presentNode.value = getDeepestNode().value;
                deleteDeepestNode();
                System.out.println("The node is deleted");
                return;
            } else {
                if (presentNode.left != null) queue.add(presentNode.left);
                if (presentNode.right != null) queue.add(presentNode.right);
            }
        }
        System.out.println("This node does not exist within this BT");
        // O(N) time complexity space complexity O(N)
    }

    // delete the binary tree :  time complexity space complexity O(1)
    void deleteBT() {
        root = null;
        System.out.println("BT has successfully deleted");
    }
}
