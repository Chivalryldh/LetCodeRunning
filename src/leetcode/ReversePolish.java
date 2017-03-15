package leetcode;

import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * @author liudaohao
 * @version 创建时间：2017年3月12日 下午4:14:00
 */
public class ReversePolish<T> {
	public static void main(String[] args) {
		String[] s = new Scanner(System.in).nextLine().split(",");
		ArrayDeque<Integer> stack = new ArrayDeque();//ArrayDeque可当成"栈"来使用
		for(int i = 0; i < s.length; i++){
			if(s[i].matches("^\\d+$")){//正则表达式：判断字符串数组中元素是否是数字
				stack.push(Integer.parseInt(s[i]));//为数字则入栈
			} else {
				String temp = s[i];
				switch (temp) {
				case "+":
					int rightOperator1 = stack.pop();
					int leftOperator1 = stack.pop();
					stack.push(leftOperator1 + rightOperator1);
					break;
				case "-":
					int rightOperator2 = stack.pop();
					int leftOperator2 = stack.pop();
					stack.push(leftOperator2 - rightOperator2);
					break;
				case "*":
					int rightOperator3 = stack.pop();
					int leftOperator3 = stack.pop();
					stack.push(leftOperator3 * rightOperator3);
					break;
				case "/":
					int rightOperator4 = stack.pop();
					int leftOperator4 = stack.pop();
					stack.push(leftOperator4 / rightOperator4);
					break;
				}
			}
		}
		System.out.println(stack.pop());
	}
}
