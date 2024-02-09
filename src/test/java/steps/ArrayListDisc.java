package steps;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDisc {
	
	
	public static void main(String[] args) {
		
		List<String> al = new ArrayList<String>();
		
		al.add("Pune");
		al.add("Mumbai");
		al.add("Kanpur");
		
		
		System.out.println(al);// print complete list
		
		String firstIndex= al.get(1);
		
		System.out.println(firstIndex);
		
		
		
		
		
		
	}

}
