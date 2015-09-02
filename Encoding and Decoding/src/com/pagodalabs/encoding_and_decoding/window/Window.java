package com.pagodalabs.encoding_and_decoding.window;

import com.pagodalabs.encoding_and_decoding.encoding.Encode;
import com.pagodalabs.encoding_and_decoding.encoding.decoding.Decode;
import com.pagodalabs.encoding_and_decoding.util.Input;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Window extends javax.swing.JFrame {

    public Window() {
        setTitle("Encoder and Decoder");
        initComponents();
    }
    
    public int fileChooser(){
       int result = 0;
       fileChooser = new JFileChooser();
        fileChooser.setAcceptAllFileFilterUsed(false);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Text File", "txt");
        fileChooser.addChoosableFileFilter(filter);
        result = fileChooser.showOpenDialog(null);
        return result;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        encode = new javax.swing.JLabel();
        enSource = new javax.swing.JButton();
        enDestination = new javax.swing.JButton();
        decode = new javax.swing.JLabel();
        deSource = new javax.swing.JButton();
        deDestination = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.FlowLayout());

        encode.setText("Encoding: ");
        getContentPane().add(encode);

        enSource.setText("Source");
        enSource.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enSourceActionPerformed(evt);
            }
        });
        getContentPane().add(enSource);

        enDestination.setText("Desitnation");
        enDestination.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enDestinationActionPerformed(evt);
            }
        });
        getContentPane().add(enDestination);

        decode.setText("Decoding: ");
        getContentPane().add(decode);

        deSource.setText("Source");
        deSource.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deSourceActionPerformed(evt);
            }
        });
        getContentPane().add(deSource);

        deDestination.setText("Destination");
        deDestination.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deDestinationActionPerformed(evt);
            }
        });
        getContentPane().add(deDestination);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enSourceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enSourceActionPerformed
        int result = fileChooser();
        if(result == JFileChooser.APPROVE_OPTION){
            try{
                encoded = Encode.encode(Input.reader(fileChooser.getSelectedFile()));
                JOptionPane.showMessageDialog(null, "File Selected: "+fileChooser.getSelectedFile().getName(), "Encoder", JOptionPane.INFORMATION_MESSAGE);
            /*
            BufferedReader reader = new BufferedReader(new FileReader(fileChooser.getSelectedFile()));
            String line = "";
            String content = "";
            
            while((line = reader.readLine())!=null)
            {
                content = line;
                encoded = Encode.encode(content);
            }
            reader.close();
            */    
            }catch(FileNotFoundException fnfe){
            System.out.println(fnfe.getMessage());
            }catch(IOException ioe){
            System.out.println(ioe.getMessage());
            }
        }
    }//GEN-LAST:event_enSourceActionPerformed

    private void enDestinationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enDestinationActionPerformed
        int result = fileChooser();
        if(result == JFileChooser.APPROVE_OPTION)
        {
        try{
            Input.writer(fileChooser.getSelectedFile(),encoded);
            JOptionPane.showMessageDialog(null, "Encoded to : "+fileChooser.getSelectedFile().getName(), "Encoder", JOptionPane.INFORMATION_MESSAGE);
        /*
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileChooser.getSelectedFile()));
        writer.write(encoded);
        writer.flush();
        writer.close();
        */
        }catch(FileNotFoundException fnfe){
            System.out.println(fnfe.getMessage());
            }catch(IOException ioe){
            System.out.println(ioe.getMessage());
            }
        }
    }//GEN-LAST:event_enDestinationActionPerformed

    private void deSourceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deSourceActionPerformed
        int result = fileChooser();
        if(result == JFileChooser.APPROVE_OPTION){
            try{
                decoded = Decode.decode(Input.reader(fileChooser.getSelectedFile()));
                JOptionPane.showMessageDialog(null, "File Selected: "+fileChooser.getSelectedFile().getName(), "Decoder", JOptionPane.INFORMATION_MESSAGE);
           /*
            BufferedReader reader = new BufferedReader(new FileReader(fileChooser.getSelectedFile()));
            String line = "";
            String content = "";
            
            while((line = reader.readLine())!=null)
            {
                content = line;
                decoded = Decode.decode(content);
            }
            reader.close();
            */
                
            }catch(FileNotFoundException fnfe){
            System.out.println(fnfe.getMessage());
            }catch(IOException ioe){
            System.out.println(ioe.getMessage());
            }
        }
    }//GEN-LAST:event_deSourceActionPerformed

    private void deDestinationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deDestinationActionPerformed
        int result = fileChooser();
        if(result == JFileChooser.APPROVE_OPTION)
        {
        try{
            Input.writer(fileChooser.getSelectedFile(),decoded);
            JOptionPane.showMessageDialog(null, "Decoded to : "+fileChooser.getSelectedFile().getName(), "Decoder", JOptionPane.INFORMATION_MESSAGE);
            
        /*
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileChooser.getSelectedFile()));
        writer.write(decoded);
        writer.flush();
        writer.close();
        */
        }catch(FileNotFoundException fnfe){
            System.out.println(fnfe.getMessage());
            }catch(IOException ioe){
            System.out.println(ioe.getMessage());
            }
        }
    }//GEN-LAST:event_deDestinationActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deDestination;
    private javax.swing.JButton deSource;
    private javax.swing.JLabel decode;
    private javax.swing.JButton enDestination;
    private javax.swing.JButton enSource;
    private javax.swing.JLabel encode;
    // End of variables declaration//GEN-END:variables
    private JFileChooser fileChooser;
    private String encoded = "";
    private String decoded = "";
}
