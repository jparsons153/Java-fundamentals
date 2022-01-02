package labs_examples.generics.labs;

import java.util.*;

/**
 * Generics Exercise 3:
 * 1) Write a generic method that accepts two generic arguments. This generic method should only accept
 * arguments which are subclasses of Number. The generic method must return the sum (as a double) of whatever two
 * numbers were passed in regardless of their type.
 * 2) Write a generic method to count the number of elements in a "Collection" of Strings that are palindromes
 * 3) Write a generic method to exchange the positions of two different elements in an array.
 * 4) Write a generic method to find the largest element within the range (begin, end) of a list.
 */

class Exercise_03 {

    public static void main(String[] args) {

// Exercise 3) -1
        int number1 = 5;
        int number2 = 14;

        double sumInt = sumNums(number1, number2);
        System.out.println("Sum of numbers: " +sumInt +"\n");

        double number3 = 6.23;
        double number4 = 3.14;

        double sumDouble = sumNums(number3, number4);
        System.out.println("Sum of numbers: " +sumDouble +"\n");


// Exercise 3) -2

        ArrayList<String> newList = new ArrayList<>();
        newList.add("no lemon no melon");
        newList.add("was it a cat I saw?");
        newList.add("never odd or even");
        newList.add("stressed desserts");
        newList.add("step on no pets");
        newList.add("too hot to hoot");
        newList.add("borrow or rob");

        Integer elementCount = countElements(newList);
        System.out.println("\n"+"Count of elements: " +elementCount +"\n");

// Exercise 3) -3

        Integer[] arra = {20, 5, 19, 30, 6};
        System.out.println("Numbers in array: ");
        for (int ele : arra) {
            System.out.print(ele + ", ");
        }

        Integer[] returnArray = swapValues(arra);
        System.out.println("Numbers in array post swap: ");

        for (int ele : returnArray) {
            System.out.print(ele + ", ");
        }

// Exercise 3) -4
        //generic method to find the largest element within the range (begin, end) of a list

        ArrayList<Integer> intArray = new ArrayList<>();
        intArray.add(5);
        intArray.add(10);
        intArray.add(15);
        intArray.add(20);

        Integer maxResult = largestEle(intArray);
        System.out.println("Largest element in range: " +maxResult +"\n");
    }

    // List can be ArrayList of LinkedList, generic for list type and primitive type?
    // class/ objects or primitive types.
    private static <E extends Collection, T extends Number> int largestEle(List<T> arra) {
        int beginIndex;
        int endIndex;
        int max=0;

        System.out.println("\n\n"+"Numbers in array: ");
        for(T element:arra){
            System.out.print(element + ", ");
        }

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("\n"+"Specify beginning index of range within list: ");
        beginIndex = scanner3.nextInt();

        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Specify end index of range within list: ");
        endIndex = scanner4.nextInt();

        ArrayList<T> sublist = new ArrayList<>();

        int i =1;

        for (T value: arra){
            if(beginIndex<=i && i<=endIndex) {
                sublist.add(value);
            }
            i++;
        }

        for (T value: sublist){
            if(value.intValue() >= max){
                max = value.intValue();}
        }

        return max;
    }

    private static <E> E[] swapValues(E[] arra) {
        E tempVar1 = null;
        E tempVar2 = null;
        int index1;
        int index2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n"+ "Specify 1st index of array to be swapped: ");
        index1 = scanner.nextInt();
        tempVar1 = arra[index1];

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Specify 2nd index of array to be swapped: ");
        index2 = scanner2.nextInt();
        tempVar2 = arra[index2];

        arra[index2] = tempVar1;
        arra[index1] = tempVar2;

        return arra;
    }

    private static <E extends Collection, T> int countElements(Collection<T> list) {

        System.out.println("Palindromes in collection: ");
        for(T e : list){
            System.out.println(e);
        }

        return list.size();
    }

    private static <T extends Number> double sumNums(T x, T y) {
        return x.doubleValue() + y.doubleValue();
    }
}