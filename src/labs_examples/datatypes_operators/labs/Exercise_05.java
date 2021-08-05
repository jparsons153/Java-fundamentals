package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all logical operators below. These include:
 *
 * AND, short-circuit AND, OR, short-circuit OR, XOR, NOT
 *
 */
class LogicalOperators {

    public static void main(String[] args) {

        // example of "OR"
        boolean a = true;
        boolean b = false;
        if (a | b){
            System.out.println("a or b is true");
        }

        // write your code below

        // AND
        boolean a1 = true;
        boolean b1 = true;
        if (a1 & b1){
            System.out.println("a1 and b1 is true");
        }

        // short circuit AND
        boolean a2 = true;
        boolean b2 = true;
        if (a2 && b2){
            System.out.println("a2 and b2 is true");
        }

        // OR
        boolean a3 = true;
        boolean b3 = false;
        if (a3 | b3){
            System.out.println("a3 or b3 is true");
        }

        // short circuit OR
        boolean a4 = true;
        boolean b4 = false;
        if (a4 || b4){
            System.out.println("a4 or b4 is true");
        }

        // XOR
        boolean a5 = true;
        boolean b5 = false;
        if (a5 ^ b5){
            System.out.println("a5 or b5 is true, but not both");
        }

        // NOT
        boolean a6 = true;
                   System.out.println("a6 through NOT gate = " + !a6);
        }

    }

