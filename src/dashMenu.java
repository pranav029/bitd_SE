
import main.panelbg;
import main.newPanel;
import main.custombtn;
import main.stack;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class dashMenu extends JPanel implements MouseListener {
    private JPanel opt1,opt2,opt3,opt4,opt5,opt6,panel;
    private JLabel lab1,lab2,lab4,lab5,lab6;
    public dashMenu(){
         panel=new panelbg("images/v915-wit-005.jpg");
         lab1=new JLabel("Student Detais");
         lab1.setFont(new Font("Arial",Font.BOLD,15));
         lab1.setBounds(70,10,150,30);
         lab2=new JLabel("Faculty Detais");
         lab2.setFont(new Font("Arial",Font.BOLD,15));
         lab2.setBounds(70,10,150,30);
         lab4=new JLabel("Add Student Details");
         lab4.setFont(new Font("Arial",Font.BOLD,15));
         lab4.setBounds(60,0,150,50);
         lab5=new JLabel("Add Faculty Details");
         lab5.setFont(new Font("Arial",Font.BOLD,15));
         lab5.setBounds(60,0,150,50);
         lab6=new JLabel("Upload Marks");
         lab6.setFont(new Font("Arial",Font.BOLD,15));
         lab6.setBounds(70,0,150,50);
         opt1=new custombtn(50,"#dd5e89","#f7bb97",panel) ;
         opt1.setBounds(50,100,250,50);
         opt1.setLayout(null);
         opt1.add(lab1);
         opt1.addMouseListener(this);
         opt2=new custombtn(50,"#dd5e89","#f7bb97",panel) ;
         opt2.add(lab2);
         opt2.addMouseListener(this);
         opt2.setLayout(null);
         opt2.setBounds(50,220,250,50);
         opt3=new custombtn(50,"#dd5e89","#f7bb97",panel) ;
         opt3.setBounds(50,350,250,50);
         opt4=new custombtn(50,"#dd5e89","#f7bb97",panel) ;
         opt4.setBounds(380,100,250,50);
         opt4.add(lab4);
         opt4.setLayout(null);
         opt4.addMouseListener(this);
         opt5=new custombtn(50,"#dd5e89","#f7bb97",panel) ;
         opt5.add(lab5);
         opt5.setLayout(null);
         opt5.setBounds(380,220,250,50);
         opt6=new custombtn(50,"#dd5e89","#f7bb97",panel) ;
         opt6.add(lab6);
         opt6.addMouseListener(this);
         opt6.setLayout(null);
         opt6.setBounds(380,350,250,50);
         panel.add(opt1);
         panel.add(opt2);
         panel.add(opt3);
         panel.add(opt4);
         panel.add(opt5);
         panel.add(opt6);
         panel.setSize(700,600);
         panel.setLayout(null);
         add(panel);
         setSize(700,600);
         setLayout(null);
         setVisible(true);
        //  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String args[]){
        new dashMenu();
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource()==opt1){
            stack.Stack.push(new studentDetails());
            stack.title.push("Student Details");
            dashboard.update();
        }
        if(e.getSource()==opt4){
            stack.Stack.push(new addStudentDetails());
            stack.title.push("Add Student Details");
            dashboard.update();
        }
        if(e.getSource()==opt6){
            stack.Stack.push(new uploadMarks());
            stack.title.push("Upload Marks");
            dashboard.update();
        }
        if(e.getSource()==opt2){
            stack.Stack.push(new facultyDetails());
            stack.title.push("Faculty Details");
            dashboard.update();
        }
    }
    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }
}
