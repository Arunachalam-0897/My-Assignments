package week1day;

public class IsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int n =14;
			 
			 for(int i = 2; i <= n-1; i++) {
				   
				   if (n%i==0)
					{
					System.out.println("Given Number is prime number");
					break;
				
				}
		
				else
				{
					System.out.println("Given Number is not a  prime number");
			     } 
	}

}}
