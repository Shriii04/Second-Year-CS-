import java.util.*;
public class Hashmap {
    String str = "This work is done by saket saket";
    HashMap<String,Integer> occ = new HashMap<>();
    String arr[] = str.split(" ");
    public void occurance(){
        
        
        for(String s:arr){
            Integer integer = occ.get(s);
            if(integer==null){
                occ.put(s,1);
            }
            else{
                occ.put(s,integer+1);
            }

        }
        System.out.println(occ);
        

    }
    public static void main(String[] args) {
        Hashmap ob = new Hashmap();
        ob.occurance();
    }
    
}



