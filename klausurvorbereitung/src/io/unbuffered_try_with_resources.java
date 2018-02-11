package io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

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
 */
public class unbuffered_try_with_resources {
    public static void main (String[] args){

        String completeText = "";

        File inputFile = new File( "./src/io/input.txt" );
        File outputFile = new File( "output.txt" );
        try(
                FileReader fileReader = new FileReader ( inputFile );
        ){
            int remaining;
            while ( (remaining=fileReader.read()) != -1){
                System.out.println(remaining);
                completeText = completeText + remaining;
            }
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
                fileWriter.write(completeText);
            }
            catch (IOException e){
                System.out.println("An IO exception occurred while writing the file!");
                e.getMessage();
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }

}
