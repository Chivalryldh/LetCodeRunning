package assemblage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author liudaohao
 * @version 创建时间：2017年3月12日 下午3:19:42
 */
public class EmployeeTest {
	
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("a", 12));
		list.add(new Employee("b", 11));
		list.add(new Employee("c", 14));
	}
}
