package Array;

public class ArrayZeroOneTwoSort {
    public static void main(String[] args) {
        int arr[]={1,0,0,2,1,0,2,1,2};
        int zero=0,one=0,two=0,pos=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0)
                zero++;
            else if (arr[i]==1) {
                one++;
            }
            else
                two++;
        }

        for(int i=0;i<zero;i++){
            arr[pos]=0;
            pos++;
        }
        for(int i=0;i<one;i++){
            arr[pos]=1;
            pos++;
        }
        for(int i=0;i<two;i++){
            arr[pos]=2;
            pos++;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
