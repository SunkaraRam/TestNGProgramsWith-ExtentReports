package Tests;

import java.util.Scanner;

public class VowelsD {

	public static void main(String[] args) {
		
		String inp,inpL;
		
		StringBuffer res=new StringBuffer("");
		
		int vowels = 0;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a String : ");
		
		inp = s.nextLine();
		
		inpL = inp.toLowerCase();
		
		for (int i = 0; i < inpL.length(); i++) {
			
			char ch = inpL.charAt(i);
			
			if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				
					
					String str = Character.toString(ch);
					
					res  = res.append(str);
				
				//System.out.println(ch);
			
			}
		}
		
		System.out.println(res);
		
		StringBuffer name= res.reverse();
		
		String nm = name.toString();
		
		System.out.println(nm);
		
	}

}
