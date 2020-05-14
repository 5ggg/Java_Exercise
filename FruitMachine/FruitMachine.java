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

/**
 * ��ʾ���������ť�ͽ��棬���幦��
 *
 */
public class FruitMachine extends JFrame implements ActionListener {

	public static void main(String[] args) {
		FruitMachine frame = new FruitMachine();
		frame.setVisible(true);
	}

	// ���忪ʼ��Ϸ��ť��������Ϸ������ť
	private JButton spinButton, newGameButton;

	// ��������label
	private JLabel aLabel, bLabel, cLabel;

	// ��������ǩ�ͻ�ӭ��ǩ
	private JLabel balanceLabel, welcomeInfoLabel, reslutInfoLabel;;

	// ��������Panel
	private JPanel aPanel, bPanel, cPanel;

	// �����������壬�Ϳ��Ƶ�����
	private Font fontTitle, fontContent;

	public FruitMachine() {
		this.setLayout(null);

		// ����һ��������� �����С20
		fontTitle = new Font("", Font.BOLD, 20);

		// ��ʾ�����Ϣ���
		balanceLabel = new JLabel("balance is 100");
		balanceLabel.setBounds(60, 40, 280, 40);
		balanceLabel.setFont(fontTitle);
		this.add(balanceLabel);

		// ��ʽ��ӭ���
		welcomeInfoLabel = new JLabel("welcome��");
		welcomeInfoLabel.setBounds(60, 100, 380, 40);
		welcomeInfoLabel.setFont(fontTitle);
		this.add(welcomeInfoLabel);

		reslutInfoLabel = new JLabel("");
		reslutInfoLabel.setBounds(60, 160, 380, 40);
		reslutInfoLabel.setFont(fontTitle);
		this.add(reslutInfoLabel);

		// ����ڶ���������� �����С20
		fontContent = new Font("", Font.BOLD, 22);

		// �����һ�����
		aPanel = new JPanel();
		// ����岼����գ����¶���
		aPanel.setLayout(null);
		// �������ľ������Ͻǵ�x,y���꣬�����ĳ����
		aPanel.setBounds(20, 210, 90, 160);

		// ����ڶ������
		bPanel = new JPanel();
		bPanel.setLayout(null);
		bPanel.setBounds(150, 210, 90, 160);

		// ������������
		cPanel = new JPanel();
		cPanel.setLayout(null);
		cPanel.setBounds(280, 210, 90, 160);

		// �����һ��label
		aLabel = new JLabel("King");
		// ����label�ľ������Ͻǵ�x,y���꣬��ȸ߶�
		aLabel.setBounds(0, 0, 90, 160);
		// ����label������
		aLabel.setFont(fontContent);
		// ����label���־���
		aLabel.setHorizontalAlignment(SwingConstants.CENTER);
		// ����label�����͸��
		aLabel.setOpaque(true);
		// ����label�ı߿���ɫ
		aLabel.setBorder(BorderFactory.createLineBorder(Color.black));
		// ����label�ı���ɫ�ǻ�ɫ
		aLabel.setBackground(Color.yellow);
		// ��label��ǩ��ӵ������
		aPanel.add(aLabel);
		// ����������frame�������
		this.add(aPanel);

		// ����ڶ���label
		bLabel = new JLabel("Queen");
		bLabel.setBounds(0, 0, 90, 160);
		bLabel.setFont(fontContent);
		bLabel.setHorizontalAlignment(SwingConstants.CENTER);
		bLabel.setOpaque(true);
		bLabel.setBorder(BorderFactory.createLineBorder(Color.black));
		bLabel.setBackground(Color.yellow);
		bPanel.add(bLabel);
		this.add(bPanel);

		// ���������label
		cLabel = new JLabel("Jack");
		cLabel.setBounds(0, 0, 90, 160);
		cLabel.setFont(fontContent);
		cLabel.setHorizontalAlignment(SwingConstants.CENTER);
		cLabel.setOpaque(true);
		cLabel.setBorder(BorderFactory.createLineBorder(Color.black));
		cLabel.setBackground(Color.yellow);
		cPanel.add(cLabel);
		this.add(cPanel);

		// spin��ť����
		spinButton = new JButton("spin");
		spinButton.setFont(fontTitle);
		spinButton.setEnabled(false);
		spinButton.setBounds(460, 235, 160, 45);
		this.add(spinButton);
		spinButton.addActionListener(this);

		// new game��ť����
		newGameButton = new JButton("new game");
		newGameButton.setFont(fontTitle);
		newGameButton.setBounds(460, 305, 160, 45);
		this.add(newGameButton);
		newGameButton.addActionListener(this);

		// ����������
		this.setTitle("Fruitmachine GUI");

		// ����JFrame��С���ɱ�
		this.setResizable(false);
		// ����JFrame����Ⱥ͸߶�
		this.setSize(700, 440);
		// ����JFrame��������ʾ
		this.setLocationRelativeTo(null);
		// ����JFrame���Ĭ��ֱ�ӹر�
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton) e.getSource();
		// ����Ϸ��ť�¼�����
		if (button == newGameButton) {
			// ������Ϸ��ť�� ���
			spinButton.setEnabled(true);
			// ����Ϸ��ť�޷����
			newGameButton.setEnabled(false);
			MyMachineUtil.score = 100;
			balanceLabel.setText("balance is 100");
			welcomeInfoLabel.setText("welcome��");
		} else if (button == spinButton) {
			// ����±����0-5�ڵ����֣�0,1,2,3,4��
			int aRandom = MyMachineUtil.r.nextInt(5);
			int bRandom = MyMachineUtil.r.nextInt(5);
			int cRandom = MyMachineUtil.r.nextInt(5);

			// ����3��panel�����label��ʾֵ
			aLabel.setText(MyMachineUtil.nameLabel[aRandom]);
			bLabel.setText(MyMachineUtil.nameLabel[bRandom]);
			cLabel.setText(MyMachineUtil.nameLabel[cRandom]);
			// �ж��ж��ٸ�Joker�Ŀ���
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
			// ��Ҫ�۳��ķ���
			int discount = 0;
			// û��Joker
			if (total == 0) {
				if ((aRandom == bRandom) && (aRandom == cRandom)) {
					// �������ſ�����ͬ,������� 50��
					MyMachineUtil.score += 50;
					welcomeInfoLabel
							.setText("Three of a kind - you win 50 points");
				} else if ((aRandom != bRandom) && (aRandom != cRandom)
						&& (bRandom != cRandom)) {
					// ������ſ�������ͬ�������ֲ���
					MyMachineUtil.score += 0;
					welcomeInfoLabel
							.setText("None of a kind - you win 0 points");
				} else {
					// ���ſ���ͬ��������ȫ�����ţ������������ 20 ��
					welcomeInfoLabel
							.setText("Two of a kind - you win 20 points");
					MyMachineUtil.score += 20;
				}
				// ������һ��Joker
			} else {
				// һ��Joker���������м�ȥ25 ��
				discount = 25 * total;// ����Joker���Ƿ���50��
				// ����ȥ��Ӧ����
				MyMachineUtil.score -= discount;
				welcomeInfoLabel.setText(total + " jokers��you loss " + discount
						+ " points");
			}
			balanceLabel.setText("balance is " + MyMachineUtil.score);
			if (MyMachineUtil.score < 0) {
				// ��ҵĵ÷����� 0 ����ʧ��
				spinButton.setEnabled(false);
				newGameButton.setEnabled(true);
				reslutInfoLabel.setText("You lose");
			}
			if (MyMachineUtil.score >= 150) {
				// ������ٻ�� 150���ǳɹ�
				spinButton.setEnabled(false);
				newGameButton.setEnabled(true);
				reslutInfoLabel.setText("You win!");
			}
		}
	}
}