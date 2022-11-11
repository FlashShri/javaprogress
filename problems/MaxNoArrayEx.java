package problems;
public class MaxNoArrayEx
{

    public static void main(String[] args) {
         
        int []arr={3,90,56,12,20,43,2,9};
        System.out.println(searchMaxNo(arr));
        System.out.println(searchMinNo(arr));
        System.out.println(searchMaxInRange(arr, 3, 7));
        
    }

    public static int searchMaxNo(int[] arr) {
        if(arr.length==0){
            return Integer.MAX_VALUE;
        }
        int max = arr[0];
        for( int i=0 ;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }

    public static int searchMinNo(int[] arr){
        if(arr.length==0){
            return Integer.MAX_VALUE;
        }
        int min = arr[0];
        for( int i=0 ;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }

    public static int searchMaxInRange(int[] arr , int start , int end){
        if(arr.length==0){
            return Integer.MAX_VALUE;
        }
        int max = arr[start];
        for( int i=start ;i<=end;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }

    public static int searchMinInRange( int[] arr , int start , int end){
        if(arr.length==0){
            return Integer.MAX_VALUE;
        }
        int min = arr[start];
        for( int i=start ;i<=end;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }
}