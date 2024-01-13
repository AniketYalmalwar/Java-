package Array;
//find Largest sum contiguous Subarray [V. IMP]
public class MaxSubarray {
    public static void main(String[] args) {
        int[] arr={2,6,-8,7,4,6,-2,-3,1};
        int maxsum=0,f=0,l=0;
        for(int i=0;i<arr.length-1;i++){
            int currentSum=0;
            for(int j=i;j<arr.length;j++){
                if(arr[j]<0)
                    break;
                currentSum +=arr[j];
                if(maxsum<currentSum) {
                    maxsum = currentSum;
                    f = i;l = j;
                }
            }
        }
        while (f<=l){
            System.out.print(arr[f]+" ");f++;
        }
        System.out.println("\nMax Sum of subarray is :"+maxsum);
    }
}
