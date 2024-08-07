import java.util.*;
public class StrBuilder{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        StringBuilder s = new StringBuilder(sc.nextLine());
        s.append("raju");
        System.out.println(s.toString());
    }
}