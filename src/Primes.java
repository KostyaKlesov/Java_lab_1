// позволяет работать с простыми числами
public class Primes {
    // функция проверяет является ли число простым в интервале от 2 до 100
    public static void main(String[] args){
        for ( int i=2; i<=100; i++){
            if (isPrime(i)) System.out.println(i);
        }
    }
    // проверяет делители числа
    public static boolean isPrime(int x){
        if (x<=1);
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
