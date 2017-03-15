package leetcode;

import java.util.Scanner;

/**
 * with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to
 * [5,6,7,1,2,3,4].
 */
public class RotateArray2 {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.print("K=");// 获得要翻转的数量k,我们这里是假定k小于数组a的长度的
		Scanner sc = new Scanner(System.in);
		int k = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < a.length - k; i++) {//这里的i的作用仅仅是控制交换的次数
			int index = 0;//index是每次交换的下标，这里是很容易出错的地方，因为每次交换后数组都变了
			for (int j = index + 1; j < a.length; j++) {// 每次都是相邻位置的元素交换
				int temp;
				temp = a[index];
				a[index] = a[j];
				a[j] = temp;
				index++;//每次都是相邻的交换，index指向永远在j指向的前一位
			}
		}
		System.out.print("换位后数组a为：");
		for (int i = 0; i < a.length; i++) {// 输出数组a
			if (i == a.length - 1) {
				System.out.println(a[i] + ".");
			} else {
				System.out.print(a[i] + ".");
			}
		}
	}
}
