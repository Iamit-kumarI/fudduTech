package String;

public class Patner {
    public static void main(String[] args) {
        String str="MyNameIsKhan";
        StringBuilder sb=new StringBuilder();
        for(char c:str.toCharArray()){
            if((c-'0')<47)sb.append(" ");
            sb.append(c);
        }
        System.out.println('Z'-'0');
    }
}
