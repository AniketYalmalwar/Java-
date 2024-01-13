package Array;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class UnionIntersection {
    public static void main(String[] args) {
        int[] arr1={3,5,6,7,8,9};
        int[] arr2={1,2,3,4,5};
        TreeSet<Integer> set= new TreeSet<>();
        for(int i=0;i<arr1.length;i++)
            set.add(arr1[i]);
        for(int i=0;i<arr2.length;i++)
            set.add(arr2[i]);
        TreeSet<Integer> set2= new TreeSet<>();
        for(int i=0 ; i<arr1.length;i++){
            for(int j=0 ; j<arr2.length;j++){
                if(arr1[i]==arr2[j])
                    set2.add(arr1[i]);
            }
        }

        Iterator<Integer> it =set.iterator();
        System.out.println("Union :");
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }

        Iterator<Integer> it1 =set2.iterator();
        System.out.println("\nIntersection :");
        while(it1.hasNext()){
            System.out.print(it1.next()+" ");
        }

    }

}
