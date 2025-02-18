class Hello1{
public static void main(String[] args) {
String s="Hello";
String res="";

for(int x=0;x<s.length();x++)
{
	for(int y=x+1;y<=s.length();y++)
	{
		String s2=s.substring(x,y);
		res=res+s2+" ";
	}
}
res = res.trim();
System.out.println(res);
}
}
