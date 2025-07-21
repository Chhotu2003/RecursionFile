public class GCD {
    public static void main(String[] args) {
        int num1 = 8;
        int num2 = 12;
        System.out.println("Greatest Common Divisor: "+GcdRecursion(num1, num2));
    }
    public static int GcdRecursion(int a,int b) {
        // base case : if b become 0 , return a in GCD;
        if(b==0) return a;
        /// recursive call with a and b;
        else return GcdRecursion(b,a%b);
    }
}

///////////// and ////////////////////////
/// out = 4;