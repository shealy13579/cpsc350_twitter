import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class userProfile extends JFrame{

	userProfile(){
		super("SPYtter");
		setSize(1200,800);
		GUI();
	}
	
	private void GUI(){
		// gui components
				JFrame frame = new JFrame();
				JPanel pane = new JPanel();
				
				// buttons and areas
				JTextArea uName = new JTextArea("Spy Alias");
				JTextArea Password = new JTextArea("Password");
				JTextArea rank = new JTextArea("Spy Level");
				JTextArea description = new JTextArea("User Identity");
				JButton register = new JButton("Update Information");
				
				// scroll pane components
				JList list = new JList();
				JScrollPane scrollpane = new JScrollPane(list);
				
				// sizing GUI components
				rank.setBounds(200,200,100,50);
				register.setBounds(200,200,100,50);
				uName.setBounds(200,200,100,50);
				description.setBounds(200,200,100,50);
				Password.setBounds(200,200,100,50);
				scrollpane.setBounds(300,300,300,300);
				// adding action listeners
			
				
				// sizing, making visible, and adding pane to Frame
				frame.setLayout(null);
				frame.setVisible(true);
				frame.setSize(1600,850);
				frame.add(pane);
			
				
				// adding components to panel and sizing
				pane.setLayout(null);
				pane.setSize(1600,850);
				pane.add(scrollpane);
				pane.add(uName);
				pane.add(rank);
				pane.add(Password);
				pane.add(description);
				pane.add(register);
				
				frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
}
