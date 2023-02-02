package org.example;

import java.io.*;

public class LeseFromTextDatei {
    public void leseText() throws IOException {
        String fileName = "TestFile.txt";
        File file = new File(fileName);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null) {
            //process the line
            System.out.println(line);
            //sasa
        }
    }
}