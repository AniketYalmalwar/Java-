package Array;

import java.util.Arrays;

public class MinimizeDifference {
    public static void main(String[] args) {
        int arr[]={1,5,8,10};
        int max,min;
        int k=2;
        Arrays.sort(arr);
        min=arr[0];
        max=arr[arr.length-1];
        int ans=arr[arr.length-1]-arr[0];
        for(int i=1;i<arr.length;i++) {
            min = Math.min(arr[0]+k, arr[i] - k);
            max= Math.max(arr[i-1]+k,arr[arr.length-1]-k);
            ans=Math.min(ans,max-min);
        }
        System.out.println(ans);
    }
}
