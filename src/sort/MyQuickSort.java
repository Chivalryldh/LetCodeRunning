package sort;

/**
 * @author liudaohao
 * @version 创建时间：2017年2月18日 下午5:09:13
 */
public class MyQuickSort {
  public static void main(String args[]) {// 第一步列出我们需要输入待排序的数组
		MyQuickSort q = new MyQuickSort();
		int[] a = { 32, 21, 43,2,33,6,222};
		q.quickSort(a, 0, a.length - 1);
		for (int i = 0; i < a.length; i++) {// 输出
		System.out.print(a[i] + " ");}
	}
	// 第二步开始排序，这个方法才是算法核心
	public void quickSort(int[] arrays, int start, int end) {
		if (start >= end) {return;}
		int i = start,j = end,value = arrays[i];boolean flag = true;
		while (i != j) {
			if (flag) {
			  if (value > arrays[j]) {
				int temp = arrays[i];arrays[i] = arrays[j];arrays[j] = temp;
					flag = false;
				} else {
					j--;
		        }
			} else {
				if (value < arrays[i]) {// 当经过第一次交换后arrays[0]=5
				  int temp = arrays[i];arrays[i] = arrays[j];arrays[j] = temp;flag = true;
				} else {
					i++;
				}
			}
		}
		quickSort(arrays, start, j - 1);quickSort(arrays, i + 1, end);
	}
}
