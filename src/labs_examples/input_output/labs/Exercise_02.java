package labs_examples.input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 2: File encryption
 *
 *      -Using the BufferedReader, read a file character by character and write an encrypted version to a new file.
 *      -For example, change every 'a' to '-' and every 'e' to '~' .
 *      -Make sure you close the connections to both files.
 *
 *      Then, read back the encrypted file using the BufferedReader and
 *      print out the unencrypted version. Does it match the original file?
 *
 */

class ReadWriteEncryption {

    public static void main(String[] args) {

        String fileReadPath = "C:\\Users\\User\\Documents\\labs\\online-java-fundamentals\\src\\labs_examples\\input_output\\files\\char_data.txt";
        String fileWritePath = "C:\\Users\\User\\Documents\\labs\\online-java-fundamentals\\src\\labs_examples\\input_output\\files\\rewrite_char_data.txt";

        encrypte(fileReadPath, fileWritePath);
        decrypte(fileReadPath, fileWritePath);
    }

    public static void encrypte(String fileReadPath, String fileWritePath) {

        BufferedReader inputStream = null;
        PrintWriter outputStream = null;

        try {
            inputStream = new BufferedReader(new FileReader(fileReadPath));
            outputStream = new PrintWriter(new FileWriter(fileWritePath));

            int charRead;

            do {

                if ((charRead = inputStream.read()) != -1) { // if end of file is not reached change 'a' to '-' and 'e' to '~'
                    if (charRead == 'a') {
                        charRead = '-';
                    } else if (charRead == 'e') {
                        charRead = '~';
                    }
                    outputStream.print((char) charRead); // write to file
                    System.out.print((char) charRead);
                }
            } while (charRead != -1);

        } catch(IOException ex) {
            ex.printStackTrace();
        } finally {
            // close connections
            // replace with try with resources

            try {
                inputStream.close();
                outputStream.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
}

    public static void decrypte(String fileReadPath, String fileWritePath) {

        BufferedReader inputStream = null;
        PrintWriter outputStream = null;

        try {
            inputStream = new BufferedReader(new FileReader(fileReadPath));
            outputStream = new PrintWriter(new FileWriter(fileWritePath));

            //char[] buffer = new char[5]; // char buffer of 5
            int charRead;

            System.out.println("\n \n");
            System.out.println("Decrypting file....\n");

            do {

                if ((charRead = inputStream.read()) != -1) { // if end of file is not reached change 'a' to '-' and 'e' to '~'
                    if (charRead == '-') {
                        charRead = 'a';
                    } else if (charRead == '~') {
                        charRead = 'e';
                    }
                    System.out.print((char) charRead);
                }
            } while (charRead != -1);

        } catch (IOException ex) {
            ex.printStackTrace();

        } finally {
            // close connections

            try {
                inputStream.close();
                outputStream.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}