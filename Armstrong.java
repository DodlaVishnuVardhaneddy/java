class Armstrong
{
public static void main(String[] args)
{
	int num=7,k=1,count1=0,temp=num,count=0,sum=0,power=0;
	for(;num!=0;num=num/10)
	{
		int rem=num%10;
		System.out.println(rem);
		count++;
	}
	System.out.println("count is" +count);
	num=temp;
	for(;num!=0;num=num/10)
	{
		int rem=num%10;
		power=(int)Math.pow(rem,count);
		System.out.println(power+" power");
		sum+=power;
	}
	num=temp;
	for(;k<=num/2;k++)
	{
		if(num%k==0)
		count1++;
	}
	System.out.println(sum+ " sum is");
	if(temp==sum && count1==1)
	{
		System.out.println(temp+ "armstrong prime");
	}
	else
	{
		System.out.println(temp+ "notarmstrng not prime");
	}
}
}
		
		
	