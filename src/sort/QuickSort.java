package sort;

public class QuickSort {
	// 第一步列出我们需要输入待排序的数组
	public static void main(String args[]) {
		QuickSort q = new QuickSort();
		int[] a = { 49, 38, 65, 12, 45, 5 };
		q.judge_quick_sort(a, 6);// 这里6表示数组a的长度
	}

	// 第二步判断我们输入的数组是否符合标准
	public void judge_quick_sort(int[] arrays, int length) {
		if (null == arrays || length < 1) {
			System.out.println("input error!");
			return;
		}
		quick_sort(arrays, 0, length - 1);
	}//quick_sort(a, 0, 5);

	// 第三步开始排序，这个方法才是算法核心
	public void quick_sort(int[] arrays, int start, int end) {
		if (start >= end) {
			return;
		}

		int i = start;
		int j = end;
		int value = arrays[i];
		boolean flag = true;
		while (i != j) {
			if (flag) {
				if (value > arrays[j]) {
					swap(arrays, i, j);//交换元素
					flag = false;
				} else {
					j--;
				}
			} else {
				if (value < arrays[i]) {//当经过第一次交换后arrays[0]=5
					swap(arrays, i, j);
					flag = true;
				} else {
					i++;
				}
			}
		}
		snp(arrays);
		quick_sort(arrays, start, j - 1);
		quick_sort(arrays, i + 1, end);
	}
    //交换元素
	private void swap(int[] arrays, int i, int j) {
		int temp;
		temp = arrays[i];
		arrays[i] = arrays[j];
		arrays[j] = temp;
	}
    //输出
	public void snp(int[] arrays) {
		for (int i = 0; i < arrays.length; i++) {
			System.out.print(arrays[i] + " ");
		}
		System.out.println();
	}


}
