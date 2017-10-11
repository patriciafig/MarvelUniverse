/**
 * Created by patricia on 9/26/17.
 */

import java.io.*;
import java.util.*;

public class MarvelUniverse {
    public static void main(String[] args) {

        try {

            //PART 1 and 2
            //The first 2 parts require number of heroes and comics, that can be extracted from nodes.csv

            // Reading in the file

            File marvel_file = new File("nodes.csv");  // file created
            FileReader file_reader = new FileReader(marvel_file);

            /*
            * FileReader is the convenience class for reading character files
            * Meant for reading streams of characters
            */
            BufferedReader b = new BufferedReader(file_reader);
            /* BufferredReader reads text from a character-input stream,
               buffering characters so as to provide for the efficient
               reading of characters, arrays, and lines.
             */

            int count=0, com_count=0, hero_count=0;

            for (String line = b.readLine(); line != null; line = b.readLine()) {      // go through each line
                count++;
                if (count==1)       // To ignore 1st line of csv file
                    continue;

                if(line.charAt(line.length()-1)=='c')   //when line entry is comic
                    com_count++;
                else                                    //when line entry is hero
                    hero_count++;
            }

            System.out.println("Number of comics : " + com_count);
            System.out.println("Number of heroes : " + hero_count);

            //PART 3 and 4

            //The 3rd and 4th part require total count of all participation of heroes in every comic
            //which we can get from edges.csv

            // Reading in the file
            marvel_file = new File("edges.csv");
            file_reader = new FileReader(marvel_file);
            b = new BufferedReader(file_reader);
            int file_count=0;
            count = 0;

            for (String line = b.readLine(); line != null; line = b.readLine()) {
                count++;
                if (count==1)
                    continue;

                file_count++;
            }

            // Total sum of heroes in all comics / number of comics = mean heroes / comic
            // Total sum of heroes in all comics / number of heroes = mean comics / heroes

            System.out.println("Mean Heroes per comic : " + file_count/com_count);
            System.out.println("Mean Comics per hero : " + file_count/hero_count);

            //PART 4

            marvel_file = new File("hero-network.csv");
            file_reader = new FileReader(marvel_file);
            b = new BufferedReader(file_reader);
            file_count=0;
            count = 0;

            for (String line = b.readLine(); line != null; line = b.readLine()) {
                count++;
                if (count==1)
                    continue;

                file_count++;
            }

            // Total sum of all partners to every hero / number of heroes = mean partner / hero

            System.out.println("Mean Partners per hero : " + file_count/hero_count);

        } catch (IOException e) { System.out.println("File not found"); }     // file not found
        //catch (IOException e) { e.printStackTrace();     // could use this instead to print out the error

    }
}



