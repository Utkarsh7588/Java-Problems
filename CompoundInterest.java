public class CompoundInterest {
    public static void main(String[] args) {
        System.out.println("Hello world!");

    }
    public static int CI(int P, int I, float T){
        if(T<1){
            for (int i = 0; i <T ; i++) {
                int Interest=P*I/100;
                P=P+Interest;
            }
        }
        int Interest=P*I/100;
        P=P+Interest;
        return P;
    }
}