public class HCF {
    public static void main(String[] args) {

        System.out.println(hcf(36,48));
    }
    public static int hcf(int a, int b){
        int hcf=1;
        for(int i=2;i<=Math.min(a,b);i++){

                while(a%i==0&&b%i==0){
                    a=a/i;
                    b=b/i;
                    hcf=hcf*i;
                }

        }
        return hcf;

    }
}
