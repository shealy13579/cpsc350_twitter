import java.awt.event.*;
import javax.swing.*;


public class userProfile extends JFrame implements ActionListener{
	JLabel uName,rank,description,bday,location,imageLabel,tweetLabel;
	JTextArea output,ranking,desc,birthday,loc, username, search, tweet, picture;
	JButton button1, button2, button3, button4, button5, tweetButton;
	JScrollPane scroll;
	ImageIcon image;
	
	userProfile(){
		super("SPYtter");
		pack();
		setVisible(true);
		setSize(1200,800);
		GUI();
	}
	
	private void GUI(){
		
		//gui components
		JFrame frame = new JFrame();
		JPanel pane = new JPanel(); 
		
		//sizing, making visible, and adding pane to Frame
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setSize(1600,850);
		frame.add(pane);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
				
		pane.setLayout(null);
		pane.setSize(1600,850);
				
		//add image 
		image = new ImageIcon("C:\\eclipse\\330twitter\\src\\SPYder.jpg");
		imageLabel = new JLabel(image);
		pane.add(imageLabel);
		
		// buttons and areas
		uName = new JLabel("Spy Alias");
		rank = new JLabel("Ranking");
		description = new JLabel("User Identity");
		bday = new JLabel("Birthday");
		location = new JLabel("Mission Location");
		tweetLabel = new JLabel("Compose new message");
		
		username = new JTextArea();
		ranking = new JTextArea();
		desc = new JTextArea();
		birthday = new JTextArea();
		loc = new JTextArea();
		search = new JTextArea();
		tweet = new JTextArea();
		picture = new JTextArea("picture goes here... hopefully");
		
		button1 = new JButton("Trending");
		button2 = new JButton("Home");
		button3 = new JButton("Show Friends");
		button4 = new JButton("Search Friends");
		button5 = new JButton("Follow");
		tweetButton = new JButton("Post");
		
		// sizing GUI components
		uName.setBounds(250,200,150,25);
		rank.setBounds(250,250,150,25);
		bday.setBounds(250,300,150,25);
		location.setBounds(250,350,150,25);
		description.setBounds(250,400,150,25);
		
		username.setBounds(400,200,150,25);
		ranking.setBounds(400,250,150,25);
		birthday.setBounds(400,300,150,25);
		loc.setBounds(400,350,150,25);
		desc.setBounds(400,400,150,200);
		search.setBounds(600,600,200,25);
		picture.setBounds(250, 25, 550, 150);
		
		tweetLabel.setBounds(600,200,200,25);
		tweet.setBounds(600,225,200,175);
		tweetButton.setBounds(600,400,200,25);
				
		button1.setBounds(600,450,200,25);
		button2.setBounds(600,500,200,25);
		button3.setBounds(600,550,200,25);
		button4.setBounds(600,625,200,25);
		button5.setBounds(250,625,300,25);
				
		// adding action listeners
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		tweetButton.addActionListener(this);
		
		// sidebar pane
		output = new JTextArea();
		output.setBounds(850,25,300,650);
		scroll = new JScrollPane(output);
		scroll.setBounds(850,25,300,650);
		
		//uName.addActionListener();
		pane.add(uName);
		pane.add(rank);
		pane.add(scroll);
		pane.add(description);
		pane.add(bday);
		pane.add(location);
		
		pane.add(button1);
		pane.add(button2);
		pane.add(button3);
		pane.add(button4);
		pane.add(button5);

		pane.add(username);
		pane.add(ranking);
		pane.add(desc);
		pane.add(birthday);
		pane.add(loc);
		pane.add(search);
		pane.add(picture);
		
		pane.add(tweet);
		pane.add(tweetLabel);
		pane.add(tweetButton);
	}

	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getActionCommand().equals("Trending")){
			output.setText("You pressed trending");
		}
		else if(e.getActionCommand().equals("Home")){
			output.setText("You pressed home");
		}
		else if(e.getActionCommand().equals("List Friends")){
			output.setText("You pressed list friends");
		}
		else if(e.getActionCommand().equals("Search Friends")){
			output.setText("You pressed search friends");
		}
		else if(e.getActionCommand().equals("Show Friends")){
			output.setText("You pressed show friends");
		}
		else if(e.getActionCommand().equals("Follow")){
			output.setText("You pressed follow");
		}
		else if(e.getActionCommand().equals("Post")){
			output.setText("You pressed post");
		}
		
	}
}
	