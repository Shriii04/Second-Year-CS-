import java.util.*;
public class List {
    ArrayList<String> list = new ArrayList<String>();
    ArrayList<String> list2 = new ArrayList<String>();

    public void reverse(){
        list.add("Hello");
        list.add("102");
        list.add("200.8");
        list.add("25");

        System.out.print("listone: "+" ");
        for(String s:list){
            System.out.print(s+" ");
        }
        System.out.println();
        list2.add("105");  
        list2.add("40.8");  
        list2.add("Welcome");  
        list2.add("A");  

        System.out.print("listtwo: "+" ");
        for(String s:list2){
            
            System.out.print(s+" ");
        }

        // for(int i=list2.size()-1;i>=0;i--){
        //     list3.add(list2.get(i)+" ");
        // }

        // for(String s:list3){
            
        //     System.out.print(s+" ");
        // }

        
        Collections.reverse(list2);
        list.addAll(list2);


        for(String S:list){
            System.out.print(S+" ");
        }



        
        
        
    }

    public static void main(String[] args) {
        List ob = new List();
        ob.reverse();
    }
}
