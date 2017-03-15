package assemblage;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

/**
 * @version 创建时间：2017年3月12日 下午1:29:18
 */
public class TestTreeMap {
	public static void main(String[] args) {
		// 1.创建集合
		TreeMap<Student, String> map = new TreeMap<Student, String>(new Comparator<Student>() {
			// 按照年龄来排序,年龄相同按照姓名来排序
			@Override
			public int compare(Student o1, Student o2) {
				if (o1.getAge() == o2.getAge()) {
					return o1.getName().compareTo(o2.getName());
				}
				return o1.getAge() - o2.getAge();
			}
		});
		// 2.创建学生对象并往集合中增加
		Student s1 = new Student("张三", 27);
		Student s2 = new Student("李四", 29);
		Student s3 = new Student("王五", 16);
		Student s4 = new Student("张九", 27);
		map.put(s1, "2001");
		map.put(s2, "2002");
		map.put(s3, "2003");
		map.put(s4, "2004");

		// 3.遍历集合 ，排序完成
		Set<Student> set = map.keySet();
		for (Student student : set) {
			String value = map.get(student);
			System.out.println(student.getName() + "==" + student.getAge() + "==" + value);
		}
	}
}
