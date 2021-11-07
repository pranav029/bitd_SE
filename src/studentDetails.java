
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Color;
import javax.swing.SwingUtilities;
public class studentDetails extends JPanel implements ActionListener{
    private JLabel label,nLable,idLabel;
    private JButton submit;
    private JTextField name,id;

    public studentDetails(){
        // setTitle("Student Details");
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
        add(label);
        add(nLable);
        add(name);
        add(idLabel);
        add(id);
        add(submit);
        setSize(700,600);
        setLayout(null);
        setVisible(true);
        // setResizable(false);
    }
    public static void main(String args[]){
        new studentDetails();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
          dashboard.update(new studentDisp());
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        int w = getWidth();
        int h = getHeight();
        Color color1 =Color.decode("#ddd6f3");
        Color color2 = Color.decode("#faaca8");
        GradientPaint gp = new GradientPaint(0, 0, color1, 0, h, color2);
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, w, h);
    }
}
