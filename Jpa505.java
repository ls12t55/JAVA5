public class JPA505 {

    public static void main(String[] args) {
        // 呼叫方法一
        add(2, 3);

        // 呼叫方法二
        add(5.2, 4.3);

        // 呼叫方法三
        add("I love", "Java!!");
    }

    // 方法一：傳入兩個整數，計算兩個整數的和
    public static int add(int i, int j) {
        int sum = i + j;
        System.out.println("Adding two integers: " + i + ", " + j);
        return sum;
    }

    // 方法二：傳入兩個浮點數，計算兩個浮點數的和
    public static double add(double i, double j) {
        double sum = i + j;
        System.out.println("Adding two doubles: " + i + ", " + j);
        return sum;
    }

    // 方法三：傳入兩個字串，合併兩個字串
    public static String add(String i, String j) {
        String sum = i + j;
        System.out.println("Adding two strings: " + i + ", " + j);
        return sum;
    }
}
