import java.util.*;
public class MergeSortedArrays{
	public static void main(String args[]){
		int a[]={2,4,5,6,7,9,10,13};
		int b[]={2,3,4,5,6,7,8,9,11,15};
		int k=0;
		int merge[]=new int[a.length+b.length];
		for(int i=0;i<a.length;i++)
		{
			merge[k]=a[i];
			k++;
		}
		for(int j=0;j<b.length;j++)
		{
			merge[k]=b[j];
			k++;
		}
		Set<Integer> noduplicate=new HashSet<>();
		for(int i=0;i<merge.length;i++)
		{
			noduplicate.add(merge[i]);	
		}
		Iterator<Integer> ite=noduplicate.iterator();
		int mergedarray[]=new int[noduplicate.size()];
		int n=0;
		while(ite.hasNext())
		{
			mergedarray[n]=ite.next();
			n++;
		}		
		Arrays.sort(mergedarray);
		for(int i=0;i<mergedarray.length;i++)
		{
			System.out.print(mergedarray[i]+" ");
		}
	}
}