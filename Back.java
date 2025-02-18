class Back
{
public static void main(String[] args)
{
	int start=1,n=5,r=3,h=n-r,pro=1,sum=1,num=1;
	while(n>1)
	{
		pro*=n;
		n--;
	}
	System.out.println(pro);
	while(r>1)
	{
		sum*=r;
		r--;
	}
	System.out.println(sum);
	while(h>1)
	{
		num*=h;
		h--;
	}
	System.out.println(num);
	System.out.println(pro/sum*num);
}
}
		