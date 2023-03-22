package app.model;

class Node {
    int key;
    Node left, right;

    public Node(int data) {
        key = data;
        left = right = null;
    }
}
