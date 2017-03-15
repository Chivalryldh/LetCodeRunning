package leetcode;

import java.util.HashMap;
import java.util.Scanner;

/**
 * with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to
 * [5,6,7,1,2,3,4].
 */
public class RotateArray3 {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.print("K=");// 获得要翻转的数量k,我们这里是假定k小于数组a的长度的
		Scanner sc = new Scanner(System.in);
		int k = Integer.parseInt(sc.nextLine());
	    reverse(a,0,a.length-k-1);
	    reverse(a,a.length-k,a.length-1);
	    reverse(a,0,a.length-1);
	    System.out.print("换位后数组a为：");
		for (int i = 0; i < a.length; i++) {// 输出数组a
			if (i == a.length - 1) {
				System.out.println(a[i] + ".");
			} else {
				System.out.print(a[i] + ".");
			}
		}
	}
	public static void reverse(int[] temp,int left,int right){
		while(left<right){
			int t = 0;
			t = temp[left];
			temp[left]= temp[right];
			temp[right] = t;
			left++;
			right--;
		}
	}
}
