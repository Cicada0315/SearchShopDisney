import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;

public class MySearchGUI extends JFrame{
    private Container c;
    private JLabel title;

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
    }
}