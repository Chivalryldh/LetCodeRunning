public class TestArray {
	/**
	 * 输入：4 2
       87 98 79 61
       10 27 95 70
       20 64 73 29
       71 65 15 0
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] array = { { 87, 98, 79, 61 }, { 10, 27, 95, 70 }, { 20, 64, 73, 29 }, { 71, 65, 15, 0 } };
		for(int i = 0;i<array.length;i++){
			
			for(int j =0;j<array[i].length;j++){
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
