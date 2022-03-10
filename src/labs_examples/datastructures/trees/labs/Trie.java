package labs_examples.datastructures.trees.labs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Trie {

        // Define the alphabet size (26 characters for `a – z`)
        private static final int NUM_CHAR = 26;

        private boolean leaf;
        private List<Trie> child_nodes = null;


        Trie()
        {
            leaf = false;
            child_nodes = new ArrayList<>(Collections.nCopies(NUM_CHAR, null));
        }

        // Insert a string into a Trie - iterative
        public void insert(String key)
        {
            System.out.println("Inserting \"" + key + "\"");

            // root node
            Trie node = this;

            // for each character of the key
            for (char c: key.toCharArray())
            {
                // create a new Trie node if the path does not exist
                if (node.child_nodes.get(c - 'a') == null) {
                    node.child_nodes.set(c - 'a', new Trie());
                }

                // go to next
                node = node.child_nodes.get(c - 'a');
            }

            // set node as leaf
            node.leaf = true;
        }

        // search for key in a Trie
        // TRUE = found; else FALSE
        public boolean search(String key)
        {
            System.out.print("Searching \"" + key + "\" : ");

            Trie node = this;

            // for each character of the key
            for (char c: key.toCharArray())
            {
                // go to the next node
                node = node.child_nodes.get(c - 'a');

                // if the string is invalid (reached end of a path in the Trie)
                if (node == null) {
                    return false;
                }
            }

            // return true if the current node is a leaf node and the
            // end of the string is reached
            return node.leaf;
        }
    }
