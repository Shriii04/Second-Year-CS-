import java.util.*;
public class pattern2 {
    int n;
    
    public void print(){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int num = n;
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num--;
            }
            num=n;
            System.out.println();
        }
        sc.close();
    }
    public static void main(String[] args) {
        pattern2 ob =new pattern2();
        ob.print();
    }
    
}
