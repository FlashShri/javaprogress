package problems;

public class Test {
    public static void main(String[] args) {
       // int num= 3545;
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
        double x = 1.0;  
  double y = 3.0;
  double z = Math.pow( x, y );
  System.out.print(z);

  try {
    
  } catch (Exception e) {
    // TODO: handle exception
    System.out.println(434);
    throw new Exception();
} finally {
throw new ArithmeticException();
}
  }
    }

 

  
