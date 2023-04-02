import javax.swing.*;
import java.awt.event.*;
class GUI3 {
    public static void main(String args[]){
        JFrame f = new JFrame("Text");
        JTextField t = new JTextField("Enter Text");
        JTextField t2 = new JTextField(" ");
        t.setBounds(120,20,150,25);
        t2.setBounds(120,60,150,25);
        JButton b = new JButton("SUBMIT");
        JLabel l = new JLabel(" ");
        b.setBounds(135,100, 100, 20);
        l.setBounds(170,150,150,25);
        f.add(t);
        f.add(t2);
        f.add(b);
        f.add(l);
        f.setSize(400,300);
        f.setLayout(null);
        f.setVisible(true);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                t2.setText(t.getText());
                l.setText(t.getText());
            }
        });

    }
}
