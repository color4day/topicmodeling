package topicmodel;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;


public class Song {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        BufferedReader br=new BufferedReader(new FileReader("Z.txt"));
        String line = br.readLine();


        String filename= "Z_" + 0 +".txt";
        File file=new File(filename);
        PrintWriter output=new PrintWriter(file);

        int i=0;
        while(line!=null)
        {
            String[] lineArray = line.split(" ");
            if(lineArray.length > 0 && lineArray[0].equals("Title:"))
            {
                line=br.readLine();
                lineArray = line.split(" ");
                if(lineArray.length > 0 && lineArray[0].equals("Post") && lineArray[1].equals("by:"))
                {
                    line=br.readLine();
                    lineArray = line.split(" ");

                    if(lineArray.length > 0 && lineArray[0].equals("Quote") && lineArray[1].equals("from:"))
                    {
                        line=br.readLine();
                    }
                    output.close();
                    i++;
                    filename= "Z_" + i +".txt";
                    file=new File(filename);
                    output=new PrintWriter(file);
                    output.print(line);
                    output.println();
                    System.out.println(line);
                    line=br.readLine();
                }
            }
            else
            {
                output.print(line);
                output.println();
                System.out.println(line);
                line=br.readLine();
            }
        }
        //System.out.println(line);
    }

}

// hahahahaha