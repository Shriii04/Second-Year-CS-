import java.util.*;
public class MinimumMax {
    int length;
    Scanner sc = new Scanner(System.in);
    
    public void maxmin(){
        System.out.print("Enter Length of Array ");
        length = sc.nextInt();
        int a [] = new int[length];
        
        for(int i =0;i<length;i++){
            a[i] = sc.nextInt();
        }
        int max=a[0];
        int min=a[0];
        for(int i =0;i<length;i++){
            if(a[i]>max){
                max = a[i];
            }
            if(a[i]<min){
                min = a[i];
            }

        }
        System.out.println("Maximum"+max);
        System.out.println("Minimum"+min);
        
    }
    public static void main(String[] args) {
        MinimumMax ob = new MinimumMax();
        ob.maxmin();
    }
    
}
