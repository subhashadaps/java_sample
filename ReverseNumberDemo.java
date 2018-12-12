import java.util.Scanner;
class ReverseNumberDemo
{
   public static void main(String args[])
   {
    //  int num=123456789;
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter any number:");
	int num = scan.nextInt();
    	
      System.out.println("Given specified number is: "+num);
      int reversenum =0;
      while( num != 0 )
      {
          reversenum = reversenum * 10;
          reversenum = reversenum + num%10;
          num = num/10;
      }
    
      System.out.println("Reverse of specified number is: "+reversenum);
   }
}
