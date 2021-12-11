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

class Byte_Streams {

    public static void main(String[] args) {

        addInputStreams();

        pushBackStream();

    }

    private static void addInputStreams() {

        InputStream input1 = null;
        InputStream input2 = null;

        try {

            input1 = new FileInputStream("C:\\Users\\User\\Documents\\labs\\online-java-fundamentals\\src\\labs_examples\\input_output\\files\\byte_data");
            input2 = new FileInputStream("C:\\Users\\User\\Documents\\labs\\online-java-fundamentals\\src\\labs_examples\\input_output\\files\\random.dat");
            SequenceInputStream sequenceInputStream = new SequenceInputStream(input1, input2);

            int read = sequenceInputStream.read();
            while (read != -1) {
                System.out.println(read);
                read = sequenceInputStream.read();
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();

        } catch (IOException exc) {
            exc.printStackTrace();
        }
    }

    private static void pushBackStream() {

        // set limit for bytes to be unread
        int limit = 8;

        try {
            PushbackInputStream input = new PushbackInputStream(new FileInputStream("C:\\Users\\User\\Documents\\labs\\online-java-fundamentals\\src\\labs_examples\\input_output\\files\\byte_data"), limit);

            int data = input.read();

                byte byteRead = (byte) data;
                System.out.println("Pushback input stream");
                System.out.println(byteRead);
                input.unread(byteRead);
                data = input.read();


        }catch (FileNotFoundException ex){
            ex.printStackTrace();
        }catch (IOException exc){
            exc.printStackTrace();
        }
    }
}