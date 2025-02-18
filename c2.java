class c2
{
public static void main(String[] args)
{
	demo d1=new demo();
	d1.greater();
	System.out.println(d1.greater1());
}
}
class demo
{
void greater() 
{	
	int a=14,b=25,c=10;
	System.out.println((a>b && a>c) ?"a is greater":(b>c)?"b is greater":"c is greater");
}
String greater1()
{
	int a=14,b=25,c=10;
	System.out.println((a>b && a>c) ?"a is greater":(b>c)?"b is greater":"c is greater");
	return a+" "+b+" "+c+" " ;
}
}


		