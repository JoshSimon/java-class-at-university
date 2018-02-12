package io;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;

/**
 * input and output can be done very differently in Java due to the age of the language
 *
 *
 *                        |                          |
 *                        | reading 8bit characters  | 16bit Java default
 * _______________________|__________________________|_____________________
 *                        |                          |
 * fast                   | yes                      | no                     <-- legacy code
 * _______________________|__________________________|_____________________
 *                        |                          |
 * modern character safe  | no                       | yes
 * UTF-16 characters      |                          |
 *
 *
 *                        |
 *                        | buffered reader          | unbuffered reader
 * _______________________|__________________________|_____________________
 *                        |                          |
 * fast                   | yes                      | no
 * _______________________|__________________________|_____________________
 *                        |                          |
 * safe                   | no, if exception occurs  | yes
 *                        | buffer content lost      |
 *
 *
 * the solution below seems to be most reasonable (unbuffered, try-with-resources, 16bit default)
 * for characters
 *
 * it could also read integers if you test if Integer(String ...) works
 * you could also concat the String and then parse it to one integer
 * or split the string and then parse
 */
public class unbuffered_try_with_resources {
    public static void main (String[] args){

        final CharsetDecoder dec = Charset.forName("UTF-8").newDecoder();

        File inputFile = new File( "./src/io/input.txt" );
        File outputFile = new File( "output.txt" );

        char[] completeText;

        try {
            if(inputFile.length() > Integer.MAX_VALUE){
                throw new custom_exception("The file cannot be read completely, it is too large.");
            }
            completeText = new char[(int) inputFile.length()]; // ! does not go well for large files

            try(
                    FileReader fileReader = new FileReader ( inputFile );
            ){
                int remaining;
                while ( (remaining= fileReader.read(completeText)) != -1){
                    System.out.println(remaining);
                }
            }
            catch (FileNotFoundException e){
                System.out.println("The file could not be found");
                e.printStackTrace();
            }
            catch (IOException e){
                System.out.println("An IO exception occurred while reading the file!");
                e.printStackTrace();
            }
            catch (Exception e){
                e.printStackTrace();
            }
            finally {
                try(
                        FileWriter fileWriter = new FileWriter ( outputFile )
                ){
                    String returnString="";
                    for(char t : completeText){
                        System.out.println(t);
                        returnString = returnString + t;
                    }
                    fileWriter.write(returnString);
                }
                catch (IOException e){
                    System.out.println("An IO exception occurred while writing the file!");
                    e.getMessage();
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }

        } catch (custom_exception e){
            e.getMessage();
        }


    }

}
