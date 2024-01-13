import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseNumber {
    public static void main(String[] args) {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\nEnter a Number : ");
        try {
            int number=Integer.parseInt(br.readLine());
            int rev=0;
            while (number > 0){
                rev=(rev*10)+(number%10);
                number=number/10;
            }
            System.out.println("Reverse is : "+rev);
        }catch (IOException e)
        {
            System.out.println("Exception :"+e);
        }


    }
}
