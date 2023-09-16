package Strings;

public class Subsets {
    public static void main(String[] args) {
        findSS("abc","");
    }
    public static void findSS(String str, String sk){
        if(str.isEmpty()){
            System.out.println(sk);
            return;
        }

        findSS(str.substring(1),sk+str.charAt(0));
        findSS(str.substring(1),sk);

    }
}
