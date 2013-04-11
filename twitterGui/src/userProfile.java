import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class userProfile extends JFrame implements ActionListener{

	// buttons and areas
	JLabel uName = new JLabel("Spy Alias");
	JLabel Password = new JLabel("Password");
	JLabel rank = new JLabel("Spy Level");
	JLabel description = new JLabel("User Identity");
	
	JTextArea friend = new JTextArea("Friendly spy alias");
	
	JButton button1 = new JButton("Trending");
	JButton button2 = new JButton("Home");
	JButton button3 = new JButton("List friends");
	JButton button4 = new JButton("Search Friends");
	JButton button5 = new JButton("Follow");
	
	userProfile(){
		super("SPYtter");
		setSize(1200,800);
		GUI();
	}
	
	private void GUI(){
		// gui components
				JFrame frame = new JFrame();
				JPanel pane = new JPanel(); // sidebar pane
				
				JTextArea output =new JTextArea("");
				output.setBounds(330,10,300,190);
				JScrollPane scroll;
				scroll = new JScrollPane(output);
				scroll.setBounds(330,10,300,800);
					
				// sizing GUI components
				rank.setBounds(50,10,100,50);
				uName.setBounds(50,60,100,50);
				description.setBounds(150,10,100,50);
				Password.setBounds(150,60,650,50);
				
				button1.setBounds(200,200,100,50);
				button2.setBounds(200,260,100,50);
				button3.setBounds(200,310,100,50);
				button4.setBounds(200,360,100,50);
				button5.setBounds(50,100,200,35);
				
				friend.setBounds(50,360,100,50);
				
				// adding action listeners
				button1.addActionListener(this);
				button2.addActionListener(this);
				button3.addActionListener(this);
				button4.addActionListener(this);
				button5.addActionListener(this);
				
				// sizing, making visible, and adding pane to Frame
				frame.setLayout(null);
				frame.setVisible(true);
				frame.setSize(1600,850);
				frame.add(pane);
				
				
				// adding components to panel and sizing
				pane.setLayout(null);
				pane.setSize(1600,850);
				
				//uName.addActionListener();
				
				pane.add(uName);
				pane.add(rank);
				pane.add(scroll);
				pane.add(Password);
				pane.add(description);
				
				pane.add(button1);
				pane.add(button2);
				pane.add(button3);
				pane.add(button4);
				pane.add(button5);
	
				pane.add(friend);
				
				frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
	
	public static void main(String[] args){
		userProfile profile = new userProfile();
	}

	
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Trending")){
			
		}else if(e.getActionCommand().equals("Home")){
			
		}else if(e.getActionCommand().equals("List Friends")){
			
		}else if(e.getActionCommand().equals("Search Friends")){
			
		}else if(e.getActionCommand().equals("Follow")){
			
		}
		
	}
}
	