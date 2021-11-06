// package main;
import javax.swing.Box;
import javax.swing.BoxLayout;
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

import java.awt.*;
import java.awt.event.*;
import java.util.Vector;

public class studentDisp extends JFrame implements ActionListener{
    private JScrollPane pane;
    private JPanel panel,contentPane;
    private JLabel label,name;
    private JButton bt;
    private JTable tab;
    public studentDisp(){
        setTitle("All Student Records");
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
        add(bt);
        add(pane);
        setSize(700,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
        setResizable(false);
        getContentPane().add(pane, BorderLayout.CENTER);
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
