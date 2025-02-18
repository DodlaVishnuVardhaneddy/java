class Insert
{
public static void main(String[] args)
{
	int a[]=new int[]{10,20,30,40,50,60,70,0};
	int index=4;
	Insert i=new Insert();
	i.delete(a,index);
}
void rotate(int[] a,int index,int element)
{
	for(int x=a.length-1;x>index;x--)
	{
		a[x]=a[x-1];
	}
	a[index]=element;
	for(int t:a)
	{
		System.out.print(t+" ");
	}
			
}
void delete(int[] a,int index)
{
	for(int x=0;x<=a.length-2;x++)
	{
		if(x<index)
		{
			a[x]=a[x];
		}		
	}
	a[x]=a[x+1];
	for(int t:a)
	{
		System.out.print(t+" ");
	}
			
}
}
