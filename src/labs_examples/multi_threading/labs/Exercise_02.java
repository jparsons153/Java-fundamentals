package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 2:
 *
 *      Create an application that creates a Thread using the Thread class
 */

class ThreadController{

    public static void main(String[] args) {
        ExtendingThread thread1 = new ExtendingThread("Thread_1");
    }
}


class ExtendingThread extends Thread {

    ExtendingThread(String name){
        super(name);
        start();
    }

    @Override
    public void run(){
        System.out.println("Thread" + getName() + " starting...");
        try{
            for(int j =0; j <20; j+=2){
                Thread.sleep(500);
                System.out.println("Thread " +getName() + " count = " + j);
            }
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
        System.out.println("Thread" + getName() + " ending...");
    }
}
