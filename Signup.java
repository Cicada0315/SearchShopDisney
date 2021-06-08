import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 

class Signup extends JFrame implements ActionListener { 
    private Container c; 
    private JLabel title, id, password, idres, name, dob, year, gender, phone, usertype, res;
    private JTextField id_input, password_input, name_input, year_input, phone_input;  
    private JButton idcheck, confirm, reset, submit;
    private JComboBox date, month, gender_input, usertypeB; 
  
    // array of string containing dates
    private String dates[]= { 
        "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", 
        "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", 
        "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"     
    };
    // array of string containing Months
    private String months[]= { 
        "Jan", "feb", "Mar",  "Apr", "May", "Jun", "July", "Aug", "Sup", "Oct", "Nov", "Dec" 
    }; 

    private String gender_arr[]= { 
        "Male", "female"
    }; 

    /*private String usertypeb[]= { 
        "User", "Administrator"
    };*/
    
    public Signup() { 
        setTitle("Jin's SearchEngine"); 
        setBounds(450, 200, 500, 600); 
        setResizable(false); 
  
        c = getContentPane();
        c.setBackground(Color.lightGray); 
        c.setLayout(null); 
  
        title = new JLabel("Register"); 
        title.setFont(new Font("Arial", Font.PLAIN, 30)); 
        title.setSize(200, 30); 
        title.setLocation(170, 40); 
        c.add(title); 

        id = new JLabel("ID"); 
        id.setFont(new Font("Arial", Font.PLAIN, 20)); 
        id.setSize(150, 20); 
        id.setLocation(50, 100); 
        c.add(id); 

        id_input = new JTextField(); 
        id_input.setFont(new Font("Arial", Font.PLAIN, 15)); 
        id_input.setSize(150, 20); 
        id_input.setLocation(150, 100); 
        c.add(id_input);
        
        idcheck = new JButton("check"); 
        idcheck.setFont(new Font("Arial", Font.PLAIN, 15)); 
        idcheck.setSize(100, 20); 
        idcheck.setLocation(300, 100);
        idcheck.addActionListener(this); 
        c.add(idcheck); 

        confirm = new JButton("confirm"); 
        confirm.setFont(new Font("Arial", Font.PLAIN, 15)); 
        confirm.setSize(100, 20); 
        confirm.setLocation(300, 100);
        confirm.addActionListener(this); 
        c.add(confirm);
        confirm.setVisible(false);
        
        idres = new JLabel(""); 
        idres.setFont(new Font("Arial", Font.PLAIN, 15)); 
        idres.setSize(400, 20); 
        idres.setLocation(150, 120); 
        c.add(idres); 
        
        password = new JLabel("Password"); 
        password.setFont(new Font("Arial", Font.PLAIN, 20)); 
        password.setSize(150, 20); 
        password.setLocation(50, 150); 
        c.add(password); 

        password_input = new JTextField(); 
        password_input.setFont(new Font("Arial", Font.PLAIN, 15)); 
        password_input.setSize(250, 20); 
        password_input.setLocation(150, 150); 
        c.add(password_input);

        name = new JLabel("Name"); 
        name.setFont(new Font("Arial", Font.PLAIN, 20)); 
        name.setSize(100, 20); 
        name.setLocation(50, 200); 
        c.add(name); 
  
        name_input = new JTextField(); 
        name_input.setFont(new Font("Arial", Font.PLAIN, 15)); 
        name_input.setSize(250, 20); 
        name_input.setLocation(150, 200); 
        c.add(name_input); 

        dob = new JLabel("DOB"); 
        dob.setFont(new Font("Arial", Font.PLAIN, 20)); 
        dob.setSize(100, 20); 
        dob.setLocation(50, 250); 
        c.add(dob); 
  
        date = new JComboBox(dates); 
        date.setFont(new Font("Arial", Font.PLAIN, 15)); 
        date.setSize(50, 20); 
        date.setLocation(150, 250); 
        c.add(date); 
  
        month = new JComboBox(months); 
        month.setFont(new Font("Arial", Font.PLAIN, 15)); 
        month.setSize(60, 20); 
        month.setLocation(210, 250); 
        c.add(month); 

        year = new JLabel("Year"); 
        year.setFont(new Font("Arial", Font.PLAIN, 15)); 
        year.setSize(70, 20); 
        year.setLocation(280, 250); 
        c.add(year); 
  
        year_input = new JTextField(); 
        year_input.setFont(new Font("Arial", Font.PLAIN, 15)); 
        year_input.setSize(80, 20); 
        year_input.setLocation(320, 250); 
        c.add(year_input);
  
        gender = new JLabel("Gender"); 
        gender.setFont(new Font("Arial", Font.PLAIN, 20)); 
        gender.setSize(100, 20); 
        gender.setLocation(50, 300); 
        c.add(gender);

        gender_input = new JComboBox(gender_arr); 
        gender_input.setFont(new Font("Arial", Font.PLAIN, 15)); 
        gender_input.setSize(250, 20); 
        gender_input.setLocation(150, 300); 
        c.add(gender_input);

        phone = new JLabel("Phone#"); 
        phone.setFont(new Font("Arial", Font.PLAIN, 20)); 
        phone.setSize(150, 20); 
        phone.setLocation(50, 350); 
        c.add(phone); 

        phone_input = new JTextField(); 
        phone_input.setFont(new Font("Arial", Font.PLAIN, 15)); 
        phone_input.setSize(250, 20); 
        phone_input.setLocation(150, 350); 
        c.add(phone_input);

        /*
        usertype = new JLabel("Usertype"); 
        usertype.setFont(new Font("Arial", Font.PLAIN, 20)); 
        usertype.setSize(100, 20); 
        usertype.setLocation(50, 400); 
        c.add(usertype);

        usertypeB = new JComboBox(usertypeb); 
        usertypeB.setFont(new Font("Arial", Font.PLAIN, 15)); 
        usertypeB.setSize(250, 20); 
        usertypeB.setLocation(150, 400); 
        c.add(usertypeB);*/
  
        reset = new JButton("Reset"); 
        reset.setFont(new Font("Arial", Font.PLAIN, 15)); 
        reset.setSize(100, 20); 
        reset.setLocation(190, 450); 
        reset.addActionListener(this); 
        c.add(reset); 
        
        submit = new JButton("Submit"); 
        submit.setFont(new Font("Arial", Font.PLAIN, 15)); 
        submit.setSize(100, 20); 
        submit.setLocation(300, 450); 
        submit.addActionListener(this); 
        c.add(submit); 
  
        res = new JLabel(""); 
        res.setFont(new Font("Arial", Font.PLAIN, 20)); 
        res.setSize(500, 25); 
        res.setLocation(100, 500); 
        c.add(res); 

        setVisible(true);
    } 


    public void actionPerformed(ActionEvent e) { 
        
    } 
}
