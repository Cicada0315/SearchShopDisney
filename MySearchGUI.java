import javax.swing.*; 
import java.awt.*; 

public class MySearchGUI extends JFrame{
    private Container c;

    public MySearchGUI(){
        setTitle("Jin's SearchEngine");
        setBounds(400, 100, 900, 800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        c = getContentPane(); 
        c.setBackground((new Color(204, 229, 255)));
        c.setLayout(null);
        setVisible(true);
    }
}