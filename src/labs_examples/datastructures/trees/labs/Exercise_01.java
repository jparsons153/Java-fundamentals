package labs_examples.datastructures.trees.labs;

/*
    Trees: Exercise_01

    Please demonstrate how to create a custom Binary Search Tree (BST). Using your custom BST, demonstrate how to:

        1.) Create a new CustomBST - done
        2.) Insert new elements - done
        3.) Retrieve elements - done
        4.) Update elements
        5.) Delete elements - done
        6.) Print elements (Bonus: try in-order traversal, pre-order traversal, post-order traversal) - done
        7.) Keep the tree well balanced - done

 */
public class Exercise_01{

    public static void main(String[]args){
        // create new Custom Binary Search Tree
        CustomBST newBST = new CustomBST();

        // Insert new elements
        newBST.insert(12);
        newBST.insert(10);
        newBST.insert(3);
        newBST.insert(5);

        // Retrieve elements
        Boolean bool = newBST.search(10);

        // Update elements

        // Delete elements
        newBST.remove(3);

        // print in-order traversal
        newBST.printInorderRecursive(newBST.root);
        System.out.println("\n");

        // print pre-order traversal
        newBST.printPreorderRecursive(newBST.root);
        System.out.println("\n");

        // post-order traversal
        newBST.printPostorderRecursive(newBST.root);
        System.out.println("\n");

    }
}