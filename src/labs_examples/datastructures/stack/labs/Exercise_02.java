package labs_examples.datastructures.stack.labs;

/**
 *      Stacks - Exercise_02
 *
 *      Write a new custom (Generic) Stack class that uses a traditional Array as the underlying data structure
 *      rather than the LinkedList as in the example we have already seen.
 *
 *      Your custom Stack class must also do the following: (Ryan Take 2)
 *
 *      1) throw a custom exception when trying to pop an element from an empty Stack
 *      2) resize the Stack (the underlying array) to be twice the size when the Stack is more than 3/4 full
 *      3) resize the Stack (the underlying array) to be half the size when the Stack is more than 1/4 empty
 *      4) contain the methods peekFirst() and peekLast()
 *      5) contain a size() method
 *      6) contain a method to print out the data of all elements in the Stack
 *
 *      TIP: To initialize an new array of a Generic type you can use this:
 *           T[] data = (T[]) new Object[10];
 */

class Exercise_02<T> {

    private T[] data = (T[]) new Object[10];

    int i;

    public void push (T item){

        try{
            while(data[i] != null) {
                data[i+1] = data[i];
        }
            data[0] = item;

        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void pop (T item){
// #1
        try{
            System.out.println("Item at top of the stack ;" +data[0]);
            data[0] = null;

        }catch(Exception exc){
            System.out.println("Null pointer exception, stack empty");
        }
    }

    public void resize() {
        // make a copy of the existing array - done
        // create a new array twice the size of the old array - done
        // iterate over the length of the old array - done
        // call the push() method and this element to the new array - done
        // catch exceptions - done

        T[] old = data;
        T[] data = (T[]) new Object[old.length * 2];

        for (int i = 0; i < old.length; i++) {
            try {
                T item = old[i];
                push(item);
            }catch (Exception exc){exc.printStackTrace();}
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

}