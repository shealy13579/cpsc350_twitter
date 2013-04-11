import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class logIn extends JFrame implements ActionListener{
	   
	//constructor
	public logIn(){
		super("SPYtter");
		this.setSize(1200,800);
		GUI();	
	    }
	
	private void GUI() {
		

		// gui components
		JFrame frame = new JFrame();
		JPanel pane = new JPanel();
		
		// buttons and areas
		JTextArea uName = new JTextArea("Spy Alias");
		JTextArea pWord = new JTextArea("Top Secret Password");
		JButton submit = new JButton("Login");
		JButton register = new JButton("Register");
		
		// sizing GUI components
		submit.setBounds(545,260,100,50);
		register.setBounds(650,260,100,50);
		uName.setBounds(545,200,100,50);
		pWord.setBounds(650,200,100,50);
		
		// adding action listeners
		submit.addActionListener(this);
		
		
		// sizing, making visible, and adding pane to Frame
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setSize(1600,850);
		frame.add(pane);
	
		
		// adding components to panel and sizing
		pane.setLayout(null);
		pane.setSize(1600,850);
		pane.add(uName);
		pane.add(pWord);
		pane.add(submit);
		pane.add(register);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
			logIn log = new logIn();
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== submit){
			
		}
		
	}

}
