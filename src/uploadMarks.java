import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class uploadMarks extends JFrame implements ActionListener {
    private JLabel semLabel,label,rLabel,mLabel,sLabel,warning,img;
    private JTextField roll,marks;
    private JComboBox<String> subs,sem;
    private JButton submit;
    private JPanel panel;
    public uploadMarks(){
        img=new JLabel(new ImageIcon("images/220px-Birla_Institute_of_Technology_Mesra.png"));
        panel=new JPanel();
        panel.setSize(700,600);
        setTitle("Upload Marks");
        String s[]={"1","2","3","4","5","6","7","8"};
        String sub[]={"Maths","DBMS","DAA"};
        label=new JLabel("Upload Marks");
        label.setBounds(250,50,200,30);
        label.setFont(new Font("Arial",Font.BOLD,30));
        semLabel=new JLabel("Semester");
        semLabel.setBounds(100,140,100,30);
        sem=new JComboBox<String>(s);
        sem.setBounds(200,140,300,30);
        rLabel=new JLabel("Roll Number");
        rLabel.setBounds(100,190,100,30);
        roll=new JTextField();
        roll.setBounds(200,190,300,30);
        sLabel=new JLabel("Subject");
        sLabel.setBounds(100,240,100,30);
        subs=new JComboBox<String>(sub);
        subs.setBounds(200,240,300,30);
        mLabel=new JLabel("Marks");
        mLabel.setBounds(100,290,100,30);
        marks=new JTextField();
        marks.setBounds(200,290,300,30);
        submit=new JButton("Submit");
        submit.setBounds(300,390,100,40);
        warning=new JLabel("All fields must be filled");
        warning.setFont(new Font("Arial",Font.ITALIC,18));
        warning.setBounds(260,440, 200,30);
        warning.setForeground(new Color(255,0,0));
        panel.add(label);
        panel.add(semLabel);
        panel.add(sem);
        panel.add(rLabel);
        panel.add(roll);
        panel.add(sLabel);
        panel.add(subs);
        panel.add(mLabel);
        panel.add(marks);
        panel.add(submit);
        panel.add(warning);
        panel.setLayout(null);
        setSize(700,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
        setResizable(false);
        img.setBounds(0,0,700,600);
        img.setLayout(null);
        img.add(panel);
        add(img);
       
    }
    public static void main(String args[]){
        new uploadMarks();
    }
    @Override
    public void actionPerformed(ActionEvent e){

    }
}
