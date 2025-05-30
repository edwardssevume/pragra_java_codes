public class PalindromeExample3 {
    public static void main(String[] args) {

        String str = "RACECAR", reverseStr = "";

        for(int i = str.length() - 1; i >= 0; --i){
            reverseStr = reverseStr + str.charAt(i);
        }

        if(str.toLowerCase().equals(reverseStr.toLowerCase())){
            System.out.println(str +" " + "is a palindrome");
        }else{
            System.out.println(str +" " + "is not a palindrome");
        }
    }
}
