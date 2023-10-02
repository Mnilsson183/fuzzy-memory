package com.mycompany.app;

/*
 * 
 * 
 * 
 */
import java.awt.*;
import javax.swing.*;


public class UiView extends JFrame{
    //================================ constants


    //================================ instance
    // general model
    private AppModel m_logic;

    // components

    private JTextField m_reps = new JTextField(5);
    private JTextField m_weight = new JTextField(20);
    private JButton    m_submit = new JButton("Submit");
    private ToggleSwitch m_Switch = new ToggleSwitch();


    //================================ constructor
    UiView(){

        m_logic = new AppModel();

    }

}