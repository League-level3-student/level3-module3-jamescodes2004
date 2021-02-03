package _00_Text_Funkifier;

import java.util.ArrayList;

public class BackwardsString extends SpecialString {

	public BackwardsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		int stringLength=s.length();
		String stringThing="";
		System.out.println(s.charAt(stringLength-1));
		for (int i = 0; i < stringLength; i++) {
			
		//	 ArrayList<String> chars = new ArrayList<String>();
		//	 chars.add(""+s.charAt(stringLength));
			 stringThing= stringThing+s.charAt(stringLength-i-1);
		}
		System.out.println(stringThing);
		return stringThing;
	}

}
