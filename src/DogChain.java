/**
 * @author liudaohao
 * @version 创建时间：2017年2月16日 下午10:33:51
 */
public class DogChain {

	private Node head = null;// 首先定义一个头结点

	/**
	 * 添加结点
	 */
	public void addNode(Dog dog) {
		Node newNode = new Node(dog);
		if (head == null) {// 没有头结点
			head = newNode;// 将第一个结点设为头结点
		} else {
			head.add(newNode);// 添加到后面合适的位置
		}
	}

//	public void printNode() {
//		if (this.head != null) {
//			this.head.print();
//		}
//	}
}
