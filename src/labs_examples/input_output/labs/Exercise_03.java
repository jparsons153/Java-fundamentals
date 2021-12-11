package labs_examples.input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 3: variety
 *
 *    1) Demonstrate the usage of at least two additional Byte Streams
 *    2) Demonstrate the usage of at least two additional Character Streams
 *    3) Demonstrate using a buffer on one of the Byte Streams and one of the Character Streams
 *    4) Demonstrate the use of the DataInputStream and DataOutputStream
 *
 */

// Exercise 03 - 1) Byte Streams
class Byte_Streams {

    public static void main(String[] args) {
        // Byte Stream files
        String file1 = "C:\\Users\\User\\Documents\\labs\\online-java-fundamentals\\src\\labs_examples\\input_output\\files\\byte_data";
        String file2 = "C:\\Users\\User\\Documents\\labs\\online-java-fundamentals\\src\\labs_examples\\input_output\\files\\random.dat";


            try{
                addInputStreams(file1,file2);

                pushBackStream(file1);

            } catch (FileNotFoundException ex) {
                ex.printStackTrace();

            } catch (IOException exc) {
                exc.printStackTrace();
            }

    }

    private static void addInputStreams(String file1, String file2) throws IOException {

        InputStream input1 = null;
        InputStream input2 = null;

        input1 = new FileInputStream(file1);
        input2 = new FileInputStream(file2);
        SequenceInputStream sequenceInputStream = new SequenceInputStream(input1, input2);

        int read = sequenceInputStream.read();
            while (read != -1) {
                System.out.println(read);
                read = sequenceInputStream.read();
            }
    }

    private static void pushBackStream(String file1) throws IOException {

        // set limit for bytes to be unread
        int limit = 8;

        PushbackInputStream input = new PushbackInputStream(new FileInputStream(file1), limit);

        int data = input.read();

        // FOR loop - read, unread , read
        // print to console

        byte byteRead = (byte) data;
        System.out.println("Pushback input stream");
        System.out.println(byteRead);
        input.unread(byteRead);
        data = input.read();
    }
}

// Exercise 03 - 2) Character Streams

class CharacterStreams {

    public static void main(String[] args) {

        // Character Stream files
        String charFile = "C:\\Users\\User\\Documents\\labs\\online-java-fundamentals\\src\\labs_examples\\input_output\\files\\char_data.txt";

        try{
            lineReader(charFile);

        } catch (FileNotFoundException ex) {
        ex.printStackTrace();

        } catch (IOException exc) {
            exc.printStackTrace();
        }

    }

    public static void lineReader(String charFile) throws IOException {

        LineNumberReader lineNumberReader = new LineNumberReader(new FileReader(charFile));

        int readData = lineNumberReader.read();
        while(readData != -1){
            char charRead = (char) readData;
            readData = lineNumberReader.read();
            int lineNumber = lineNumberReader.getLineNumber();
            System.out.println("Reading line" + lineNumber);
        }
        System.out.println("File read successfully");
        lineNumberReader.close();
    }

// second Character Stream 

}