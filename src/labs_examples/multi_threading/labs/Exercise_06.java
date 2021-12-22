package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 6:
 *      Write a program that will print 1-100 sequentially from at least two distinct threads. For instance, thread1 will
 *      print "1", then thread2 will print "2", then thread1 will print "3", then thread2 will print "4" and so on.
 */

class WaitOrNotify{
    public static void main(String[] args) {

        Count obj = new Count();

       MainThread thread1 = new MainThread("counter1", obj);
       MainThread thread2 = new MainThread ("counter2", obj);
    }
}

class Count {
    static int currentCount =0;
    String counter;

   synchronized void Counter1Count() {
       counter = "counter1";
       System.out.println(counter);
       currentCount +=1;
       System.out.println(currentCount);
       notify();
           try {
               while (counter.equals("counter1")) {
                   wait();
               }
           } catch (InterruptedException ex) {
               ex.printStackTrace();
           }
   }

   synchronized void Counter2Count(){
       counter = "counter2";
       System.out.println(counter);
       currentCount +=1;
       System.out.println(currentCount);
       notify();
           try {
               while (counter.equals("counter2")) {
                   wait();
               }
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
   }
}

   class MainThread extends Thread {
       String name;
       Count countobj;

       MainThread(String name, Count countobj) {
           this.name = name;
           this.countobj = countobj;
           setName(name);
           start();
       }

       @Override
       public void run() {

           for (int i = 1; i < 51; i++) {

               if (name.equals("counter1")) {
                   countobj.Counter1Count();
               }
               if (name.equals("counter2")) {
                   countobj.Counter2Count();
               }
           }
       }
   }