import java.util.*;
public class inheritance {
//    public void setarea(){
//        System.out.println("This is setarea method");
//    }
}
    class triangle extends inheritance{
        public double setarea(float base, float height){
            double areatri=0.5*base*height;
            return areatri;
        }
    }
    class square extends inheritance{
        public int setarea(int side){
            int areasq=side*side;
            return areasq;
        }
    }
    class circle extends inheritance {
        public double setarea(float radi) {
            double areacir = 3.14 * radi * radi;
            return areacir;
        }
    }

    class A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Shape for which area is to be calculated");
        System.out.println("choose 1:Triangle 2:Square 3:Circle");
        int i = input.nextInt();
        switch (i) {
            case 1:
                triangle calltri = new triangle();
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter base and height of triangle");
                double areatri = calltri.setarea(sc.nextFloat(), sc.nextFloat());
                System.out.println("Area of Triangle is "+areatri);
                break;
            case 2:
                square callsq = new square();
                Scanner scsq = new Scanner(System.in);
                System.out.println("Enter side of Square");
                int areasq = callsq.setarea(scsq.nextInt());
                System.out.println("Area of Square is "+areasq);
                break;
            case 3:
                circle callcir = new circle();
                Scanner sccir = new Scanner(System.in);
                System.out.println("Enter radius of Circle");
                double areacir = callcir.setarea(sccir.nextFloat());
                System.out.println("Area of Circle is "+areacir);
                break;
                }
            }
        }
