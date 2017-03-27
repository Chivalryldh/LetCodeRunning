import java.util.Scanner;

public class HDU2084{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        while (c-- > 0) {
            int n = sc.nextInt();
            int[][] num = new int[n][n];
            int[][] dp = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    num[i][j] = -1;
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    num[i][j] = sc.nextInt();
                }
            }
            for (int j = 0; j < n; j++) {
                if (num[0][j] != -1) {
                    dp[0][j] = num[0][j];
                }
            }

            for (int i = 1; i < n; i++) {
                dp[i][0] = dp[i - 1][0] + num[i][0];
            }
            for (int i = 1; i < n; i++) {
                for (int j = 1; j <= i; j++) {
                    dp[i][j] = Math.max(dp[i - 1][j - 1], dp[i - 1][j]) + num[i][j];
                }
            }
            int max = dp[n - 1][0];
            for (int j = 0; j <= n - 1; j++) {
                if (max < dp[n - 1][j]) {
                    max = dp[n - 1][j];
                }
            }
            System.out.println(max);

        }
    }
}
