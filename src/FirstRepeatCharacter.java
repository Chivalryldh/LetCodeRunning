import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * @author liudaohao
 * @version 创建时间：2017年2月23日 下午9:38:48
 */
public class FirstRepeatCharacter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] s = sc.nextLine().split(",");//获得控制台输入字符串，并按照','来隔开
		char[] c = s[0].toCharArray();
		Set set = new LinkedHashSet();
		for (int i = 0; i < c.length; i++) {
			set.add(c[i]);
		}//执行完循环后set的值为q,y,w,e,r,2,3,t,d
		Object[] b = set.toArray();
		int p = 0, q = 0;
		// b的长度明显要比c短
		while (q < b.length) {
			if (c[p] == (char)b[q]) {
				p++;
				q++;
			} else {
				break;//当第一次出现不同的元素时就是第一次出现重复的元素
			}
		}
		System.out.println(c[p]);
	}
}
