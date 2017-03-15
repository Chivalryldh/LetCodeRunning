import javax.swing.plaf.synth.SynthSeparatorUI;

/**
 * 1分2分5分组成1角的组合
 */
public class Coin {

	public static void main(String[] args) {
		Long l = System.currentTimeMillis();
		int count = 0;
		for (int x = 0; x < 5000; x++) {
			for (int y = 0; y < 3000; y++) {
				for (int z = 0; z < 6000; z++) {
					if (x + y + z == 9000) {
						count++;
					}
				}
			}
		}

		System.out.println("组合数一共有:" + count + "种.");
		Long s = System.currentTimeMillis();
		System.out.println(s-l);
	}
}
