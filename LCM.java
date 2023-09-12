public class LCM {
    public static void main(String[] args) {
        System.out.println(lcm(36,48));
    }
    public static int lcm(int a, int b){
        int lcm=1;
        for (int i=2;i<Math.max(a,b);i++){
            while(a%i==0||b%i==0){
                if(a%i==0&&b%i==0){
                    a=a/i;
                    b=b/i;
                    lcm=lcm*i;

                }else{
                if(a%i==0){
                    a=a/i;
                    lcm=lcm*i;
                }
                if(b%i==0){
                    b=b/i;
                    lcm=lcm*i;
                }}
            }

        }
        return lcm;
    }
}
