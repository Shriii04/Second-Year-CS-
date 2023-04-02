import java.util.*;
class Person{
    String name;
    int age;
    Person(String name,int age){
        this.name = name;
        this.age = age;
    }
}
class Employee extends Person{
    String designation;
    int salary;
    Employee(String name,int age,String designation,int salary){
        super(name,age);
        this.designation = designation;
        this.salary = salary;
        if(salary>5000){
            System.out.println(name);
            System.out.println(designation);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee ob = new Employee(sc.next(),sc.nextInt(),sc.next(),sc.nextInt());
        //Employee ob1 = new Employee("Akshat", 20, "Develper", 50000);
        sc.close();
    }
}
