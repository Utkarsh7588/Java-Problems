package patterns;

public class triangle {
    public static void main(String[] args) {
printtriangle(5);
    }
//    public static void printtriangle(int n){
//        if(n==0){
//            return;
//        }
//        for (int i = 0; i <n ; i++) {
//            System.out.print("*");
//        }
//        System.out.println();
//        printtriangle(n-1);
//
//    }
    public static void printtriangle(int n){
        printtriangle(n,0);
    }
    public static void printtriangle(int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            System.out.print("*");
            printtriangle(r,c+1);
        }
        else {
            System.out.println();
            printtriangle(r-1,0);
        }

    }
}
