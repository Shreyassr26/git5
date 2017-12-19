package interview;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Demo5 {

	public static void main(String[] args) {
	
		List<Integer> values=new ArrayList<>();
		values.add(10);
		values.add(5);
		//values.add("Shreyas");
		Collections.sort(values);
		
		values.forEach(System.out::println);
		

	}

}
