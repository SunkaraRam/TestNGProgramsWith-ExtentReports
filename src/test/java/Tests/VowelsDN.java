package Tests;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;


public class VowelsDN {
	
	public static void main(String[] args) {
		
		String inp,inpL,fin="";
		
		StringBuffer res=new StringBuffer("");
		
		int vowels = 0;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a String : ");
		
		inp = s.nextLine();
		
		inpL = inp.toLowerCase();
		
		List<Integer> m = new ArrayList<Integer>();
		
		
		for (int i = 0; i < inpL.length(); i++) {
			
			char ch = inpL.charAt(i);
			
			if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				
					
					String str = Character.toString(ch);
					
					res  = res.append(str);
					
					m.add(i);
			}
		}
		
		System.out.println(res);
		
		StringBuffer name= res.reverse();
		
		String resRev = name.toString();
		
		StringBuilder sb = new StringBuilder(inp);
		
		System.out.println(m.size());
		
		for (int j = 0; j <= resRev.length(); j++) {
			
				char ch = resRev.charAt(j);
				
				StringBuilder sd = new StringBuilder(inp);
				
				for (int i = 0; i <=m.size(); i++) {
					
					sd.insert(i, ch);
					
				}
				
				System.out.println(sd);
			
		}
		
		
	}
	
	
//	public String addChar(String str, char ch, int position) {
//		
//	    StringBuilder sb = new StringBuilder(str);
//	    
//	    sb.insert(position, ch);
//	   
//	    return sb.toString();
//	}

}
