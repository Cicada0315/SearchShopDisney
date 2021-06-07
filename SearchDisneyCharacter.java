
public class SearchDisneyCharacter{
    public static String path ="";
    public static String transctionLog_path ="";
    public static String userInfo_path ="";
    public static String image_path ="";
    public static String ouput_path ="";
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
                    userInfo_path = args[in++];
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
    }
}