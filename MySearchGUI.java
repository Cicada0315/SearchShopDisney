import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;

public class MySearchGui extends JFrame implements ActionListener{
    private Container c;
    private JLabel title, search;
    private JTextField character;
    private JButton login, logout, signup, searching, reset; 
    private JTextArea out;
    private JScrollPane scroll;

    public MySearchGui(){
        setTitle("Jin's SearchEngine");
        setBounds(400, 100, 900, 800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        c = getContentPane(); 
        c.setBackground((new Color(204, 229, 255)));
        c.setLayout(null); 

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

        search = new JLabel("Search Disney"); 
        search.setFont(new Font("Arial", Font.PLAIN, 20)); 
        search.setSize(200, 20); 
        search.setLocation(100, 200); 
        c.add(search); 

        character = new JTextField(); 
        character.setFont(new Font("Arial", Font.PLAIN, 15)); 
        character.setSize(500, 20); 
        character.setLocation(300, 200); 
        c.add(character);

        searching = new JButton("Search"); 
        searching.setFont(new Font("Arial", Font.PLAIN, 15)); 
        searching.setSize(100, 20); 
        searching.setLocation(700, 250);
        searching.addActionListener(this);
        c.add(searching);

        out = new JTextArea();
        scroll = new JScrollPane (out, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS); 
        out.setFont(new Font("Arial", Font.PLAIN, 15)); 
        out.setSize(700, 350); 
        out.setLocation(100, 300); 
        out.setLineWrap(true); 
        out.setEditable(false);
        c.add(scroll);
        c.add(out);

        reset = new JButton("Reset"); 
        reset.setFont(new Font("Arial", Font.PLAIN, 15)); 
        reset.setSize(100, 20); 
        reset.setLocation(590, 250); 
        reset.addActionListener(this); 
        c.add(reset);        
        setVisible(true);
    }

    public void loginGui(){
        signup.setVisible(false);
        login.setVisible(false);
        logout.setVisible(true);
    }

    public void resetgui(){
        String empty = ""; 
        character.setText(empty);  
        out.setText(empty); 
    }

    public void actionPerformed(ActionEvent e) { 
        if(e.getSource() == signup){
            SignupGui registerPage= new SignupGui(); 
        }else if (e.getSource() == login) { 
            LoginGui loginPage = new LoginGui(this);            
        }else if (e.getSource() == logout) {
            logout.setVisible(false); 
            signup.setVisible(true);
            login.setVisible(true);
        }else if(e.getSource() == searching){
            //Making string URL based on the query
            String website ="https://www.shopdisney.com/search?q="+character.getText()+"&lang=default&isRegSearch=1";
            String Makeurl = website.replaceAll("\\s", "");
            SearchDisneyCharacter.getProductFromDisney(Makeurl, character.getText());
            out.setText(SearchDisneyCharacter.output);
            SearchDisneyCharacter.output="";
        }else if (e.getSource() == reset) { 
            resetgui();
        } 
    }
}