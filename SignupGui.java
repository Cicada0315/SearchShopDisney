import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 

class SignupGui extends JFrame implements ActionListener { 
    private Container c; 
    private JLabel title, id, password, idcheck_result, name, dob, year, gender, phone, usertype, res;
    private JTextField id_input, password_input, name_input, year_input, phone_input;  
    private JButton idcheck, confirm, reset, submit;
    private JComboBox date, month, gender_input, usertypeB; 
    public static String empty = "";  
  
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
    
    public SignupGui() { 
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

        confirm = new JButton("confirmed"); 
        confirm.setFont(new Font("Arial", Font.PLAIN, 15)); 
        confirm.setSize(100, 20); 
        confirm.setLocation(300, 100);
        confirm.addActionListener(this); 
        c.add(confirm);
        confirm.setVisible(false);
        
        idcheck_result = new JLabel(""); 
        idcheck_result.setFont(new Font("Arial", Font.PLAIN, 15)); 
        idcheck_result.setSize(400, 20); 
        idcheck_result.setLocation(150, 120); 
        c.add(idcheck_result); 
        
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
    
    public void resetgui(){
        date.setSelectedIndex(0); 
        month.setSelectedIndex(0);
        gender_input.setSelectedIndex(0); 
        //usertypeB.setSelectedIndex(0);
        id_input.setText(empty); 
        year_input.setText(empty);
        password_input.setText(empty);
        name_input.setText(empty);
        phone_input.setText(empty);
        idcheck_result.setText(empty);
        idcheck.setVisible(true);
        confirm.setVisible(false);
    }

    public void actionPerformed(ActionEvent e) { 
        //check if id is unique
        if (e.getSource() == idcheck){
            String id= id_input.getText();
            if((SearchDisneyCharacter.user_hash).containsKey(id)){
                idcheck_result.setText("Id is already taken. Use different one"); 
                id_input.setText("");
            }
            else{
                idcheck_result.setText("");
                idcheck.setVisible(false);
                confirm.setVisible(true);
            }
        }else if (e.getSource() == submit) {
            String dob_string = (String)date.getSelectedItem()+" "+ (String)month.getSelectedItem()+ " "+year_input.getText();
            String gender_string=(String)gender_input.getSelectedItem();
            // validation
            if(!confirm.isVisible() || name_input.getText().isEmpty() || password_input.getText().isEmpty() || year_input.getText().isEmpty() || phone_input.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Invalid! Fill all the input and check id");
            }/*else if(type.equals("Administrator")){
                String code = JOptionPane.showInputDialog("Input administrator code?", null);
                int admincode=Integer.parseInt(code);
                if(admincode==23778905){
                    JOptionPane.showMessageDialog(null, "Welcome to DisneyAdmin, "+ nameinput.getText());
                    Userinfo info=new Userinfo("Admin", pinput.getText(), nameinput.getText(), dbo, gender, phoneinput.getText());
                    SearchDisneyCharacter.userinfo.put(idinput.getText(), info);
                    String uinfo=idinput.getText()+ ","+ "Admin"+ ","+pinput.getText()+ ","+nameinput.getText()+ ","+dbo+ ","+gender+ ","+phoneinput.getText();
                    SearchDisneyCharacter.addinfoToFile(uinfo);
                    resetgui();
                    setVisible(false);
                }
                else {
                    JOptionPane.showMessageDialog(null, "Code is wrong. You cannot register to admin");
                }
            }*/
            else{
                JOptionPane.showMessageDialog(null, "Welcome to DisneyFamily, "+ name_input.getText());
                User newuser=new User(id_input.getText(), password_input.getText(), name_input.getText(), dob_string, gender_string, phone_input.getText());
                SearchDisneyCharacter.user_hash.put(id_input.getText(), newuser);
                String user_string=id_input.getText()+ ","+password_input.getText()+ ","+name_input.getText()+ ","+dob_string+ ","+gender_string+ ","+phone_input.getText()+"\n";
                SearchDisneyCharacter.addinfoToFile(user_string);
                resetgui();
                setVisible(false);
            }
        }else if (e.getSource() == reset) { 
            resetgui();
        } 
    } 
}
