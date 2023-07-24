class Node {
    int data;
    Node left;
    Node right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

public class boundarynode {
    Node root;

    void printleaves(Node node) {
        if (node == null) {
            return;
        }
        printleaves(node.left);
        if (node.left == null && node.right == null)
            System.out.println(node.data + " ");
        printleaves(node.right);
    }

    void printleftnodes(Node node) {
        if (node == null) {
            return;
        }
        if (root.left != null) {
            System.out.println(node.data + " ");
            printleftnodes(node.left);
        } else if (root.right != null) {
            System.out.println(node.data + " ");
            printleftnodes(node.right);
        }
    }

    void printrightnode(Node node) {
        if (node == null) {
            return;
        }
        if (root.right != null) {
            printrightnode(node.right);
            System.out.println(node.data + " ");
        } else if (root.left != null) {
            printrightnode(node.left);
            System.out.println(node.data + " ");
        }
    }

    void print(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.data + " ");

        printleftnodes(node.left);
        printleaves(node.left);
        printleaves(node.right);
        printrightnode(node.right);
    }

    public static void main(String[] args) {
        boundarynode tree = new boundarynode();
        tree.root = new Node(20);
        tree.root.left = new Node(8);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(12);
        tree.root.left.right.left = new Node(10);
        tree.root.left.right.right = new Node(14);
        tree.root.right = new Node(22);
        tree.root.right.right = new Node(25);
        tree.print(tree.root);
    }
}
