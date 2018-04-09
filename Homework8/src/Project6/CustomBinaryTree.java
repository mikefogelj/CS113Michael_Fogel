package Project6;

public class CustomBinaryTree<E> {
    //Create a new Node
    Node root;

    /**
     * addNode method allows you to add a node in teh binary tree,
     * this way with you can keep extending the binary tree with
     * children
     * @param key
     * @param name
     */
    public void addNode(int key, String name) {
        Node newNode = new Node(key, name);

        if (root == null) {
            root = newNode;
        } else {
            Node focusNode = root;

            Node parent;

            while (true) {
                parent = focusNode;

                if (key < focusNode.key) {
                    focusNode = focusNode.leftChild;

                    if (focusNode == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    focusNode = focusNode.rightChild;

                    if (focusNode == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    /**
     * inOrderTravers method allows user to traverse the binary tree
     * in order and print the correct node when it is found
     * @param focusNode
     */
    public void inOrderTraverse(Node focusNode) {
        if (focusNode != null) {
            inOrderTraverse(focusNode.leftChild);

            System.out.println(focusNode);

            inOrderTraverse(focusNode.rightChild);
        }
    }

    /**
     * preOrderTraverse method allows user to travers binary tree in pre
     * order from left to right
     * @param focusNode
     */
    public void preOrderTraverse(Node focusNode) {
        if (focusNode != null) {
            System.out.println(focusNode);

            preOrderTraverse(focusNode.leftChild);

            preOrderTraverse(focusNode.rightChild);
        }
    }

    /**
     * postOrderTravers method
     * @param focusNode
     */
    public void postOrderTraverse(Node focusNode) {
        if (focusNode != null) {

            postOrderTraverse(focusNode.leftChild);

            postOrderTraverse(focusNode.rightChild);

            System.out.println(focusNode);
        }
    }
}
class Node {

    int key;
    String name;

    Node leftChild;
    Node rightChild;

    /**
     * Constructor for node
     * @param key
     * @param name
     */
    Node(int key, String name ){
        this.key = key;
        this.name = name;
    }

    /**
     * toString method prints the name and the key(Item number)
     * @return
     */
    public String toString(){
        return name + key;

    }
}

