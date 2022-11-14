 package problems;

public class BsearchEx1 {
    public static void main(String[] args) {
        int[] arr={4,6,8,22,32,41,46,54,86}; //sorted array acending order

       System.out.println(findnum(arr,6)); 
    }
    public static int findnum(int[] arr, int num){
        int start=0;
        int end=arr.length-1;

        while(start<=end){

           // int mid=(start+end)/2; // this can give error in certain case

            int mid = start + (end -start)/2;

            if(num==arr[mid])
            {
                return mid;
            }
            if(num<arr[mid])
            {
                end=mid-1;
            }
            if(num>arr[mid])
            {
                start=mid+1;
            }
        }

        return -1;

       

    }
}
