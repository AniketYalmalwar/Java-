package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class NewArray{
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int[] arr;
        arr = new int[3];
        for (int i=0;i<arr.length;i++){
            System.out.print("Enter element at position "+(i+1)+" : ");
            arr[i]=Integer.parseInt(br.readLine());
        }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }

        //2d array
        int[][] arr1=new int[4][4];
        for (int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print("Enter the element at position ("+(i+1)+","+(j+1)+") : ");
                arr1[i][j]=Integer.parseInt(br.readLine());
            }
        }
        //display 2d array
        for (int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }

    }
}