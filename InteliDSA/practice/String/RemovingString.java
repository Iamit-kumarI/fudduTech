package String;

public class RemovingString {
    public static void main(String[] args) {
        System.out.println(removeString("i live in newDelhi"));
    }
    public static String removeString(String str){
        if(str.isEmpty()){
            return str;
        }
//        return str.startsWith("new")?removeString()
        return helper(str,"");
    }
    public static String helper(String str,String newstr){
        if(str.isEmpty()){
            return newstr;
        }
        return str.startsWith("new")?helper(str.substring(3),newstr):helper(str.substring(1),newstr+str.charAt(0));
    }

}
