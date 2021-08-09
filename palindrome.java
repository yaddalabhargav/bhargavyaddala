package task2;

public class palindrome {

		static boolean ispalindrome(int x) 
		{
			String str=Integer.toString(x);
			StringBuffer sb= new StringBuffer(str);
			sb=sb.reverse();
			//System.out.println(str+" "+sb.toString());
			if(str.equals(sb.toString()))
			{return true;}
			else
				return false;
		}
		public static void main(String[] args) {
			int arr[]= {222,353,223,565,445,4,9,33,234};
			for(int x:arr)
			{
				if(ispalindrome(x))
					System.out.print(x+" ");
			}

		}


	}

