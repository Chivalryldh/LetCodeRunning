package linkedlist;

public class PersonChain {
	private PersonChainNode head; // 头节点
	private int size; // 链表的实体（即节点的数量）
	private int modCount; // 链表被操作的次数（备用）

	/**
	 * 获得链表中节点数量
	 * 
	 * @return 链表中节点数
	 */
	public int getSize() {
		return this.size;
	}

	/**
	 * 添加节点的一般方法
	 * 
	 * @param p
	 *            添加到链表节点的对象 由于实现细节，作为唯一标识，同一个编号的Person只能添加一次
	 */
	public void addNode(Person p) {
		if (!contains(p.personNo)) { // 如果链表中没有该对象，则准备添加
			if (head != null) { // 如果有头节点，则添加新节点作为头节点
				head = new PersonChainNode((linkedlist.Person) p, head);
				size++;
				modCount++;
			} else { // 如果没有头节点，则添加对象作为头节点
				head = new PersonChainNode((linkedlist.Person) p, null);
				size++;
				modCount++;
			}
		}
	}

	/**
	        * 通过编号删除对象
	        * 
	        * @param personNo
	        *            要删除对象的编号
	        */
	       public void deleteNode(int personNo) {
	           if (size == 0 ) { // 如果当前链表节点数为零
	               return;
	           }
	           if (size == 1 ) { 
	               // 如果只有一个节点并且正是需要删除的对象
	               if (head.person.personNo == personNo) {
	                   head = null;
	                   size = 0 ;
	               }
	               return;
	           }
	           // 如果不存在该对象编号
	           if (!contains(personNo)) {
	               return;
	           }
	   
	           // 较为复杂的删除，定义整型保存被删除的节点的索引
	           //（删除和索引都是不存在的，这里只是一个说法）
	           int index = 0 ;
	           // 循环遍历，找到删除节点的索引
	           for (PersonChainNode p = head; p != null; p = p.nextNode) {
	               if (!(p.person.personNo == personNo)) {
	                   index++;
	               } else {
	                   break;
	               }
	           }
	           // 如果删除的是第一个节点（即头节点）
	           if (index == 0 ) {
	               head = new PersonChainNode(head.nextNode.person,
	                       head.nextNode.nextNode);    // 设置头节点后一个节点为新的头节点
	               size--;                                            // 链表节点数减一
	               modCount++;                                // 链表被操作次数加一
	               return;
	           }
	           
	           // 如果删除的节点不是第一个节点
	           // 循环遍历，找到被删除节点的前一个节点
	           // 其索引下标用count保存
	           int count = 0 ;
	           for (PersonChainNode p = head; p != null; p = p.nextNode) {
	               if (count == index - 1 ) {    // 如果找到了被删除节点的前一个节点
	                   if (index == size - 1 ) {    // 如果被删除节点是最后一个节点
	                       p.nextNode = null;    // 将被删除节点的前一个节点的引用指向空引用
	                   } else {                            // 如果被删除节点不是最后一个节点
	                       p.nextNode = p.nextNode.nextNode;    // 将被删除节点前一个节点对其引用指向被删除节点的下一个节点
	                   }
	                   size--;                // 减一数量
	                   modCount++;    // 加一操作次数
	                   return;
	               }
	               count++;                // 没有找到，索引加一
	           }
	       }

	/**
	 * 通过姓名查找对象 未实现
	 * 
	 * @param name
	 *            对象姓名
	 * @return 对象数组，可能多个
	 */
	public Person[] searchNodeByPersonName(String name) {
		return null;
	}

	/**
	 * 通过年龄查找对象 未实现
	 * 
	 * @param age
	 *            对象年龄
	 * @return 对象数组，可能多个
	 */
	public Person[] searchPersonByAge(int age) {
		return null;
	}

	/**
	 * 通过编号查找对象 由于编号是唯一标识，循环遍历查找并返回即可
	 * 
	 * @param personNo
	 *            对象编号
	 * @return 查找到的对象或者null
	 */
	public Person searchNode(int personNo) {
		Person p = null;
		for (PersonChainNode pcn = head; pcn != null; pcn = pcn.nextNode) {
			if (pcn.person.personNo == personNo) {
				p = pcn.person;
			}
		}
		return p;
	}

	/**
	 * 通过原对象修改及传入值修改该对象属性
	 * 
	 * @param personNo
	 *            要修改的对象编号
	 * @param value
	 *            通过传入值的类型判断修改 只能修改姓名或年龄
	 */
	public void editNode(int personNo, Object value) {
		// 通过作为唯一标识的编号查找到对象
		Person target = searchNode(personNo);
		if (target == null) { // 如果对象为null
			return;
		}
		if (value == null) { // 如果传入参数为null
			return;
		}
		// 如果传入参数为字符串类型
		if (value.getClass() == java.lang.String.class) {
			target.name = value.toString();
			return;
		}
		try {
			// 如果传入参数为整型
			target.age = Integer.parseInt(value.toString());
			return;
		} catch (Exception ex) {
			// 如果传入参数类型错误
			return;
		}
	}

	/**
	 * 通过对象编号打印对象
	 * 
	 * @param personNo
	 *            对象编号
	 */
	public void printNode(int personNo) {
		Person target = searchNode(personNo);
		if (target == null) {
			return;
		}
		System.out.println(target.toString());
	}

	/**
	        * 判断指定对象是否存在链表中
	        * 
	        * @param personNo
	        *            对象编号
	        * @return true表示存在该对象，false表示不存在该对象
	        */
	       public boolean contains(int personNo) {
	           if (size != 0 ) {
	               for (PersonChainNode pcn = head; pcn != null; pcn = pcn.nextNode) {
	                   if (pcn.person.personNo == personNo) {
	                       return true;
	                   }
	               }
	           }
	           return false;
	       }

	// 排序方法

	/**
	 * 通过姓名排序
	 */
	public void sortByPersonName() {
	}

	/**
	 * 通过年龄排序
	 */
	public void sortByPersonAge() {
	}

	/**
	 * 默认排序，通过编号排序 使用冒泡排序，增加了判断以提高效率
	 */
	public void sort() {
		boolean jx = true; // 冒泡排序的简化方法
		for (PersonChainNode pcn = head; pcn != null && jx; pcn = pcn.nextNode) {
			jx = false;
			for (PersonChainNode pc = head; pc != null && pc.nextNode != null; pc = pc.nextNode) {
				if (pc.person.personNo > pc.nextNode.person.personNo) {
					Person temp = pc.person;
					pc.person = pc.nextNode.person;
					pc.nextNode.person = temp;
					jx = true;
				}
			}
		}
	}

	/**
	        * 打印整个链表
	        */
	       public void printAll() {
	           if (size != 0 ) {
	               for (PersonChainNode pcn = head; pcn != null; pcn = pcn.nextNode) {
	                   System.out.println(pcn.person.toString());
	               }
	           }
	       }
}
