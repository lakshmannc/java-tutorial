import java.util.*;

public class Anagram{
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        System.out.print("Enter a string1:");
        String str1=s.nextLine().toLowerCase().replaceAll("\\s+", "");
        System.out.print("Enter a string2:");
        String str2=s.nextLine().toLowerCase().replaceAll("\\s+", "");

        if (isAnagram(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }

    public static boolean isAnagram(String str1, String str2) {
        // If string lengths are not same, they cannot be anagram
        if (str1.length() != str2.length()) {
            return false;
        }

        // Sort both strings and compare
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        System.out.println();

        return Arrays.equals(charArray1, charArray2);
    }
}
