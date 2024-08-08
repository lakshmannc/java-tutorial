public class Recursive {
    public static void printName(String name, int n) {
        if(n==0){
            return;
        }
        System.out.println(name);
        printName(name,n-1);
    }
    public static void main(String[] args) {
        String name = "Alice";
        int times=5;
        printName(name,times);
    }
}
