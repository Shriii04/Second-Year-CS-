import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF ELEMENTS REQUIRED FOR YOUR ARRAY");
        int size = sc.nextInt();
        int[] array = new int[100];
        System.out.println("ENTER THE ELEMENTS FOR THE ARRAY:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("ARRAY ELEMENTS ARE:");
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
        int temp = 0;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("SOURTED ARRAY:");
        for (int i = 0; i < size; i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println("ENTER THE NUMBER YOU WANT TO SEARCH");
        int find = sc.nextInt();
        int start = 0;
        int end = size;
        while (start<=end){
            int mid = (start+end)/2;
            if(array[mid] < find){
                start = mid+1;
                }
            else if(array[mid]==find){
                System.out.println("ELEMENT FOUND AT\t"+(mid+1));
                break;
            }
            else {
                end = mid-1;
            }
            //mid = (start+end)/2;
        }
        if (start>end){
            System.out.println("ELEMENT NOT FOUND");
        }
        sc.close();
    }
    

}