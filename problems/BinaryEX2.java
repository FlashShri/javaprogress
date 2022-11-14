

class BinaryEX2{


    public static void main(String[] args) {
        
        int [] arr ={65,54,44,32,22,11,8};

        int ans= binarySearch( arr ,11 );
        System.out.println(ans);
    
    }

    static int binarySearch(int[] arr , int num){

        int start=0;
        int end = arr.length-1;

      boolean checkOrder = (arr[start]<arr[end]);//ascending

      while(start<=end){

        int mid = start +(end -start)/2;

        if(num == arr[mid]){
            return mid ;
        }
        if(checkOrder){
            if(num<arr[mid]){
                end=mid-1;
            }
            if(num>arr[mid]){
                start= mid+1;
            }
        }else{
            if(num<arr[mid]){
                start=mid+1;
            }
            if(num>arr[mid]){
                end=mid-1;
            }
        }
      }
      return -1;

      
    }
}