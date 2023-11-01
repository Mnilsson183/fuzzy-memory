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

    private JTextField m_repsTextField = new JTextField("Reps", 8);
    private JTextField m_weighTextField = new JTextField("Weight (kg)", 8);
    private JTextField m_exerciseNameTextField = new JTextField("Exercise", 20);
    private ToggleSwitch m_ToggleSwitch = new ToggleSwitch();


    // submit and reset buttons
    private JButton    m_submitButton = new JButton("Submit");
    private JButton    m_clearButton = new JButton("Reset");
    private JButton    m_saveButton = new JButton("Save");


    //================================ constructor
    UiViewController(){

        m_logic = new AppModel();

        JPanel content = new JPanel();
        content.setPreferredSize(new Dimension(600, 500));
        content.setLayout(new FlowLayout());
        content.add(new JLabel("Workout information"));
        content.add(m_exerciseNameTextField);
        content.add(m_repsTextField);
        content.add(m_weighTextField);
        content.add(m_ToggleSwitch);
        content.add(m_submitButton);
        content.add(m_clearButton);
        content.add(m_saveButton);

        // add button listeners
        m_submitButton.addActionListener(new submitListener());
        m_clearButton.addActionListener(new clearListener());
        m_saveButton.addActionListener(new saveListener());

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
            String userInputStringExercise = "";

            try {

                // weight and reps
                userInputStringExercise = m_exerciseNameTextField.getText();
                userInputStringReps = m_repsTextField.getText();
                userInputStringWeight = m_weighTextField.getText();


                int exerciseReps = Integer.parseInt(userInputStringReps);
                int exerciseWeight = Integer.parseInt(userInputStringWeight);

                m_logic.submitExercise(userInputStringExercise, exerciseReps, exerciseWeight);

            } catch (Exception b) {
                JOptionPane.showMessageDialog(UiViewController.this, "Bad input: " + userInputStringReps + " + " + userInputStringWeight);
                b.printStackTrace();
            }
        }
    }

    class clearListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            m_repsTextField.setText("");
            m_weighTextField.setText("");
        }
    }

    class saveListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            m_logic.save();
        }
    }
}