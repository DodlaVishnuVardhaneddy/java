class Lcm
{
public static void main(String[] args)
{
	int start=1,num=10,num1=12,k=0,lcm=1;
	for(;start<=num;start++)
	{
		if(num%start==0 && num1%start==0)
		{
			k=start;
		}
		System.out.println(k+ " var is");
	}
	lcm=(num*num1/k);
	System.out.println(lcm+" lcm value");
}
}	