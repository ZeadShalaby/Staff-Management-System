/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project0;



import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class login2 extends JFrame{
	
	JFrame frame;
    JButton button ;
    JLabel label1,label2 ;
    JTextField t1,t2; 
    public void log2() {
    	
    	frame=new JFrame("login form");
        
        t1=new JTextField(); 
        t2=new JTextField();
    
        button = new JButton("login");
        
        label1 = new JLabel("USER : ");
        label2 = new JLabel("pass : ");
 
        button.setBounds(300, 120, 100, 50);
        button.setForeground(Color.orange);
        button.setBackground(Color.GRAY);
        
        t1.setBounds(100,50,150,30);
        t2.setBounds(100,100,150,30);
        
        label1.setBounds(50,50,60,30);
        label2.setBounds(50,100,60,30);
        label1.setForeground(Color.orange); 
        label2.setForeground(Color.orange); 
        frame.add(button);
        
        frame.add(t1);
        frame.add(t2);
 
        frame.add(label1);
        frame.add(label2);
        
        frame.getContentPane().setBackground(Color.black );
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);
        frame.setLayout(null); 
        frame.setLocationRelativeTo(null); 
        frame.setVisible(true);
        
        button.addActionListener(new Actionu());
    }

}
