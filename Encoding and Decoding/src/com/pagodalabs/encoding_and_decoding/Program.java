package com.pagodalabs.encoding_and_decoding;

import com.pagodalabs.encoding_and_decoding.window.Window;
import javax.swing.JFrame;

public class Program {

    public static void main(String[] args) {
        Window window = new Window();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(300,125);
        window.setVisible(true);
        
    }
    
}
