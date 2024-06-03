import java.util.Scanner;

public class Test3 {
    public static int[] takeInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size:- ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        return arr;
    }
    public static void Sort(int arr[]){
        int a =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                int b = arr[a];
                arr[a] = arr[i];
                arr[i] =b;
                a++;
            }
        }
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
   public static void main(String[] args) {
    int arr[] = takeInput();
    Sort(arr);
   } 
}
