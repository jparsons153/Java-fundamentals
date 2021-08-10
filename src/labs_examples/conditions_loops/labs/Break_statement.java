package labs_examples.conditions_loops.labs;

public class Break_statement {
    public static void main (String[] args) {
        int i=0;
        // Break without a label
        for (i = 0; i < 10; i++) {
            System.out.println(i);
            if (i == 3)
                break;
        }
        // Break with label
        one: {
            two:{
                if(i==0) {
                    break one; // breaks to label one, prints message
                }
                System.out.println("Print in label two");  // if i !=0, this will print
            }
            System.out.println("Print in label one");
        }

    }
}
