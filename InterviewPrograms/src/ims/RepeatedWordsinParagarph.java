package ims;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RepeatedWordsinParagarph {
	public static void main(String[] args) {
		
		System.out.println("Enter the string into words:");
		//Scanner scr=new Scanner(System.in);
		String input="I love Automation Automation Automation";
		
		String words[]=input.split(" ");
		Map<String, Integer> wordMap = new HashMap<String,Integer>();
		
		for (String str : words) {
			if(wordMap.get(str)!=null) {
				wordMap.put(str, wordMap.get(str)+1);
			}
			else
				wordMap.put(str, 1);
			
		}
		Set<String> str2 = wordMap.keySet();
		for (String str : str2) {
			if(wordMap.get(str)>1)//to print only repeated code more than 1
				{System.out.println("words: "+str+" repeated "+wordMap.get(str)+" time");
			
		}}
		
		
		
		
		
	}
	

}
