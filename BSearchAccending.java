class BSearchAccending
{
public static void main(String[] args)
{
	int a[]=new int[]{20,50,10,30,15,40,25};
	for(int k=0;k<=a.length-1;k++)
	{
		for(int x=0;x<=a.length-1;x++)
		{
			if(a[k]<a[x])
			{
				int temp=a[k];
				a[k]=a[x];
				a[x]=temp;
			}
		}
	}
	for(int x=0;x<=a.length-1;x++)
	{
		System.out.print(a[x]+" ");
	}
	System.out.println("After sorting");
	int f=0,l=a.length-1,mid,search=35,count=0;
	for(;f<=l;)
	{
		mid=(f+l)/2;
		if(search==a[mid])
		{
			System.out.println("\nElement founded"+ count);
			break;
		}
		else if(search>a[mid])
		{
			f=mid+1;
		}
		else if(search<a[mid])
		{
			l=mid-1;
		}
	}
	if(f>l)
	{
		System.out.println("element not found");
		System.out.println("count is "+count);
	}		
}
}
