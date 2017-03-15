import java.util.ArrayList;
import java.util.List;

public class MyretainAll {
	/**题目:A、B两个整数集合，设计一个算法求他们的交集，尽可能的高效
	 * retainAll方法用于从列表中移除未包含在指定collection中的所有元素。
                     语法  boolean retainAll(Collection<?> c)
	 * @param args
	 */
	public static void main(String[] args) {
		List a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		a.add(6);
		a.add(7);
		a.add(8);
		List b = new ArrayList<Integer>();
		b.add(1);
		b.add(3);
		b.add(7);
		b.add(8);
		b.add(9);
		if (a.retainAll(b)) {
			for (int i = 0; i < a.size(); i++) {
				System.out.print(a.get(i)+".");
			}
		}

	}
}
