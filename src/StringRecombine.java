import java.util.Scanner;

/**
 * @author liudaohao
 * @version 创建时间：2017年2月12日 下午11:15:55
 */
public class StringRecombine {
	public static void main(String[] args) {
		int k = 0;
		System.out.print("输入:");
		Scanner sc = new Scanner(System.in);
		char[] c = sc.nextLine().toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (String.valueOf(c[i]).equals("*")) {// 如果是*号，执行if语句
				char temp = c[i];
				for (int j = i; j > k; j--) {
					c[j] = c[j - 1];
				}
				c[k] = temp;
				k++;// 每次循环k都指在i所指的下一位，这样保证k所指的位置的前一位必然是*号
			}
		}
		//当第一次遇到非*时，i和k相等，等到下一次循环时，就会开始换顺序，看if里的for即可知
		System.out.println("输出："+String.valueOf(c));
	}
}
