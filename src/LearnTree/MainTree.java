package LearnTree;

public class MainTree {
    public static void main(String[] args) {
//        TreeNode drinks = new TreeNode("Drinks");
//        TreeNode hot = new TreeNode("Hot");
//        TreeNode cold = new TreeNode("Cold");
//        TreeNode tea = new TreeNode("Tea");
//        TreeNode beer = new TreeNode("Beer");
//        TreeNode coffee = new TreeNode("Coffee");
//        TreeNode wine = new TreeNode("wine");
//
//        drinks.addChild(hot);
//        drinks.addChild(cold);
//        hot.addChild(tea);
//        hot.addChild(coffee);
//        cold.addChild(beer);
//        cold.addChild(wine);
//        System.out.println(drinks.print(0));

        BinaryTreeLL bTree = new BinaryTreeLL();
        bTree.insert("N1");
        bTree.insert("N2");
        bTree.insert("N3");
        bTree.insert("N4");
        bTree.insert("N5");
        bTree.insert("N6");
        bTree.levelOrder();
        // bTree.deleteDeepestNode();
        System.out.println();
        bTree.deleteNode("N3");
        System.out.println();
        bTree.levelOrder();
        // System.out.println("HERE " + bTree.getDeepestNode().value);;

        BinaryTreeLL binaryTree = new BinaryTreeLL();

        BinaryNode N1 = new BinaryNode();
        N1.value = "N1";

        BinaryNode N2 = new BinaryNode();
        N2.value = "N2";

        BinaryNode N3 = new BinaryNode();
        N3.value = "N3";

        BinaryNode N4 = new BinaryNode();
        N4.value = "N4";

        BinaryNode N5 = new BinaryNode();
        N5.value = "N5";

        BinaryNode N6 = new BinaryNode();
        N6.value = "N6";

        BinaryNode N7 = new BinaryNode();
        N7.value = "N7";

        BinaryNode N8 = new BinaryNode();
        N8.value = "N8";

        BinaryNode N9 = new BinaryNode();
        N9.value = "N9";

        N1.left = N2;
        N1.right = N3;
        N2.left = N4;
        N2.right = N5;
        N3.left = N6;
        N3.right = N7;
        N4.left = N8;
        N4.right = N9;
        binaryTree.root = N1;

        // binaryTree.preOrder(binaryTree.root);
        // binaryTree.inOrder(binaryTree.root);
        // binaryTree.postOrder(binaryTree.root);
        // binaryTree.levelOrder();
//        binaryTree.search("N5");

    }


}
