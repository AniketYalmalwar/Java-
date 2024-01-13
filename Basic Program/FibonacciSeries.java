import java.util.Scanner;

public class FibonacciSeries {
    static void fibbonacciSeries( int number){
        int num1=0,num2=1,num3;
        for (int i = 1; i <= number ;i++){
            if(i == 1){
                System.out.print(num1+" ");
                continue;
            }
            else if (i == 2){
                System.out.print(num2+" ");
                continue;
            }
            else{
                num3 = num1 + num2;
                System.out.print(num3+" ");
                num1=num2;
                num2=num3;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----Fibonacci Series -------");
        System.out.print("Enter length of fibonacci series : ");
        int number= sc.nextInt();
        fibbonacciSeries(number);
    }
}
