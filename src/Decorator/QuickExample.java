/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Andrea
 */
public class QuickExample {
    public static void main(String[] args) {
        try {        
            InputStream is = new FileInputStream("somefile.txt");
            //InputStreamReader isr = new InputStreamReader(is);
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            br.readLine();
        } catch (Exception e) {
        }
        
        JTextArea jta = new JTextArea(20,30);
        JScrollPane jsp = new JScrollPane(jta);
    }
}
