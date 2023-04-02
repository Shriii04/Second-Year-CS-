interface Account {
    abstract void set();
    abstract void display();
}

interface Person{
    abstract void store();
    abstract void disp();
}

class Customer implements Account,Person{

    String name;
    int balance,acc_no;

    Customer(String name,int acc_no,int balance){
        this.name = name;
        this.acc_no = acc_no;
        this.balance = balance;
    }

    @Override
    public void store() {
        // TODO Auto-generated method stub

        
    }

    @Override
    public void disp() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void set() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void display() {
        // TODO Auto-generated method stub
        System.out.println("Name "+name);
        System.out.println("Account No "+acc_no);
        System.out.println("Balance "+balance);
        
    }
    public static void main(String[] args) {
        Customer ob = new Customer("Shrinivas", 12345677, 50000);
        ob.display();
    }
    
}