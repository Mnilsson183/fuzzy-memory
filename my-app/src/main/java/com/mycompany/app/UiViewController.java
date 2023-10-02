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

    private JTextField m_repsTextField = new JTextField(5);
    private JTextField m_weighTextField = new JTextField(20);
    private ToggleSwitch m_ToggleSwitch = new ToggleSwitch();
    private JButton    m_submitButton = new JButton("Submit");
    private JButton    m_clearButton = new JButton("Reset");


    //================================ constructor
    UiViewController(){

        m_logic = new AppModel();

        JPanel content = new JPanel();
        content.setLayout(new FlowLayout());
        content.add(new JLabel("Input"));
        content.add(m_repsTextField);
        content.add(m_weighTextField);
        content.add(m_ToggleSwitch);
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
            String userInputStringReps = "";
            String userInputStringWeight = "";
            try {
                userInputStringReps = m_repsTextField.getText();
                userInputStringWeight = m_weighTextField.getText();

                m_logic.submitReps(userInputStringReps);
                m_logic.SubmitWeight(userInputStringWeight);

            } catch (Exception b) {
                JOptionPane.showMessageDialog(UiViewController.this, "Bad input: " + userInputStringReps + " + " + userInputStringWeight);
            }
        }
    }

    class clearListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            m_repsTextField.setText("");
            m_weighTextField.setText("");
        }
    }

}