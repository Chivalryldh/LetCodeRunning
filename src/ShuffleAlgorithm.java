import java.util.Random;

/**
 * public int nextInt(int n) 该方法的作用是生成一个随机的int值，该值介于[0,n)的区间
 * 也就是0到n之间的随机int值，包含0而不包含n。
 * 
 * @author Administrator
 *
 */
public class ShuffleAlgorithm {//洗牌算法
	public static void main(String[] args) {
		int[] a = new int[54];
		int i;
		for (i = 0; i < 54; i++) {
			a[i] = i;
			if (i == 53) {
				i = 0;
				break;
			}
		}
		for (int j = 0; j < 54; j++) {
			int temp;
			int r = new Random().nextInt(54);// [0,54)
			temp = a[i];
			a[i] = a[r];
			a[r] = temp;
		}
		for (int k = 0; k < 54; k++) {
			
			if(k==53){
				System.out.print(a[k]);
			}else{
				System.out.print(a[k]+",");
			}
		}
	}
}
