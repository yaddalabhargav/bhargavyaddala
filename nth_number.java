package task2;


	import java.util.*;

	public class nth_number {
		public static void main(String[] args) {
			int arr[]= {2,2,2,2,2,4,4,4,4,4,5,6,6,6,6,7,8,9,1,1,1,};
			System.out.println("Array:"+Arrays.toString(arr));
			Arrays.sort(arr);
			System.out.println("Enter N value");
			Scanner s = new Scanner(System.in);
			int Nth_max=s.nextInt();
			s.close();
			int i,temp=arr[0];
			for(i=1;i<arr.length && Nth_max>1;i++)
			{
				if(arr[i]!=temp)
				{
					temp=arr[i];
					Nth_max--;
				}
			}
			System.out.println(arr[i]);

		}

	}


