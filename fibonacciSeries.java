public class fibonacciSeries {
    public static void main(String[] args) {
        int n=6;
        System.out.println(fibo(n));
    }
    public static int fibo(int n){
        if(n==0) return 0;
        else if(n==1) return 1;
        else return fibo(n-1)+fibo(n-2);
    }
}


//////////////////// ans /////////////////////////
/// input = 6
/// output = 8