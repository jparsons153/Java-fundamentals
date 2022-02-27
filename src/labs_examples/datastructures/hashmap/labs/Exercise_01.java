package labs_examples.datastructures.hashmap.labs;

import java.util.HashMap;

/**
 *  HashMaps Exercise_01
 *
 *  Demonstrate you're mastery of using Java's built-in HashMap class below.
 *
 *  Using a HashMap demonstrate the use of the following methods:
 *
 *  put() - done
 *  get() - done
 *  putAll() - done
 *  size() - done
 *  contains() - done
 *  keySet() - done
 *  entrySet() - done
 *  putIfAbsent() - done
 *  remove() - done
 *  replace() - done
 *  forEach() - done
 *  clear() - done
 *
 */

public class Exercise_01 {

    public static void main(String[] args) {
        HashMap<String, Document> documentHashMap = new HashMap<>();

        // create objects
        Document A01 = new Document(12345,"Joe Bloggs","A01");
        Document B03 = new Document(12045,"Joe Bloggs","B03");
        Document B04 = new Document(12046, "Tim Wood", "B04");
        Document B05 = new Document(12405,"Tim Wood","B05");

        // add objects to Hashmap
        documentHashMap.put(A01.getLine(), A01);
        documentHashMap.put(B03.getLine(), B03);
        documentHashMap.put(B04.getLine(), B04);

        // get method
        Document getResult = documentHashMap.get("A01");
        System.out.println(getResult.toString());

        // copy all entries to new map - putAll
        HashMap<String, Document> documentHashMapTwo = new HashMap<>();
        documentHashMapTwo.putAll(documentHashMap);

        // size
        System.out.println("New map has a size of " +documentHashMapTwo.size());

        // contains
        System.out.println("Does this Hashmap contain A01 :" +documentHashMap.containsKey("A01"));

        // keyset
        System.out.println("Current lines stored : "+ documentHashMap.keySet());

        // entryset
        System.out.println("Entries in the hashmap :" + documentHashMap.entrySet());

        // putifabsent
        documentHashMap.putIfAbsent(A01.getLine(), A01);
        documentHashMap.putIfAbsent(B05.getLine(), B05);

        // remove
        documentHashMap.remove(B03.getLine(),B03);

        // replace
        documentHashMap.replace(B04.getLine(), B04,B05);

        // forEach
        documentHashMap.forEach((s, document) -> System.out.println(s));

        //clear
        documentHashMap.clear();

    }
}

    class Document{
        private int DocNumber;
        private String author;
        private String line;

        public Document(int docNumber, String author, String line) {
            DocNumber = docNumber;
            this.author = author;
            this.line = line;
        }

        public int getDocNumber() {
            return DocNumber;
        }

        public void setDocNumber(int docNumber) {
            DocNumber = docNumber;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getLine() {
            return line;
        }

        public void setLine(String line) {
            this.line = line;
        }

        @Override
        public String toString() {
            return "Document{" +
                    "DocNumber=" + DocNumber +
                    ", author='" + author + '\'' +
                    ", line='" + line + '\'' +
                    '}';
        }
    }