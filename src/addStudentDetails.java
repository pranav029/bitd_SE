import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import main.panelbg;
import main.stack;
public class addStudentDetails extends JPanel{
    private JPanel bg;
    private JLabel label,nLab,rLab,adLab,geLab,caLab,seLab,DOB,hint,phLab;
    private JButton submit;
    private JTextField name,roll,address,phone;
    private JComboBox<String> gender,category,semester,day,mon,year;
    public addStudentDetails(){
        bg=new panelbg("images/v915-wit-005.jpg");
        bg.setSize(700,600);
        bg.setLayout(null);
        label=new JLabel("Add Student Details");
        label.setBounds(220,50,300,30);
        label.setFont(new Font("Arial",Font.PLAIN,30));
        nLab=new JLabel("Name");
        nLab.setBounds(100,100,400,80);
        name=new JTextField();
        name.setBounds(160,122,400,40);
        rLab=new JLabel("Roll");
        rLab.setBounds(100,155,400,80);
        roll=new JTextField();
        roll.setBounds(160,178,400,40);
        geLab=new JLabel("Gender");
        geLab.setBounds(100,198,400,80);
        gender=new JComboBox<String>();
        gender.setBounds(160,230,400,25);
        caLab=new JLabel("Category");
        caLab.setBounds(100,238,400,80);
        category=new JComboBox<String>();
        category.setBounds(160,270,400,25);
        seLab=new JLabel("Semester");
        seLab.setBounds(100,278,400,80);
        semester=new JComboBox<String>();
        semester.setBounds(160,310,400,25);
        DOB=new JLabel("DOB");
        DOB.setBounds(100,320,400,80);
        day=new JComboBox<String>();
        day.setBounds(160,350,100,25);
        mon=new JComboBox<String>();
        mon.setBounds(270,350,100,25);
        year=new JComboBox<String>();
        year.setBounds(380,350,100,25);
        hint=new JLabel("(dd/mm/yyyy)");
        hint.setBounds(500,320,200,80);
        hint.setForeground(Color.red);
        adLab=new JLabel("Address");
        adLab.setBounds(100,360,400,80);
        address=new JTextField();
        address.setBounds(160,385,400,50);
        phLab=new JLabel("Phone");
        phLab.setBounds(100,420,400,80);
        phone=new JTextField();
        phone.setBounds(160,445,400,30);
        submit=new JButton("Submit");
        submit.setBounds(300,500,100,30);
        bg.add(label);
        bg.add(nLab);
        bg.add(name);
        bg.add(rLab);
        bg.add(roll);
        bg.add(geLab);
        bg.add(gender);
        bg.add(caLab);
        bg.add(category);
        bg.add(seLab);
        bg.add(semester);
        bg.add(DOB);
        bg.add(day);
        bg.add(mon);
        bg.add(year);
        bg.add(hint);
        bg.add(adLab);
        bg.add(address);
        bg.add(phLab);
        bg.add(phone);
        bg.add(submit);
        add(bg);
        setSize(700,600);
        setLayout(null);
        setVisible(true);
        // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String args[]){
        new addStudentDetails();
    }
    
}