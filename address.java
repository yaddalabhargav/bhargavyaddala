package eg2;

public class address {
	
		static String checksecure(String str) 
		{
			if(str.startsWith("https://"))

				{return "secure";}
				
			else
				if(str.startsWith("https://")) 
					
				
					{return "not secure" ;}
					return "not secure";
		}
			
			public static void main(String[] args)
			{
				System.out.println(checksecure("https://en.wikipedia.org/wiki/main_page"));
				System.out.println(checksecure("https://en.wikipedia.org/wiki/main_page"));
				System.out.println(checksecure("helloworld.com/wiki/main_page"));
				System.out.println(checksecure("hacker.challenge.org/wiki/main_page"));
			
		}
	}

