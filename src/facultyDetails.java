
import javax.swing.*;
import java.awt.*;

public class facultyDetails extends JFrame{
    private JLabel label,nLable,idLabel;
    private JButton submit;
    private JTextField name,id;

    public facultyDetails(){
        setTitle("Faculty Details");
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
        add(label);
        add(nLable);
        add(name);
        add(idLabel);
        add(id);
        add(submit);
        setSize(700,600);
        setLayout(null);
        setVisible(true);
        setResizable(false);
    }
    public static void main(String args[]){
        new facultyDetails();
    }

}
