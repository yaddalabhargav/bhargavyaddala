package eg1;

public class uppercase {
	


		public static void main(String[] args) {
			String h="hello revature well for being training us";
			System.out.println(stringMod(h));
		}
			public static String stringMod(String h){
				
			String[] s=h.split(" ");
			StringBuilder sb=new StringBuilder();
			for(int i=0;i<s.length;i++) {
				sb.append(s[i].substring(0,s[i].length()-1));
				sb.append(Character.toUpperCase(s[i].charAt(s[i].length()-1)));
				sb.append(" ");
				
			
			}
			
			return sb.toString().trim();


			
		}
	}

