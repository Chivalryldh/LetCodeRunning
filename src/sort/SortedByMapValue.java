package sort;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class SortedByMapValue {
	public static void main(String[] args) {
		Map<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);a.add(2);a.add(3);a.add(4);
		map.put(0, a);
		ArrayList<Integer> b = new ArrayList<Integer>();
		b.add(1);b.add(2);
		map.put(1, b);
		ArrayList<Integer> c = new ArrayList<Integer>();
		c.add(1);c.add(2);c.add(3);
		map.put(2, c);
		Set<Integer> keys = map.keySet();
		Iterator<Integer> it = keys.iterator();
		while (it.hasNext()) {
			Integer key = it.next();// 这里的key就是map中的key
			System.out.println(key + "-->" + map.get(key));// map.get(key)就是key对应的value
		}
		System.out.println("========================");
		int[] keySortedByDegree = getDeployment(map);
		for (int j = 0; j < keySortedByDegree.length; j++) {
			System.out.println(keySortedByDegree[j]);
		}
	}
	/**
	 * 1. 生成树节点排序（排序规则，度从大到小） 2. 在度最大的点上 添加服务器
	 * @param mst  一个生成树类型的变量，不是String
	 * @return 所有服务器的ID
	 */
	public static int[] getDeployment(Map<Integer, ArrayList<Integer>> mst) {
		List<Entry<Integer, ArrayList<Integer>>> list = new ArrayList<Entry<Integer, ArrayList<Integer>>>(
				mst.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<Integer, ArrayList<Integer>>>() {
			public int compare(Map.Entry<Integer, ArrayList<Integer>> o1, Map.Entry<Integer, ArrayList<Integer>> o2) {
				return (o2.getValue().size() - o1.getValue().size());
			}
		});
		int i = 0;
		int[] keySortedByDegree = new int[mst.size()];
		for (Entry<Integer, ArrayList<Integer>> newEntry : list) {
			keySortedByDegree[i++]=newEntry.getKey();
		}
		// ArrayList中元素是有序的
		return keySortedByDegree;

	}
}
