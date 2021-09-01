package labs_examples.objects_classes_methods.labs.methods;

public class HighAndLow_Array {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] returnHigh = ReturnHigh(array);
     //   int[] returnLow = ReturnLow(array);


        System.out.println("Highest 3 numbers in Array = ");
        for (int n : returnHigh) {
            System.out.print(n + " ");
        }

  //      System.out.println("\n" + "Lowest 3 numbers in Array = ");
  //      for (int n : returnLow) {
  //          System.out.print(n + " ");
        }


    public static int[] ReturnHigh(int[] array) {
        int[] returnHigh = new int[3]; // array for storing top 3 max values
        returnHigh[0] = 0; // initialise
        int tempHi = 0; // temp variable for current max

        // nested for loop to iterate through each index in array for each of the 3 values in returnHigh
        for (int j = 0; j < returnHigh.length; j++) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] < tempHi) { // find next highest value which is less than temp value
                    returnHigh[j] = array[i];
                    continue;
                } else if (array[i] == tempHi && j > 0) { //next highest number can't be same as previous
                    tempHi = array[i - 1];
                    break;
                } else if (array[i] > returnHigh[j]) { // find highest number
                    returnHigh[j] = array[i];
                    tempHi = returnHigh[j]; // store result in returnHigh & tempHi
                }
            }
        }
        return returnHigh;
    }

 /*   public static int[] ReturnLow(int[] array) {
        int[] returnLow = new int[3]; // array for storing top 3 min values
        returnLow[0] = array[0];
        returnLow[1] = array[1];
        returnLow[2] = array[2];// initialise
        int tempLo = array[0]; // temp variable for current min

        // nested for loop to iterate through each index in array for each of the 3 values in returnLow
        for (int j = 0; j < returnLow.length; j++) {
            for (int i = 0; i < array.length; i++) {

                if (array[i] <= returnLow[j]) {
                    returnLow[j] = array[i];
                    tempLo = returnLow[j]; // find minimum value
                    continue;
                } else if (array[i] < returnLow[j] = array[i];

                //else if (array[i] == tempLo & j>0){
                //  tempLo = array[i];
            }
        }
       return returnLow;
 */  }


