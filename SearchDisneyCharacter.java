import java.io.*;
import java.util.*;

public class SearchDisneyCharacter{
    public static String transctionLog_path, user_path, image_path, ouput_path ="";
    public static Hashtable<String, User> user_hash = new Hashtable<>();
    //Initialization of user: add all exsisting user to hashtable when the program starts
    public static void addUserinfoTohash() { 
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(user_path));
            String line = reader.readLine();
            while (line != null) {
                String arr[]=line.split(",");
                User user= new User(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5]);
                // add user to hash    
                user_hash.put(arr[0],user);
                // read next line
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //New user to user.txt
    public static void addinfoToFile(String str) { 
        try { 
            BufferedWriter out = new BufferedWriter(new FileWriter(user_path, true)); 
            out.write(str); 
            out.close(); 
        } 
        catch (IOException e) { 
            System.out.println("exception occoured" + e); 
        } 
    }

    public static void main(String[] args) throws Exception{
        int in = 0;
        String arg;
        while (in < args.length && args[in].startsWith("-")){
            arg = args[in++];
            if (arg.equals("-t")) {
                if (in < args.length){
                    transctionLog_path = args[in++];
                    //System.out.println(transctionLog_path);
                }
                else
                    System.err.println("-t requires a transctionlog path");
            }
            //if you want to check if the option is working use below
            else if(arg.equals("-u")){
                if (in < args.length){
                    user_path = args[in++];
                    //System.out.println(userInfo_path);
                }
                else
                    System.err.println("-u requires a userinfo path");
            }
            else if(arg.equals("-o")){
                if (in < args.length){
                    ouput_path = args[in++];
                    //System.out.println(ouput_path);
                }
                else
                    System.err.println("-o requires a ouput path");
            }
            else if(arg.equals("-i")){
                if (in < args.length){
                    image_path = args[in++];
                    //System.out.println(image_path);
                }
                else
                    System.err.println("-i requires a image path");
            }
        }
        addUserinfoTohash();
        MySearchGUI gui=new MySearchGUI(); 
    }
}