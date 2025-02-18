class Assending
{
public static void main(String[] args)
{
	int a[]=new int[]{50,30,60,60,10,20,15};
	for(int fix=0;fix<=a.length-2;fix++)
	{
		for(int c=fix+1;c<=a.length-1;c++)
		{
			if(a[fix]>a[c])
			{
				int temp=a[fix];
				a[fix]=a[c];
				a[c]=temp;
			}
		}
	}
	System.out.println("After sorting");
	System.out.println(a[a.length-1]);
	for(int x=a.length-2;x>=1;x--)
	{
		if(a[x]!=a[a.length-1])
		{
			System.out.println("Second Largest "+a[x]);
			break;
		}
	}
}
}