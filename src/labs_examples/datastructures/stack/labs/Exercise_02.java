package labs_examples.datastructures.stack.labs;

/**
 *      Stacks - Exercise_02
 *
 *      Write a new custom (Generic) Stack class that uses a traditional Array as the underlying data structure
 *      rather than the LinkedList as in the example we have already seen.
 *
 *      Your custom Stack class must also do the following: (Ryan Take 2)
 *
 *      1) throw a custom exception when trying to pop an element from an empty Stack - done
 *      2) resize the Stack (the underlying array) to be twice the size when the Stack is more than 3/4 full - done
 *      3) resize the Stack (the underlying array) to be half the size when the Stack is more than 1/4 empty - done
 *      4) contain the methods peekFirst() and peekLast() - done
 *      5) contain a size() method - done
 *      6) contain a method to print out the data of all elements in the Stack - done
 *
 *      TIP: To initialize an new array of a Generic type you can use this:
 *           T[] data = (T[]) new Object[10];
 */

class Exercise_02<T> {

    private T[] data = (T[]) new Object[10];


    public void push (T item){
        int i=0;
        try{
            while(data[i] != null) {
                data[i + 1] = item;
                i++;
            }

        } catch (Exception e){
            e.printStackTrace();
        }
            resize();
        }

    public void pop (T item){
// #1
        try{
            System.out.println("Item at top of the stack ;" +data[data.length-1]);
            data[data.length-1] = null;

        }catch(Exception exc){
            System.out.println("Null pointer exception, stack empty");
        }
    }

     private void resize() {
        // make a copy of the existing array - done
        // create a new array twice the size of the old array - done
        // iterate over the length of the old array - done
        // call the push() method and this element to the new array - done
        // catch exceptions - done

        T[] old = data;
        if (size() > data.length * 0.75) {

            T[] data = (T[]) new Object[old.length * 2];

            for (int i = 0; i < old.length; i++) {
                try {
                    T item = old[i];
                    push(item);
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
                    push(item);
                } catch (Exception exc) {
                    exc.printStackTrace();
                }
            }
        } else {
            return;
        }
    }

// #5
    public int size(){
        int count = 0;
        for (int j =0; j<data.length; j++){
            count ++;
        }
        return count;
    }

    public void peekFirst(){
        System.out.println(data[data.length-1]);
    }

    public void peekLast(){
        System.out.println(data[0]);
    }

    public void print(){
        int i=0;
        while(data[i] != null){
            System.out.println(data[i]);
            i++;
        }
    }
}
