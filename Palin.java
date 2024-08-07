import java.util.Scanner;

public class Palin{
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        System.out.print("Enter a String:");
        String str = s.nextLine();
        int n = str.length();
        boolean isPalindrome = true;

        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}

    