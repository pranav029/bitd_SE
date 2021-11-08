// package main;
import javax.imageio.ImageIO;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import org.w3c.dom.events.MouseEvent;

import main.panelbg;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.util.Vector;

public class studentDisp extends JPanel implements ActionListener{
    private JScrollPane pane;
    private JPanel panel,contentPane;
    private JLabel label,name;
    private JButton bt;
    private JTable tab;
    private Image bgImage;
    public studentDisp(){
        // setTitle("All Student Records");
        JPanel bg=new panelbg("images/v915-wit-005.jpg");
        bg.setSize(700,600);
        bg.setLayout(null);
        try {
            bgImage = ImageIO.read(new File("images/v915-wit-005.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        label=new JLabel("All Student Records");
        label.setFont(new Font("Arial",Font.PLAIN,30));
        panel=new JPanel();
        panel.setBounds(0,0,700,60);
        panel.setBackground(Color.cyan);
        panel.add(label);
        add(panel);
        bt=new JButton("Back to Dashboard");
        bt.setBounds(260,500,150,30);
        bt.addActionListener(this);
        String cols[]={"Name","Roll No","Semester"};
        DefaultTableModel def=new DefaultTableModel();
        def.addColumn("Name");
        def.addColumn("Roll No");
        def.addColumn("Semester");
        tab=new JTable(def);
        pane=new JScrollPane(tab);
        pane.setBounds(40,80,600,400);
        bg.add(bt);
        bg.add(pane);
        add(bg);
        setSize(700,600);
        // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
        // setResizable(false);
        // getContentPane().add(pane, BorderLayout.CENTER);
    }
    public static void main(String args[]){
        new studentDisp();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
         DefaultTableModel def=(DefaultTableModel) tab.getModel();
         def.addRow(new Object[]{"Pranav","BTECH/60077/19","5"});
    }

   

}
