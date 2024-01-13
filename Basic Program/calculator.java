import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class calculator {
    public static void main(String[] args) {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        try {
            while (true){
                System.out.println("_________________CALCULATOR____________________\nSelect the operation to perform \n1.Addition\n2.SubStraction\n3.Multiplication\n4.Division \n5.Exit \n : ");
                int choice=Integer.parseInt(br.readLine());
                if(choice==5)
                    System.exit(0);
                System.out.print("Enter 1st Number : ");
                float num1=Float.parseFloat(br.readLine());
                System.out.print("Enter 2nd Number : ");
                float num2=Float.parseFloat(br.readLine());
                switch (choice){
                    case 1:
                        System.out.println(num1+" + "+num2+" = "+(num1+num2));
                        break;
                    case 2:
                        System.out.println(num1+" - "+num2+" = "+(num1-num2));
                        break;
                    case 3:
                        System.out.println(num1+" * "+num2+" = "+(num1*num2));
                        break;
                    case 4:
                        System.out.println(num1+" / "+num2+" = "+(num1/num2));
                        break;
                    default:
                        System.out.println("Select valid operation");

                }
            }

        }catch (IOException e){
            System.out.println("Exception : "+e);
        }

    }
}
