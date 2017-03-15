/**
 * @author liudaohao
 * @version 创建时间：2017年2月11日 下午7:07:46
 */
public class Node {
	public Dog dog;
	public Node nextNode;

	public Node(Dog dog) {//这个非常关键,必须写
		this.dog = dog;
	}

	/**
	 * 其中在DogChain中已经有了一个addNode()方法了,
	 * 又写个add()方法是因为我想实现每插入一个Node的时候 是从最后插入
	 * 当然要是哪位大神有好的方法的话，欢迎赐教！
	 */
	public void add(Node newNode) {
          if(this.nextNode == null){//判断下一个结点是否为空
        	  this.nextNode = newNode;//如果下一个结点为空，则把新结点放在nextNode的位置上
          }else{//如果不为空，则表示还有下一个结点，判断下一个结点是否为空
        	  this.nextNode.add(newNode);
          }
	}

}
