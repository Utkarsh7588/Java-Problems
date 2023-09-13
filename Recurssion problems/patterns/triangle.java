package patterns;

public class triangle {
    public static void main(String[] args) {
printtriangle(5);
    }
    public static void printtriangle(int n){
        if(n==0){
            return;
        }
        for (int i = 0; i <n ; i++) {
            System.out.print("*");
        }
        System.out.println();
        printtriangle(n-1);

    }
}
