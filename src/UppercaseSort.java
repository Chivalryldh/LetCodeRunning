import java.util.Scanner;

/**
 * @author liudaohao
 * @version 创建时间：2017年2月11日 下午6:44:31
 */
public class UppercaseSort {
	public static void main(String[] args) {
		int k = 0;
		Scanner sc = new Scanner(System.in);
		char[] c = sc.nextLine().toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (String.valueOf(c[i]).matches("[a-z]")) {
				char temp = c[i];
				for (int j = i; j > k; j--) {
					c[j] = c[j - 1];
				}
				c[k] = temp;
				k++;
			}
		}
		System.out.println(String.valueOf(c));
	}
}
