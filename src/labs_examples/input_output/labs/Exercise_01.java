package labs_examples.input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 1: File input/output
 *
 *      Using the BufferedInputStream, read a text file 5 bytes at a time and write each byte to a new file.
 *      Make sure you close the connections to both files.
 *
 *
 */

class Example {
    public static void main(String[] args) {

        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;

        String inFilePath = "C:\\Users\\User\\Documents\\labs\\online-java-fundamentals\\src\\labs_examples\\input_output\\files\\byte_data";
        String outFilePath = "C:\\Users\\User\\Documents\\labs\\online-java-fundamentals\\src\\labs_examples\\input_output\\files\\some_output_file.txt";

        try {
            inputStream = new FileInputStream(inFilePath);
            bufferedInputStream = new BufferedInputStream(inputStream);

            outputStream = new FileOutputStream(outFilePath);
            bufferedOutputStream = new BufferedOutputStream(outputStream);

            byte[] buffer = new byte[5];
            int bytesRead = 0;

            while ((bytesRead = bufferedInputStream.read(buffer)) != -1) {
                // write contents to a new file
                outputStream.write(bytesRead);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            // replace with try with resources

            try {
                inputStream.close();
                bufferedInputStream.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            try{
                outputStream.close();
                bufferedOutputStream.close();
            } catch (IOException ex){
                ex.printStackTrace();
            }
        }
    }
}