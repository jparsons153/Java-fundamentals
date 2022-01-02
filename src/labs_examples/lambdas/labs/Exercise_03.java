package labs_examples.lambdas.labs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

/**
 * Lambdas Exercise 3:
 *      1) Demonstrate the use of a static method reference
 *      2) Demonstrate the use of an instance method reference
 *      3) Demonstrate the use of a constructor reference
 */

class Strings {

    public static void main(String[] args) {

    // 1) Use of a static method reference
        List<String> l = Arrays.asList("This is a string", "this is another string", "a", "test");

        findString(l, Strings::charLessThanTen);

    // 2) Use of an instance method reference
       String s1 = "new String";
       String s2 = "another new String";

        Strings obj = new Strings();
        BiFunction<String, String, String> ref = obj :: myMethod;
        System.out.println(ref.apply(s1,s2));

    // 3) Use of a constructor reference
        ReportInterface reportGen = Report::new;
        Report a = reportGen.createReport(12567,"Qualification of Tool XYZ");
        System.out.println(a.toString());
        
    }

    private static boolean charLessThanTen(String s) {
        return s.length() > 10;
    }

    private static List<String> findString(
            List<String> list, Predicate<String> func) {
        List<String> newList = new ArrayList<>();
        for (String i : list) {
            if (func.test(i)) {
                newList.add(i);
            }
            System.out.println(i);
        }
        return newList;
    }

    private String myMethod(String string1, String string2) {
        System.out.println("\n" + "Instance Method");
        return String.join(", ",string1, string2);
        }
}

@FunctionalInterface
interface ReportInterface{
    Report createReport(int reportNumber, String reportName);
}

class Report{
    int reportNumber;
    String reportName;

    public Report(int reportNumber, String reportName) {
        this.reportNumber = reportNumber;
        this.reportName = reportName;
    }

    @Override
    public String toString() {
        return "Report{" +
                "reportNumber=" + reportNumber +
                ", reportName='" + reportName + '\'' +
                '}';
    }
}