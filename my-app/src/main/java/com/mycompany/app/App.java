package com.mycompany.app;

/**
 * Hello world!
 *
 */
import java.awt.*;
import javax.swing.*;

public class App extends JFrame {
    public static void main(String[] args){

        JFrame frame = new JFrame();
        JButton button = new JButton("button");

        frame.add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}