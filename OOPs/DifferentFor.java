import java.util.*;
public class DifferentFor {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println("Using For Loop");
        for(int i =0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println("\nUsing Advanced For Loop");
        for(Integer i :list){
            System.out.print(i+" ");
        }
        System.out.println("\nUsing Iterator");
        Iterator it = list.iterator();
        while(it.hasNext())
            System.out.print(it.next()+" ");
        }
    }
    
