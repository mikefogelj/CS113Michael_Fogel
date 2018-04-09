package Project8;
import java.util.Iterator;
import java.util.Stack;

public class BinaryTreeIterator<E> extends BinaryTree implements Iterable <E>
{
    Stack <E> list = new Stack<>();

    @Override
    public Iterator<E> iterator(Node root) {
        Node currentNode = root;
        if (root == null)
        {
            return null;
        }

        while (!list.empty() || currentNode!= null)
        {
            if (currentNode != null)
            {
                list.push((E) currentNode);
                currentNode = currentNode.left;
            }
            else 
            {
                Node n = (Node) list.pop();
                currentNode = n.right;
            }
        }
    }
}
