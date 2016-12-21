
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Tester {

	public static void main(String[] args) throws IOException {
		Scanner inputReader=new Scanner(new File("E:\\Workspace\\MultipleKeySorter\\Names_ages.txt"));
		int aa=-1;
		String []xyz=new String[50];
		while(inputReader.hasNextInt())
		{
			aa++;
			xyz[aa]=inputReader.nextLine();
		}
		inputReader.close();
		String[] stuff=new String[xyz.length];
		String [] names=new String[xyz.length];
		String [] ages=new String[xyz.length];
		ArrayList<String> organizeN=new ArrayList<>();
		ArrayList<String> organizeA=new ArrayList<>();
		for (int x=0; x<aa;x++)
		{
			stuff=xyz[x].split("\\s+");	
			organizeN.add(x, stuff[0]);
			organizeA.add(x,stuff[1]);
		}
		for(int n=0;n<organizeA.size();n++)
		{
			ages[n]=organizeA.get(n);
		}
		for (int m=0; m<organizeN.size(); m++)
		{
			names[m]=organizeN.get(m);
		}
		Sorting kley=new Sorting();
		kley.sort(names);
		
		int []zzz=new int[ages.length];
		for(int pp=0;pp<names.length;pp++)
		{
			zzz[pp]=Integer.valueOf(ages[pp]);
			//System.out.println(zzz[pp]+"\n");
		}
		for (int f=0;f<ages.length;f++)
		{
			System.out.println(names[f]+ ", "+ages[f]);
		}
		
		/*public void sortThisShit(String in[], int []w, int ooo)
		{
			ArrayList<sortObj> st=new ArrayList<sortObj>;
			for (int l=0;l<ooo;l+++)
			{
				sortObj notLit=new sortObj(in[k],w[k]);
				st.add(k,notLit);
			}
		}*/
		String e[];
		/*for (int ll=0; ll<st.size(); ll++)
		{
			System.out.println()
		}*/
	}

}
