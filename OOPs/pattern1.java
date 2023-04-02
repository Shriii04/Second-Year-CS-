import java.util.*;
public class pattern1 {
    int n;
    int num =0;
    public void star(){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i =1;i<=n;i++){
            for(int j =1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
        sc.close();
    }
    public static void main(String[] args) {
        pattern1 ob = new pattern1();
        ob.star();
    }
}
