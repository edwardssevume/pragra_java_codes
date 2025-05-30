public class Swapping2Numbers2 {
    public static void main(String[] args) {
        int a = 20, b = 30;

        System.out.println("Before swapping values of a and b are: " +a + " and " +b);

        // Swapping using + and -

        a = a + b;  // 20 + 30 = 50
        b = a - b;  // 50 - 30 = 20
        a = a - b;  // 50 - 20 = 30

        // Swapping using * and /  ie a or b should not be zero
        // a = a * b = 20 * 30 = 600
        // b = a / b = 600 / 30 = 20
        // a = a / b = 600 / 20 = 30

        // Swapping using bitwise XOR (^)
        // a = a ^ b;  20 ^ 30 = 10
        // b = a ^ b;  10 ^ 30 = 20
        // a = a ^ b;  10 ^ 20 = 30

        System.out.println("After swapping values of a and b are: " +a + " and " +b);
    }
}
