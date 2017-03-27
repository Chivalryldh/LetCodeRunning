package leetcode;

/**
 * @version 创建时间：2017年3月12日 下午8:02:21
 */
public class NumberPyramid {
	public static void main(String[] args) {
		int n = 5, i, sum, indexDiff;
		sum = (1 + n) * n / 2;// 总数
		int a[] = { 7, 3, 2, 8, 1, 0, 2, 7, 4, 4, 4, 5, 2, 6, 5 };// 将数字全部存在一维数组中
		sum = sum - n;// 减去最后一层的个数，第五层有五个数，说白了就是为了得到倒数第二层最后一个数的下标
		for (i = sum - 1, indexDiff = 0; i >= 0; i--) {// 从下往上依次想加
			a[i] = a[i] + Max(a[i + n], a[i + n - 1]);
			/**
			 * 改变头与肩膀的差值，比如说第四排的数字的下标和它下面的两个数字的下标相差为4和5
			 * 但是第三排的数字的下标和它下面的两个数字的下标相差为3和4
			 */
			if (++indexDiff == n - 1) {// indexDiff为成员变量
				n--;
				indexDiff = 0;
			}
		}
		System.out.println(a[0]);
	}
	public static int Max(int p, int q) {
		return p > q ? p : q;
	}
}
