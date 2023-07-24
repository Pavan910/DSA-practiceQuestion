class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
    }
}

class distancek {
    Node root;

    void print(Node node, int k) {
        if (node == null || k < 0) {
            return;
        }
        if (k == 0) {
            System.out.println(node.data + " ");
            return;
        }
        print(node.left, k - 1);
        print(node.right, k - 1);
    }

    public static void main(String[] args) {
        distancek dis = new distancek();
        dis.root = new Node(10);
        dis.root.left = new Node(20);
        dis.root.right = new Node(30);
        dis.root.left.left = new Node(40);
        dis.root.left.right = new Node(50);
        dis.root.right.left = new Node(60);

        dis.print(dis.root, 2);
    }
}
