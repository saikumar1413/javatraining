public class Compare {
	public static void main(String...args)
	{
		int a = 90;
		int b = 890;
		int c = 70;

		if(a>b&&a>c) //comparing a with b & c
		{
		System.out.println("a is highest");
		}
		else if(b>a&&b>c) //comparing b with a&c
		{
		System.out.println("b is highest");	
		}
		else if(c>a&&c>b)  //comparing c with a&b
		{
			System.out.println("c is highest");
		}
		if(a<b&&a<c)
		{
			System.out.println("a is lowest");
		}
		else if(b<a&&b<c)
		{
			System.out.println("b is lowest");
		}
		else if(c<a&&c<b)
		{
			System.out.println("c is lowest");
		}
		
	}

}
