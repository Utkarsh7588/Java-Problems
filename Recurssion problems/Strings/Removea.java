package Strings;

public class Removea {

    public static void main(String[] args) {
System.out.println(skip("bhaalsal"));
    }
    static String str1="";
    public static String skip(String str ){
        if(str.isEmpty()){
            return "";
        }
        char ch=str.charAt(0);
        if(ch=='a'){
            return skip(str.substring(1));
        }
        else {
            return ch+skip(str.substring(1));
        }
    }
}
