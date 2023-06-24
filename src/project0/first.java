package project0;

import java.awt.Color;
import java.awt.color.ColorSpace;
import javax.swing.JButton;
import javax.swing.JFrame;

public class first extends JFrame{

	JFrame frame;
    JButton button1,button2 ;
    
    first()
    {
    	frame=new JFrame("Enter SYS");
    	
    	button1 = new JButton("admin");
    	button2 = new JButton("user");
        
       
        button1.setForeground(Color.orange);
        button2.setForeground(Color.orange);

        button2.setBackground(Color.gray );
    	button1.setBackground(Color.gray );
        button2.setBackground(Color.gray );
    	button1.setBounds(100, 100, 100, 50);
    	button2.setBounds(300, 100, 100, 50);
    	
    	frame.add(button1);
    	frame.add(button2);
    	
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);
        frame.getContentPane().setBackground(Color.black );
        frame.setLayout(null);   
        frame.setLocationRelativeTo(null); 
        frame.setVisible(true);
        
        button1.addActionListener(new Actionb1());
        button2.addActionListener(new Actionb2());
    }
	
}
