class Const{
     static void Animalmethod(){
          System.out.println("Animal is created");
     }
     public static void main(String[] args) {
        System.out.println("sss");
    }
    
}
class Dog extends Const{
     static void Animalmethod(){
          // super();
          System.out.println("Dog is created");}
    public static void main(String[] args) {
        Dog ob = new Dog();
        ob.Animalmethod();
    }
}