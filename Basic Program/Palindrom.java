import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrom {
    public static boolean isPalindrome(int number){
        int num=number;
        int rev=0;
        while(num>0){
            int x=num%10;
            rev=rev*10+x;
            num=num/10;
        }
        if(number==rev) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("-------------Palindrome or Not-----------------");
            System.out.print("Enter a Number :");
            int number=Integer.parseInt(br.readLine());
            if(isPalindrome(number))
                System.out.println("Palindrome");
            else
                System.out.println("Not Palindrome");

        }
        catch (IOException e){
            System.out.println("Execption"+e);
        }

    }
}
