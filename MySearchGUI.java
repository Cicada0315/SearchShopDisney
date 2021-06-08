import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;

public class MySearchGUI extends JFrame implements ActionListener{
    private Container c;
    private JLabel title;
    private JButton signup, login, logout;

    public MySearchGUI(){
        setTitle("Jin's SearchEngine");
        setBounds(400, 100, 900, 800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        c = getContentPane(); 
        c.setBackground((new Color(204, 229, 255)));
        c.setLayout(null);
        setVisible(true);

        title = new JLabel("SearchDisney"); 
        title.setFont(new Font("Jokerman", Font.PLAIN, 30)); 
        title.setSize(250, 40); 
        title.setLocation(325, 100); 
        c.add(title);

        signup = new JButton("SignUp"); 
        signup.setFont(new Font("Arial", Font.PLAIN, 15)); 
        signup.setSize(100, 20); 
        signup.setLocation(590, 50);
        signup.addActionListener(this); 
        c.add(signup);

        login = new JButton("LogIn"); 
        login.setFont(new Font("Arial", Font.PLAIN, 15)); 
        login.setSize(100, 20); 
        login.setLocation(700, 50);
        login.addActionListener(this); 
        c.add(login);
        
        logout = new JButton("LogOut"); 
        logout.setFont(new Font("Arial", Font.PLAIN, 15)); 
        logout.setSize(100, 20); 
        logout.setLocation(700, 50);
        logout.addActionListener(this); 
        c.add(logout); 
        logout.setVisible(false);
    }


    public void actionPerformed(ActionEvent e) { 
        if(e.getSource() == signup){
            Signup registerPage= new Signup(); 
        }else if (e.getSource() == login) { 
            Login loginPage = new Login(this);            
        }
        else if (e.getSource() == logout) {
            logout.setVisible(false); 
            signup.setVisible(true);
            login.setVisible(true);
        } 
    }
}