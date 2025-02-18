class c4
{
public static void main(String[] args)
{
	demo d1=new demo();
	d1.cap();
	System.out.println(d1.cap1());
}
}
class demo
{
void cap()
{
	char letter='A';
	char res=(char)(letter+32);

}
char cap1()
{
	char letter='A';
	char res=(char)(letter+32);
	return res;
}
}



