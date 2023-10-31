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

    //Date section
    private JTextField m_dateMonthField = new JTextField("Month", 5);
    private JTextField m_dateDayField = new JTextField("Day", 5);
    private JTextField m_dateYearField = new JTextField("Year", 5);


    // submit and reset buttons
    private JButton    m_submitButton = new JButton("Submit");
    private JButton    m_clearButton = new JButton("Reset");
    private JButton    m_saveButton = new JButton("Save");


    //================================ constructor
    UiViewController(){

        m_logic = new AppModel();

        JPanel content = new JPanel();
        content.setLayout(new FlowLayout());
        content.add(new JLabel("Workout information"));
        content.add(m_exerciseNameTextField);
        content.add(m_repsTextField);
        content.add(m_weighTextField);
        content.add(m_ToggleSwitch);
        content.add(new JLabel("Date"));
        content.add(m_dateMonthField);
        content.add(m_dateDayField);
        content.add(m_dateYearField);
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

            int[] exercise = new int[5];
            try {

                // weight and reps
                userInputStringExercise = m_exerciseNameTextField.getText();
                userInputStringReps = m_repsTextField.getText();
                userInputStringWeight = m_weighTextField.getText();


                // date
                exercise[0] = Integer.parseInt(m_dateMonthField.getText());
                exercise[1] = Integer.parseInt(m_dateDayField.getText());
                exercise[2] = Integer.parseInt(m_dateYearField.getText());

                exercise[3] = Integer.parseInt(userInputStringReps);
                exercise[4] = Integer.parseInt(userInputStringWeight);

                m_logic.submitExercise(userInputStringExercise, exercise);

            } catch (Exception b) {
                JOptionPane.showMessageDialog(UiViewController.this, "Bad input: " + userInputStringReps + " + " + userInputStringWeight);
            }
        }
    }

    class clearListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            m_repsTextField.setText("");
            m_weighTextField.setText("");
            m_dateMonthField.setText("");
            m_dateDayField.setText("");
            m_dateYearField.setText("");
        }
    }

    class saveListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            m_logic.save();
        }
    }
}