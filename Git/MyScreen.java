package com.Lab6;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyScreen extends JFrame implements ActionListener
{
	JButton button1, button2;
	JLabel label1;
	JTextField text1;
	
	public MyScreen(String title)
	{
		super("Lab 6");
		setLayout(new GridLayout());
		
		JLabel myLabel1 = new JLabel("Adam");
		add(myLabel1);
		
		button1 = new JButton("word");
		add(button1);
		button2 = new JButton("word");
		add(button2);
		
		text1 = new JTextField("wadwd");
		add(text1);
		setVisible(true);	
		
		
		//set size of box
		setLocation(500, 300);
		setSize(300, 300); 
		
		//stops java program running
		setDefaultCloseOperation (EXIT_ON_CLOSE);

		 button1.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		JOptionPane.showMessageDialog(this, "My first event!");
		
	}
	
	
	
	
	
	
}
