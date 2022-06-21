package ArbolesBinarios;

import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
// add the starting node of our tree, usually called the root:
    Node root;

//Then we'll create a recursive method to do the insertion:
    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        } else {
            // value already exists
            return current;
        }

        return current;
    }
//Next we'll create the public method that starts the recursion from the root node:
    public void add(int value) {
        root = addRecursive(root, value);
    }

    //Let's see how we can use this method to create the tree from our example:
    private BinaryTree createBinaryTree() {
        BinaryTree bt = new BinaryTree();

        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);

        return bt;

    }

    //Now let's add a method to check if the tree contains a specific value.
    //
    //As before, we'll first create a recursive method that traverses the tree:
    private boolean containsNodeRecursive(Node current, int value) {
        if (current == null) {
            return false;
        }
        if (value == current.value) {
            return true;
        }
        return value < current.value
                //primero hace la primer linea y luego la segunda si no cumple con la condicion de la primera
                ? containsNodeRecursive(current.left, value)
                : containsNodeRecursive(current.right, value);
    }

    //Here we're searching for the value by comparing it to the value in the current node; we'll then continue in the left or right child depending on the outcome.
    //
    //Next we'll create the public method that starts from the root:
    public boolean containsNode(int value) {
        return containsNodeRecursive(root, value);
    }

    //Then we'll create a simple test to verify that the tree really contains the inserted elements:



    //Another common operation is the deletion of a node from the tree.
    //
    //First, we have to find the node to delete in a similar way as before:

    private Node deleteRecursive(Node current, int value) {
        if (current == null) {
            return null;
        }

        if (value == current.value) {
            // Node to delete found
            // ... code to delete the node will go here
        }
        if (value < current.value) {
            current.left = deleteRecursive(current.left, value);
            return current;
        }
        current.right = deleteRecursive(current.right, value);
        return current;
    }
//DUDAS::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
    //Once we find the node to delete, there are 3 main different cases:
    //
    //a node has no children – this is the simplest case; we just need to replace this node with null in its parent node
    //a node has exactly one child – in the parent node, we replace this node with its only child.
    //a node has two children – this is the most complex case because it requires a tree reorganization
    //Let's see how we would implement the first case when the node is a leaf node:

    //if (current.left == null && current.right == null) {
    //    return null;
    //}

    //DUDAS::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
    //Now let's continue with the case when the node has one child:
    //
    //if (current.right == null) {
    //    return current.left;
    //}
    //
    //if (current.left == null) {
    //    return current.right;
    //}



    //Here we're returning the non-null child so it can be assigned to the parent node.
    //
    //Finally, we have to handle the case where the node has two children.
    //
    //First, we need to find the node that will replace the deleted node. We'll use the smallest node of the soon to be deleted node's right sub-tree:
    private int findSmallestValue(Node root) {
        return root.left == null ? root.value : findSmallestValue(root.left);
    }

//DUDAS::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
    //Then we assign the smallest value to the node to delete, and after that, we'll delete it from the right sub-tree:
    //
    //int smallestValue = findSmallestValue(current.right);
    //current.value = smallestValue;
    //current.right = deleteRecursive(current.right, smallestValue);
    //return current;



    //Finally, we'll create the public method that starts the deletion from the root:

    public void delete(int value) {
        root = deleteRecursive(root, value);
    }

    //Depth-First Search
    //Depth-first search is a type of traversal that goes deep as much as possible in every child before exploring the next sibling.
    //
    //There are several ways to perform a depth-first search: in-order, pre-order and post-order.
    //
    //The in-order traversal consists of first visiting the left sub-tree, then the root node, and finally the right sub-tree:

    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.value);
            traverseInOrder(node.right);
        }
    }
    public void traverseLevelOrder() {
        if (root == null) {
            return;
        }

        Queue<Node> nodes = new LinkedList<>();
        nodes.add(root);

        while (!nodes.isEmpty()) {

            Node node = nodes.remove();

            System.out.print(" " + node.value);

            if (node.left != null) {
                nodes.add(node.left);
            }

            if (node.right != null) {
                nodes.add(node.right);
            }
        }
    }





}

