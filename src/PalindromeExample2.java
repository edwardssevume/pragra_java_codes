public class PalindromeExample2 {
    public static void main(String[] args) {
        String s = "Racecar";
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();

        if(s.equals(sb.toString())){
            System.out.println(s + " " + "is a palindrome");
        }else{
            System.out.println(s + " " + "is not a palindrome");
        }
    }
}
