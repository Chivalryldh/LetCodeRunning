package sort;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author liudaohao
 * @version 创建时间：2017年2月19日 下午2:35:26
 */
public class MyHashMap {
	public static void main(String[] args) {
		int k = 0;
		int[] a = { 132, 345, 534, 721, 913 };
		int[] b = { 21, 132, 654, 345, 123, 534, 721, 913 };
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < a.length; i++) {
			map.put(a[i], a[i]);
		}
		Iterator<Integer> ite = map.values().iterator();
		while (ite.hasNext()) {
			int temp = ite.next();
			for (int j = 0; j < b.length; j++) {
				if (b[j] == temp) {
					k++;
					System.out.print(b[j] + ",");
					break;//找到一个即结束本次for循环,省时间(不考虑重复数字)
				}
			}
		}
		System.out.println();
		System.out.print("相同个数为：" + k + "个");
	}
}
