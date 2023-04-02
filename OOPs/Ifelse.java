import java.util.*;

public class Ifelse {
    int a,b;
    void ifelse(){
        Scanner sc  = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        if(a==b){
            System.out.println("Equal");
        }
        else if(a>b){
            System.out.println("A > B");
        }
        else{
            System.out.println("A<B");
        }
        sc.close();
    }
    public static void main(String[] args){
        Ifelse ob = new Ifelse();
        ob.ifelse();

    }

    
}
