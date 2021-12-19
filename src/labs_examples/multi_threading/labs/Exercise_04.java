package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 4:
 *      Demonstrate the use of a synchronized block and a synchronized method - ensure that the synchronization is
 *      working as expected
 */

// Synchronized block

// Synchronized method

class PrintLine {

    // added synchronized keyword for Synchronized method
    public synchronized void print(String line) {

        System.out.println("Print line" + "\n" + line);

            try{
                Thread.sleep(500);
            }catch (Exception exc){
                exc.printStackTrace();
            }

        System.out.println("print complete");
    }
}

class Sender implements Runnable {

    String line;
    Thread t;
    PrintLine prntln;

    public Sender(String name, String s, PrintLine obj) throws InterruptedException {
        t = new Thread(this, name);
        line = s;
        prntln = obj;

        try {
            t.start();
            t.join();
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

        @Override
        public void run () {

            // commented out synchronized block
           // synchronized (prntln) {
                prntln.print(line);
            }
        }
    //}

    class Controller {
        public static void main(String[] args) throws InterruptedException {
            try {
                PrintLine prntln = new PrintLine();
                Sender s1 = new Sender("s1", "printing from thread #1", prntln);
                Sender s2 = new Sender("s1", "printing from thread #2", prntln);
            }catch(InterruptedException ex){
                    ex.printStackTrace();
                }
        }
    }