package labs_examples.datastructures.trees.labs;

/*
    Trees: Exercise_02

    For this challenge, please research and implement a custom Trie data structure (https://en.wikipedia.org/wiki/Trie).

    Trie's are very interesting and useful data structures. Many interview questions, and real-world scenario's
    can be properly addressed using a Trie. We use Tries to store things like words and numbers in a highly
    efficient manner. See here: http://theoryofprogramming.com/wp-content/uploads/2015/06/trie12.jpg

    Understanding and implement a Trie is a fantastic step in thinking creatively as a developer to
    accomplish goals as efficiently as possible.

    Here is a fantastic set of relevant interview questions: https://www.techiedelight.com/trie-interview-questions/

 */

// reference https://www.techiedelight.com/implement-trie-data-structure-java/ accessed 10MAR22

public class Exercise_02 {

    public static void main(String[] args) {

        Trie trie = new Trie();

        trie.insert("the");
        trie.insert("that");
        trie.insert("then");
        trie.insert("do");
        trie.insert("does");

        System.out.println(trie.search("the"));
        System.out.println(trie.search("that"));
        System.out.println(trie.search("then"));
        System.out.println(trie.search("do"));
        System.out.println(trie.search("does"));

    }
}