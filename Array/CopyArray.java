package Array;
//copy elements of one array into another
public class CopyArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,1,3,3,2,5};
        int[] arr2= new int[arr.length];
        for (int i=0;i<arr.length;i++){
            arr2[i] = arr[i];
        }
        System.out.println("\nArray 1 : ");
        for (int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");;
        }
        System.out.println("\nArray 2 :");
        for (int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");;
        }

    }
}
