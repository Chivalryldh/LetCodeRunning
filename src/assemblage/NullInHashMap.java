package assemblage;

import java.util.TreeMap;

/**
* @author liudaohao
* @version 创建时间：2017年3月12日 下午12:48:04
*/
public class NullInHashMap {

	public static void main(String[] args) {
		TreeMap a = new TreeMap();
		a.put("a", 88);
		a.put("b", 882);
		a.put("c", 885);
		System.out.println(a);
	}
}
