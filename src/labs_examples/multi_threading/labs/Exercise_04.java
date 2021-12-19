package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 4:
 *      Demonstrate the use of a synchronized block and a synchronized method - ensure that the synchronization is
 *      working as expected
 */

// Synchronized block

class PrintLine {

    public void print(String line) {

        System.out.println("Print line" + "\n" + line);

            try{
                Thread.sleep(500);
            }catch (Exception exc){
                exc.printStackTrace();
            }

        System.out.println("print complete");
    }
}

class Sender extends Thread {
    private String line;
    private Thread t;
    PrintLine prntln;

    // Receives a message object and a string
    // prints message
    Sender(String s, PrintLine obj){
        line = s;
        prntln = obj;
    }

    public void run(){
        synchronized (prntln){
            prntln.print(line);
        }
    }
}

class Controller {
    public static void main(String[] args) {
        PrintLine prntln = new PrintLine();
        Sender s1 = new Sender("printing from thread #1", prntln);
        Sender s2 = new Sender("printing from thread #2", prntln);

        s1.start();
        s2.start();

        try {
            s1.join();
            s2.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}