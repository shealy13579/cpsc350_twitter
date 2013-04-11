import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class userRegister extends JFrame{

	userRegister(){
		super("SPYtter");
		setSize(1200,800);
		GUI();
	}
	
	private void GUI(){

		// gui components
		JFrame frame = new JFrame();
		JPanel pane = new JPanel();
		
		// buttons and areas
			// username password first name last name rank organization description
		JTextArea uName = new JTextArea("Spy Alias");
		JTextArea Password = new JTextArea("Password");
		JTextArea rank = new JTextArea("Spy Level");
		JTextArea description = new JTextArea("User Identity");
		JButton register = new JButton("Register");
		
		// sizing GUI components
		rank.setBounds(200,200,100,50);
		register.setBounds(200,200,100,50);
		uName.setBounds(200,200,100,50);
		description.setBounds(200,200,100,50);
		Password.setBounds(200,200,100,50);
		
		// adding action listeners
	
		
		// sizing, making visible, and adding pane to Frame
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setSize(1600,850);
		frame.add(pane);
	
		
		// adding components to panel and sizing
		pane.setLayout(null);
		pane.setSize(1600,850);
		
		pane.add(uName);
		pane.add(rank);
		pane.add(Password);
		pane.add(description);
		pane.add(register);
		
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
