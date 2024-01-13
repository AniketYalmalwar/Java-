package Array;

public class CyclicRotate {
    public static void main(String[] args) {
        int arr[]={3,5,2,7,4,1};
        int temp=arr[arr.length-1];
        for(int i=arr.length-1;i>=0;i--){
            if(i==0)
                arr[0]=temp;
            else
                arr[i]=arr[i-1];

        }
        for(int i :arr){
            System.out.print(i+" ");
        }
    }
}
