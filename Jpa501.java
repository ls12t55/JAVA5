public class JPA501 {

    public static void main(String[] args) {
        int n;
        do {
            System.out.print("Input n (0 <= n <= 16): ");
            n = Integer.parseInt(System.console().readLine());
        } while (n < 0 || n > 16);

        int fac = 1;
        for (int i = 1; i <= n; i++) {
            fac *= i;
        }

        System.out.println(n + "的階乘 = " + fac);
    }
}
