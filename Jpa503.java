public class JPA503 {

    public static void main(String[] args) {
        int m, n;
        while (true) {
            System.out.print("Input m: ");
            m = scanner.nextInt();
            if (m == 999) {
                break;
            }
            System.out.print("Input n: ");
            n = scanner.nextInt();
            int gcd = gcd(m, n);
            System.out.println("最大公因數=" + gcd);
        }
    }

    private static int gcd(int m, int n) {
        if (n == 0) {
            return m;
        } else {
            return gcd(n, m % n);
        }
    }
}
