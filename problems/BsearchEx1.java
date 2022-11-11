package problems;

public class BsearchEx1 {
    public static void main(String[] args) {
        int[] arr={4,6,8,22,32,41,46,54,86}; //sorted array acending order

        findnum(arr,46);
    }
    public static int findnum(int[] arr, int num){
        int h =(0+arr.length-1)/2;

        while(h==arr.length)
        {
            if(num>arr[h]){
                
    
            }
            else if(num<arr[h]){
    
            }
            else{
                return h;
            }

        }

        h=(h+arr.length-1)/2;
        
        return -1;

    }
}
