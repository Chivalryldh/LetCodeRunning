package leetcode;

import java.util.regex.Pattern;

/**
 * @author liudaohao
 * @version 创建时间：2017年3月12日 下午8:02:21
 */
public class Test {
	public static void main(String[] args) {
		String[] s = { "4", "13", "52", "/", "+" };
		for(int i = 0; i < s.length; i++){
			if(s[i].matches("^\\d+$")){
				System.out.println(s[i]);
			}
		}
		
	}
}
