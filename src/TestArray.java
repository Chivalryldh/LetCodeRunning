import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TestArray {
	/**
	 * 输入：
	 *   4 2
	 *  87 98 79 61
	 *  10 27 95 70
	 *  20 64 73 29
	 *  71 65 15 0
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String[] s = new Scanner(System.in).nextLine().split(" ");
		List<Integer> list = new ArrayList<Integer>();
		int result = 0;
		int count = 0;// 控制循环次数
		int[][] array = { { 87, 98, 79, 61 }, { 10, 27, 95, 70 }, { 20, 64, 73, 29 }, { 71, 65, 15, 0 } };
		rowMax(s, result, count, array, list);// 求行的最大值
		columnMax(s, result, count, array, list);// 求列的最大值
		diagonalMax(s, result, count, array, list);// 求对角线的最大值
		System.out.println("max:" + Collections.max(list));// 输出最大值
	}

	public static void rowMax(String[] s, int result, int count, int[][] array, List<Integer> list) {

		for (int i = 0; i < Integer.parseInt(s[0]); i++) {
			for (int j = 0; j < Integer.parseInt(s[0]);) {
				while (count < Integer.parseInt(s[1])) {
					result = result + array[i][j];
					j++;
					count++;
				}
				list.add(result);// 计算每行的值放入集合
				result = 0;// 重新赋值为0
				count = 0;
				if (j == Integer.parseInt(s[0])) {
					break;
				} else {
					j--;
				}
			}
		}
		System.out.println("rowMax:" + Collections.max(list));// 输出行最大值
	}

	public static void columnMax(String[] s, int result, int count, int[][] array, List<Integer> list) {
		for (int j = 0; j < Integer.parseInt(s[0]); j++) {// i的取值只能是0，1，2，表示行
			for (int i = 0; i < Integer.parseInt(s[0]);) {
				while (count < Integer.parseInt(s[1])) {
					result = result + array[i][j];
					i++;
					count++;
				}
				list.add(result);// 计算每行的值放入集合
				result = 0;// 重新赋值为0
				count = 0;
				if (i == Integer.parseInt(s[0])) {
					break;
				} else {
					i--;
				}

			}
		}
		System.out.println("columnMax:" + Collections.max(list));// 输出列最大值
	}

	public static void diagonalMax(String[] s, int result, int count, int[][] array, List<Integer> list) {
		int N = Integer.parseInt(s[0]);
		int d = Integer.parseInt(s[1]);
		int crosSum1 = 0;
		int crosSum2 = 0;
		for (int i = 0; i <= N - d; i++) {
			for (int j = 0; j <= N - d; j++) {
				int temp3 = 0, temp4 = 0;
				for (int k = 0; k < d; k++) {
					temp3 += array[i + k][j + k];
					temp4 += array[i + k][N - 1 - j - k];
				}
				if (crosSum1 < temp3) {
					crosSum1 = temp3;
				}
				if (crosSum2 < temp4) {
					crosSum2 = temp4;
				}
			}
		}
		list.add(crosSum1);
		list.add(crosSum2);
	}
}
