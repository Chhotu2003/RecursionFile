public class FactorRecursion {

    public static void main(String[] args) {
        int n=5;
        System.out.println("Factorial Number : "+factcorial(n));
    }
    public static int factcorial(int n){
        if(n==0){
            return 1;
        }
        return n*factcorial(n-1);
    }
}