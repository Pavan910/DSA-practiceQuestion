import java.util.ArrayList;
import java.util.Stack;

class Node {
    int data;
    Node left;
    Node right;

    Node(int item) {
        data = item;
        left = right;
    }
}

class BSTpostorder {
    Node root;
    ArrayList<Integer> list = new ArrayList<Integer>();

    ArrayList<Integer> postOrderIterative(Node node) {
        Stack<Node> S = new Stack<Node>();

        if (node == null)
            return list;
        S.push(node);
        Node prev = null;
        while (!S.empty()) {
            Node current = S.peek();

            if (prev == null || prev.left == current || prev.right == current) {
                if (current.left != null)
                    S.push(current.left);
                else if (current.right != null)
                    S.push(current.right);
                else {
                    S.pop();
                    list.add(current.data);
                }
            } else if (current.left == prev) {
                if (current.right != null)
                    S.push(current.right);
                else {
                    S.pop();
                    list.add(current.data);
                }
            } else if (current.right == prev) {
                S.pop();
                list.add(current.data);
            }
            prev = current;
        }
        return list;
    }

    public static void main(String[] args) {
        BSTpostorder tree = new BSTpostorder();
        tree.root = new Node(1);
        tree.root.left = new Node(9);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(5);
        tree.root.left.right = new Node(6);
        tree.root.right.left = new Node(5);
        tree.root.right.right = new Node(10);

        ArrayList<Integer> mylist = tree.postOrderIterative(tree.root);

        System.out.println(
                "Post order traversal of binary tree is :");
        System.out.println(mylist);
    }
}
