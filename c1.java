class c1
{
public static void main(String[] args)
{
	c2 d1=new c2();
	//d1.prime();
	d1.fibonacci();
}
}
class c2
{
void prime()
{
	for(int x=1;x<=100;x++)
	{
	int num=x,count=0;
	for(int start=1;start<=num/2;start++)
		{
		if(num%start==0)
		count++;
		}
		if(count==1)
		{
			System.out.println(num+" prime value");
		}
	}
}
void fibonacci()
{
	int num=10,fn=0,sn=1,nn;
	for(int start=1;start<=num;start++)
	{
		System.out.print(fn+ " ");
		nn=fn+sn;
		fn=sn;
		sn=nn;
	}
}
}