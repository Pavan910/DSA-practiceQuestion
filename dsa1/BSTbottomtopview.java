import java.util.Map.Entry;
import java.util.*;

class Node {
    int data;
    int h;
    Node left;
    Node right;
    public Object root;

    public Node(int data) {
        this.data = data;
        h = Integer.MAX_VALUE;
    }

    public void TopView(Object root2) {
    }

    public void bottomview() {
    }
}

public class BSTbottomtopview {
    class tree {
        Node root;

        public tree() {
        }

        public tree(Node node) {
            root = node;
        }

        public void bottomview() {
            if (root == null) {
                return;
            }
            int h = 0;
            Map<Integer, Integer> map = new TreeMap<>();
            Queue<Node> queue = new LinkedList<Node>();

            root.h = h;
            queue.add(root);
            while (!queue.isEmpty()) {
                Node temp = queue.remove();
                h = temp.h;
                map.put(h, temp.data);
                if (temp.left != null) {
                    temp.left.h = h - 1;
                    queue.add(root.left);
                }
                if (temp.right != null) {
                    temp.right.h = h - 1;
                    queue.add(root.right);
                }
            }
            Set<Entry<Integer, Integer>> set = map.entrySet();
            Iterator<Entry<Integer, Integer>> iterator = set.iterator();

            while (iterator.hasNext()) {
                Map.Entry<Integer, Integer> me = iterator.next();
                System.out.println(me.getValue() + " ");
            }
        }
    }

    class BinaryTree {
        Node root;

        public BinaryTree() {
            root = null;
        }

        private void TopView(Node root) {
            class QueueObj {
                Node node;
                int hd;

                QueueObj(Node node, int hd) {
                    this.node = node;
                    this.hd = hd;
                }
            }
            Queue<QueueObj> q = new LinkedList<QueueObj>();
            Map<Integer, Node> topViewMap = new TreeMap<Integer, Node>();

            if (root == null) {
                return;
            } else {
                q.add(new QueueObj(root, 0));
            }

            System.out.println(
                    "The top view of the tree is : ");

            while (!q.isEmpty()) {
                QueueObj tmpNode = q.poll();
                if (!topViewMap.containsKey(tmpNode.hd)) {
                    topViewMap.put(tmpNode.hd, tmpNode.node);
                }

                if (tmpNode.node.left != null) {
                    q.add(new QueueObj(tmpNode.node.left,
                            tmpNode.hd - 1));
                }
                if (tmpNode.node.right != null) {
                    q.add(new QueueObj(tmpNode.node.right,
                            tmpNode.hd + 1));
                }
            }
            for (Map.Entry<Integer, Node> entry : topViewMap.entrySet()) {
                System.out.print(entry.getValue().data + " ");
            }
        }
    }

    public static void main(String args[]) {
        Node tree = new Node(1);
        tree.left = new Node(2);
        tree.right = new Node(3);
        tree.left.right = new Node(4);
        tree.left.right.right = new Node(5);
        tree.left.right.right.right = new Node(6);
        System.out.println("top view of tree is: ");
        tree.TopView(tree.root);
        System.out.println("Bottom view of tree is: ");
        tree.bottomview();

    }
}
