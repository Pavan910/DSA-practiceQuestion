public class power {
    static int num(int base, int exponent){
        if(exponent==0){
            return 1;
        }else if(exponent%2==0){
            int halfpower=num(base,exponent/2);
            return halfpower*halfpower;
        }else{
            return base*num(base,exponent-1);
        }

    }
    public static void main(String[] args) {
        int base=2;
        int exponent=5;
        int result = num(base,exponent);
        System.out.println("the power of the number is"+result);
    }
}
