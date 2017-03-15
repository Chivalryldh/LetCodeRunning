import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * @author liudaohao
 * @version 创建时间：2017年2月21日 下午9:48:03
 */
public class Test {
	public static void main(String[] args) {
		char[] c = { 'q', 'y', 'w', 'y', 'q', '2', '3', 't', 't', 'd', 'd', 's' };
		Set set = new LinkedHashSet();
        for(int i = 0;i<c.length;i++){
        	set.add(c[i]);
        }
		Iterator it = set.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + ",");
		}
	}
}
