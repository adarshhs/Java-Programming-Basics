package com.adarsh.corejava.basics;

public class EuclidsAlgo 
{
	int gcd = 0;
	static int arg1 = 0;
	static int arg2 = 0;
	
	public static void main(String[] args) 
	{
		if(args.length==2)
		{
			arg1=Integer.parseInt(args[0]);
			arg2=Integer.parseInt(args[1]);
			System.out.println("Arguments are "+arg1+" , "+arg2);
		}
		else
		{
			System.err.println("Pass only 2 arguments!");
		}
		
		EuclidsAlgo algo = new EuclidsAlgo();
		algo.euclidAlgo(arg1, arg2);
				
	}
	
	int euclidAlgo(int a, int b)
	{
		int rem=0;
		
		if(a>b)
		{
			rem = a%b;
			System.out.println("Rem of "+a+"/"+b+" is :"+rem);
			if(rem!=0)
			{
				a=b;
				b=rem;
				euclidAlgo(a,b);
			}
			else if(rem==0)
			{
				System.out.println("GCD is :" +b);
			}
		}
		else
		{
			euclidAlgo(b,a);
		}
		
		return  gcd;
	}
}