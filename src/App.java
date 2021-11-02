
import javax.swing.*;
import java.awt.Font;
import java.awt.event.*;
import java.awt.Image;
public class App extends JFrame  implements ActionListener {
    private JTextField user_id;
    private JTextField password;
    private JButton submit;
    private JLabel label,lab;
    // private JPanel panel;
    private ImageIcon  image;
    public App(){
        setTitle("Login Portal");
        image=new ImageIcon("images/220px-Birla_Institute_of_Technology_Mesra.png");
        Image temp = image.getImage().getScaledInstance(120,120, Image.SCALE_DEFAULT);
        ImageIcon newImg=new ImageIcon(temp);
        lab=new JLabel(newImg);
        lab.setBounds(125,30,120,120);
        user_id=new JTextField();
        password=new JTextField();
        submit=new JButton("Login");
        label=new JLabel("Login Portal");
        label.setBounds(110,110,200,130);
        user_id.setBounds(90,210,200,30);
        password.setBounds(90,260,200,30);
        submit.setBounds(140,330,100,50);
        submit.addActionListener(this);
        label.setFont(new Font("Arial",Font.PLAIN,30));
        add(lab);
        add(label);
        add(user_id);
        add(password);
        add(submit);
        setSize(400,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null); 
        setResizable(false);
        setVisible(true);
    }
    public static void main(String args[]){
        new App();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        dispose();
        new studentDetails();
    }
}




