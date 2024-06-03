import java.util.Scanner;

public class Test1 {

    public static void SubStrin(String str){
        for(int i =0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                System.out.println(str.substring(i,j));
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        SubStrin(str);
        sc.close();
    }
}