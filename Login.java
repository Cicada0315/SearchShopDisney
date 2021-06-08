import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 

public class Login extends JFrame implements ActionListener{
    private Container c;
    private JLabel title;
    private MySearchGUI mygui;

    public Login(MySearchGUI mygui){
        this.mygui=mygui;
        setTitle("Jin's SearchEngine");
        setBounds(550, 200, 600, 400);
        c = getContentPane(); 
        c.setBackground(Color.lightGray);
        c.setLayout(null); 

        title = new JLabel("Log in"); 
        title.setFont(new Font("Arial", Font.PLAIN, 30)); 
        title.setSize(300, 40); 
        title.setLocation(250, 100); 
        c.add(title);

        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) { 
    }
}
