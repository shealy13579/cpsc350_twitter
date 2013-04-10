import java.awt.event.*;
import javax.swing.*;


public class logIn extends JFrame implements ActionListener{
	JLabel username, password, imageLabel;
	JTextArea uName, pWord, temp;
	JButton submit, register;
	ImageIcon image;
	
	//constructor
	public logIn(){
		super("SPYtter");
		pack();
		setVisible(true);
		setSize(1200,800);
		GUI();	
	    }
	
	private void GUI() {

		//gui components
		JFrame frame = new JFrame();
		JPanel pane = new JPanel();
		
		// sizing, making visible, and adding pane to Frame
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setSize(1600,850);
		frame.add(pane);
		
		//add image 
		image = new ImageIcon("C:\\eclipse\\330twitter\\src\\SPYder.jpg");
		imageLabel = new JLabel(image,JLabel.CENTER);
		pane.add(imageLabel);
		
		// buttons and areas
		username = new JLabel("Spy Alias: ");
		password = new JLabel("Top Secret Password: ");
		uName = new JTextArea();
		pWord = new JTextArea();
		temp =  new JTextArea();
		submit = new JButton("Login");
		register = new JButton("Register");
		
		// sizing GUI components
		username.setBounds(400,200,150,25);
		password.setBounds(400,300,150,25);
		uName.setBounds(600,200,100,25);
		pWord.setBounds(600,300,100,25);
		temp.setBounds(400,500,300,50);
		submit.setBounds(400,400,100,25);
		register.setBounds(600,400,100,25);

	
		// adding action listeners
		submit.addActionListener(this);
		register.addActionListener(this);
		
		// adding components to panel
		pane.add(username);
		pane.add(password);
		pane.add(uName);
		pane.add(pWord);
		pane.add(temp);
		pane.add(submit);
		pane.add(register);
		pane.setLayout(null);
		pane.setSize(1600,850);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Login")){
			String userName = uName.getText();
			String passWord = pWord.getText();
			temp.setText("You pressed login" + "\nUsername: "+ userName+ "\nPassword: "+passWord);
		}
		else if (e.getActionCommand().equals("Register")){
			temp.setText("You pressed register");
		}
		
	}
	
	public static void main(String[] args) {
			logIn log = new logIn();
	}

}
