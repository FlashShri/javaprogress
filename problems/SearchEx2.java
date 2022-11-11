package problems;


public class SearchEx2 {
    public static void main(String[] args) {
        int[] nums={32,8,199,2,1232,9,87};

        System.out.println(findEvenNums(nums));

        int evendigitnum =evenDigitNum(nums);
        System.out.println(evendigitnum);
    }

    // print how many even nums are present in array
    public static int findEvenNums(int[] arr){
        if(arr.length==0){
            return -1;
        }
        int num=0;
        for(int i=0 ; i <arr.length ;i++){
            if(arr[i]%2==0){
                num++;
            }
        }
        return num;
    }

    public static int evenDigitNum (int[] arr){
        if(arr.length==0){
            return -1;
        }
        int num=0;
        int digitcount=0;
        for(int i=0 ; i <arr.length ;i++){
            while(arr[i]>0){
                int temp=arr[i]/10;
                digitcount++;
                arr[i]=temp;
            }

            if(digitcount%2==0){
                num++;
            }

        }
        return num;
    }

}
