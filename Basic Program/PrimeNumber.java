import java.util.Scanner;

public class PrimeNumber {
    public static boolean isPrime(int number){
        if(number == 0 || number == 1){
            return false;
        }
        else{
            for (int i=2 ; i <= number/2 ; i++){
                if(number %i ==0)
                    return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("------------Prime Number ------------");
        System.out.print("Enter a Number : ");
        int number= sc.nextInt();
        if(isPrime(number))
            System.out.println(number+" is Prime");
        else
            System.out.println(number+" Not Prime");
    }
}
