package assemblage;

/**
 * @author liudaohao
 * @version 创建时间：2017年3月19日 下午4:44:10
 */
public class zhengchu {
	public static void main(String[] args) {

		for (int i = 0; i < 2; i++) {
			System.out.println("i=" + i);
			if (i == 0) {
				for (int j = 0; j < 3; j++) {
					System.out.println("内层for循环,j=" + j);
					break;//break直接跳出本层for循环
				}
				break;//break直接跳出最外层for循环
			}
		}
	}
}
