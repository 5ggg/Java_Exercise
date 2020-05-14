package try1;

import java.util.Arrays;

/*
 * 这个是用来判断不同的字符的unicode赋值大小。
 * 结果如下
 * 0 < 9 < A < Z < a < z < 汉
 */

public class Char {
	public static void main (String[] args) {
		
		char[] s = {'汉','0','9','A','Z','a','z'};
		
		char a = '汉';
		char b = '0';
		char c = '9';
		char d = 'A';
		char e = 'Z';
		char f = 'a';
		char g = 'z';
		
		Arrays.sort(s);
		
		
		String s1 = "abd";
		String s2 = "aba";
		
		System.out.println(s1.compareTo(s2));
		
		for (int i=0; i<s.length; i++) {
			
			System.out.println (s[i]);
		}
	}
	

}
