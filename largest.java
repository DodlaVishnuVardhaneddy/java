class largest
{
public static void main(String[] args) 
{
	/*int num=23897563,temp=num,count=0,min=9;
	for(;num!=0;num=num/10)
	{
		int rem=num%10;
		count++;
		if(rem<min)
		min=rem;
	}
	System.out.println("largest of min"+ min);
	*/
	int num=24367945,temp=num,count=0,max=0;
	for(;num!=0;num=num/10)
	{
		int rem=num%10;
		count++;
		if(max<rem)
		max=rem;
	}
	System.out.println("max of value: "+max);
}
}
		