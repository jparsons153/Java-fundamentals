package labs_examples.datastructures.hashmap.labs;

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
 *      5) instead of checking the number of keys to resize, check the number of values
 *
 *      6) on collisions, add new elements to the front of the LinkedList, not the end - done
 *
 *      7) anytime someone tries to get/update/remove an element that does not exist, print
 *          out a message indicating that the element does not exist - done
 *
 *      8) add at least one more method that you think could be useful to the HashMap
 *          review Java's built-in HashMap for inspiration
 */

class JohnsCustomHashMap<K, V> {

    // create Pair table
    Pair<K, V>[] tableEntry = new Pair[10];

    // track the current number of elements in the hashmap
    private int noElements = 0;

    //Hashes the given key and returns a table index
    private int hashNumber(K key) {
        // get the hashCode for the key and mod that hashCode by the length of the array
        int indexNo = Math.abs(key.hashCode() % tableEntry.length);
        // the result will be the index where we can find and/or place entries
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

        // no element at the given index, means no collision
        // go ahead and simply add the value to the array
        if (tableEntry[indexNo] == null) {

            tableEntry[indexNo] = item;
            noElements++;
        }
        // otherwise, there was a collision
        // we need iterate through the linked list at that index
        else {
            // get the first Entry (in the linked list) at the given index
            // create new variable for firstIndex
            Pair<K, V> i = tableEntry[indexNo];
            Pair<K, V> firstIndex = i;

            // move each element by one index to make space at the front
            // index i = index i+1
            // while i !=null

            // traverse the linked list
            while (i != null) {
                i = i.next;
            }

            // after we exit the while loop above, we'll be at the end of the linked list
            // this is where we can add the new Entry
            firstIndex = item;
            noElements++;
        }

        // check for resize
        if (noElements > tableEntry.length * 0.5) {
            // the resize method will create a bigger underlying array and
            // add all values in the existing array to the new, larger array
            resizeHashmap();
        }
    }

    /**
     * Resizes the underlying array to double its previous size and copies the old values into it
     */
    private void resizeHashmap() {
        // make a copy of the existing table and call it "old"
        Pair<K, V>[] old = tableEntry;
        // create a new Entry[] that is twice the size of the old one
        tableEntry = new Pair[old.length * 3];

        // iterate over the length of the old array
        for (int i = 0; i < old.length; i++) {
            try {
                // get the Entry at the index of "i" from the "old" table
                Pair entryNew = old[i];
                // call the put() method passing the key and value to add this element to the new table
                putIn((K) entryNew.getKey(), (V) entryNew.getValue());

                // check to see if this entry is actually the start of a linked list
                while (entryNew.next != null) {
                    // if it is, traverse to the next node
                    entryNew = entryNew.next;
                    // and call the put() method to add this element
                    putIn((K) entryNew.getKey(), (V) entryNew.getValue());
                    // loop
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

        // ensure key exists by calling the get() method
        if (getKey(key) == null) {
            // if the get() method returns null, there's nothing to delete
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

        // when we exit the loop above, entry.next will contain the key we're looking for
        // if we're deleting from the middle of a linked list we need to link
        // entry.next to entry.next.next - this is basically like turning this list:
        // a -> b -> c
        // into this list:
        // a -> c
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