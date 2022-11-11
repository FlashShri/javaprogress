package problems;

import java.util.Arrays;

public class SearchIn2D {
    
    public static void main(String[] args) {
        int[][] arr ={
            {34,54,65,8,2},
            {4,55,64,7,12},
            {2,1,10},
            {1,40,81,18}
        };

        int maxNoValue = searchMaxNum( arr);
        System.out.println(maxNoValue);
        int[] maxNoPosition= searchMaxNumP( arr ,maxNoValue );
        System.out.println(Arrays.toString(maxNoPosition));
    }

    public static int searchMaxNum(int[][] arr){
        int max = arr[0][0];

        for (int i=0 ; i<arr.length ;i++){
            for(int j=0 ; j<arr[i].length;j++){
                if(arr[i][j]>max){
                    max=arr[i][j] ;
                }
            }
        }
        return max;

    }

    public static int[] searchMaxNumP( int[][] arr , int target)
    {
        for (int i=0 ; i<arr.length ;i++){
            for(int j=0 ; j<arr[i].length;j++){
                if(arr[i][j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }
}
