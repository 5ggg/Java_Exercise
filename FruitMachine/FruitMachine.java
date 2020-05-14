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
 * 显示面板的组件按钮和界面，定义功能
 *
 */
public class FruitMachine extends JFrame implements ActionListener {

	public static void main(String[] args) {
		FruitMachine frame = new FruitMachine();
		frame.setVisible(true);
	}

	// 定义开始游戏按钮，和新游戏启动按钮
	private JButton spinButton, newGameButton;

	// 定义三个label
	private JLabel aLabel, bLabel, cLabel;

	// 定义余额标签和欢迎标签
	private JLabel balanceLabel, welcomeInfoLabel, reslutInfoLabel;;

	// 定义三个Panel
	private JPanel aPanel, bPanel, cPanel;

	// 定义标题的字体，和卡牌的字体
	private Font fontTitle, fontContent;

	public FruitMachine() {
		this.setLayout(null);

		// 定义一个字体粗体 字体大小20
		fontTitle = new Font("", Font.BOLD, 20);

		// 显示余额信息面板
		balanceLabel = new JLabel("balance is 100");
		balanceLabel.setBounds(60, 40, 280, 40);
		balanceLabel.setFont(fontTitle);
		this.add(balanceLabel);

		// 形式欢迎面板
		welcomeInfoLabel = new JLabel("welcome！");
		welcomeInfoLabel.setBounds(60, 100, 380, 40);
		welcomeInfoLabel.setFont(fontTitle);
		this.add(welcomeInfoLabel);

		reslutInfoLabel = new JLabel("");
		reslutInfoLabel.setBounds(60, 160, 380, 40);
		reslutInfoLabel.setFont(fontTitle);
		this.add(reslutInfoLabel);

		// 定义第二个字体粗体 字体大小20
		fontContent = new Font("", Font.BOLD, 22);

		// 定义第一个面板
		aPanel = new JPanel();
		// 将面板布局清空，重新定义
		aPanel.setLayout(null);
		// 定义面板的距离左上角的x,y坐标，和面板的长宽度
		aPanel.setBounds(20, 210, 90, 160);

		// 定义第二个面板
		bPanel = new JPanel();
		bPanel.setLayout(null);
		bPanel.setBounds(150, 210, 90, 160);

		// 定义第三个面板
		cPanel = new JPanel();
		cPanel.setLayout(null);
		cPanel.setBounds(280, 210, 90, 160);

		// 定义第一个label
		aLabel = new JLabel("King");
		// 设置label的距离左上角的x,y坐标，宽度高度
		aLabel.setBounds(0, 0, 90, 160);
		// 设置label的字体
		aLabel.setFont(fontContent);
		// 设置label文字居中
		aLabel.setHorizontalAlignment(SwingConstants.CENTER);
		// 设置label的面板透明
		aLabel.setOpaque(true);
		// 设置label的边框颜色
		aLabel.setBorder(BorderFactory.createLineBorder(Color.black));
		// 设置label的背景色是黄色
		aLabel.setBackground(Color.yellow);
		// 将label标签添加的面板上
		aPanel.add(aLabel);
		// 将面板添加在frame大面板上
		this.add(aPanel);

		// 定义第二个label
		bLabel = new JLabel("Queen");
		bLabel.setBounds(0, 0, 90, 160);
		bLabel.setFont(fontContent);
		bLabel.setHorizontalAlignment(SwingConstants.CENTER);
		bLabel.setOpaque(true);
		bLabel.setBorder(BorderFactory.createLineBorder(Color.black));
		bLabel.setBackground(Color.yellow);
		bPanel.add(bLabel);
		this.add(bPanel);

		// 定义第三个label
		cLabel = new JLabel("Jack");
		cLabel.setBounds(0, 0, 90, 160);
		cLabel.setFont(fontContent);
		cLabel.setHorizontalAlignment(SwingConstants.CENTER);
		cLabel.setOpaque(true);
		cLabel.setBorder(BorderFactory.createLineBorder(Color.black));
		cLabel.setBackground(Color.yellow);
		cPanel.add(cLabel);
		this.add(cPanel);

		// spin按钮定义
		spinButton = new JButton("spin");
		spinButton.setFont(fontTitle);
		spinButton.setEnabled(false);
		spinButton.setBounds(460, 235, 160, 45);
		this.add(spinButton);
		spinButton.addActionListener(this);

		// new game按钮定义
		newGameButton = new JButton("new game");
		newGameButton.setFont(fontTitle);
		newGameButton.setBounds(460, 305, 160, 45);
		this.add(newGameButton);
		newGameButton.addActionListener(this);

		// 设置面板标题
		this.setTitle("Fruitmachine GUI");

		// 设置JFrame大小不可变
		this.setResizable(false);
		// 设置JFrame面板宽度和高度
		this.setSize(700, 440);
		// 设置JFrame面板居中显示
		this.setLocationRelativeTo(null);
		// 设置JFrame面板默认直接关闭
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton) e.getSource();
		// 新游戏按钮事件监听
		if (button == newGameButton) {
			// 设置游戏按钮能 点击
			spinButton.setEnabled(true);
			// 新游戏按钮无法点击
			newGameButton.setEnabled(false);
			MyMachineUtil.score = 100;
			balanceLabel.setText("balance is 100");
			welcomeInfoLabel.setText("welcome！");
		} else if (button == spinButton) {
			// 随机下标产生0-5内的数字，0,1,2,3,4，
			int aRandom = MyMachineUtil.r.nextInt(5);
			int bRandom = MyMachineUtil.r.nextInt(5);
			int cRandom = MyMachineUtil.r.nextInt(5);

			// 设置3个panel上面的label显示值
			aLabel.setText(MyMachineUtil.nameLabel[aRandom]);
			bLabel.setText(MyMachineUtil.nameLabel[bRandom]);
			cLabel.setText(MyMachineUtil.nameLabel[cRandom]);
			// 判断有多少个Joker的卡牌
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
			// 需要扣除的分数
			int discount = 0;
			// 没有Joker
			if (total == 0) {
				if ((aRandom == bRandom) && (aRandom == cRandom)) {
					// 所有三张卡都相同,余额增加 50点
					MyMachineUtil.score += 50;
					welcomeInfoLabel
							.setText("Three of a kind - you win 50 points");
				} else if ((aRandom != bRandom) && (aRandom != cRandom)
						&& (bRandom != cRandom)) {
					// 如果三张卡都不相同，则余额保持不变
					MyMachineUtil.score += 0;
					welcomeInfoLabel
							.setText("None of a kind - you win 0 points");
				} else {
					// 两张卡相同（但不是全部三张），则将余额增加 20 点
					welcomeInfoLabel
							.setText("Two of a kind - you win 20 points");
					MyMachineUtil.score += 20;
				}
				// 至少有一个Joker
			} else {
				// 一个Joker都会从余额中减去25 分
				discount = 25 * total;// 两个Joker就是分数50分
				// 余额减去相应分数
				MyMachineUtil.score -= discount;
				welcomeInfoLabel.setText(total + " jokers：you loss " + discount
						+ " points");
			}
			balanceLabel.setText("balance is " + MyMachineUtil.score);
			if (MyMachineUtil.score < 0) {
				// 玩家的得分少于 0 分是失败
				spinButton.setEnabled(false);
				newGameButton.setEnabled(true);
				reslutInfoLabel.setText("You lose");
			}
			if (MyMachineUtil.score >= 150) {
				// 玩家至少获得 150分是成功
				spinButton.setEnabled(false);
				newGameButton.setEnabled(true);
				reslutInfoLabel.setText("You win!");
			}
		}
	}
}