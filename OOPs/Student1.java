class student {
    int rollno = 10;
    String name = "Shree";
    static String college = "VIT";
    /*student(){
        rollno = 10;
        name = "Shrinivas";
    }*/
    static void change(){
       college = "abc";

    }
    void display(){
       
        System.out.println("Name: "+name+"\nRoll No: "+rollno+"\nCollege: "+college);
        System.out.println(college);
        change();
       
    
    }
}
public class Student1{
    

    public static void main(String[] args){
        student ob1 = new student();
        student ob2 = new student();
        ob1.display();
        ob2.display();

      

    }
}

    
