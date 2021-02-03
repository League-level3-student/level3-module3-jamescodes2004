package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		int stringLength=s.length();
		String stringThing="";
	
		boolean alreadyRun = true;
		for (int i = 0; i < stringLength; i++) {
			String cap;
			
			String currentChar = ""+s.charAt(i);
			if(alreadyRun==false) {
			cap = currentChar.toUpperCase();
			alreadyRun=true;
			}
			else {
				cap=currentChar;
				alreadyRun=false;
			}
			 stringThing= stringThing+cap;
		}
		System.out.println(stringThing);
		return stringThing;
	}

}
