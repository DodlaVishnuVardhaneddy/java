class Adding
{
public static void main(String[] args)
{
	Demo d=new Demo();
	//d.total(10,1,0);
	//d.totalWithRecursion(10,1,0);
	//d.sumOfDigit(143,0);
	//d.fibonacciSeries(0,1,0,10,1);
	//d.collabrate(3);
	//d.prime(17,2,0);
	d.armstrong(124,124,0,1,0);
}
}
/*class Demo
{
	void totalWithRecursion(int num,int start,int sum)
	{
		if(start==num+1)
		{
			System.out.println("sum of number"+ sum);
		}
		else
		{
			sum+=start;
			totalWithRecursion(num,start+1,sum);
		}
	}
}*/
// Sum of digits adding//
/*class Demo
{
	void sumOfDigit(int num,int sum)
	{
		if(num==0)
		{
			System.out.println("sum of digit  of "+sum);
		}
		else
		{
			int rem=num%10;
			sum+=rem;
			sumOfDigit(num/10,sum);
		}
	}
}*/
//Fibonaccis series with recurstion type//

/*class Demo
{
	void fibonacciSeries(int a,int b,int c,int n,int start)
	{
		if(start==n+1)
		{
		}
		else
		{
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
			fibonacciSeries(a,b,c,n,start+1);
		}
	}
}*/
// Write a code for collabrate(even or odd)to procide the method//

/*class Demo
{
	void collabrate(int n)
	{
		if(n==1)
		{
		}
		else
		{
			if(n%2==0)
			{
				n=n/2;
			}
			else
			{
				n=3*n+1;
			}
			System.out.println(n+" ");
			collabrate(n);
		}	
	}
}*/
//write a code for recurstion in prime//

/*class Demo
{
	void prime(int num,int start,int count)
	{
		if(start==(num/2)+1)
		{
			if(count==0 && num>=2)
				System.out.println(num+"its a prime");
			else
				System.out.println(num+"not at prime");

		}
		else
		{
			if(num%start==0)
			{
				count++;
			}
			prime(num,start+1,count);
		}
	}
}*/
//Write a code for amstrong with recurstion//

class Demo
{
	void armstrong(int num,int temp,int sum,int pow,int count)
	{
		if(num==0)
		{
			System.out.println(temp==sum?"armstrong":"Not armstrong");
		}
		else
		{
			if(num!=0)
			{
				int rem=num%10;	
				count++;
				num=num/10;
			}
			System.out.println("count value of: "+count);
			armstrong(num,temp,sum,pow,count);
			num=temp;
			if(num!=0)
			{
				int rem=num%10;	
				pow=(int)Math.pow(rem,count);
				sum+=pow;
				num=num/10;
			}
			System.out.println("sum value of: "+sum);
			armstrong(num,temp,sum,pow,count);
		}
	}
}
				
			
	
			
			
			
				
	
		
		
		
		