public class JPA504 {

    public static int sum2(int n) {
        if (n == 1) {
            return 2;
        } else {
            return sum2(n - 1) + 2 * n;
        }
    }

    public static void main(String[] args) {
        System.out.println("Input the number :");
        int n = Integer.parseInt(System.console().readLine());
        System.out.println("Ans: " + sum2(n));
    }
}
