import java.awt.event.*;
import javax.swing.*;

public class userRegister extends JFrame implements ActionListener{
	JLabel imageLabel, username, ranking, desc, birthday, location,password;
	JTextArea uName, rank, description, bDay, loc,pword;
	JButton register;
	ImageIcon image;
	
	userRegister(){
		super("SPYtter");
		pack();
		setVisible(true);
		setSize(1200,800);
		GUI();	
	}
	
	private void GUI(){

		// gui components
		JFrame frame = new JFrame();
		JPanel pane = new JPanel();
		
		// sizing, making visible, and adding pane to Frame
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setSize(1600,850);
		frame.add(pane);
		
		//add image 
		image = new ImageIcon("C:\\eclipse\\330twitter\\src\\SPYder.jpg");
		imageLabel = new JLabel(image);
		pane.add(imageLabel);
		
		// buttons and areas
		username = new JLabel("Spy Alias");
		ranking = new JLabel("Rank");
		desc = new JLabel("User Identity");
		birthday = new JLabel("Birthday");
		location = new JLabel("Mission Location");
		password = new JLabel("Password");
		pword = new JTextArea();
		uName = new JTextArea();
		rank = new JTextArea();
		bDay = new JTextArea();
		loc = new JTextArea();
		description = new JTextArea();
		register = new JButton("Update Information");
		
		// sizing GUI components
		username.setBounds(400,150,150,25);
		password.setBounds(400,200,150,25);
		ranking.setBounds(400,250,150,25);
		birthday.setBounds(400,300,150,25);
		location.setBounds(400,350,150,25);
		desc.setBounds(400,400,150,25);
		
		uName.setBounds(600,150,150,25);
		pword.setBounds(600,200,150,25);
		rank.setBounds(600,250,150,25);
		bDay.setBounds(600,300,150,25);
		loc.setBounds(600,350,150,25);
		description.setBounds(600,400,150,200);
		
		register.setBounds(500,625,150,25);
		
		// adding action listeners
		register.addActionListener(this);
		
		// adding components to panel and sizing
		pane.add(username);
		pane.add(ranking);
		pane.add(desc);
		pane.add(uName);
		pane.add(description);
		pane.add(register);
		pane.add(rank);
		pane.add(birthday);
		pane.add(location);
		pane.add(bDay);
		pane.add(loc);
		pane.add(password);
		pane.add(pword);
		pane.setLayout(null);
		pane.setSize(1600,850);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Update Information")){
			String userName = uName.getText();
			String rankIng = rank.getText();
			String descri = description.getText();
			String birthDay = bDay.getText();
			String locat = loc.getText();	
			
			userProfile profile = new userProfile();
		}
	}
	
}
 