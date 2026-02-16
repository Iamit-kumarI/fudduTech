package String;

public class Temp {
    public static void main(String[] args) {
        String str="Ram isdkf asdljf boy";
        String[]sarr=str.split("\\s+");
        StringBuilder sb=new StringBuilder();
        for(String cur:sarr){
            sb.append(revWord(cur));
        }
        System.out.println(sb.toString());
    }
    public static String revWord(String word){
        int s=0,end=word.length()-1;
        StringBuilder sb=new StringBuilder(word);
        while(s<end){
            sb.setCharAt(s,word.charAt(end));
            sb.setCharAt(end--,word.charAt(s++));
        }
        return sb.append(" ").toString();
    }
}
