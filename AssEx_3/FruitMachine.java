/*
 *  NAME: JiaLiang Song
 *  Student ID: 2410536s
 *  Subject: Software Development
 * 
 *  This class display panel component buttons and interfaces, defining the necessary functions
 */

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;



public class FruitMachine extends JFrame implements ActionListener {

	public static void main(String[] args) {
		FruitMachine frame = new FruitMachine();
		frame.setVisible(true);
	}

	// Define the "spin" and the "New Game" button
	private JButton spinButton, newGameButton;

	// Define three Label for three card (their name).
	private JLabel aLabel, bLabel, cLabel;

	// Define three Panel for three card (their panel/background)
	private JPanel aPanel, bPanel, cPanel;
		
	// Define three Label for display balance, welcome, resultInfomation
	private JLabel balanceLabel, welcomeInfoLabel, resultInfoLabel;;

	// Define the font of the title and the font of the card
	private Font fontTitle, fontContent;

	public FruitMachine() {
		this.setLayout(null);

		// Define font as bold font size 20
		fontTitle = new Font("", Font.BOLD, 20);

		// SET the balance information Label
		balanceLabel = new JLabel("balance is 100");
		balanceLabel.setBounds(60, 40, 280, 40);
		balanceLabel.setFont(fontTitle);
		this.add(balanceLabel);

		// SET the default welcome Label
		welcomeInfoLabel = new JLabel("welcome！");
		welcomeInfoLabel.setBounds(60, 100, 380, 40);
		welcomeInfoLabel.setFont(fontTitle);
		this.add(welcomeInfoLabel);

		// SET the result Infomation Label (default Null)
		resultInfoLabel = new JLabel("");
		resultInfoLabel.setBounds(60, 160, 380, 40);
		resultInfoLabel.setFont(fontTitle);
		this.add(resultInfoLabel);

		// Define the second font bold, font size 20
		fontContent = new Font("", Font.BOLD, 22);

		/*
		 * SET the PANEL
		 */
		// Define the first PANEL
		aPanel = new JPanel();
		// Clear panel layout and redefine
		aPanel.setLayout(null);
		// Defines the x, y coordinates of the top left corner of the panel, 
		//         and the length and width of the panel
		aPanel.setBounds(20, 210, 90, 160); 

		// Define the second PANEL (Similar to the first one)
		bPanel = new JPanel();
		bPanel.setLayout(null);
		bPanel.setBounds(150, 210, 90, 160);

		// Define the three PANEL (Similar to the first one)
		cPanel = new JPanel();
		cPanel.setLayout(null);
		cPanel.setBounds(280, 210, 90, 160);

		/*
		 * SET the LABEL
		 */
		// Define the first LABEL
		aLabel = new JLabel("King");
		// SET the x, y coordinates of the label's upper left corner, width and height
		aLabel.setBounds(0, 0, 90, 160);
		// SET the font of the label
		aLabel.setFont(fontContent);
		// SET label text to center
		aLabel.setHorizontalAlignment(SwingConstants.CENTER);
		// SET the label's panel to transparent
		aLabel.setOpaque(true);
		// SET the border color of the label
		aLabel.setBorder(BorderFactory.createLineBorder(Color.black));
		// SET the background color of the label to yellow
		aLabel.setBackground(Color.yellow);
		// Add the label label to the panel
		aPanel.add(aLabel);
		// Add the panel to the main frame panel
		this.add(aPanel);

		// Define the second label (Similar to the first one)
		bLabel = new JLabel("Queen");
		bLabel.setBounds(0, 0, 90, 160);
		bLabel.setFont(fontContent);
		bLabel.setHorizontalAlignment(SwingConstants.CENTER);
		bLabel.setOpaque(true);
		bLabel.setBorder(BorderFactory.createLineBorder(Color.black));
		bLabel.setBackground(Color.yellow);
		bPanel.add(bLabel);
		this.add(bPanel);

		// Define the three label (Similar to the first one)
		cLabel = new JLabel("Jack");
		cLabel.setBounds(0, 0, 90, 160);
		cLabel.setFont(fontContent);
		cLabel.setHorizontalAlignment(SwingConstants.CENTER);
		cLabel.setOpaque(true);
		cLabel.setBorder(BorderFactory.createLineBorder(Color.black));
		cLabel.setBackground(Color.yellow);
		cPanel.add(cLabel);
		this.add(cPanel);

		
		/*
		 * SET the BUTTON
		 */
		// Define the "spin" button
		spinButton = new JButton("spin");
		spinButton.setFont(fontTitle);
		spinButton.setBounds(460, 235, 160, 45);
		this.add(spinButton);
		spinButton.addActionListener(this);

		// Define the "new game" button (Similar to the "spin" button)
		newGameButton = new JButton("new game");
		newGameButton.setFont(fontTitle);
		newGameButton.setEnabled(false);         // SET the "New game" button unavailable at the start
		newGameButton.setBounds(460, 305, 160, 45);
		this.add(newGameButton);
		newGameButton.addActionListener(this);


		/*
		 * SET main interface/window parameters
		 */
		// SET the title of the frame
		this.setTitle("Fruitmachine GUI");
		// SET JFrame size to be immutable
		this.setResizable(false);
		// SET JFrame panel width and height
		this.setSize(700, 440);
		// Set the JFrame panel to be centered
		this.setLocationRelativeTo(null);
		// Set JFrame panel to close directly by default
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}



	// !!!   1/14/2020 Notes
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton) e.getSource();
		// SET "new game" button event listener
		if (button == newGameButton) {
			// SET the "new game" button able to click
			spinButton.setEnabled(true);
			// SET New game buttons are not clickable
			newGameButton.setEnabled(false);
			MyMachineUtil.score = 100;
			balanceLabel.setText("balance is 100");
			welcomeInfoLabel.setText("welcome！");
			resultInfoLabel.setText(""); // clean the third label "you win" or "you lose" after each game end.
			
		} else if (button == spinButton) {
			// Random subscripts generate numbers within 0-5, 0,1,2,3,4,
			int aRandom = MyMachineUtil.r.nextInt(5);
			int bRandom = MyMachineUtil.r.nextInt(5);
			int cRandom = MyMachineUtil.r.nextInt(5);

			// SET the label display value on the 3 panels
			aLabel.setText(MyMachineUtil.nameLabel[aRandom]);
			bLabel.setText(MyMachineUtil.nameLabel[bRandom]);
			cLabel.setText(MyMachineUtil.nameLabel[cRandom]);
			
			// Determine how many Joker cards
			int total = 0;
			if (aRandom == 4) {
				total++;
			}
			if (bRandom == 4) {
				total++;
			}
			if (cRandom == 4) {
				total++;
			}
			// Points need to be deducted
			int discount = 0;
			// If no Joker
			if (total == 0) {
				if ((aRandom == bRandom) && (aRandom == cRandom)) {
					// If all three cards are the same and the balance is increased by 50 points
					MyMachineUtil.score += 50;
					welcomeInfoLabel
							.setText("Three of a kind - you win 50 points");
				} else if ((aRandom != bRandom) && (aRandom != cRandom)
						&& (bRandom != cRandom)) {
					// If the three cards are different, the balance remains the same
					MyMachineUtil.score += 0;
					welcomeInfoLabel
							.setText("None of a kind - you win 0 points");
				} else {
					// If two cards are the same (but not all three), 
					//    the balance will be increased by 20 points
					welcomeInfoLabel
							.setText("Two of a kind - you win 20 points");
					MyMachineUtil.score += 20;
				}
				
				
				// IF at least one Joker
			} else {
				// A Joker will subtract 25 points from the balance
				//    so two Jokers are 50 points
				discount = 25 * total;
				// Balance minus corresponding score
				MyMachineUtil.score -= discount;
				welcomeInfoLabel.setText(total + " jokers：you loss " + discount
						+ " points");
			}
			balanceLabel.setText("balance is " + MyMachineUtil.score);
			
			
			// Set the end condition
			// A player's score less than 0 will fail
			if (MyMachineUtil.score < 0) {
				spinButton.setEnabled(false);
				newGameButton.setEnabled(true);
				resultInfoLabel.setText("You lose");
			}
			
			
			// Players score at least 150 points will succeed
			if (MyMachineUtil.score >= 150) {
				spinButton.setEnabled(false);
				newGameButton.setEnabled(true);
				resultInfoLabel.setText("You win!");
			}
		}
	}
}