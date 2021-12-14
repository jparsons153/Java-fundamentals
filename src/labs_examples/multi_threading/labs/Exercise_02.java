package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 2:
 *
 *      Create an application that creates a Thread using the Thread class
 */

class ThreadController{

    public static void main(String[] args) {

        ExtendingThread thread_1 = new ExtendingThread("Thread_1");
        ExtendingThread thread_2 = new ExtendingThread("Thread_2");

        thread_1.setPriority(Thread.MAX_PRIORITY);
        thread_2.setPriority(Thread.MIN_PRIORITY);

        thread_1.start();
        thread_2.start();

            try{
                thread_1.join();
                thread_2.join();
            }catch (Exception e){
                e.printStackTrace();
            }
    }
}


class ExtendingThread extends Thread {

    ExtendingThread(String name){
        super(name);
        //start();
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
