public class RecombinMinNum {
	static int[] a = { 21, 43, 58, 2, 3, 2031 };// //2031,21,2,3,43,58,
	static int i, j;

	public static void main(String[] args) {
		//采用简单选择排序的思想
		for (i = 0; i < a.length - 1; i++) {
			// 原因是要按位比较，所以要将每个元素拆分成字符数组c1和c2
			char[] c1 = String.valueOf(a[i]).toCharArray();// 将整型转化为字符数组
			for (j = i + 1; j < a.length; j++) {
				char[] c2 = String.valueOf(a[j]).toCharArray();// 将整型转化为字符数组
				sort(c1, c2);
			}
		}
		// 将排序完成的数组输出
		for (int k = 0; k < a.length; k++) {
			System.out.print(a[k] + ",");
		}
	}

	public static void sort(char[] c1, char[] c2) {
		// 下面开始比较大小
		int p = 0, q = 0;
		while (p < c1.length && q < c2.length) {
			if (c1[p] < c2[q]) {
				break;// 直接跳过,break结束整个while循环
			} else {
				if (c1[p] > c2[q]) {
					int temp = 0;
					temp = Integer.parseInt(String.valueOf(a[i]));
					a[i] = Integer.parseInt(String.valueOf(a[j]));
					a[j] = temp;
					break;// break结束整个while循环
				} else {
					if (c1[p] == c2[q]) {
						p++;
						q++;
					}
				}
			}
		}
		// 如果两个字符数组长度不一样，可能有一个数组已经比完了，参考"将两个整型数组按照合并成一个数组"的解法
		if (p == c1.length && q != c2.length) {
			/**
			 * 这里有一个易错点，还要比较长度较长的数组的最后一位和长度较短的数组的第一位的大小 比如说：48和483，48和485
			 */
			if (c1[0] > c2[q]) {
				int temp = 0;
				temp = Integer.parseInt(String.valueOf(a[i]));
				a[i] = Integer.parseInt(String.valueOf(a[j]));
				a[j] = temp;
			}
		}
		if (p != c1.length && q == c2.length) {
			if (c1[p] > c2[0]) {
				int temp = 0;
				temp = Integer.parseInt(String.valueOf(a[i]));
				a[i] = Integer.parseInt(String.valueOf(a[j]));
				a[j] = temp;
			}
		}
	}
}