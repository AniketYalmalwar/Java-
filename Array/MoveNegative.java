package Array;

public class MoveNegative {
    public static void main(String[] args) {
        int arr[]={2,-4,3,0,-1,4};
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>=arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
