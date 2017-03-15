package assemblage;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liudaohao
 * @version 创建时间：2017年3月9日 下午10:02:09
 */
public class ContainsTest {

	class Dog {
	}

	public static void main(String[] args) {
		List<Dog> dogList = new ArrayList<Dog>();
		Dog dog1 = new ContainsTest().new Dog();
		Dog dog2 = new ContainsTest().new Dog();
		dogList.add(dog1);
		System.out.println(dogList.contains(dog2));// false

		List<String> strList = new ArrayList<String>();
		strList.add("teststr");

		String str = new String("teststr");
		System.out.println(strList.contains(str));// true

	}

}
