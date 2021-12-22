package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 5:
 *
 *      Demonstrate the use of a wait() and notify()
 */

class WaitNotify {
    public static void main(String[] args) {
        DayAndNight day = new DayAndNight();
        Week thread1 = new Week("WakeUp", day);
        Week thread2 = new Week("Sleep", day);
    }
}

class DayAndNight {

    String currentState = "";

    synchronized void WakeUp(){
        currentState = "WakeUp";
        System.out.println(currentState);
        notify();
        try{
            while(currentState.equals("WakeUp")){
                wait();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    synchronized void Sleep(){
        currentState = "Sleep";
        System.out.println(currentState);
        notify();
        try{
            while(currentState.equals("Sleep")){
                wait();
            }
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
    }
}

class Week extends Thread {
    String name;
    DayAndNight dayref;

    Week(String name, DayAndNight dayref){
        this.name = name;
        this.dayref = dayref;
        setName(name);
        start();
    }

    @Override
    public void run(){
        if(name.equals("WakeUp")){
            for (int i =0; i<8; i++){
                dayref.WakeUp();
            }
        }
        if (name.equals("Sleep")){
            for (int i =0; i<8; i++){
                dayref.Sleep();
            }
        }
    }
}