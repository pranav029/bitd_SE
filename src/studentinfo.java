import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import main.panelbg;
import main.stack;
public class studentinfo extends JPanel{
    private JPanel bg;
    private JLabel label,nLab,rLab,adLab,geLab,caLab,seLab,DOB,semSel,phLab,examMarks;
    private JButton submit;
    private JLabel name,roll,address,phone,gender,category,semester,day;
    private JComboBox<String> sem;
    private JScrollPane pane;
    private JTable table;
    public studentinfo(){
        bg=new panelbg("images/v915-wit-005.jpg");
        bg.setSize(700,600);
        bg.setLayout(null);
        label=new JLabel("Student Details");
        label.setBounds(220,30,300,30);
        try {
            label.setFont(Font.createFont(Font.TRUETYPE_FONT, 
            new File("images/JosefinSansRegular-x3LYV.ttf")).deriveFont(30f));
        } catch (FontFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        nLab=new JLabel("Name       : ");
        nLab.setFont(new Font("Arial",Font.BOLD,15));
        nLab.setBounds(100,80,400,80);
        name=new JLabel("Name goes here");
        name.setFont(new Font("Arial",Font.PLAIN,15));
        name.setBounds(180,101,400,40);
        rLab=new JLabel("Roll           : ");
        rLab.setFont(new Font("Arial",Font.BOLD,15));
        rLab.setBounds(100,110,400,80);
        roll=new JLabel("Roll goes here");
        roll.setFont(new Font("Arial",Font.PLAIN,15));
        roll.setBounds(180,130,400,40);
        geLab=new JLabel("Gender    :");
        geLab.setFont(new Font("Arial",Font.BOLD,15));
        geLab.setBounds(100,138,400,80);
        gender=new JLabel("Gender goes here");
        gender.setFont(new Font("Arial",Font.PLAIN,15));
        gender.setBounds(180,166,400,25);
        caLab=new JLabel("Category :");
        caLab.setFont(new Font("Arial",Font.BOLD,15));
        caLab.setBounds(100,166,400,80);
        category=new JLabel("Category goes here");
        category.setFont(new Font("Arial",Font.PLAIN,15));
        category.setBounds(180,195,400,25);
        seLab=new JLabel("Semester:");
        seLab.setFont(new Font("Arial",Font.BOLD,15));
        seLab.setBounds(100,197,400,80);
        semester=new JLabel("Semester goes here");
        semester.setFont(new Font("Arial",Font.PLAIN,15));
        semester.setBounds(180,225,400,25);
        DOB=new JLabel("DOB        :");
        DOB.setFont(new Font("Arial",Font.BOLD,15));
        DOB.setBounds(102,228,400,80);
        day=new JLabel("Birth date goes here");
        day.setFont(new Font("Arial",Font.PLAIN,15));
        day.setBounds(180,255,300,25);
        adLab=new JLabel("Address :");
        adLab.setFont(new Font("Arial",Font.BOLD,15));
        adLab.setBounds(100,260,400,80);
        address=new JLabel("Address goes here");
        address.setFont(new Font("Arial",Font.PLAIN,15));
        address.setBounds(180,285,400,30);
        phLab=new JLabel("Phone     :");
        phLab.setFont(new Font("Arial",Font.BOLD,15));
        phLab.setBounds(100,290,400,80);
        phone=new JLabel("Phone goes here");
        phone.setFont(new Font("Arial",Font.PLAIN,15));
        phone.setBounds(180,315,400,30);
        examMarks=new JLabel("Examination Marks");
        examMarks.setFont(new Font("Arial",Font.BOLD,15));
        examMarks.setBounds(280,345,200,30);
        semSel=new JLabel("Semester:");
        semSel.setFont(new Font("Arial",Font.BOLD,15));
        semSel.setBounds(100,365,200,30);
        String sems[]={"1","2","3","4","5","6","7","8"};
        sem=new JComboBox<String>(sems);
        sem.setBounds(200,367,50,25);
        DefaultTableModel def=new DefaultTableModel();
        def.addColumn("Subject");
        def.addColumn("Code");
        def.addColumn("Semester");
        def.addColumn("Marks");
        table=new JTable(def);
        pane=new JScrollPane(table);
        pane.setBounds(100,400,500,150);
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
        bg.add(adLab);
        bg.add(address);
        bg.add(phLab);
        bg.add(phone);
        bg.add(examMarks);
        bg.add(semSel);
        bg.add(sem);
        bg.add(pane);
        add(bg);
        setSize(700,600);
        setLayout(null);
        setVisible(true);
        // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String args[]){
        new studentinfo();
    }
    
}
