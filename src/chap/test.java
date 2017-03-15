package chap;

import java.io.IOException;

public class test {
	public static void main(String[] args) {
		char[] c1 = { '5', '3', '3' };// 会出现53533和53353
		char[] c2 = { '5', '3' };
		int[] c = new int[2];
		int t = 0;
		int i = 0, j = 0;
		while (i < c1.length && j < c2.length) {
			if (c1[i] < c2[j]) {
				c[t++] = Integer.parseInt(String.valueOf(c1));
				c[t++] = Integer.parseInt(String.valueOf(c2));
				break;
			} else {
				if (c1[i] > c2[j]) {
					c[t++] = Integer.parseInt(String.valueOf(c2));
					c[t++] = Integer.parseInt(String.valueOf(c1));
					break;
				} else {
					if (c1[i] == c2[j]) {
						i++;
						j++;
					}
				}
			}
		}
		// 如果两个字符数组长度不一样，可能有一个数组已经比完了，参考"将两个整型数组按照合并成一个数组"的解法
		if (i == c1.length && j != c2.length) {
			/**
			 * 这里有一个易错点，还要比较长度较长的数组的最后一位和长度较短的数组的第一位的大小 比如说：48和483，48和485
			 */
			if (c1[0] < c2[j]) {
				c[t++] = Integer.parseInt(String.valueOf(c1));
				c[t++] = Integer.parseInt(String.valueOf(c2));
			} else {
				c[t++] = Integer.parseInt(String.valueOf(c2));
				c[t++] = Integer.parseInt(String.valueOf(c1));
			}
		}
		if (i != c1.length && j == c2.length) {
			if (c2[0] < c1[i]) {
				c[t++] = Integer.parseInt(String.valueOf(c2));
				c[t++] = Integer.parseInt(String.valueOf(c1));
			} else {
				c[t++] = Integer.parseInt(String.valueOf(c1));
				c[t++] = Integer.parseInt(String.valueOf(c2));
			}
		}
		// 将排序完成的数组输出
		for (int k = 0; k < c.length; k++) {
			System.out.print(c[k]);
		}
	}
}
