import java.util.Scanner;

public class JPA502 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 輸入 n 的值
        System.out.print("Input n (0 <= n <= 16): ");
        int n = scanner.nextInt();

        // 使用迴圈計算 n 的階乘
        int factorialLoop = 1;
        for (int i = 1; i <= n; i++) {
            factorialLoop *= i;
        }

        // 使用尾端遞迴計算 n 的階乘
        int factorialTail = facTail(n, 1);

        // 顯示結果
        System.out.println(n + "的階乘(迴圈) = " + factorialLoop);
        System.out.println(n + "的階乘(尾遞迴) = " + factorialTail);
    }

    private static int facTail(int a, int b) {
        if (a == 1) {
            return b;
        } else {
            return facTail(a - 1, a * b);
        }
    }
}
