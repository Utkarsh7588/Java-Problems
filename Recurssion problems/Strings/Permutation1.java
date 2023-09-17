package Strings;

import java.util.ArrayList;

public class Permutation1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList=permutatearr("abc",0,2);
        System.out.println(arrayList);
    }
    public static void permutate(String str, int l, int r){
        if (l==r){
            System.out.println(str);
        }
        else {
            for (int i = l; i <=r; i++) {
                str = swap(str, l, i);
                permutate(str, l + 1, r);
                str = swap(str, l, i);
            }
        }
    }

    public static ArrayList<String> permutatearr(String str, int l, int r){
        ArrayList<String> list=new ArrayList<String>();
        if (l==r){
            list.add(str);
            return list;
        }
        else {
            ArrayList<String> ans=new ArrayList<>();
            for (int i = l; i <=r; i++) {

                str = swap(str, l, i);
                ans.addAll(permutatearr(str, l + 1, r));
                str = swap(str, l, i);
            }
            return ans;
        }
    }
    public static String swap(String str, int i, int j){
        char temp;
        char[] s=str.toCharArray();
        temp=s[i];
        s[i]=s[j];
        s[j]=temp;
        return String.valueOf(s);
    }
}
