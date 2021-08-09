package eg1;

public class Address {

	
		// TODO Auto-generated method stub
		

			static String getdomain(String str)
			{
				if(str.startsWith("https://"))
				{
					str=str.substring(8);
				}
				else
					if(str.startsWith("http://"))
					{
						str=str.substring(7);
						}
				int i = str.indexOf('/');
				str=str.substring(0,i);
				return str;
					}
			public static void main(String[] args)
			{
				System.out.println(getdomain("https://en.wikipedia.org/wiki/main_page"));
				System.out.println(getdomain("https://en.wikipedia.org/wiki/main_page"));
				System.out.println(getdomain("helloworld.com/wiki/main_page"));
				System.out.println(getdomain("hacker.challenge.org/wiki/main_page"));
			
			
		}

	
	}


