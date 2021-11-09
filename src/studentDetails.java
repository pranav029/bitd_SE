import main.panelbg;
import main.stack;
import main.custombtn;
import main.msg;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Color;
import javax.swing.SwingUtilities;
public class studentDetails extends JPanel implements ActionListener,MouseListener{
    private JLabel label,nLable,idLabel,or,lab1;
    private JButton submit;
    private JTextField name,id;
    private JPanel opt1;
    public studentDetails(){
        // setTitle("Student Details");
        JPanel bg=new panelbg("images/v915-wit-005.jpg");
        bg.setSize(700,600);
        bg.setLayout(null);
        label=new JLabel("Search Student Details");
        nLable=new JLabel("Enter Student Name");
        idLabel=new JLabel("Enter Student Roll No");
        name=new JTextField();
        id=new JTextField();
        submit=new JButton("Submit");
        label.setBounds(170,20,400,100);
        label.setFont(new Font("Arial",Font.PLAIN,30));
        nLable.setBounds(130,120,400,80);
        name.setBounds(130,180,400,40);
        idLabel.setBounds(130,240,400,80);
        id.setBounds(130,300,400,40);
        submit.setBounds(270,400,100,40);
        submit.addActionListener(this);
        or=new JLabel("OR");
        or.setFont(new Font("Arial",Font.PLAIN,15));
        or.setBounds(310,445,100,30);
        lab1=new JLabel("All Student List");
         lab1.setFont(new Font("Arial",Font.PLAIN,20));
         lab1.setBounds(55,10,150,30);
         opt1=new custombtn(50,"#dd5e89","#f7bb97",bg) ;
         opt1.setBounds(200,480,250,50);
         opt1.setLayout(null);
         opt1.add(lab1);
         opt1.addMouseListener(this);
        bg.add(label);
        bg.add(nLable);
        bg.add(name);
        bg.add(idLabel);
        bg.add(id);
        bg.add(submit);
        bg.add(or);
        bg.add(opt1);
        add(bg);
        setSize(700,600);
        setLayout(null);
        setVisible(true);
        // setResizable(false);
    }
    // public static void main(String args[]){
    //     new studentDetails();
    // }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource()==submit){
            if(name.getText().toString().length()==0 ||
              id.getText().toString().length()==0){
                  new msg("All Fields must be filled","Error",dashboard.f);
                  return;
              }else{
                  stack.Stack.push(new studentinfo());
                  stack.title.push("Student Details");
                  dashboard.update();
              }
              
        }
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource()==opt1){
            stack.Stack.push(new studentDisp());
            stack.title.push("Display Details");
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
