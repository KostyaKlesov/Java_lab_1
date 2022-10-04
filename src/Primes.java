public class Primes {
    public static void main(String[] args){
        for ( int i=2; i<=100; i++){
            if (isPrime(i)) System.out.println(i);
        }
    }
    public static boolean isPrime(int x){
        int count=0;
        for(int i=1; i<=x; i++){
            if (x%i==0){
                count++;
            }
            if (count>2) {
                return false;
            }
        }
        return true;
    }
}
