package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 1:
 *      1: Create an application that starts a Thread by implementing the Runnable interface
 *      2: Demonstrate at least two distinct ways of initiating a Thread using the Runnable you just created
 */

class MultiThreadController {

    public static void main(String[] args) {

    // Exercise 01 - 1)
        System.out.println("Starting Thread");
        RunnableThread thread1 = new RunnableThread("RunnableThreadNo.1");
        RunnableThread thread2 = new RunnableThread("RunnableThreadNo.2");
        System.out.println("Ending Thread");

    // Exercise 01 -2)
    // Option 01
        System.out.println("Excerise 01 - 2, starting...");
        Thread thread3 = new Thread(new RunnableThread("Option 01"));

    // Option 02
        new Thread(new RunnableThread("Option 02")).start();
        System.out.println("Exercise 01 - 02, ending...");
    }
}

class RunnableThread implements Runnable {

    Thread thread;

    public RunnableThread(String name){
        thread = new Thread(this, name);
        thread.start();
    }

    @Override
    public void run(){
            try{
                for(int i = 10; i > 0; i--){
                    Thread.sleep(800);
                    System.out.println("Thread " +thread.getName() + " count is " +i);
                }
            }catch (InterruptedException ex){
                ex.printStackTrace();
            }
        System.out.println(thread.getName() + " terminating");
    }
}



