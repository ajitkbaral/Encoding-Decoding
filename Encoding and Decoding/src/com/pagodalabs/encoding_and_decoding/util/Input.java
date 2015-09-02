package com.pagodalabs.encoding_and_decoding.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Input {

    public static String reader(File file) throws FileNotFoundException, IOException{
        String content = "";
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String lines = "";
        String line = "";
        while((lines = reader.readLine())!=null)
        {
            line = lines;
            content = line;
        }
        reader.close();
        return content;
    }
    
    public static void writer(File File, String content) throws IOException{
        BufferedWriter writer = new BufferedWriter(new FileWriter(File));
        writer.write(content);
        writer.flush();
        writer.close();
        
    }
}
