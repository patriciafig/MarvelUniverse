/**
 * Created by patricia on 9/26/17.
 */

import java.io.*;
import java.util.*;

public class MarvelUniverse {
    public static void main(String[] args) {

        try {

            //PART 1 and 2

            // The first 2 parts require number of heroes and comics, that can be extracted from nodes.csv

            // Reading in the file
            File marvel_file = new File("nodes.csv");
            FileReader file_reader = new FileReader(marvel_file);
            BufferedReader b = new BufferedReader(file_reader);

            int count=0, com_count=0, hero_count=0;

            for (String line = b.readLine(); line != null; line = b.readLine()) {
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

            //The 3rd and 4th part require total count of all participations of heroes in every comic
            //which we can get from edges.csv


            


        } catch (IOException e) { System.out.println("File not found"); }     // file not found
        //catch (IOException e) { e.printStackTrace();     // could use this instead to print out the error


    }
}


