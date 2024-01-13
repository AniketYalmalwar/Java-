import java.util.Scanner;

public class Isbn {
    public static boolean isISBN(long number){
        int sum=0;
        int i=1;
        while (number>0){
            sum=sum+((int) number%10)*i;
            number=number/10;
            i++;
        }
        if(sum%11==0)
            return true;
        return false;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ISBN Number : ");
        long number = sc.nextLong();
        if(isISBN(number)){
            System.out.println("The number is ISBN Number");
        }
        else {
            System.out.println("The number is NOT ISBN Number");
        }
    }
}
