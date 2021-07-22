package com.yash.inputtypedemo;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JOptionInput {

	JFrame f;
	JOptionInput(){  
	    f=new JFrame();   
	    String name=JOptionPane.showInputDialog(f,"Enter Name");   
	    System.out.println(name);
	}
//	JOptionInput(String name){  
//	    f1=new JFrame();   
//	    JOptionPane.showMessageDialog(f1,"Enter Name");      
//	}
	public static void main(String[] args) {  
	    new JOptionInput(); 
//	    new JOptionInput(name);
	} 
}
