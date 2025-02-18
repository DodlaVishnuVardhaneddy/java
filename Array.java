import java.util.Scanner;
class Array
{
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	int j[]=new int[5];
	int sum=0;
	for(int x=1;x<=j.length-1;x++)
	{
		j[x]=s.nextInt();
	}
	for(int y=1;y<=j.length-1;y++)
	{
		sum+=j[y];
	}
	System.out.println(sum+" sum of vaue");
}
}