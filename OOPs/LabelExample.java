import java.awt.*;


class LabelExample{  
public static void main(String args[]){  
    Frame f= new Frame("Label Example");  
    Label l1,l2;  
    l1=new Label("Username");  
    l1.setBounds(50,100, 100,30);  
    l2=new Label("Password");  
    l2.setBounds(50,150, 100,30);  
    f.add(l1); f.add(l2);  
    TextField t1,t2;
    f.setSize(400,400); 
    t1=new TextField();  
    t1.setBounds(60,100, 200,30);
    //t1.setForeground("Black");  
    t2=new TextField();  
    t2.setBounds(60,150, 200,30);  
    f.add(t1); f.add(t2);  
    Button b = new Button("Submit");
    b.setBounds(80,200,60,40);
    f.add(b);

    f.setLayout(null);  
    f.setVisible(true);  
 
 

}  
}  
