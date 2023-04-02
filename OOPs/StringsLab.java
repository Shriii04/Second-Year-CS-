import java.util.*;

public class StringsLab {
    Scanner sc = new Scanner(System.in);    
    String arr[] = new String[10];
    String str;
    public void operate(){
        for(int i =0;i<arr.length;i++){
            str = sc.next();
            arr[i] = str;
            char ch[] = str.toCharArray();
            Arrays.sort(ch);
            // char temp;
            // for(int j =0;j<ch.length;j++){
            //     for(int k=j+1;k<ch.length;k++){
            //         if(ch[k]<ch[j]){
            //             temp = ch[j];
            //             ch[j]=ch[k];
            //             ch[k] = temp;
                        
            //         }
            //     }
            // }
            System.out.println(ch);
        }
        
    }
    public static void main(String[] args) {
        StringsLab ob = new StringsLab();
        ob.operate();
    }
}
