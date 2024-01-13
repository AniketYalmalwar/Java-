import java.util.Scanner;

public class Factorial {
    static void factorial(int number){
        int f = 1;
        if(number == 0 || number == 1)
            System.out.println("Factorial : " +1);
        else {
            for (int i =2 ; i <= number ; i++){
                f *= i;}
            System.out.println("Factorial : " +f);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------- FACTORIAL OF A NUMBER ---------------");
        System.out.print("Enter a Number :");
        int number = sc.nextInt();
        factorial(number);

    }
}
