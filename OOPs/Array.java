import java.util.*;
public class Array {
    int size,k,m;
    int target,flag;
    void array(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array");
        size = sc.nextInt();
        int arr[] = new int[size];
        for(int i =0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter Target sum");
        target = sc.nextInt();
        for(k =0;k<size;k++){
            for(m=k+1;m<size;m++){
                if(arr[k]+arr[m]==target){
                    System.out.println("["+arr[k]+","+arr[m]+"]");
                    break;
                }                
            }

            // if(arr[k]+arr[k]==target){
            //     System.out.println("["+arr[k]+","+arr[k]+"]");
            //     break;
            // }                
            
        
        }            
    }
    public static void main(String[] args) {
        Array ob = new Array();
        ob.array();
        
    }

    
}
// import java.util.Scanner;
// class Adder{
//     int n;
//     int arr[];
//     int targetSum ;
//     void getData(){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number of elements you want to store: ");
//         n= sc.nextInt();
//         arr = new int[n];
//         System.out.println("Enter the elements of array: ");
//         for(int i = 0; i<n ;i++){
//             arr[i] = sc.nextInt();
//         }
//         System.out.println("Enter the targetSum: ");
//         targetSum = sc.nextInt();
//     }
//     int[] numsum(){
//         int sum;
//         int counter = 0;
//         int arr2[] = new int[2];
//         for(int i = 0 ; i<n ; i++){
//             for(int j = i+1 ;j<n ; j++){
//                 sum = arr[i] + arr[j];

//                 if(sum == targetSum){
//                     counter ++;
//                     arr2[0] = arr[i];
//                     arr2[1] = arr[j];
//                     for(int k = 0 ; k<2 ;k++){
//                         System.out.print(arr2[k]+" ");
//                     }
//                      return arr2;
//                 }
//                 else{
//                     arr2[0]=' ';
//                     arr2[1]=' ';
                    
//                 }
                 
//             }
//         }
//         return arr2;
//     }
// }




// class Main{
//     public static void main(String[] args) {
//         Adder obj = new Adder();
//         obj.getData();
//         obj.numsum();
//     }
// }