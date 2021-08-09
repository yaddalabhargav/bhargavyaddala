package eg1;

public class oddlengthupper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


System.out.println(oddupper("hello hi good noon hope we got thread safety"));

}

	public static String oddupper(String s) 
	{
	
		String a[]=s.split(" ");
		StringBuilder sb=new StringBuilder();
		for (int w = 0; w <a.length;w++) 
		{
		     int l=a[w].length();
		     if(l%2==0)
			{
		sb.append(Character.toUpperCase(a[w].charAt(0))).append(a[w].substring(1)).append(" ");
	    }
			else
			{
				int d=(l/2);
				sb.append(a[w].substring(0,d)).append(Character.toUpperCase(a[w].charAt(d))).append(a[w].substring(d+1)).append(" ");
			}
		}
		
		return sb.toString().trim();
	}


	}

