package Project6;

import java.util.LinkedList;
import java.util.Queue;

public class Main
{
    public static void main(String[] args)
    {
        Queue<CustomBinaryTree> list = new LinkedList<>();

        CustomBinaryTree test = new CustomBinaryTree();

        test.addNode(10, "Mike");
        test.addNode(15, "Ayli");
        test.addNode(20, "Avi" );
        test.addNode(25, "Elana");
        test.addNode(30, "Mom");
        test.addNode(35, "Dad");

        list.add(test);

        System.out.println("Breadth first: ");
        System.out.println(list);
        System.out.println();
        System.out.println("In Order traversal of tree");
        test.inOrderTraverse(test.root);
    }
}
