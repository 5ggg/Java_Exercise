import java.util.Random;

/**
 * 用途：定义主界面类所需常理区分，便于管理
 *
 */
public class MyMachineUtil {
	// 定义”ACE”, ”King”, ”Queen”, ”Jack”和”Joker”
	public static String nameLabel[] = { "ACE", "King", "Queen", "Jack",
			"Joker" };

	// 定义随机类
	public static Random r = new Random();

	// 积分的总余额（初始值为100）
	public static int score = 100;
}
