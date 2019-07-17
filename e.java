// correct on my compiler but was not accepted


import java.util.Scanner;
import java.math.*;


public class e{
	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);

		int nn=input.nextInt();

		while(nn-->0){
			int n=input.nextInt();
			int t=input.nextInt();
			int m=input.nextInt();

			BigInteger numerator=fact(n-m).multiply(fact(t));
			BigInteger denominator=fact(t-m).multiply(fact(n));

			BigInteger d; 
			// int temp=numerator.compareTo 
    		d = Gcd(numerator, denominator);  
  
   			numerator = numerator.divide(d);  
    		denominator = denominator.divide(d);


			System.out.println((numerator.multiply((new BigInteger((mulInv(denominator.intValue(),1000000007))+""))).remainder(new BigInteger(1000000007+""))).toString());
			
		}

	} 


	
  
	static BigInteger Gcd(BigInteger a, BigInteger b)  {
	  	int temp=b.compareTo(new BigInteger(0+""));
	    if (temp == 0)  
	        return a;  
	    return Gcd(b, a.remainder(b));  
	      
	}  


	static BigInteger fact(int num){

		BigInteger fact=BigInteger.ONE;

		for(int i=2;i<=num;i++){
			fact=fact.multiply(new BigInteger(i+""));

		}
		return fact;
	}

	static int mulInv(int q, int prime){ 
		int temp=prime; 
		int y=0;
		int x=1; 

		if (prime == 1) 
			return 0; 

		while (q > 1) 
		{ 
			int qq = q / prime; 

			int temp2 = prime; 

			prime = q % prime; 
			q = temp2; 
			temp2 = y; 

			y = x - qq * y; 
			x = temp2; 
		} 

		if (x < 0) 
			x += temp; 

		return x; 
	} 


}