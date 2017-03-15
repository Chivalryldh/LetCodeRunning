package sort;

/**
 * @author liudaohao
 * @version 创建时间：2017年2月19日 下午6:28:53
 */
public class BubbleSort {
	public static void main(String[] args) {
		int[] a = { 21, 43, 58, 1, 3, 2031 };// 2031,21,2,3,43,58,
		new BubbleSort().sort(a);
		// 将排序完成的数组输出
		for (int k = 0; k < a.length; k++) {
			if (k < a.length) {
				System.out.print(a[k] + ",");
			} else {
				System.out.print(a[k]);
			}
		}
		System.out.println();
		for (int k = 0; k < a.length; k++) {
			System.out.print(a[k]);
		}
	}

	public void sort(int[] a) {
		int temp = 0;
		for (int i = a.length - 1; i > 0; --i) {
			for (int j = 0; j < i; ++j) {
				int j1 = String.valueOf(a[j]).length();
				int j2 = String.valueOf(a[j + 1]).length();
				int j3 = (int) (a[j + 1] * Math.pow(10, j1)) + a[j];
				int j4 = (int) (a[j] * Math.pow(10, j2)) + a[j + 1];
				if (j3 < j4) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
	}
}
