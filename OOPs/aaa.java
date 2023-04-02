import java.lang.*;
class exceptionS extends Exception{


}
class People {
    People(){
        System.out.println("first");
    }
    public void calc ()throws exceptionS{
        throw new exceptionS();
    }
}
class aaa extends People{
    aaa(){
        System.out.println("second");
    }
    public void payment() throws exceptionS
    {
        new People().calc();
    }
    public static void main(String[] args) {
        aaa a=new aaa();
    }
}
