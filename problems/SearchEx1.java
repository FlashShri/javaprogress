
package problems;
public class SearchEx1 {
    

    //linear Search
    //sreach the array return the index if no -1;

    public static int searchNo(int[] arr,int n){
       
        if(arr.length ==0){
            return -1;
        }

        for(int i=0;i<arr.length;i++){
           //check every index
            if(arr[i]==n){
                return i;
            }
            
        }
    return -1;

    }

    public static boolean  checkElement(int[] arr, int no) {
        if(arr.length==0){
            return false ;
        }
        for (int i : arr) {
            if(i==no)
            {
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        
        int []arr={3,90,56,12,20,43,2,9};
        int no = 56;
        int index= searchNo(arr, no);
        System.out.println(index);

        System.out.println(checkElement(arr , no));
      

       
    }
    
}
