package Array;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class KthMaxMin {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int arr[]={3,5,2,7,4,1};
        System.out.print("Enter the kt for Kth Max : ");
        int k=Integer.parseInt(br.readLine());
        System.out.print("Enter the kt for Kth Min : ");
        int kmin=Integer.parseInt(br.readLine());

        if(k<=arr.length && k>=1 && kmin<=arr.length && kmin>=1){
            Arrays.sort(arr);
            System.out.println("kth Max is : "+arr[arr.length-k]);
            System.out.println("kth Max is : "+arr[kmin-1]);}
        else
            System.out.println("Out of Range Input");

    }
}

