import java.util.Scanner;

public class palindromeMethodExample2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the word you want to check:");
        String str = scanner.next();

        str = str.toLowerCase();

        if(isPalindrome(str)){
            System.out.println(str + " " + "is a palindrome");
        }else{
            System.out.println(str + " " + "is not a palindrome");
        }
    }

    public static boolean isPalindrome(String s){
        int i = 0, j = s.length() - 1;

        while (i < j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
