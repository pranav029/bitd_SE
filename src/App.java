
import main.msg;
import javax.swing.*;
import java.awt.Font;
import java.awt.event.*;
import java.awt.Image;
import java.lang.Class;
import java.sql.*;
public class App extends JFrame implements ActionListener {
    private JTextField user_id;
    private JTextField password;
    private JButton submit;
    private JLabel label,lab;

    // private JPanel panel;
    public App(){
        ImageIcon  image;
        setTitle("Login Portal");
        image=new ImageIcon("images/220px-Birla_Institute_of_Technology_Mesra.png");
        Image temp = image.getImage().getScaledInstance(120,120, Image.SCALE_DEFAULT);
        ImageIcon newImg=new ImageIcon(temp);
        lab=new JLabel(newImg);
        lab.setBounds(125,30,120,120);
        user_id=new JTextField();
        password=new JTextField();
        submit=new JButton("Login");
        label=new JLabel("Login Portal");
        label.setBounds(110,110,200,130);
        user_id.setBounds(90,210,200,30);
        password.setBounds(90,260,200,30);
        submit.setBounds(140,330,100,50);
        submit.addActionListener(this);
        label.setFont(new Font("Arial",Font.PLAIN,30));
        add(lab);
        add(label);
        add(user_id);
        add(password);
        add(submit);
        setSize(400,500);
        setLayout(null); 
        setResizable(false);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    public static void main(String args[]){
        new App();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        // dispose();
        if(e.getSource()==submit){
            if(user_id.getText().toString().length()==0 ||
              password.getText().toString().length()==0 ){
                  new msg("All Fields must be filled","Error",this);
                return;
            }
            if(validate(user_id.getText().toString(),password.getText().toString())==true){
               dispose();
                new dashboard();
            }
            else {
                new msg("Wrong Credentials","Error",App.this);
            }
        }
    }
    private boolean validate(String id,String pass){
         String url="jdbc:mysql://localhost:3306/cse_module";
         String user="root";
         String pa="Pranav@2046";
         try {
             Class.forName("com.mysql.cj.jdbc.Driver");
             Connection con=DriverManager.getConnection(url, user, pa);
             Statement st=con.createStatement();
             ResultSet res=st.executeQuery("select user_password from login where user_id='"+id+"'"); 
             if(res.next() && pass.equals(res.getString(1)))return true;
         } catch (Exception e) {
             //TODO: handle exception
             System.out.println(e);
             return false;
         }
         return false;
    }
}


