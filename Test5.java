import java.util.Scanner;
/*
 Given an array of length N, you need to find and return the sum of all elements of the array.
 
 */
public class Test5 {
    public static int[] takeInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size:- ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        return arr;
    }
    public static int Sum(int arr[]){
        return HelperFunction(arr, 0);
    }
    public static int HelperFunction(int arr[],int start){
         if(arr.length==start){
            return 0;
         }
         int ans = arr[start]+HelperFunction(arr,start+1);
         return ans;
    }
    public static void main(String[] args) {
        int arr[] = takeInput();
        System.out.print(Sum(arr));
    }
}
