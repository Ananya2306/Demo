import java.util.Scanner;

public class Test2 {
    public static boolean Palindrome(String str){
        int start =0;
        int end = str.length()-1;
        while(start<end){
            if(str.charAt(start)!=str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String :- ");
        String str = sc.nextLine();
        System.out.println(Palindrome(str));
        sc.close();
    }
}
