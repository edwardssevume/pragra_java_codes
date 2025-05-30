public class Swapping2Numbers {
    public static void main(String[] args) {
        int a = 20, b = 30;

        System.out.println("Before swapping values of a and b are: " +a + " and " +b);

        // Swapping using a third variable

        int c = a;
        a = b;
        b = c;

        System.out.println("After swapping values of a and b are: " +a + " and " +b);
    }
}
