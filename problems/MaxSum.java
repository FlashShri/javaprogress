package problems;

import java.util.Arrays;

public class MaxSum {
    public static void main(String[] args) {
        // each array contains the coins the a persone have
        // find the person who hava  a max coins
        int arr[][]={
            {4,5,23,11,18}, 
            {4,55,33,55,76},
            {343,98,11},
            {2,22,111,4},
        };

       System.out.println(maxCoin(arr)); 

        
    }

    public static int maxCoin(int[][] arr){
        int sum[]= new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int s=0;
            for(int j=0;j<arr[i].length;j++){
               
                s=s+arr[i][j];
                
            }
            sum[i]=s;
            System.out.println(s);
        }

        System.out.println(Arrays.toString(sum));
        int max=sum[0];
        for(int i=0;i<sum.length;i++){
             
             if(sum[i]>max){
                max=sum[i];
             }
        }
        System.out.println(max);
        for(int i=0;i<sum.length;i++){
            if(sum[i]==max){
                return i;
            }
        }
        return -1;

    }
}
