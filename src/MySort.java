import java.util.Scanner;

/**
 * @author liudaohao
 * @version 创建时间：2017年2月13日 上午9:05:20
 */
public class MySort {
	public static void main(String[] args) {
		int[] a = { 21, 43, 58, 2, 3, 2031 };
		for (int i = 0; i < a.length - 1; i++) {
			int temp;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[i]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ",");
		}
	}
}
