
public class Sorting {
	public static void sort(String[]a)
	{
		String min;
		int minIndex;
		for(int i=0;i<a.length;i++)
		{
			min=a[i];
			minIndex=i;
			for (int j=i+1;j<a.length;j++)
			{
				if(a[j].charAt(0)<min.charAt(0))
				{
					min=a[j];
				}
			}
			a[minIndex]=a[i];
			a[i]=min;
		}
		

		
	}
}
