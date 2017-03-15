package linkedlist;

public class Person {
	String name; // 姓名
	int age; // 年龄
	int personNo; // 编号，用作唯一标识

	// 带参构造方法
	public Person(String name, int age, int personNo) {
		this.name = name;
		this.age = age;
		this.personNo = personNo;
	}

	// 获取姓名
	public String getName() {
		return this.name;
	}

	// 获取年龄
	public int getAge() {
		return this.age;
	}

	// 获取编号
	public int getPersonNo() {
		return this.personNo;
	}

	// 用于输出的信息
	public String toString() {
		return "姓名：" + this.name + "\t年龄：" + this.age + "\t编号" + this.personNo;
	}
}
