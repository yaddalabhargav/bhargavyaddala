package aug4;

//2)Same as task1 but you should only count unique vowel count i.e if a word is having aeeeeee like that so that count of vowel is 2 not 8
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.*;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "eee hgee aeer";
		sortString(str);
	}
	 static String removeDuplicates(String str)   
	    {     
	        //Create LinkedHashSet of type character   
	        LinkedHashSet<Character> set = new LinkedHashSet<>();   
	        //Add each character of the string into LinkedHashSet   
	        for(int i=0;i<str.length();i++)   
	            set.add(str.charAt(i));   
	            
	        // print the string after removing duplicate characters  
	        String s="";
	        for(Character ch : set) 
	        {
	            s=s+ch;   
	        }
	        return s;
	    }  
	public static void sortString(String str)
	{
		Map<Integer, String> map = new TreeMap<>(Collections.reverseOrder());
		String p[] = str.split(" ");
		Arrays.sort(p,Collections.reverseOrder());
		int l=p.length;
		String []ar=new String  [l];
		for(int i=0;i<p.length;i++)
		{
	
			ar[i]=removeDuplicates(p[i]);
			int t=0;
			for(int j=0;j<ar[i].length();j++)
			{	
				String s=ar[i];
				if(s.charAt(j)=='A'||s.charAt(j)=='E'||s.charAt(j)=='I'||s.charAt(j)=='O'||s.charAt(j)=='U'||s.charAt(j)=='a'||s.charAt(j)=='e'||s.charAt(j)=='i'||s.charAt(j)=='o'||s.charAt(j)=='u')
				{
					t=t+1;
				}
			}
			//System.out.println(t);
			if(map.containsKey(t)) {
				String temp=map.get(t);
				temp=temp+" "+ar[i];
				map.put(t, temp);
			}else {
				map.put(t, ar[i]);
			}
		}
		System.out.println("map : "+map);
		StringBuilder sb=new StringBuilder();
		for(Entry<Integer, String> e:map.entrySet()) {
			sb.append(e.getValue()).append(" ");
		}
		System.out.println( sb.toString().trim());
	}
	

}