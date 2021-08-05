package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all relational operators below. These include:
 *
 * less than, less than or equal to, greater than, greater than or equal to, and equal to
 *
 */
class RelationalOperators {

    public static void main(String[] args) {

        // example of "less than"
        int a = 1;
        int b = 2;
        if (a < b){
            System.out.println("a is less than b");
        }

        // write your code below

        // less than or equal to
        int a1 = 2;
        int b1 = 2;
        if (a1 <= b1) {
            System.out.println("a1 is less than or equal to b1");
        }

        // greater than
        int a2 = 4;
        int b2 = 2;
        if (a2 > b2) {
            System.out.println("a2 is greater than b2");
        }

        // greater than or equal to
        int a3 = 2;
        int b3 = 2;
        if (a3 >= b3) {
            System.out.println("a3 is greater than or equal to b3");
        }

        // equal to
        int a4 = 2;
        int b4 = 2;
        if (a4 == b4) {
            System.out.println("a4 is equal to b4");
        }

    }

}

