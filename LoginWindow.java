
/*
 * Stage: Development-01
 * @author: Resul Erdem Arduc 119200056
 * @author: Sinan Hacisoyu 119200060

 *
 */

import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class LoginWindow extends JFrame implements ActionListener {
	
	//All users for this application
	User users[] = {new User("Deli", "Bela","delibela26", "beladeli2626")};

	// main method for testing the application
	public static void main(String[] args) {
		new LoginWindow();
	}


	/*
	 * Graphical User Interface (GUI) Elements
	 *
	 * ! PLEASE RENAME THE OBJECTS ACCORDING TO THEIR PURPOSES !
	 * ! YOU CAN ADD MORE ELEMENTS IF IT IS NECESSARY !
	 */
	private JButton btn01, btn02;
	private JLabel lbl01, lbl02;
	private JTextField txt01, txt02;


	// Constructor
	public LoginWindow () {
		
		this.initializeGUI();
		this.setWindowProperties(3, 2);
		this.addGUIElementsToFrame();

	}


	/**
	 * Initialize GUI elements. If it is necessary, you can add more
	 * 	elements.
	 */
	public void initializeGUI() {
		lbl01 = new JLabel("nickname", SwingConstants.CENTER);
		lbl02 = new JLabel("password", SwingConstants.CENTER);

		txt01 = new JTextField("TextField-01");
		txt02 = new JTextField("TextField-02");

		txt01.setHorizontalAlignment(SwingConstants.CENTER);
		txt02.setHorizontalAlignment(SwingConstants.CENTER);

		btn01 = new JButton("Reset");
		btn02 = new JButton("Login");

		btn01.addActionListener(this);
		btn02.addActionListener(this);
	}


	/**
	 * Set the necessary properties for the window
	 *
	 * @param numRow number of row for GUI elements
	 * @param numCol number of column for GUI elements
	 */
	public void setWindowProperties(int numRow, int numCol) {
		this.setLayout(new GridLayout(numRow, numCol));

		this.setSize(800, 800);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}


	/**
	 * Add GUI elements to the layout of the frame. If it is necessary,
	 * 	you can add more elements.
	 */
	public void addGUIElementsToFrame() {
		this.add(lbl01);
		this.add(txt01);

		this.add(lbl02);
		this.add(txt02);

		this.add(btn01);
		this.add(btn02);
	}


	/**
	 * Add margin to the frame.
	 */
	@Override
    public Insets getInsets() {
        return new Insets(100, 50, 100, 50);
    }


	/**
	 * Action listener for the buttons. If e.getSource() is from
	 * 	one of the buttons, apply the related operation.
	 *
	 * @param e action event for detecting which button is clicked
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(btn02)) {//when the click login button
			String nickname = txt01.getText();
			String password = txt02.getText();		
			
			if(nickname.equals(users[0].getNickname()) && password.equals(users[0].getPassword())) {//checking the name and password
				//txt01.setText("asdas");
				//btn02.dispose();
				new SecondFrame();//adding new page
			}
		}	
		else if(e.getSource().equals(btn01)){//when the click reset button
			txt01.setText("");//reset
			txt02.setText("");//reset
		}
		
		

	}

}


//to make our new page implementation when the user click login button
class SecondFrame {
	private JFrame f = new JFrame("Second");
	
	public SecondFrame() {
	
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(300,300);
		f.setVisible(true);
	}
}
