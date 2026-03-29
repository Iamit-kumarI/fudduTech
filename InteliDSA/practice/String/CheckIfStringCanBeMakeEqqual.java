package String;

public class CheckIfStringCanBeMakeEqqual {
    public static void main(String[] args) {
        System.out.println(canBeEqual("abcd","cdab"));
    }
    public static boolean canBeEqual(String s1, String s2) {
        StringBuilder sb1=new StringBuilder(s1);
        StringBuilder sb2=new StringBuilder(s2);
        return swap(sb1,sb2,0)||swap(sb1,sb2,1)&&swap(sb1,sb2,0)||swap(sb1,sb2,1);
    }
    public static boolean swap(StringBuilder text1,StringBuilder text2,int index){
        char ctext1=text1.charAt(index);
        text1.setCharAt(index,text1.charAt(index+2));
        text1.setCharAt(index+2,ctext1);
        if(text1.compareTo(text2)==0)return true;
        ctext1=text1.charAt(index+2);
        text1.setCharAt(index+2,text1.charAt(index+2));
        text1.setCharAt(index,ctext1);
        return false;
    }
}
