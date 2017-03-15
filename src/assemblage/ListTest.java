package assemblage;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author liudaohao
 * @version 创建时间：2017年3月9日 上午12:31:38
 */
public class ListTest {
	public static void main(String[] args) {
		String[] city = new String[] { "成都", "延安", "山西", "湖北" };
		List list = new ArrayList();
		for (int i = 0; i < city.length; i++) {
			list.add(city[i]);
		}
		System.out.println("第一次输出：" + list);
		ListIterator li = list.listIterator();
		System.out.print("使用listIterator输出:");
		while(li.hasNext()){
			System.out.print(li.next()+" . ");//输出
		}
		System.out.println();
		System.out.print("逆向迭代输出:");
		while(li.hasPrevious()){
			System.out.print(li.previous()+" . ");
		}
	}
}
