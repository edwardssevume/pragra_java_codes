public class palindromeMethodExample1 {
    public static boolean isPalindrome(String s){
        int i = 0, j = s.length() - 1;

        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "collaborate";
        String str2 = "Racecar";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(isPalindrome(str1)){
            System.out.println(str1 + " " + "is a palindrome");
        }else{
            System.out.println(str1 + " " + "is not a palindrome");
        }

        if(isPalindrome(str2)){
            System.out.println(str2 + " " + "is a palindrome");
        }else{
            System.out.println(str2 + " " + "is not a palindrome");
        }
    }
}
