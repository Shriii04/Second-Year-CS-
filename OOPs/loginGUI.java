// import javax.swing.*;
// import java.awt.event.*;
// public class loginGUI {  
// public static void main(String[] args) {  
//     JFrame f=new JFrame("Password Field Example");  
            
//     JButton b=new JButton("Login");  
//     b.setBounds(160,100,100, 30);

//     JTextField f1 = new JTextField();
//     JPasswordField f2 = new JPasswordField(16);

//     f1.setBounds(160, 10, 200, 20);
//     f2.setBounds(160,60,200,20);

//     JLabel l1 = new JLabel("Username");
//     JLabel l2 = new JLabel("Password");
//     JLabel l3 = new JLabel(" ");

//     l1.setBounds(10, 10, 100, 14);
//     l2.setBounds(10, 60, 100, 14);
//     l3.setBounds(20, 150, 400, 14);

//     f.add(b);
//     f.add(f1);
//     f.add(l1);
//     f.add(l2);
//     f.add(f2);
//     f.add(l3);
    
//     f.setLayout(null);
//     f.setVisible(true);
//     f.setSize(400,300);

//     b.addActionListener(new ActionListener(){
//         public void actionPerformed(ActionEvent e){
//             l3.setText("Username : "+f1.getText()+" "+"Password "+f2.getText());

//         }

//     });
//     }
// }


import javax.swing.*;  
import java.awt.event.*;  
public class loginGUI extends JFrame implements ActionListener{  
    JLabel l;  
    JCheckBox cb1,cb2,cb3;  
    JButton b;  
    loginGUI(){  
        l=new JLabel("Food Ordering System");  
        l.setBounds(50,50,300,20);  
        cb1=new JCheckBox("Pizza @ 100");  
        cb1.setBounds(100,100,150,20);  
        cb2=new JCheckBox("Burger @ 30");  
        cb2.setBounds(100,150,150,20);  
        cb3=new JCheckBox("Tea @ 10");  
        cb3.setBounds(100,200,150,20);  
        b=new JButton("Order");  
        b.setBounds(100,250,80,30);  
        b.addActionListener(this);  
        add(l);add(cb1);add(cb2);add(cb3);add(b);  
        setSize(400,400);  
        setLayout(null);  
        setVisible(true);  
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
    }  
    public void actionPerformed(ActionEvent e){  
        float amount=0;  
        String msg="";  
        if(cb1.isSelected()){  
            amount+=100;  
            msg="Pizza: 100\n";  
        }  
        if(cb2.isSelected()){  
            amount+=30;  
            msg+="Burger: 30\n";  
        }  
        if(cb3.isSelected()){  
            amount+=10;  
            msg+="Tea: 10\n";  
        }  
        msg+="-----------------\n";  
        JOptionPane.showMessageDialog(this,msg+"Total: "+amount);  
    }  
    public static void main(String[] args) {  
        new loginGUI();  
    }  
}


