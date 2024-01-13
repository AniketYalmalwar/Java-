import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Armstrong {

    public static boolean isArmstrong(int number){
        int sum = 0,x;
        int num = number;
        while (num > 0){
            x = num % 10;
            sum = sum + (x*x*x);
            num = num / 10;
        }
        if(number == sum)
            return true;
        return false;
    }
    public static void main(String[] args) {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("--------Armstrong Number or Not---------------\n");
            System.out.print("Enter a Number : ");
            int number=Integer.parseInt(br.readLine());
            if(isArmstrong(number))
                System.out.println("Armstrong Number");
            else
                System.out.println("Not Armstrong Number");

        }catch (IOException e){
            System.out.println("Exception : "+e);
        }
    }
}
