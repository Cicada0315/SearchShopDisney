import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 

public class LoginGui extends JFrame implements ActionListener{
    private Container c;
    private JLabel title, id, password, result;
    private JTextField id_input, password_input;  
    private JButton login; 
    private MySearchGui mygui;
     
    public LoginGui(MySearchGui mygui){
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

        id = new JLabel("ID"); 
        id.setFont(new Font("Arial", Font.PLAIN, 20)); 
        id.setSize(150, 20); 
        id.setLocation(130, 150); 
        c.add(id); 

        id_input = new JTextField(); 
        id_input.setFont(new Font("Arial", Font.PLAIN, 15)); 
        id_input.setSize(220, 20); 
        id_input.setLocation(200, 150); 
        c.add(id_input); 

        password = new JLabel("Password"); 
        password.setFont(new Font("Arial", Font.PLAIN, 20)); 
        password.setSize(150, 20); 
        password.setLocation(100, 200); 
        c.add(password); 

        password_input = new JTextField(); 
        password_input.setFont(new Font("Arial", Font.PLAIN, 15)); 
        password_input.setSize(220, 20); 
        password_input.setLocation(200, 200); 
        c.add(password_input);
        
        login = new JButton("LogIn"); 
        login.setFont(new Font("Arial", Font.PLAIN, 15)); 
        login.setSize(100, 20); 
        login.setLocation(320, 250);
        login.addActionListener(this); 
        c.add(login); 

        result = new JLabel(""); 
        result.setFont(new Font("Arial", Font.PLAIN, 20)); 
        result.setSize(500, 25); 
        result.setLocation(300, 300); 
        c.add(result); 
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) { 
        if (e.getSource() == login) {
            String empty = ""; 
            String id= id_input.getText();
            if((SearchDisneyCharacter.user_hash).containsKey(id)){
                String pw=(SearchDisneyCharacter.user_hash.get("jean")).getPassword();
                if(pw.equals(password_input.getText())){
                    SearchDisneyCharacter.sucess=true;
                    SearchDisneyCharacter.login_user=id;
                    result.setText(empty);
                    id_input.setText(empty);
                    password_input.setText(empty);
                    setVisible(false);
                    JOptionPane.showMessageDialog(null, "Welcome to SearchDisney, "+ id);
                    //SearchDisneyCharacter.addtemphash();
                    mygui.loginGui();
                }
                else{
                    result.setText("Wrong Password"); 
                }
            }
            else{
                result.setText("No such an ID exsist");
            } 
        }
    }
}
