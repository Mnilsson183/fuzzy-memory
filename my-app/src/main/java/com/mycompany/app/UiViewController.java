package com.mycompany.app;

/*
 * 
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class UiViewController extends JFrame{
    //================================ constants


    //================================ instance
    // general model
    private AppModel m_logic;

    // components

    private JTextField m_reps = new JTextField(5);
    private JTextField m_weight = new JTextField(20);
    private ToggleSwitch m_Switch = new ToggleSwitch();
    private JButton    m_submitButton = new JButton("Submit");
    private JButton    m_clearButton = new JButton("Reset");


    //================================ constructor
    UiViewController(){

        m_logic = new AppModel();

        JPanel content = new JPanel();
        content.setLayout(new FlowLayout());
        content.add(new JLabel("Input"));
        content.add(m_reps);
        content.add(m_weight);
        content.add(m_Switch);
        content.add(m_submitButton);
        content.add(m_clearButton);

        // add button listeners
        m_submitButton.addActionListener(new submitListener());
        m_clearButton.addActionListener(new clearListener());

        this.setContentPane(content);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Workout-App");
    }

    /*
     * When input is read send the data from text boxes into the database
     */
    class submitListener implements ActionListener {
        public void actionPerformed(ActionEvent e){

        }
    }

    class clearListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            
        }
    }

}