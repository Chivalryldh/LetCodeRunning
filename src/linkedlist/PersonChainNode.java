package linkedlist;

public class PersonChainNode {
	Person person; // 人
	PersonChainNode nextNode; // 该对象（'人'）保存的下一个对象的引用

	// 获取当前实体对象（'人'）
	public Person getPerson() {
		return this.person;
	}

	// 获取下一个实体
	public PersonChainNode getNextEntity() {
		return this.nextNode;
	}

	// 构造方法
	public PersonChainNode(Person p, PersonChainNode ep) {
		this.person = p;
		this.nextNode = ep;
	}

	// 构造方法
	public PersonChainNode(Person p) {
		this.person = p;
	}
}
