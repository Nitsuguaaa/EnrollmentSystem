package com.mycompany.enrollmentsystem;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.*;
import javax.swing.*;

public class NewGUI implements ActionListener {
    
    public static void main(String[] args) {
	new NewGUI();
    }
    
    private int count = 0;
	private JLabel label;
	private JFrame frame;
	private JPanel panel;
	
	public NewGUI() {
		JButton button = new JButton("Start enrollment system");
			button.addActionListener(this);
			button.setBounds(80,30,120,40);
		
		frame = new JFrame();
		panel = new JPanel();
		label = new JLabel("Number of runs: 0");
		
		label.setBounds(70, 110, 500, 300);
		
		JTextField t1,t2;  
	    t1=new JTextField("Welcome to Javatpoint.");  
	    t1.setBounds(50,100,150,20);  
	    t2=new JTextField("AWT Tutorial");  
	    t2.setBounds(80,120,120,40);  

		
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
		panel.setLayout(new GridLayout(0, 1));
		panel.add(button);
		panel.add(label);
		panel.add(t1);
		panel.add(t2);
		panel.setLayout(null);
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Test GUI");
		frame.pack();
		frame.setVisible(true);
		frame.setSize(1000,500); 
		frame.setLocationRelativeTo(null);
		
		
	}
        
        @Override
	public void actionPerformed(ActionEvent e) {
		count++;
		label.setText("Number of runs: " + count);
                mainint mainint = new mainint();
                mainint.mainstartup();
		
	}
    
    
        
        
    
}

