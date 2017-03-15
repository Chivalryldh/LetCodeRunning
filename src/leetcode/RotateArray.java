package leetcode;

import java.util.Scanner;
/**
 * with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to
 * [5,6,7,1,2,3,4].
 */
public class RotateArray {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.print("K=");// 获得要翻转的数量k,我们这里是假定k小于数组a的长度的
		Scanner sc = new Scanner(System.in);
		int k = Integer.parseInt(sc.nextLine());
		int[] temp = new int[k];// temp数组存储源数组最后k个元素
		for (int i = 0; i < k; i++) {// for循环完成存储
			// 倒数第k个元素的下标是n-k
			temp[i] = a[a.length - k + i];
		}
		System.out.print("temp数组是：");
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i] + ".");// 输出temp数组
		}
		System.out.println();
		System.arraycopy(a, 0, a, a.length - k - 1, a.length - k);
		for (int i = 0; i < a.length; i++) {// 这里再次输出一次数组a，看看有什么变化
			if (i == a.length - 1) {
				System.out.println(a[i] + ".");
			} else {
				System.out.print(a[i] + ".");
			}
		}
		for (int i = 0; i < k; i++) {// 将temp数组中的内容，即源数组中最后K位的元素赋给数组a
			a[i] = temp[i];
		}
		System.out.println("换位后数组a为：");
		for (int i = 0; i < a.length; i++) {// 输出数组a
			if (i == a.length - 1) {
				System.out.println(a[i] + ".");
			} else {
				System.out.print(a[i] + ".");
			}
		}
	}
}
