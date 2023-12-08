import java.util.*;

public class knapsack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numInstances = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numInstances; i++) {
            int numItems = scanner.nextInt();
            int capacity = scanner.nextInt();
            int[] weight = new int[numItems];
            int[] value = new int[numItems];

            for (int j = 0; j < numItems; j++) {
                weight[j] = scanner.nextInt();
                value[j] = scanner.nextInt();
            }

            System.out.println(helper(numItems, capacity, weight, value));

            if (i < numInstances - 1) {
                scanner.nextLine();
            }
        }
    }

    public static int helper(int numItems, int capacity, int[] weight, int[] value) {
        int[][] checkingArr = new int[numItems + 1][capacity + 1];
        for (int i = 0; i <= numItems; i++) {
            for (int j = 0; j <= capacity; j++) {
                if (i == 0 || j == 0) {
                    checkingArr[i][j] = 0;
                } else if (weight[i - 1] > j) {
                    checkingArr[i][j] = checkingArr[i - 1][j];
                } else {
                    checkingArr[i][j] = Math.max(checkingArr[i - 1][j],
                            value[i - 1] + checkingArr[i - 1][j - weight[i - 1]]);
                }
            }
        }

        return checkingArr[numItems][capacity];
    }
}
