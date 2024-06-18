import java.util.Scanner;
/*
 * Given an array of length N and an integer x, you need to find and return the last index of integer x present in the array. Return -1 if it is not present in the array.

Last index means - if x is present multiple times in the array, return the index at which x comes last in the array.

You should start traversing your array from 0, not from (N - 1)
 */
public class Test4 {
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
    // Recursion
    public static int LastOccur(int arr[],int x){
        return HelperFunction(arr, 0,x);

    }
    //Helper Fuction 
    public static int HelperFunction(int arr[],int start,int x){
        if(arr.length==start){
            return -1;
        }
        int ans = HelperFunction(arr, start+1, x);
        if(arr[start]==x && ans==-1){
            return start;
        }
        return ans;
    }
    //Main Function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = takeInput();
        System.out.println(LastOccur(arr,x));
        sc.close();
    }
}
