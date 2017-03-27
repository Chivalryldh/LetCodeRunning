import sort.BubbleSort;

/**
 * 约瑟夫环问题：一圈共有N个人，开始报数，报到M的人自杀，然后重新开始报数，问最后自杀的人是谁？
 */
public class JosephProblem {
	// 假设现在有8个人，编号从0到7，报到4就自杀
	public static void main(String[] args) {
		int[] a = { 0, 1, 2, 3, 4, 5, 6, 7 };
		int i = 0;
		int cursor = 0;
		int delCount = 0;
		while (true) {
			if (delCount == 7) {
				for (int j = 0; j < 8; j++) {
					if (a[j] != -1) {
						System.out.println(a[j]);
						return;
					}
				}
			}
			if (i == 8) {
				i = i % 8;
			}
			if (a[i] != -1) {
				cursor++;
			}
			if (cursor == 4) {
				cursor = 0;
				delCount++;
				a[i]=-1;
			}
			i++;
		}
	}
}
