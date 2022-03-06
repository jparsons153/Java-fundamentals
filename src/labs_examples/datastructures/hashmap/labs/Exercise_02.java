package labs_examples.datastructures.hashmap.labs;

import java.util.HashMap;

/**
 *      HashMaps Exercise_02
 *
 *      Rewrite the CustomHashMap class to meet the following requirements:
 *      1) no method has the same name as any in CustomHashMap - done
 *          (do not use refactor - do it manually)
 *      2) no variable has the same name as any in CustomHashMap - done
 *          (do not use refactor - do it manually)
 *      3) resize the HashMap when the underlying array is more than half full - done
 *      4) triple the size of the underlying array on resize() - done
 *
 *      5) instead of checking the number of keys to resize, check the number of values - done
 *
 *      6) on collisions, add new elements to the front of the LinkedList, not the end - done
 *
 *      7) anytime someone tries to get/update/remove an element that does not exist, print
 *          out a message indicating that the element does not exist - done
 *
 *      8) add at least one more method that you think could be useful to the HashMap
 *          review Java's built-in HashMap for inspiration - done
 */

class JohnsCustomHashMap<K, V> {

    // create Pair table
    Pair<K, V>[] tableEntry = new Pair[10];

    // track the current number of elements in the hashmap
    private int noElements = 0;
    private int noValues = 0;

    //Hashes the given key and returns a table index
    private int hashNumber(K key) {
        int indexNo = Math.abs(key.hashCode() % tableEntry.length);
        return indexNo;
    }

    /**
     * Adds the key-value pair to the hashmap
     *
     * @param key   a key Object
     * @param value a value Object
     */
    public void putIn(K key, V value) {
        // call the hash() method to get the index to place the element
        int indexNo = hashNumber(key);

        // create the Entry object containing the key and value that we will store in the underlying array
        Pair<K,V> item = new Pair(key, value);

        // no element at the given index, no collision add value to the array
        if (tableEntry[indexNo] == null) {

            tableEntry[indexNo] = item;
            noElements++;
            noValues++;
        }
        // else collision iterate through the linked list at that index
        else {
            // get the first Entry (in the linked list) at the given index
            // create new variable for firstIndex
            Pair<K, V> i = tableEntry[indexNo];
            Pair<K, V> firstIndex = i;


            // traverse the linked list, move each element to next index
            while (i != null) {
                i = i.next;
            }

            // add the new Entry
            firstIndex = item;
            noElements++;
            noValues++;
        }

        // check for resize using number of values
        if (noValues > tableEntry.length * 0.5) {
            // call resize method to add all values to new larger array
            resizeHashmap();
        }
    }

    /**
     * Resizes the underlying array to double its previous size and copies the old values into it
     */
    private void resizeHashmap() {
        Pair<K, V>[] old = tableEntry;
        // new array 3 times size of previous
        tableEntry = new Pair[old.length * 3];

        // get index from 'old', call put() to add to new table
        for (int i = 0; i < old.length; i++) {
            try {
                Pair entryNew = old[i];
                putIn((K) entryNew.getKey(), (V) entryNew.getValue());

                // go to end of linkedlist and add element
                while (entryNew.next != null) {
                    entryNew = entryNew.next;
                    putIn((K) entryNew.getKey(), (V) entryNew.getValue());
                }
            } catch (Exception e) {
                System.out.println("Element does not exist");
            }
        }
    }

    /**
     * Removes the pair at the given key from the hashmap
     *
     * @param key of the pair to be removed
     */
    public void removePair(K key) {

        // ensure key exists by calling the get() method if null nothing to delete
        if (getKey(key) == null) {
            return;
        }

        // otherwise, get the index for the key by calling the hash() method
        int indexNo = hashNumber(key);

        // get the Entry at the index
        Pair<K, V> entryNew = tableEntry[indexNo];

        // if this entry has the matching key, remove the element at this index
        if (entryNew.getKey().equals(key)){
            tableEntry[indexNo] = null;
            noElements--;
            return;
        }

        // otherwise, if the next element in the linked list is not null
        while (entryNew.next != null ) {
            // if the key of the next element in the linked list is not the key we're looking for
            if (entryNew.next.getKey() != key) {
                // traverse the linked list to the next node
                entryNew = entryNew.next;
            }
        }


        if(entryNew.next.next != null){
            entryNew.next = entryNew.next.next;
            noElements--;
            return;
        }
        // otherwise, entry.next is the end of the list so we can just chop it off
        else {
            entryNew.next = null;
            noElements--;
            return;
        }
    }

    /**
     * Finds the value of a key
     *
     * @param key to search for
     * @return value of the given key
     */
    public V getKey(K key) {
        // call the hash() method to get the index for the key
        int index = hashNumber(key);

        // nothing at key - return null
        if (tableEntry[index] == null) {
            return null;
        }

        // otherwise, get the Entry at the index
        Pair<K, V> entryNew = tableEntry[index];

        // if the key of the current entry is not the key we're looking for
        // that means we're looking at a linked list and we need to traverse it
        // if the key does match right from the start, this loop will be skipped
        while (entryNew.getKey() != key) {

            // if we reach the end of the list and haven't found it return null
            if (entryNew.next == null) {
                return null;
            }

            // otherwise, keep traversing the linked list
            entryNew = entryNew.next;
        }

        // if we get here, that means the key has been found, return the value
        return entryNew.getValue();
    }

    /**
     * For Testing: gets the size of the underlying array
     *
     * @return int storage size
     */
    public int getArraySize() {
        return tableEntry.length;
    }


    public boolean containsValue(Pair value) {
        Pair<K,V>[] tab; V v;
        if ((tab = tableEntry) != null && tableEntry.length > 0) {
            for (int i = 0; i < tab.length; ++i) {
                for (Pair<K,V> e = tab[i]; e != null; e = e.next) {
                    if ((v = e.getValue()) == value ||
                            (value != null && value.equals(v)))
                        return true;
                }
            }
        }
        return false;
    }
}

/**
 * A Key-Value Pair
 */
class Pair<K, V> {
    private K key;
    private V value;
    // it means this is a LinkedList
    Pair next = null;

    Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

}