import java.util.*;
public class Factorial {
    
    public int fact(int m){
        if(m==0){
            return 1;
        }
        else{
            return(m*fact(m-1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int facto = 1;
        Factorial ob = new Factorial();
        facto = ob.fact(n);
        System.out.println(facto);
    }
}
