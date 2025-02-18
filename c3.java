class c3
{
public static void main(String[] args)
	{
	demo d1=new demo();
	d1.prime();
	System.out.println(d1.prime1());	
	}
}
class demo
{
	void prime()
	{
		int num=21,count=0;
		for(int start=1;start<=num;start++)
		{
			if(num%start==0)
			{
				count++;
			}
		}
		System.out.println(count==2?num+" prime":num+" not prime");
	}
	String prime1()
	{
		int num=21,count=0;
		for(int start=1;start<=num;start++)
		{
			if(num%start==0)
			{
				count++;
			}
		}
		System.out.println(count==2?num+" prime":num+" not prime");
		return num+" ";
	}
}
		
		