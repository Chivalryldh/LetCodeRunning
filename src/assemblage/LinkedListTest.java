package assemblage;

import java.util.LinkedList;

/**
 * @author liudaohao
 * @version 创建时间：2017年3月7日 下午10:28:07
 */
public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList books = new LinkedList();
		// 将字符串元素加入队列的尾部
		books.offer("数学");
		// 将一个字符串元素加入栈的顶部
		books.push("语文");
		// 将一个字符串元素加入队列的顶部（相当于栈的顶部）
		books.offerFirst("英语");
		for (int i = 0; i < books.size(); i++) {
			System.out.println("遍历中：" + books.get(i));
		}
		// 访问并不删除栈顶的元素
		System.out.println(books.peekFirst());
		// 访问并不删除队列的最后一个元素
		System.out.println(books.peekLast());
		// 将栈顶的元素弹出栈
		System.out.println(books.pop());//英语
		// 下面的输出将会看到队列中第一个元素已经被删除
		System.out.println(books);//[语文, 数学]
        //访问并删除队列的最后一个元素
		System.out.println(books.pollLast());
		System.out.println(books);//[语文]
	}

}
