class highest
{
public static void main(String[] args)
{
	/*int start=1,num=18,end=num,high=0;
	while(start<=end/2)
	{
		if(num%start==0)
		{
			high=start;
		}
		start++;
	}
	System.out.println(high);*/
	int start=1,num1=10,num2=20,num3=30,min=0;
	/*if(num1>num2 && num1>num3)
	{
		System.out.println(num1=min);
	}
	else if(num2>num3)
	{
		System.out.println(num2=min);
	}
	else
	{
		System.out.println(num3=min);
	}*/
	while(start<=num1 && start<=num2 && start<=num3)
	{
		if(num1%start==0 && num2%start==0 && num3%start==0)
		{
			System.out.println("start is "+start);
		}
		start++;
	}
	/*int m=2,n=7,pow=1;
	for(int start=1;start<=n ;)
	{
		pow=pow*m;
		start++;
	}
	System.out.println("power is"+pow);*/
}
}