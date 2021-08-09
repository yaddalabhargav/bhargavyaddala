package aug4;
//1)Arrange the sentence by words with the word which is having highest vowel count first and followed by rest, if two or more words have same vowel count then arrange it reverse alphabetical order


import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hey hello everyone its getting complicated right that's why we should wrap up the tasks given on same day but we rarely stick to it sad";
        sortString(str);
	}
	public static void sortString(String str)
	{
		Map<Integer, String> map = new TreeMap<>(Collections.reverseOrder());
		String ar[] = str.split(" ");
		Arrays.sort(ar,Collections.reverseOrder());
		for(int i=0;i<ar.length;i++)
		{
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