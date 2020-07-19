//Java Program to find particular text in a text file using regex
package container;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
import java.io.IOException;

public class TextSearch {
	public static void main(String args[]) {
        try {
            String stringSearch = "the";
            // Open the file c:\test.txt as a buffered reader
            BufferedReader bf = new BufferedReader(new FileReader("test.txt"));

            // Start a line count and declare a string to hold our current line.
            int linecount = 0;
                String line;

            // Let the user know what we are searching for
            System.out.println("Searching for " + stringSearch + " in file...");

            // Loop through each line, stashing the line into our line variable.
            while (( line = bf.readLine()) != null){
                // Increment the count and find the index of the word
                linecount++;
                int indexfound = line.indexOf(stringSearch);

                // If greater than -1, means we found the word
                if (indexfound > -1) {
                    System.out.println("Word was found at position " + indexfound + " on line " + linecount);
                }
            }

            // Close the file after done searching
            bf.close();
        }
        catch (IOException e) {
            System.out.println("IO Error Occurred: " + e.toString());
        }
    }
}