package labs_examples.input_output.labs;

import labs_examples.input_output.examples.csv_parser.Student;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 *      Following the video examples and source code found in the src/labs_examples/input_output/examples/csv_parser
 *      package, create a new application that will parse a custom CSV file that you created and map each line of the
 *      csv to a custom POJO that you create.
 *
 *      Then add that object to an arraylist. After you have mapped each row of the csv to objects
 *      and added each object to an arraylist, print out each object using the objects custom toString() method.
 *
 *      Then, write the arraylist of objects back out to a new .csv file. Ensure that the resulting csv file is valid.
 *
 */


// read in csv file - DONE
// create bufferedReader & parse by ',' - DONE
// map each line to POJO - DONE
// add object to arrayList - DONE
// print object toString - DONE
// write objects in arrayList to new csv file
// catch exceptions

class CSV_Parse_Reports {

    public static void main(String[] args) {

        csvToObj();

    }
    public static void csvToObj(){

    // ArrayList of Reports
    ArrayList<Report> reports = new ArrayList();

    String filePath = "C:\\Users\\User\\Documents\\labs\\online-java-fundamentals\\src\\labs_examples\\input_output\\files\\Reports.csv";

        try (BufferedReader br =
                     new BufferedReader(new FileReader(filePath))) {

            String line;

            // parse csv file and add object to Reports arraylist
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                reports.add(mapValuesToReportObj(values));
            }
        } catch (
            FileNotFoundException e) {
            e.printStackTrace();
        } catch (
            IOException e) {
            e.printStackTrace();
            }

            // Print toString for each report in Arraylist
            for(Report report : reports){
                System.out.println(report.toString());
            }
    }

    private static Report mapValuesToReportObj(String[] values){
        Report report = new Report();

        report.setTool(values[0]);
        report.setEquipmentNumber(values[1]);
        report.setAuthor(values[2]);
        report.setDate(values[3]);

        return report;
    }
}




