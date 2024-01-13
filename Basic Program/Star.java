import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Leghth of the Pattern :");
        int num = 8;


        //  1st pattern

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n\n");

        // 2nd pattern square
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (j == 1 || j == num || i == 1 || i == num) {
                    System.out.print("* ");
                } else
                    System.out.print("  ");
            }
            System.out.println();
        }

        System.out.println("\n\n");

        //3rd pattern

        for (int i =1;i<=num ;i++){
            for (int j=1;j <=num-i ;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=i; k++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println("\n\n");
        //4th pattern
        for (int i =1;i<=num ;i++){
            for (int j=1;j <=num-i ;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=i; k++){
                System.out.print(i*i+" ");
            }
            System.out.println();
        }
        System.out.println("\n\n");
        //5th pattern
        int sum=0;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                sum++;
                System.out.print(sum+" ");
            }
            System.out.println();
        }
    }
}
