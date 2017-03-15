import java.util.Scanner;

public class Rev {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("整数X:");
		char[] char_X = sc.nextLine().toCharArray();// 程序执行sc.nextLine()就会停下来，直到输入数据
		reverse(char_X);// 此时传递的是数组的引用，通过移动引用(也就是地址)来改变数组的内容
		System.out.print("整数Y:");
		char[] char_Y = sc.nextLine().toCharArray();
		reverse(char_Y);
		int result = Integer.parseInt(String.valueOf(char_X)) + Integer.parseInt(String.valueOf(char_Y));
		char[] x_y = String.valueOf(result).toCharArray();
		reverse(x_y);
		int i = 0, temp = 0;
		while (i < x_y.length) {
			if (x_y[i] != '0') {
				temp = i;
				break;
			}
			i++;
		}
		//输出
		for (; temp < x_y.length; temp++) {
			System.out.print(x_y[temp]);
		}
	}
	public static void reverse(char[] c) {
		for (int i = 0, j = c.length - 1; i < c.length / 2; i++, j--) {
			if (j > i) {
				char temp;
				temp = c[i];c[i] = c[j];c[j] = temp;
			}
		}
		// System.out.println(c);// 输出c和原数组的内容一样，说明原数组的内容已经改变
	}
}
