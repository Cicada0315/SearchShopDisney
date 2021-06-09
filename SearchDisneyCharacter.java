import java.io.*;
import java.util.*;
import java.net.URL;
import java.net.URLConnection;
import java.sql.Timestamp;

public class SearchDisneyCharacter{
    public static String transctionLog_path, user_path, image_path, ouput_path ="";
    public static Hashtable<String, User> user_hash = new Hashtable<>();
    public static Hashtable<String, Product> product_hash = new Hashtable<>();
    public static boolean sucess=false;
    public static String login_user="guest";
    public static String output="";
    public static String timeStamp, user, transactiontype, query, category, id, productName, origPrice, discPrice, available;
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

    //add New user to user.txt
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

    //Add each of the transction into the transctionLog.txt
    public static void addLogToFile(String transctionLog_path, String str) { 
        try { 
            BufferedWriter out = new BufferedWriter(new FileWriter(transctionLog_path, true)); 
            out.write(str); 
            out.close(); 
        } 
        catch (IOException e) { 
            System.out.println("exception occoured" + e); 
        } 
    }


    public static void getProductFromDisney(String st, String query){
        try{
            URL url = new URL(st);
            //Get the input stream through URL Connection
            URLConnection Connection = url.openConnection();
            //Connection.setRequestProperty("User-Agent", USER_AGENT);
            InputStream is = Connection.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            String product="data-tealium-productstring";
            String notfound="no-results";
            String line = reader.readLine();
            while (line != null) {
                if(line.contains("notfound")){
                    output="No Result Found";
                }
                else if(line.contains(product)){
                    Timestamp times = new Timestamp(System.currentTimeMillis());
                    String timeStamp=times.toString();
                    String data=line;
                    data = data.replace("&ndash;","-");
                    data = data.replace("&amp;","&");
                    data = data.replace("&quot;","");
                    data = data.replace("data-tealium-productstring=","");
                    data = data.replace("{","");
                    data = data.replace("}","");
                    String[] arrOfStr=data.split(",");
                    String a=arrOfStr[0];
                    String[] temp=a.split(":");
                    if(temp.length==1){
                        category="-";
                    }
                    else category=temp[1];
    
                    a=arrOfStr[4];
                    temp=a.split(":");
                    if(temp.length==1){
                        id="-";
                    }
                    else id=temp[1];
    
                    a=arrOfStr[9];
                    temp=a.split(":");
                    if(temp.length==1){
                        productName="-";
                    }
                    else productName=temp[1];
    
                    a=arrOfStr[10];
                    temp=a.split(":");
                    if(temp.length==1){
                        origPrice="-";
                    }
                    else origPrice=temp[1];
    
                    a=arrOfStr[11];
                    temp=a.split(":");
                    if(temp.length==1){
                        discPrice="-";
                    }
                    else discPrice=temp[1];
    
                    a=arrOfStr[30];
                    if(a.contains("in_stock")){
                        available="Yes";
                    }
                    else available="No";
                    output += "Item: "+productName+ " Category: "+ category+ " ID: "+ id+ " OrigPrice: "+ origPrice+" DiscPrice: "+ discPrice+ " Available: "+available+"\n";
                    String usertype="guest";
                    if (login_user!= "guest"){
                        usertype="user";
                    }
            
                    Product item = new Product(timeStamp, usertype, login_user, "ADD", query, category, id, productName, origPrice, discPrice, available);
                    product_hash.put(id, item);
                    
                    addLogToFile(transctionLog_path, item.toString()+"\n");
                }
                line = reader.readLine();
            }
        }catch (IOException e1){
            System.out.println("error");
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
                }
                else
                    System.err.println("-t requires a transctionlog path");
            }
            else if(arg.equals("-u")){
                if (in < args.length){
                    user_path = args[in++];
                    
                }
                else
                    System.err.println("-u requires a userinfo path");
            }
            else if(arg.equals("-o")){
                if (in < args.length){
                    ouput_path = args[in++];
                }
                else
                    System.err.println("-o requires a ouput path");
            }
            else if(arg.equals("-i")){
                if (in < args.length){
                    image_path = args[in++];
                }
                else
                    System.err.println("-i requires a image path");
            }
        }
        addUserinfoTohash();
        MySearchGui gui=new MySearchGui(); 
    }
}