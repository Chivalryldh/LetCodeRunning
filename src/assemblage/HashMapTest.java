package assemblage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @version 创建时间：2017年3月12日 下午1:29:18
 */
public class HashMapTest {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("b", "ccccc");
		map.put("d", "aaaaa");
		map.put("c", "bbbbb");
		map.put("a", "ddddd");
		List<Map.Entry<String, String>> list = new ArrayList<Map.Entry<String, String>>(map.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<String, String>>() {
			// 升序排序
			public int compare(Entry<String, String> o1, Entry<String, String> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}

		});
		for (Map.Entry<String, String> mapping : list) {
			System.out.println(mapping.getKey() + ":" + mapping.getValue());
		}
	}
}
