package labs_examples.input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 3: variety
 *    1) Demonstrate the usage of at least two additional Byte Streams - DONE
 *    2) Demonstrate the usage of at least two additional Character Streams - DONE
 *    3) Demonstrate using a buffer on one of the Byte Streams and one of the Character Streams - DONE
 *    4) Demonstrate the use of the DataInputStream and DataOutputStream - DONE
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

                bufferByteStream(file1);

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

        byte byteRead = (byte) data;
        System.out.println("Pushback input stream");
        System.out.println(byteRead);
        input.unread(byteRead);
        data = input.read();
    }

// Exercise 03 - 3) Buffer Byte Streams


    private static void bufferByteStream(String file1) throws IOException {

        // Use buffer equal to PC L1 cache = 128KB
        int bufferSize = 128 * 1024;

        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file1));

            int data = bufferedInputStream.read();
                while(data != -1){
                    data = bufferedInputStream.read();
                }

        bufferedInputStream.close();
    }
}

// Exercise 03 - 2) Character Streams

class CharacterStreams {

    // Serialise for Object Stream
    public static class Report implements Serializable {
        public String tool = null;
        public String equipmentNumber = null;
        public String author = null;
        public String date = null;
    }

    public static void main(String[] args) {

        // Character Stream files
        String charFile = "C:\\Users\\User\\Documents\\labs\\online-java-fundamentals\\src\\labs_examples\\input_output\\files\\char_data.txt";
        String objFile = "C:\\Users\\User\\Documents\\labs\\online-java-fundamentals\\src\\labs_examples\\input_output\\files\\report.bin";

        try {
            lineReader(charFile);

            objStream(objFile);

            bufferReader(charFile);


        } catch (FileNotFoundException ex) {
            ex.printStackTrace();

        } catch (IOException exc) {
            exc.printStackTrace();

        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }

// first Character Stream - Line Reader

    private static void lineReader(String charFile) throws IOException {

        LineNumberReader lineNumberReader = new LineNumberReader(new FileReader(charFile));

        int readData = lineNumberReader.read();
        while (readData != -1) {
            char charRead = (char) readData;
            readData = lineNumberReader.read();
            int lineNumber = lineNumberReader.getLineNumber();
            System.out.println("Reading line" + lineNumber);
        }
        System.out.println("File read successfully");
        lineNumberReader.close();
    }

// second Character Stream - Object Stream

    private static void objStream(String objFile) throws IOException, ClassNotFoundException {

        ObjectOutputStream objectOutputStream =
                new ObjectOutputStream(new FileOutputStream(objFile));

            Report report = new Report();
            report.tool = "A01";
            report.equipmentNumber = "001";
            report.author = "Jane Smith";
            report.date = "01DEC21";

        objectOutputStream.writeObject(report);
        objectOutputStream.close();

        ObjectInputStream objectInputStream =
                new ObjectInputStream(new FileInputStream(objFile));

            Report reportRead = (Report) objectInputStream.readObject();

        objectInputStream.close();

        System.out.println(reportRead.tool);
        System.out.println(reportRead.author);
    }

// Exercise 03 - 3) Buffer Character Streams

    private static void bufferReader(String charFile) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader(charFile));

        String line = bufferedReader.readLine();

        System.out.println("\n");

            while(line != null){
                System.out.println(line);
                line = bufferedReader.readLine();
            }
    }
}

class dataInputStream {

    public static void main(String[] args) {

        String dataFile = "C:\\Users\\User\\Documents\\labs\\online-java-fundamentals\\src\\labs_examples\\input_output\\files\\dataInput.bin";

        try {

            readWriteData(dataFile);

        } catch (IOException ex){
            ex.printStackTrace();
        }
    }

    private static void readWriteData(String dataFile) throws IOException {

        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(dataFile));

            dataOutputStream.writeInt(120);
            dataOutputStream.writeDouble(10.15);

        dataOutputStream.close();

        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(dataFile));

            int i = dataInputStream.readInt();
            double db = dataInputStream.readDouble();

        dataInputStream.close();

        System.out.println("Reading integers " + i);
        System.out.println("Reading doubles " + db);

    }

}
