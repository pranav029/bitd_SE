
import javax.swing.*;

import main.custombtn;
import main.panelbg;
import java.awt.event.*;
import java.awt.*;

public class facultyDetails extends JPanel implements ActionListener,MouseListener{
    private JLabel label,nLable,idLabel,or,lab1;
    private JButton submit;
    private JTextField name,id;
    private JPanel opt1;

    public facultyDetails(){
        JPanel bg=new panelbg("images/v915-wit-005.jpg");
        bg.setSize(700,600);
        bg.setLayout(null);
        // setTitle("Faculty Details");
        label=new JLabel("Search Faculty Details");
        nLable=new JLabel("Enter Faculty Name");
        idLabel=new JLabel("Enter Faculty ID");
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
        or=new JLabel("OR");
        or.setFont(new Font("Arial",Font.PLAIN,15));
        or.setBounds(310,445,100,30);
        lab1=new JLabel("All Faculty List");
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
    @Override
    public void mouseClicked(MouseEvent e) {
        
    }
    @Override
    public void mousePressed(MouseEvent e) {
     
        
    }
    @Override
    public void mouseReleased(MouseEvent e) {
        
        
    }
    @Override
    public void mouseEntered(MouseEvent e) {
        
        
    }
    @Override
    public void mouseExited(MouseEvent e) {
        
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
     
        
    }

}
