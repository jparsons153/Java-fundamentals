package labs_examples.datastructures.queue.labs;

/**
 *      Queues - Exercise_02
 *
 *      Write a new custom (Generic) Queue class that uses a traditional Array as the underlying data structure
 *      rather than the LinkedList as in the example we have already seen.
 *
 *      Your custom Queue class must also do the following:
 *
 *      1) throw a custom exception when trying to pop  an element from an empty Queue
 *      2) resize the Queue (the underlying array) to be twice the size when the Queue is more than 3/4 full
 *      3) resize the Queue (the underlying array) to be half the size when the Queue is more than 1/4 empty
 *      4) contain the methods peekFirst() and peekLast()
 *      5) contain a size() method
 *      6) contain a method to print out the data of all elements in the Queue
 *
 */

public class ArrayQueue<T> {

    private T[] data = (T[]) new Object[10];

    // simple boolean to track whether or not the queue is empty
    private boolean isEmpty;

    // constructor - set empty to true upon creation
    public ArrayQueue() {isEmpty = true;}

    public void enqueue(T item){
    int i =0;
        try{
            while(data[i] != null) {
                data[i+1] = data[i];
                i++;
            }
            data[0] = item;

        } catch (Exception e){
            e.printStackTrace();
        }
    resize();
    }

    public T dequeue(){
        try {
            T item = data[0];
            data[0] = null;

            // check if empty
            if (data[0] == null) {
                isEmpty = true;
            }

            return item;

        }catch(Exception e){
            System.out.println("This is a custom exception for dequeing an empty queue");
            return null;
        }
    }

    private void resize() {
        T[] old = data;
        if (size() > data.length * 0.75) {

            T[] data = (T[]) new Object[old.length * 2];

            for (int i = 0; i < old.length; i++) {
                try {
                    T item = old[i];
                    enqueue(item);
                } catch (Exception exc) {
                    exc.printStackTrace();
                }
            }
        } else if (size() < data.length * 0.25) {
            int intValue = (int)(old.length * 0.5);
            T[] data = (T[]) new Object[intValue];

            for (int i = 0; i < old.length; i++) {
                try {
                    T item = old[i];
                    enqueue(item);
                } catch (Exception exc) {
                    exc.printStackTrace();
                }
            }
        } else {
            return;
        }
    }

    public int size(){
        int count = 0;
        for (int j =0; j<data.length; j++){
            count ++;
        }
        return count;
    }

    public void peekFirst(){
        System.out.println(data[0]);
    }

    public void peekLast(){
        System.out.println(data[data.length-1]);
    }

    public void print() {
        int j = 0;
        while (data[j] != null) {
            System.out.println(data[j]);
            j++;
        }
    }

    public boolean isEmpty() {
        return isEmpty;
    }
}