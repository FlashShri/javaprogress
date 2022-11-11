package problems;

public class Test {
    public static void main(String[] args) {
        int num= 3545;
        int num1=8;

      int  temp= num1;
      int digitcount=0;
        while(temp>0){
            digitcount++;
            temp=temp/10;

        }
        System.out.println(digitcount);


        System.out.println("*******************************");

        int[] arr ={5,67,34,3,2,6,8};
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum= sum+ arr[i];
        }

        System.out.println(sum);
    }
}
